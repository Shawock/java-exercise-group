package com.shawock.dp.abstractfactory1;


import static com.shawock.util.PrintUtils.println;

/**
 * Created on 2018/07/07.
 *
 * @author zhouhao
 */
public class Red implements Color {
	@Override
	public void fill() {
		println("fill red...");
	}
}
