/*
* generated by Xtext
*/
package expr.ui.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import expr.exprDemo.Formula;
import expr.exprDemo.Multi;
import expr.exprDemo.Plus;

/**
 * customization of the default outline structure
 * 
 */
public class ExprDemoTransformer extends AbstractDeclarativeSemanticModelTransformer {
	
	public List<EObject> getChildren( Formula f ) {
		List<EObject> res = new ArrayList<EObject>();
		res.add(f.getExpr());
		return res;
	}
	
	public List<EObject> getChildren( Plus f ) {
		List<EObject> res = new ArrayList<EObject>();
		res.add(f.getLeft());
		res.add(f.getRight());
		return res;
	}
	
	public List<EObject> getChildren( Multi f ) {
		List<EObject> res = new ArrayList<EObject>();
		res.add(f.getLeft());
		res.add(f.getRight());
		return res;
	}
	
}
