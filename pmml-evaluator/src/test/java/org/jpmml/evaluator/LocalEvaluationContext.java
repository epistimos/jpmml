/*
 * Copyright (c) 2013 Villu Ruusmann
 */
package org.jpmml.evaluator;

import org.dmg.pmml.*;

public class LocalEvaluationContext extends EvaluationContext {

	@Override
	public DerivedField resolveDerivedField(FieldName name){
		return null;
	}

	@Override
	public DefineFunction resolveFunction(String name){
		return null;
	}
}