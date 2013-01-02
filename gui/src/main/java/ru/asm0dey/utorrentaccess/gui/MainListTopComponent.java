/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.asm0dey.utorrentaccess.gui;

import ca.odell.glazedlists.gui.TableFormat;
import com.jidesoft.grid.*;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import ru.asm0dey.utorrentaccess.services.IUseSingleTorrents;
import ru.asm0dey.utorrentaccess.utorrentclient.UTorrent;
import ru.asm0dey.utorrentaccess.utorrentclient.domain.SingleListTorrent;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Top component which displays something.
 */
@ConvertAsProperties( dtd = "-//ru.asm0dey.utorrentaccess.gui//MainList//EN", autostore = false )
@TopComponent.Description( preferredID = "MainListTopComponent",
// iconBase="SET/PATH/TO/ICON/HERE",
persistenceType = TopComponent.PERSISTENCE_ALWAYS )
@TopComponent.Registration( mode = "editor", openAtStartup = true )
@ActionID( category = "Window", id = "ru.asm0dey.utorrentaccess.gui.MainListTopComponent" )
@ActionReference( path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration( displayName = "#CTL_MainListAction", preferredID = "MainListTopComponent" )
@Messages( { "CTL_MainListAction=MainList", "CTL_MainListTopComponent=MainList Window", "HINT_MainListTopComponent=This is a MainList window" } )
public final class MainListTopComponent extends TopComponent {

	static {
// com.jidesoft.utils.Lm.verifyLicense("Paul M. Finkelshtein", "uTorrent-Client-MP", ":e7PN6hopxf3pK7yrQUGF4Ppznb8SQb2");
	}

	public MainListTopComponent() throws IOException {

		initComponents();
		initTable();
		setName( Bundle.CTL_MainListTopComponent() );
		setToolTipText( Bundle.HINT_MainListTopComponent() );
		putClientProperty( TopComponent.PROP_CLOSING_DISABLED, Boolean.TRUE );
		putClientProperty( TopComponent.PROP_DRAGGING_DISABLED, Boolean.TRUE );
		putClientProperty( TopComponent.PROP_UNDOCKING_DISABLED, Boolean.TRUE );
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new com.jidesoft.grid.SortableTable();

		setBorder( javax.swing.BorderFactory.createEtchedBorder() );
		setLayout( new javax.swing.BoxLayout( this, javax.swing.BoxLayout.LINE_AXIS ) );

		jTable1.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_OFF );
		jTable1.setColumnAutoResizable( true );
		jScrollPane1.setViewportView( jTable1 );

		add( jScrollPane1 );
	}// </editor-fold>//GEN-END:initComponents
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JScrollPane jScrollPane1;
	private com.jidesoft.grid.SortableTable jTable1;

	// End of variables declaration//GEN-END:variables

	@Override
	public void componentOpened() {
// jTable1.getColumnModel().set
		// TODO add custom code on component opening
	}

	@Override
	public void componentClosed() {
		// TODO add custom code on component closing
	}

	void writeProperties( java.util.Properties p ) {
		// better to version settings since initial version as advocated at
		// http://wiki.apidesign.org/wiki/PropertyFiles
		p.setProperty( "version", "1.0" );
		// TODO store your settings
	}

	void readProperties( java.util.Properties p ) {
		String version = p.getProperty( "version" );
		// TODO read your settings according to their version
	}

	private void initTable() throws IOException {

		final UTorrent instance = UTorrent.getInstance( "192.168.1.2", 8080, "admin", "" );
		jTable1.getSelectionModel().setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
		jTable1.setMultiColumnSortable( true );
		jTable1.setAutoscrolls( true );
		final AutoFilterTableHeader autoFilterTableHeader = new AutoFilterTableHeader( jTable1 );
		autoFilterTableHeader.setAutoFilterEnabled( true );
		autoFilterTableHeader.setAllowMultipleValues( true );
// autoFilterTableHeader.setShowFilterIcon(true);
// autoFilterTableHeader.setShowSortArrow(true);
		autoFilterTableHeader.setShowFilterNameAsToolTip( true );
// autoFilterTableHeader.setUseNativeHeaderRenderer(true);
// autoFilterTableHeader.set
		jTable1.setTableHeader( autoFilterTableHeader );
		final BeanTableModel model = new BeanTableModel( instance.getTorrentList().getTorrents(), SingleListTorrent.class );
		final FilterableTableModel filterableTableModel = new FilterableTableModel( model ) {
			@Override
			public boolean isCellEditable( int a, int b ) {
				return false;
			}
		};
		jTable1.setModel( new SortableTableModel( filterableTableModel ) );
        jTable1.setAutoResizeMode(JideTable.AUTO_RESIZE_FILL);
		jTable1.getSelectionModel().addListSelectionListener( new ListSelectionListener() {
			@Override
			public void valueChanged( ListSelectionEvent e ) {
				final int actualRowAt = jTable1.getActualRowAt( jTable1.getSelectedRow() );
				final SingleListTorrent row = (SingleListTorrent) model.getObject( actualRowAt );
				for ( IUseSingleTorrents iUseSingleTorrents : Lookup.getDefault().lookupAll( IUseSingleTorrents.class ) ) {
					iUseSingleTorrents.handle( row );
				}
			}
		} );
	}

	class ProgressRenderer extends DefaultTableCellRenderer {

		private final JProgressBar b = new JProgressBar( 0, 100 );

		public ProgressRenderer() {
			super();
			setOpaque( true );
			b.setBorder( BorderFactory.createEmptyBorder( 1, 1, 1, 1 ) );
			b.setStringPainted( true );
		}

		@Override
		public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
			Integer i = ( (BigDecimal) value ).intValue();
			String text = "Completed";
			if ( i < 0 ) {
				text = "Error";
			} else if ( i <= 100 ) {
				b.setValue( i );
				b.setString( i == 100 ? text : i + " %" );
				return b;
			}
			super.getTableCellRendererComponent( table, text, isSelected, hasFocus, row, column );
			return this;
		}
	}

	static class ToorrentsTableFormat implements TableFormat<SingleListTorrent> {

		public ToorrentsTableFormat() {
		}

		@Override
		public int getColumnCount() {
			return 19;
		}

		@Override
		public String getColumnName( int column ) {

			return column == 0 ? "Hash" : column == 1 ? "Statuses" : column == 2 ? "Name" : column == 3 ? "Size" : column == 4 ? "% Ready" : "";
// return "";
		}

		@Override
		public Object getColumnValue( SingleListTorrent baseObject, int column ) {
			if ( column == 1 ) {
				return baseObject.getStatuses();
			} else if ( column == 4 ) {
				return baseObject.getPercentReady().toString() + " %";
			}
			return baseObject.get( column );
		}
	}
}
