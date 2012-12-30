package ru.finkel.utorrentaccess.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA. User: finkel Date: 29.12.12 Time: 19:36 To change this template use File | Settings | File Templates.
 */
public class SingleFile extends ArrayList<Object> {

	private String fileName;
	private long fileSize;
	private long downloaded;
	private Priority priority;

	@Override
	public Object set( int index, Object element ) {
		final Object set = super.set( index, element );
		makeAdditionalOperations( index + 1, element );
		return set; // To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean add( Object e ) {
		final boolean add = super.add( e );
		makeAdditionalOperations( size(), e );
		return add; // To change body of generated methods, choose Tools | Templates.
	}

	private void makeAdditionalOperations( int size, Object e ) {
		switch ( size ) {
		case 1:
			fileName = e.toString();
			break;
		case 2:
			fileSize = Long.parseLong( e.toString() );
			break;
		case 3:
			downloaded = Long.parseLong( e.toString() );
			break;
		case 4:
			priority = Priority.getByInt( Integer.parseInt( e.toString() ) );
		}
	}

	public enum Priority {

		SKIP( 0 ), LOW( 1 ), NORMAL( 2 ), HIGH( 3 );

		private static Priority getByInt( int parseInt ) {
			for ( Priority priority : Priority.values() ) {
				if ( priority.getNumber() == parseInt ) {
					return priority;
				}
			}
			throw new IllegalArgumentException( "Wrong priority" );
		}

		private int number;

		private Priority( int number ) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString( this, ToStringStyle.SHORT_PREFIX_STYLE );
	}
}
