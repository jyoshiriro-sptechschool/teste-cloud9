package sptech;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws JsonProcessingException {
		System.out.println("É nóis no Java");

		Estudante estudante = new ObjectMapper().readValue("""
				{
				  "codigo": 1,
				  "nome": "Zé Ruela",
				  "media": 8.95
				}
				""", Estudante.class);

		System.out.println(estudante);
	}
}