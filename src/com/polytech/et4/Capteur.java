package com.polytech.et4;

import com.polytech.et4.ElemRegulation;

public class Capteur {
    private ElemRegulationCapteur m_elem;
    private boolean m_estNotifie = false;


	public void setM_elem(ElemRegulationCapteur m_elem) {
		this.m_elem = m_elem;
	}

	public void notifie(){
		if (m_estNotifie){
			m_elem.notifie();
		}
    }
    
    
}
