/*
* generated by Xtext
*/
package de.itemis.xtext.typesystem.dsl.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.dsl.tsDsl.MetaclassSpec;
import de.itemis.xtext.typesystem.dsl.tsDsl.TypesystemSpec;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class TsDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public TsDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(TypesystemSpec ele) {
		return "typesystem "+ele.getName();
	}
		 
	String text(MetaclassSpec ele) {
		return ele.getClazz().getName();
	}
		 
//    String image(MyModel ele) {
//      return "MyModel.gif";
//    }
}
