package com.gzkj;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @Author: 25490
 * @Date : 2019/11/26 11:23
 */
public class CalculateExpression {
    public static void main(String[] args) {
        boolean result = getResult(args[0]);
//        boolean result = getResult("2+2>3");
        System.out.println(result);
    }

    public static boolean getResult(String rule) {
        boolean result = false;
        try {
            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
            ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
            result = Boolean.parseBoolean(String.valueOf(scriptEngine.eval(rule)));
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }
}
