package com.nt.comp;

public class ChocoSyrupVanilaIcecream extends  VanilaIcecream {

	@Override
	public void prepare() {
	 super.prepare();
	 addTopings();
	}

	private void addTopings() {
		System.out.println("adding  ChocoSyrup");
	}
	
}
