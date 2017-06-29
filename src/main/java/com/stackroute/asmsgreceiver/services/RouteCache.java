package com.stackroute.asmsgreceiver.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RouteCache {

	private Map<String, ArrayList<String>> mapRoutes;
	
	public RouteCache() {
		mapRoutes = new HashMap<String, ArrayList<String>>();
		ArrayList<String> values = new ArrayList<String>();
		values.add("mmdu1");
		values.add("mmdu2");
		values.add("mmdu3");
		mapRoutes.put("circle1", values);
		mapRoutes.put("circle2", values);
		mapRoutes.put("circle3", values);
		
		values = new ArrayList<String>();
		values.add("mmdu4");
		values.add("mmdu5");
		values.add("mmdu6");
		mapRoutes.put("circle4", values);
		mapRoutes.put("circle5", values);
	}
	
	public Map<String, ArrayList<String>> getRoutes() {
		return mapRoutes;
	}
	
	public ArrayList<String> getMmdclist(String circleid) {
		return mapRoutes.get(circleid);
	}
}
