package ru.finkel.utorrentaccess.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA. User: finkel Date: 29.12.12 Time: 19:34 To change this template use File | Settings | File Templates.
 */
public class FilesObject extends ArrayList<Object> {

	String hash;
	ArrayList<SingleFile> singleFiles;

	@Override
	public boolean add( Object o ) {
		boolean add = super.add( o );
		makeAdditionalOperations( o, size() );
		return add;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString( this, ToStringStyle.SHORT_PREFIX_STYLE );
	}

	private void makeAdditionalOperations( Object o, int size ) {
		switch ( size ) {
		case 1:
			hash = o.toString();
			break;
		case 2:
			singleFiles = (ArrayList<SingleFile>) o;
			break;
		}
	}

	@Override
	public Object set( int index, Object element ) {
		final Object set = super.set( index, element );
		makeAdditionalOperations( element, index + 1 );
		return set; // To change body of generated methods, choose Tools | Templates.
	}
}
