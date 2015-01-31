package cyano.basemetals.init;

import java.util.HashMap;
import java.util.Map;

import cyano.basemetals.material.*;

public class Materials {

	private static Map<String,MetalMaterial> allMaterials = new HashMap<>();
	
	public static MetalMaterial copper;
	public static MetalMaterial silver;
	public static MetalMaterial tin;
	public static MetalMaterial lead;
	public static MetalMaterial nickel;
	public static MetalMaterial bronze;
	public static MetalMaterial brass;
	public static MetalMaterial steel;
	public static MetalMaterial invar;
	public static MetalMaterial electrum;
	public static MetalMaterial coldiron;
	public static MetalMaterial mithril;
	public static MetalMaterial adamantine;
	public static MetalMaterial starsteel;
	
	private static boolean initDone = false;
	public static void init(){
		if(initDone)return;
		
		copper = addMaterial("copper",4,4,5);
		silver = addMaterial("silver", 4, 4, 6);
		tin = addMaterial("tin", 3, 1, 2);
		lead = new LeadMaterial("lead", 1, 1, 1);
		allMaterials.put(lead.getName(), lead);
		nickel = addMaterial("nickel", 4, 4, 7);
		bronze = addMaterial("bronze", 8, 4, 4.5);
		brass = addMaterial("brass", 3.5, 3, 5);
		steel = addMaterial("steel", 8, 15, 2);
		invar = addMaterial("invar", 9, 10, 3);
		electrum = addMaterial("electrum", 4, 4, 10);
		coldiron = addMaterial("coldiron", 7, 7, 7);
		mithril = addMaterial("mithril", 9, 9, 9);
		adamantine = new AdamantineMaterial("adamantine", 10, 100, 0);
		allMaterials.put(adamantine.getName(), adamantine);
		starsteel = new StarSteelMaterial("starsteel", 10, 25, 12);
		allMaterials.put(starsteel.getName(), starsteel);
		
		initDone = true;
	}
	
	private static MetalMaterial addMaterial(String name, double hardness, double strength, double magic){
		MetalMaterial m = new MetalMaterial(name,(float)hardness,(float)strength,(float)magic);
		allMaterials.put(name, m);
		return m;
	}
}
