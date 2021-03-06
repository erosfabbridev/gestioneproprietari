package it.prova.gestioneproprietari.service.automobile;

import java.util.List;

import it.prova.gestioneproprietari.dao.automobile.AutomobileDAO;
import it.prova.gestioneproprietari.model.Automobile;

public interface AutomobileService {

	public List<Automobile> listAllAutomobili() throws Exception;

	public Automobile caricaSingolaAutomobile(Long id) throws Exception;

	public void aggiorna(Automobile automobileInstance) throws Exception;

	public void inserisciNuova(Automobile automobileInstance) throws Exception;

	public void rimuovi(Automobile automobileInstance) throws Exception;

	public void setAutomobileDAO(AutomobileDAO automobileDAO);

	public List<Automobile> getListaAutomobiliDaProprietariConCodiceFiscaleIniziaCon(String inizioCF) throws Exception;

	public List<Automobile> getAutomobiliErroreProprietarioMinorenne() throws Exception;
}
