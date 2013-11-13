package com.bfp.valueobjects;

import java.util.List;

/**
 * @author tiruppathir
 *
 */
public class JewelMaster {

	/**
	 * 
	 */
	private List<JewelCategory> jewelCategory = null;

	/**
	 * @return the jewelCategory
	 */
	public List<JewelCategory> getJewelCategory() {
		return jewelCategory;
	}

	/**
	 * @param jewelCategory the jewelCategory to set
	 */
	public void setJewelCategory(List<JewelCategory> jewelCategory) {
		this.jewelCategory = jewelCategory;
	}
	
	private List<JewelQuality> jewelQualities = null;

	/**
	 * @return the jewelQualities
	 */
	public List<JewelQuality> getJewelTypes() {
		return jewelQualities;
	}

	/**
	 * @param jewelQualities the jewelQualities to set
	 */
	public void setJewelTypes(List<JewelQuality> jewelTypes) {
		this.jewelQualities = jewelTypes;
	}
	
}