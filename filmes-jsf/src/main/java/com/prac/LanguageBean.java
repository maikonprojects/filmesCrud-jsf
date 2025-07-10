package com.prac;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "language")
public class LanguageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String selectedLocaleCode;

	private static Map<String, Object> localeList;

	static {
		localeList = new HashMap<String, Object>();
		localeList.put("English", Locale.ENGLISH);
		localeList.put("Chinese", Locale.SIMPLIFIED_CHINESE);
		localeList.put("Hindi", new Locale("hi","IN"));
		
	}

	// action handler for value change
	public void changeLocale(ValueChangeEvent event) {
		String newValue = event.getNewValue().toString();
		for (Map.Entry<String, Object> item : localeList.entrySet()) {
			if (item.getValue().toString().equalsIgnoreCase(newValue)) {
				FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) item.getValue());
			}
		}
	}

	public String getSelectedLocaleCode() {
		return selectedLocaleCode;
	}

	public void setSelectedLocaleCode(String selectedLocaleCode) {
		this.selectedLocaleCode = selectedLocaleCode;
	}

	public Map<String, Object> getLocaleList() {
		return localeList;
	}

	public static void setLocaleList(Map<String, Object> localeList) {
		LanguageBean.localeList = localeList;
	}

}
