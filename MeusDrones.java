import java.util.Scanner;

public class MeusDrones{

	public static void main(String[] args){
		
		Drone drone1 = new Drone();
		Drone drone2 = new Drone();
		Drone drone3 = new Drone();
		
		//Atribuindo nomem em cada Drone
		drone1.nome = "Michael";
		drone2.nome = "James";
		drone3.nome = "Peter";
		
		//Atribuindo altura maxima (m) em cada Drone
		drone1.altMax = 200;
		drone2.altMax = 250;
		drone3.altMax = 300;
		
		//Atribuindo velocidade (km/h) em cada Drone
		drone1.velcMax = 40.;
		drone2.velcMax = 30.;
		drone3.velcMax = 20.;
		
		//Relatorio dos drone
		System.out.println("Drone: \n" + drone1.nome);
		System.out.println("altura max (m): \n" + drone1.altMax);
		System.out.println("veloc max (km/h): \n" + drone1.velcMax);
		
		System.out.println("Drone: \n" + drone2.nome);
		System.out.println("altura max (m): \n" + drone2.altMax);
		System.out.println("veloc max (km/h): \n" + drone2.velcMax);
		
		System.out.println("Drone: \n" + drone3.nome);
		System.out.println("altura max (m): \n" + drone3.altMax);
		System.out.println("veloc max (km/h): \n" + drone3.velcMax);
		
		System.out.println("\n \n --------------------- \n");
		
		//Operando o drone1
		drone1.ligar();
		drone1.mudarAlt(50);
		drone1.mudarVeloc(10.);
		drone1.mudarDirecao(90.);
		
		System.out.println("Drone: \n" + drone1.nome);
		System.out.println("altura atual (m): \n" + drone1.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone1.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone1.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//aumentando a velocidade do drone1 em 20km/h e descendo 5 metros
		drone1.mudarAlt(-5);
		drone1.mudarVeloc(20.);
		
		System.out.println("Drone: \n" + drone1.nome);
		System.out.println("altura atual (m): \n" + drone1.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone1.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone1.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//desligando o drone
		drone1.desligar();
		
		//Operando o drone2
		drone2.ligar();
		drone2.mudarAlt(50);
		drone2.mudarVeloc(10.);
		drone2.mudarDirecao(90.);
		
		System.out.println("Drone: \n" + drone2.nome);
		System.out.println("altura atual (m): \n" + drone2.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone2.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone2.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//aumentando a velocidade do drone1 em 20km/h e descendo 5 metros
		drone2.mudarAlt(-5);
		drone2.mudarVeloc(20.);
		
		System.out.println("Drone: \n" + drone2.nome);
		System.out.println("altura atual (m): \n" + drone2.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone2.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone2.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//desligando o drone
		drone2.desligar();
		
		//Operando o drone1
		drone3.ligar();
		drone3.mudarAlt(50);
		drone3.mudarVeloc(10.);
		drone3.mudarDirecao(90.);
		
		System.out.println("Drone: \n" + drone3.nome);
		System.out.println("altura atual (m): \n" + drone3.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone3.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone3.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//aumentando a velocidade do drone1 em 20km/h e descendo 5 metros
		drone3.mudarAlt(-5);
		drone3.mudarVeloc(20.);
		
		System.out.println("Drone: \n" + drone3.nome);
		System.out.println("altura atual (m): \n" + drone3.altAtual);
		System.out.println("veloc atual (km\\h): \n" + drone3.velocAtual);
		System.out.println("direcao atual (graus): \n" + drone3.direcaoAtual);
		System.out.println("\n \n --------------------- \n");
		
		//desligando o drone
		drone3.desligar();
	}

}
