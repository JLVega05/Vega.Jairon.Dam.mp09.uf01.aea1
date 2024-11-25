package vega.jairon.dam.mp09.uf01.pr2.seguretat.view.console;


import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import vega.jairon.dam.mp09.uf01.pr2.seguretat.model.domain.VisitaMedica;
import vega.jairon.dam.mp09.uf01.pr2.seguretat.model.domain.VisitaMedicaLog;


public class VisitaMedicaDesktopView {
public VisitaMedica getVisitaMedica() {
		
		String text = null;

		text = JOptionPane.showInputDialog(null, "Id Visita Mèdica:", "Visita Mèdica", JOptionPane.PLAIN_MESSAGE);
		int id = getIntByText(text);
		String nomMetge = JOptionPane.showInputDialog(null, "Nom metge:", "Visita Mèdica", JOptionPane.PLAIN_MESSAGE); 
		String nomPacient = JOptionPane.showInputDialog(null, "Nom pacient:", "Visita Mèdica", JOptionPane.PLAIN_MESSAGE); 
		String diagnostic = JOptionPane.showInputDialog(null, "Diagnòstic:", "Visita Mèdica", JOptionPane.PLAIN_MESSAGE);
		
		text = JOptionPane.showInputDialog(null, "Data (YYYY-MM-DD):", "Visita Mèdica", JOptionPane.PLAIN_MESSAGE);

		LocalDate data = LocalDate.parse(text);
		
		VisitaMedica visitaMedica = new VisitaMedica();
		visitaMedica.setIdVisita(id);
		visitaMedica.setNomMetge(nomMetge);
		visitaMedica.setNomPacient(nomPacient);
		visitaMedica.setDiagnostic(diagnostic);
		visitaMedica.setData(data);
		return visitaMedica;
	}

	public void showVisitaMedica(VisitaMedica visitaMedica) {
		JOptionPane.showMessageDialog(null, visitaMedica.toString(), "Informació", JOptionPane.INFORMATION_MESSAGE);
	}

	public void showMissatge(String missatge, boolean esError) {
		if (esError) {

			JOptionPane.showMessageDialog(null, missatge, "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, missatge, "Informació", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public boolean demanarMesDades() {
		boolean result = false;
		
		

		String text = JOptionPane.showInputDialog(null, "Desitja demanar més dades?true/false", JOptionPane.PLAIN_MESSAGE);
		if (text=="true")
		{
			result = true;
		}
		
		return result;
	}

	public void mostraLogs(ArrayList<VisitaMedicaLog> logs) {
		
		StringBuilder sb = new StringBuilder();
		if (logs != null && logs.size() > 0) {
			for (VisitaMedicaLog v : logs) {
				sb.append(v.toString() + "\n");
			}
		}
		showMissatge(sb.toString(), false);
	}
	
	private int getIntByText(String text) {
		int i = 0;
		try {
			i = Integer.parseInt(text);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}

		return i;

	}
}
