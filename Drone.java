import java.util.Scanner;

public class Drone{

	//Atributos
	String nome;
	int altMax;
	double velcMax;
	boolean ligado = false;
	int altAtual = 0;
	double velocAtual = 0;
	double direcaoAtual = 0;
	
	//Metodos
	void ligar(){
		ligado = true;
		System.out.println("O drone " + nome + " esta ligado?: " + ligado);
	}
	
	void desligar(){
		ligado = false;
		System.out.println("O drone " + nome + " esta ligado?: " + ligado);
	}
	
	void mudarVeloc(double incrementoVeloc){
		velocAtual += incrementoVeloc;
	}
	
	void mudarAlt(int incrementoAlt){
		//altura final
		int altFinal = altAtual + incrementoAlt;
		if(ligado){
			//teste se o drone ira subir/descer
			if(altFinal > altAtual){
				for( ;altAtual < altFinal; altAtual += 1){
					if(altAtual > altMax){
						System.out.println("O drone esta na maxima altitude");
						break;
					}
				}
			}
			else{
			//drone descendo a cada 1 metro
				for( ;altAtual > altFinal; altAtual -= 1){
					if(altAtual < 1){
						System.out.println("O drone esta no solo");
						break;
					}
				}
			}
		}
		
		
		else{
			System.out.println("O drone esta desligado");
		}
	}
	
	void mudarDirecao(double incrementoDirecao){
		direcaoAtual += incrementoDirecao;
	}
	
	void pousar(){
		altAtual = 0;
		velocAtual = 0;
		System.out.println("O drone " + nome + " pousou");
	}

}
