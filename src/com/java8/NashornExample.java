package com.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

	public static void main(String[] args) {
		
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine nashorn = engineManager.getEngineByName("nashorn");
		try{
			nashorn.eval("print('Hello World!')");
			Integer sum = (Integer) nashorn.eval("5 + 8");
			System.out.println(sum);			
		}catch(ScriptException e){
			System.out.println(e.getMessage());
		}

	}

}
