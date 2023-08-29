package com.solar.edge;

import java.util.ArrayList;
import java.util.Scanner;

import com.solar.edge.models.SolarPanelModelInformation;
import com.solar.edge.models.SolarPanelModelInformationList;

//import com.solar.edge.models.STC;
//import com.solar.edge.models.STCBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Your code here
        
       // STCBuilder stcBuilder = new STCBuilder(12.2F, 5.3F, 17.33F, 12F, 24.78F, 41.1F);
        //STC stc = stcBuilder.build();
        
        //System.out.println(stc.getMaxPower());
        
        ArrayList<SolarPanelModelInformation> list = SolarPanelModelInformationList.getPanelModelList();
        
    	
    }
}