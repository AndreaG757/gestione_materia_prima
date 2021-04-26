package it.gestionemateriaprima.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.gestionemateriaprima.service.ILavorazioneService;
import it.gestionemateriaprima.service.IMateriaPrimaService;

public class MyServiceFactory {

	private static ApplicationContext ctx;
	
	static {
		
		try {
			ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static IMateriaPrimaService getMateriaPrimaService() {
		return ctx.getBean(IMateriaPrimaService.class);
	}
	
	public static ILavorazioneService getLavorazioneService() {
		return ctx.getBean(ILavorazioneService.class);
	}
	
}
