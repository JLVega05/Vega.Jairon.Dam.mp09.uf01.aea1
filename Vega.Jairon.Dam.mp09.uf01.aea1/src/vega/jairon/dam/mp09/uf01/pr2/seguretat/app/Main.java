package vega.jairon.dam.mp09.uf01.pr2.seguretat.app;

import vega.jairon.dam.mp09.uf01.pr2.seguretat.controller.VisitaMedicaController;
import vega.jairon.dam.mp09.uf01.pr2.seguretat.model.domain.VisitaMedica;
import vega.jairon.dam.mp09.uf01.pr2.seguretat.view.console.VisitaMedicaDesktopView;

public class Main {
	public static void main(String[] args) {
		VisitaMedicaController visitaMedicaController = new VisitaMedicaController();
		visitaMedicaController.inici();
	}
}
