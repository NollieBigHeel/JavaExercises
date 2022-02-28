package com.qa.cakeDemo;

public class CakeTin {
	
	//flavour - String
	//layers - int
	//icing - boolean
	//colour - String
	
	public String flavour;
	public int layers;
	public boolean icing;
	public String colour;
	
	public CakeTin(String flavourParam, int layersParam, boolean icingParam, String colourParam) {
		
		this.flavour = flavourParam;
		this.layers = layersParam;
		this.icing = icingParam;
		this.colour = colourParam;
	}

}
