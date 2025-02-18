function() {/**logo_url("/driver_icons/js.png")
visibility("PRIVATE")
created_timestamp(1728852119703)
base_component_id("9822b260-89a3-11ef-8704-c3e0d696c77b")
 Practica Final | ~ Creado por Josue Gutierrez y Ruben Sanchez Sevilla G7 **/

import java.util.Scanner ; /** Importacion Scanner **/

class Liga {   /** Clase **/
	
    static Scanner leer = new Scanner ( System.in ) ; /** Modulo Scanner **/

	private static void inicializacionresultados (int [][]resultados, int n) { /** METODO INICIALIZACION MATRIZ RESULTADOS **/
		
		int contador1 = 0 ; /** Inicializacion de Variable Contador1 a 0 **/
    	int contador2 = 0 ; /** Inicializacion de Variable Contador2 a 0 **/
        
    	do { /** Bucle de Recorrido de la Matriz Resultados **/
    
    		do { /** Bucle de Recorrido de la Matriz de Resultados **/ 
        
        		resultados[contador1][contador2] = -1 ; /** Inicializa la matriz a -1 **/
            
            	contador1++ ; /** La Variable Contador1 incrementa una unidad **/
            
        	} while ( contador1 < n ) ; 
        
        	contador1 = 0 ; /** RESET Contador1 **/
        	contador2++ ; /** La Variable Contador2 incrementa una unidad **/
        
    	} while ( contador2 < n ) ; /** FIN del Bucle de Recorrido de la Matriz **/

} /** FIN METODO INICIALIZACION MATRIZ RESULTADOS **/

    private static void imprimirMenu ( ) { /** METODO IMPRESION DE MENU **/
    
        System.out.println ("\n \n Introduzca una Opcion del Menu ( Numero del 1 al 9 ) \n \n") ;   /** Etiqueta Menu **/
        
        System.out.println ("( 1 ) Introducir puntos de un partido concreto \n \n") ;               /** Etiqueta (1) Introducir puntos de un partido concreto **/    
        System.out.println ("( 2 ) Introducir puntos de todos los partidos \n \n") ;                /** Etiqueta (2) Introducir puntos de todos los partidos **/ 
        System.out.println ("( 3 ) Ver puntos de un equipo concreto \n \n") ;                       /** Etiqueta (3) Ver puntos de equipo concreto **/ 
        System.out.println ("( 4 ) Ver puntos de todos los equipos \n \n") ;                        /** Etiqueta (4) Ver puntos de todos los equipos **/ 
        System.out.println ("( 5 ) Ver equipo ganador \n \n") ;                                     /** Etiqueta (5) Ver Equipo Ganador **/ 
        System.out.println ("( 6 ) Introducir nombres de un equipo \n \n") ;                        /** Etiqueta (6) Introducir nombre de un equipo concreto **/    
        System.out.println ("( 7 ) Introducir nombres de todos los equipos \n \n") ;                /** Etiqueta (7) Introducir nombre de todos los equipos **/    
        System.out.println ("( 8 ) Borrar todo \n \n " ) ; 											/** Etiqueta (8) Eliminar todos los datos introducidos en la aplicacion **/
        System.out.println ("( 9 ) Cerrar la Aplicacion \n \n") ;                                   /** Etiqueta (9) Fin del Programa **/
    
    }   /** FIN METODO IMPRESION DE MENU **/

	private static int comprobacionequipo(int LecturaEquipo, int [][] resultados, int n) { /** METODO COMPROBACION DE EXISTENCIA DE PUNTOS **/

		int contador = 0 ; /** Inicializacion de Variable Contador a 0 **/
		          
    	do { /** Bucle de Recorrido de la Matriz de Resultados por Columna (VISITANTE) **/
    
    		if ( LecturaEquipo == contador ) { /** Cuando la celda es la del Equipo Contra Si Mismo **/
    	
    			contador++ ; /** La variable contador incrementa en 1 su valor **/
    		
    		} else { /** Cuando la celda no es la del Equipo Contra Si Mismo **/
    	
    			if ( resultados[LecturaEquipo][contador] == -1 ) { /** Cuando no hay puntos en la celda EQUIPO, Contador **/
    		
    				return 1 ; /** El metodo devuelve un 1 **/
        		
        		} else { /** Cuando hay puntos en la celda EQUIPO, Contador **/
        		
        			contador++ ; /** La variable contador incrementa en 1 su valor **/
        		
        		} /** Fin de IF de comprobacion del estado de la celda **/ 
            
       	 } /** Fin IF de Comprobacion de Celda Equipo Vs Equipo **/
        	
    	}  while ( contador < n ) ; /** Fin del Bucle Columna cuando contador deja de ser menor que n **/
        
    	contador = 0 ; /** RESET de la variable contador **/
        	
    	do { /** Bucle de Recorrido de la Matriz de Resultados por Fila (CASA) **/
        
      		if ( contador == LecturaEquipo ) { /** Cuando la celda es la del Equipo Contra Si Mismo **/
        
          		contador++ ; /** La variable contador incrementa en 1 su valor **/
        		
        	} else { /** Cuando la celda no es la del Equipo Contra Si Mismo **/
        	
        		if ( resultados[contador][LecturaEquipo] == -1 ) { /** Cuando no hay puntos en la celda EQUIPO, Contador **/
        		
        			return 1 ; /** El metodo devuelve un 1 **/
        		
        		} else { /** Cuando hay puntos en la celda EQUIPO, Contador **/
        		
        			contador++ ; /** La variable contador incrementa en 1 su valor **/
        		
        		} /** Fin de IF de comprobacion del estado de la celda **/ 
            
        	} /** Fin IF de Comoprobacion de Celda Equipo Vs Equipo **/
            
    	} while ( contador < n ) ; /** Fin del Bucle Fila cuando contador deja de ser menor que n **/
        	
    	return 0 ; /** El metodo devuelve un 0 **/
        
	} /** FIN DEL METODO COMPROBACION DE EXISTENCIA DE PUNTOS **/

	private static int existenciaequipos (int casa, int visitante, int n ) { /** METODO PARA COMPROBAR LA EXISTENCIA DE LOS EQUIPOS CASA Y VISITANTE **/
	
		if ( casa < n ) { /** Comprobacion de si casa esta dentro de los "n" equipos **/
                        
        	if ( visitante < n ) { /** Comprobacion de si visitante esta dentro de los "n" equipos **/
            
            	return 1 ; /** Si ambos equipos existen se devuelve un 1 **/           
                        
        	} else { /** ELSE Comprobacion existencia Visitante **/
                                
            	return 2 ; /** Error | Visitante No existe **/
                                
            }  /** FIN Comprobacion existencia Visitante **/
                        
       	} else { /** ELSE Comprobacion existencia Casa **/
                            
        	return 0 ; /** Error | Casa No existe **/
                          
        } /** Fin Comprobacion existencia de Casa **/            		
	
	} /** FIN DEL METODO PARA COMPROBAR LA EXISTENCIA DE LOS EQUIPOS CASA Y VISITANTE **/

    private static void menusobreescritura (int [] puntos, int [][] resultados, int casa, int visitante, String [] etiquetaequipos ) { /** METODO MENU DE SOBRE ESCRITURA DE PUNTOS **/
    
    	int menu ; /** Inicializacion de la variable menu **/
    
    	System.out.println("\n\nYa has introducido los puntos de este partido, Deseas sobreescribir los puntos?\nEscribe un 1 para Sobreescribirlos, 2 Para ignorarlos, 3 Para ver los puntos introducidos") ; /** Impresion del mensaje de Advertencia **/
                             		
       	do { /** Bucle de Respuesta del Menu **/
       	
       		menu = leer.nextInt() ; /** Lectura de la opcion del menu  **/
             String Vacio = leer.nextLine() ;   /** String Vacio **/
	
            switch ( menu ) { /** Menu **/
            
            	case 1: { /** Caso 1 | Sobre Escribir los puntos **/
            	
            		sobreescrituradepuntos(puntos, resultados, casa, visitante) ; /** Eliminacion de los puntos antiguos **/
        											
        			escanerpuntosetiquetaequipos (casa, etiquetaequipos) ; /** Llamada al metodo escanerpuntosetiquetaequipos **/
        											
                    resultados[casa][visitante] = leer.nextInt() ; /** Lectura de puntos del Casa (Equipo Local) **/
                           
                    calculodepuntos(casa, visitante, resultados, puntos, etiquetaequipos) ; /** Llamada al metodo calculodepuntos **/
                                	
                } break ; /** Fin del Caso 1 **/
                
                case 2: { /** Caso 2 | Puntos Ignorados **/
                
                	System.out.println("\n\nPuntos Ignorados\n") ; /** Mensaje Puntos Ignorados **/
                	
                } break ; /** Fin del Caso 2 **/
                
                case 3: { /** Caso 3 | Ver puntos existentes **/
                
                	System.out.println("\n\n"+resultados[casa][visitante]+" Puntos\n"); /** Impresion de puntos existentes **/
                    System.out.println("\nYa has introducido los puntos de este partido, Deseas sobreescribir los puntos?\nEscribe un 1 para Sobreescribirlos, 2 Para ignorarlos, 3 Para ver los puntos introducidos\n\n") ; /** Impresion del mensaje de Advertencia **/
		
                } break ; /** Fin del Caso 3 **/
                
                default: { /** En otro Caso **/
                
                	System.out.println("\n\nOpcion no valida\n\nEscribe un 1 para Sobreescribirlos, 2 Para ignorarlos, 3 Para ver los puntos introducidos");
                                				
                } break ; /** Fin de otro Caso **/
                                		
            } /** Fin del Switch Menu **/
                                		 
        } while ( menu != 1 && menu != 2 ) ; /** Fin del Bucle de Respuesta del Menu **/
                             		
    } /** FIN DEL METODO DEL MENU DE SOBRE ESCRITURA DE PUNTOS **/

    private static void verpuntosallequipos ( String [] etiquetaequipos, int [] puntos, int n, int [][] resultados ) { /** METODO VER PUNTOS DE TODOS LOS EQUIPOS **/
        
        int contador = 0 ; /** Inicializacion de Variable Contador a 0 **/
        int comprobacion ;
        
        do { /** Bucle de Repeticion de Impresion de Puntos de un Equipo **/
        
        	comprobacion = comprobacionequipo ( contador, resultados, n ) ;
                    
        	if ( comprobacion == 0 ) { /** Comprobacion de si hay puntos introducidos **/
        
        		if ( etiquetaequipos[contador] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
                
                	/** EN CASO AFIRMATIVO **/
                
                	System.out.println("\nEl equipo "+contador+" tiene un total de "+puntos[contador]+" puntos\n") ; /** Impresion de los puntos del equipo **/
                
            	} else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
                
                	/** EN CASO NEGATIVO **/
                
                	System.out.println("\nEl equipo "+contador+" | "+etiquetaequipos[contador]+" | tiene un total de "+puntos[contador]+" puntos\n") ; /** Impresion de los puntos del Equipo **/
                
            	} /** FIN Comprobacion Etiqueta de Equipo **/
            
            } else { /** ELSE | Comprobacion de si hay puntos introducidos **/
        
        		if ( etiquetaequipos[contador] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
                
                	/** EN CASO AFIRMATIVO **/
                
                	System.out.println("\nAtencion | Aun no has introducido todos los puntos del equipo "+contador+"") ; /** Impresion Advertencia | Aun no se ha introducido todos los puntos **/
					System.out.println("El equipo "+contador+" tiene un total de "+puntos[contador]+" puntos\n") ; /** Impresion de los puntos del equipo **/
                
            	} else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
                
                	/** EN CASO NEGATIVO **/
                
                	System.out.println("\nAtencion | Aun no has introducido todos los puntos del equipo "+contador+" | "+etiquetaequipos[contador]+" | ") ; /** Impresion Advertencia | Aun no se ha introducido todos los puntos **/
					System.out.println("El equipo "+contador+" | "+etiquetaequipos[contador]+" | tiene un total de "+puntos[contador]+" puntos\n") ; /** Impresion de los puntos del Equipo **/
                
            	} /** FIN Comprobacion Etiqueta de Equipo **/
                    
			} /** Fin comprobacion puntos existentes **/
            
        	contador++ ; /** La Variable Contador incrementa una unidad **/
            
        } while ( contador < n ) ; /** FIN del Bucle de Impresion de Puntos de Equipos cuando el contador deja de ser mas peque�o que el numero de equipos **/
    
    } /** FIN DEL METDO VER PUNTOS DE TODOS LOS EQUIPOS **/

	private static void sobreescrituradepuntos (int [] puntos, int [][] resultados, int casa, int visitante) { /** METODO DE SOBRE ESCRITURA DE PUNTOS **/

        switch ( resultados[casa][visitante] ) { /** Eliminacion de Puntos de los Equipos **/
                
            case 1 : { /** En caso de que el equipo1 tuviera 1 punto **/
                
                puntos[casa] = puntos[casa] - resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia menos los que se introdujeron **/
                
                puntos[visitante] = puntos[visitante] - 1 ; /** Los puntos del equipo2 son los que tenia menos 1 **/
                
            } ; break ; /** FIN del Caso 1 | Los 2 equipos quedaron empate **/
                
            case 0 : { /** En caso de que el equipo1 tuviera 0 punto **/
            
            	puntos[casa] = puntos[casa] - resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia menos los que se introdujeron **/
                
                puntos[visitante] = puntos[visitante] - 3 ; /** Los puntos del equipo2 son los que tenia menos 3 **/
                
            } ; break ; /** FIN del Caso 2 | El equipo1 obtuvo 0 puntos y el equipo2 3 puntos **/
                
            case 3 : { /** En caso de que el equipo1 tuviera 3 punto **/
                
                puntos[casa] = puntos[casa] - resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia menos los que se introdujeron **/
                
                puntos[visitante] = puntos[visitante] - 0 ; /** Los puntos del equipo2 son los que tenia menos 0 **/
                
            } ; break ; /** FIN del Caso 3 | El equipo1 obtuvo 3 puntos y el equipo2 0 puntos **/
                
        } /** FIN de Switch  **/

} /** FIN DEL METODO DE SOBRE ESCRITURA DE PUNTOS **/

    private static void etiquetadorunequipo ( int Lecturadeequipo , String [] etiquetaequipos ) {  /** METODO ETIQUETA DE EQUIPO **/
    
    	if ( etiquetaequipos [ Lecturadeequipo ] == null ) { /** Comprobacion si la etiquetaequipo esta vacia **/
    	
    		System.out.println("\n\nElige un Nombre\n") ;       /** Etiqueta Lectura Nombre del Equipo **/
    	
    		etiquetaequipos [ Lecturadeequipo ] = leer.nextLine() ;   /** Lectura del Nombre del Equipo **/
        
        } else { /** Si la etiquetaquipo no esta vacia **/
        
        	sobreescrituradeetiqueta (etiquetaequipos, Lecturadeequipo) ;
        
        } /** Fin comprobacion etiquetaequipo **/
        
    } /** FIN METODO ETIQUETA DE EQUIPO **/

    private static void etiquetadorallequipo (String [] etiquetaequipos, int n) { /** METODO ETIQUETADOR DE TODOS LOS EQUIPOS **/
    
        int contador = 0 ; /** Inicializacion Variable Contador **/
        
        do { /** Bucle de Repeticion de Nombre de Equipo **/
            
            if(etiquetaequipos[contador] == null) { /** Comprobacion si la etiquetaequipo esta vacia **/
            
            	System.out.println("\n\nElige un Nombre para el equipo "+contador+" \n") ; /** Etiqueta Lectura Nombre del Equipo **/

            	etiquetaequipos[contador] = leer.nextLine() ; /** Lectura del Nombre del Equipo **/  
                
                contador++ ; /** La variable contador incrementa su valor en 1 **/
            
            } else { /** Si la etiquetaquipo no esta vacia **/
            
            	System.out.println("\n\n Equipo "+contador+" ") ; /** Etiqueta Lectura Nombre del Equipo **/

            	sobreescrituradeetiqueta (etiquetaequipos, contador) ;
            
            	contador++ ; /** La variable contador incrementa su valor en 1 **/
            
            } /** Fin comprobacion etiquetaequipo **/

        } while ( contador < n ) ; /** FIN del Bucle de Repeticion del Nombre de Equipo cuando el contador deja de ser mas peque�o que el Numero de Equipos **/ 
    
    } /** FIN DEL METODO ETIQUETADOR DE TODOS LOS EQUIPOS **/

    private static void equipoganador ( int n, int [] puntos, String [] etiquetaequipos, int [][] resultados) { /** METODO EQUIPO GANADOR **/
        
        int mayor = 0 ; /** Inicializacion de Variable Mayor a 0 **/
        int contador = 0 ; /** Inicializacion de Variable Contador a 0 **/
        int ganador = 0 ; /** Inicializacion de Variable Ganador a 0 **/
        int comprobacion = 0 ; /** Comprobacion de Variable Ganador a 0 **/
        
        do { /** Bucle de Repeticion de Comprobacion de Equipo Ganador **/
          
            if ( puntos[contador] > mayor ) { /** Comprobacion si los puntos del equipo es mayor que los puntos del ganador almacenados hasta el momento **/
                
                /** Si se cumple la condicion **/
                
                mayor = puntos[contador] ; /** mayor almacena los puntos totales de el nuevo equipo ganador **/ 
                
                ganador = contador ; /** ganador almacena el numero del nuevo equipo ganador **/
                
            } /** FIN de Comprobacion de si los puntos del equipo es mayor que los puntos del ganador almacenados hasta el momento **/
            
            contador++ ; /** La Variable Contador incrementa una unidad **/
            
        } while ( contador < n ) ; /** FIN del Bucle de Repeticion de Comoprobacion de Equipo Ganador cuando el contador deja de ser mas peque�o que el Numero de Equipos **/
        
        comprobacion = comprobacionequipo ( ganador, resultados, n ) ;
                    
        if ( comprobacion == 0 ) { /** Comprobacion de si hay puntos introducidos **/
        
        	if ( etiquetaequipos[ganador] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/ 
            
            	/** EN CASO AFIRMATIVO **/
            
            	System.out.println("\nEl Equipo con mas Puntos es el "+ganador+" con "+mayor+" puntos\n") ; /** Impresion Equipo Ganador **/
            
        	} else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            	/** EN CASO NEGATIVO **/
            
            	System.out.println("\nEl Equipo con mas Puntos es el "+ganador+" | "+etiquetaequipos[ganador]+" | con "+mayor+" puntos\n") ; /** Impresion Equipo Ganador **/
            
        	} /** FIN Comprobaci�n Etiqueta de Equipo **/
        
        } else { /** ELSE | Comprobacion de si hay puntos introducidos **/

			if ( etiquetaequipos[ganador] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/ 
            
            	/** EN CASO AFIRMATIVO **/
                            
            	System.out.println("\nEl Equipo con mas Puntos es el "+ganador+" con "+mayor+" puntos") ; /** Impresion Equipo Ganador **/
                System.out.println("Atencion | Aun no se han introducido todos los puntos\n") ; /** Impresion Advertencia | Aun no sen ha introducido todos los puntos **/

        	} else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            	/** EN CASO NEGATIVO **/
                
            	System.out.println("\nEl Equipo con mas Puntos es el "+ganador+" | "+etiquetaequipos[ganador]+" | con "+mayor+" puntos") ; /** Impresion Equipo Ganador **/
                System.out.println("Atencion | Aun no se han introducido todos los puntos\n") ; /** Impresion Advertencia | Aun no sen ha introducido todos los puntos **/

        	} /** FIN Comprobaci�n Etiqueta de Equipo **/
        	
        } /** Fin Comprobaci�n Existencia de puntos **/
        
    } /** FIN METODO EQUIPO GANADOR **/

    private static void calculodepuntos (int casa, int visitante, int [][] resultados, int [] puntos, String [] etiquetaequipos) { /** METODO DE CALCULO DE PUNTOS **/
    
        switch ( resultados[casa][visitante] ) { /** Calculo de Resultados de los Equipos **/
                
            case 1 : { /** En caso de que el equipo1 tenga 1 punto **/
                
                puntos[casa] = puntos[casa] + resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia mas los introducidos **/
                
                puntos[visitante] = puntos[visitante] + 1 ; /** Los puntos del equipo2 son los que tenia mas 1 **/
                
            } ; break ; /** FIN del Caso 1 | Los 2 equipos quedan empate **/
                
            case 0 : { /** En caso de que el equipo1 tenga 0 punto **/
                
                puntos[casa] = puntos[casa] + resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia mas los introducidos **/
                
                puntos[visitante] = puntos[visitante] + 3 ; /** Los puntos del equipo2 son los que tenia mas 3 **/
                
            } ; break ; /** FIN del Caso 2 | El equipo1 obtiene 0 puntos y el equipo2 3 puntos **/
                
            case 3 : { /** En caso de que el equipo1 tenga 3 punto **/
                
                puntos[casa] = puntos[casa] + resultados[casa][visitante] ; /** Los puntos del equipo1 son los puntos que tenia mas los introducidos **/
                
                puntos[visitante] = puntos[visitante] + 0 ; /** Los puntos del equipo2 son los que tenia mas 0 **/
                
            } ; break ; /** FIN del Caso 3 | El equipo1 obtiene 3 puntos y el equipo2 0 puntos **/
                
            default : { /** En caso de que los puntos leidos no sean validos **/
                
                erroretiquetaequipos (casa, etiquetaequipos) ; /** Llamada al Metodo erroretiquetaequipos **/
                
            } ; /** FIN OPCION DEFAULT **/
                
        } /** FIN de Switch  **/
    
    } /** FIN DEL METODO DE CALCULO DE PUNTOS **/

	private static void calculopuntosall(String [] etiquetaequipos, int [][] resultados, int [] puntos, int n) { /** METODO CALCULO DE TODOS LOS PUNTOS **/
    
    	int casa = 0 ; /** Inicializacion de Variable Casa a 0 **/
        int visitante = casa ; /** Inicializacion de Variable Visitante al Valor de Casa **/

        do { /** Bucle de Repeticion de Lectura de Puntos del Primer Equipo (LOCAL) **/
                            
        	do { /** Bucle de Repeticion de Lectura de Puntos del Segundo Equipo (VISITANTE) **/
                            
            	if ( visitante == casa ) { /** Comprobacion para evitar que un equipo juegue contra si mismo **/
                                
                	visitante++ ; /** La variable visitante incrementa en 1 su valor **/
                
                } else { /** ELSE Comprobacion para evitar que un equipo juegue contra si mismo **/
                
                	System.out.println("\n \n Introduce puntos\n") ; /** Impresion Mensaje Introducir Equipos **/
                                
                    escaneretiquetaequipos(casa, etiquetaequipos) ; /** Llamada al Metodo escaneretiquetaequipos **/
                                
                    System.out.println("\nVs") ; /** Impresion Vs **/
                                
                    escaneretiquetaequipos(visitante, etiquetaequipos) ; /** Llamada al Metodo escaneretiquetaequipos **/

					if ( resultados[casa][visitante] == -1 ) { /** Si no se ha introducido ningun punto anteriormente **/
					
						escanerpuntosetiquetaequipos (casa, etiquetaequipos) ; /** Llamada al metodo escanerpuntosetiquetaequipos **/

                    	do { /** Bucle de Lectura de Puntos **/
                                
                    		resultados[casa][visitante] = leer.nextInt() ; /** Lectura de puntos del Equipo(casa) Vs Equipo(visitante) (Equipo Local) **/
                                
                        	calculodepuntos(casa, visitante, resultados, puntos, etiquetaequipos) ; /** Llamada al metodo calculodepuntos **/
                                
                    	} while ( ( resultados[casa][visitante] != 1 ) && ( resultados[casa][visitante] != 0 ) && ( resultados[casa][visitante] != 3) ) ;  /** FIN del bucle cuando los puntos leidos son 1, 0, 3 **/
                                
                    	visitante++ ; /** La variable visitante incrementa su valor en 1 **/
                    	
                    } else { /** Si ya hay puntos introducidos **/
                    
                    	menusobreescritura ( puntos, resultados, casa, visitante, etiquetaequipos ) ; /** METODO Sobre Escritura de Puntos **/
                        
                        visitante++ ; /** La variable Visitante incrementa una unidad **/
                             	
                    } /** Fin Comprobacion existencia de puntos **/
                 
                 }  /** Fin Comprobacion Equipo Vs. Equipo **/
                        
            } while ( visitante < n ) ; /** FIN del Bucle de Lectura de Puntos del Segundo Equipo (VISITANTE) cuando es mayor que el numero de equipos **/
                        
            visitante = 0 ; /** RESET de la Variable visitante **/
            casa++ ; /** La Variable Contador incrementa una unidad **/
                    
        } while ( casa < n ) ; /** FIN del Bucle de Lectura de Puntos del Primer Equipo (LOCAL) cuando es mayor que el numero de equipos **/
    
    } /** FIN DEL METODO CALCULO DE TODOS LOS PUNTOS **/
    
    private static void erroretiquetaequipos(int casa, String [] etiquetaequipos){ /** METODO ERROR ETIQUETA EQUIPOS **/
    
        if ( etiquetaequipos[casa] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO AFIRMATIVO **/
            
            System.out.println("\n\nError, Puntos del Equipo "+casa+" no validos, Introduzca puntos (0, 1 o 3)\n") ; /** Impresion de error puntos no validos **/
            
        } else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO NEGATIVO **/
            
            System.out.println("\n\nError, Puntos del Equipo "+casa+" | "+etiquetaequipos[casa]+" | no validos, Introduzca puntos (0, 1 o 3)\n") ; /** Impresion de error puntos no validos **/
            
        } /** FIN Comprobacion Etiqueta de Equipo **/
    
    } /** FIN METODO ERROR ETIQUETA EQUIPOS **/
    
    private static void escanerpuntosetiquetaequipos(int equipo, String [] etiquetaequipos ) { /** METODO ESCANER PUNTOS ETIQUETA EQUIPOS **/
    
        if ( etiquetaequipos[equipo] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO AFIRMATIVO **/
            
            System.out.println("\nPuntos del Equipo "+equipo+":") ; /** Impresion de los puntos del equipo **/
            
        } else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO NEGATIVO **/
            
            System.out.println("\nPuntos del Equipo "+equipo+" | "+etiquetaequipos[equipo]+" | :") ; /** Impresion de los puntos del equipo **/
            
        } /** FIN Comprobacion Etiqueta de Equipo **/
        
    } /** FIN METODO ESCANER PUNTOS ETIQUETA EQUIPOS **/
    
    private static void escaneretiquetaequipos(int equipo, String [] etiquetaequipos ) { /** METODO ESCANER ETIQUETA EQUIPOS **/
        
        if ( etiquetaequipos[equipo] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO AFIRMATIVO **/
            
            System.out.println("\nEquipo "+equipo+"") ; /** Impresion del equipo **/
            
        } else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO NEGATIVO **/
            
            System.out.println("\nEquipo "+equipo+" | "+etiquetaequipos[equipo]+" |") ; /** Impresion del equipo **/
            
        } /** FIN Comprobacion Etiqueta de Equipo **/
        
    } /** FIN METODO ESCANER ETIQUETA EQUIPOS **/
    
    private static void verpuntosunequipo (String [] etiquetaequipos, int [] puntos, int n, int Lecturadeequipo ) { /** METODO VER PUNTOS DE UN EQUIPO **/
    
      if ( etiquetaequipos[Lecturadeequipo] == null ) { /** Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO AFIRMATIVO **/
            
            System.out.println("\nEl equipo "+Lecturadeequipo+" tiene un total de "+puntos[Lecturadeequipo]+" puntos\n") ; /** Impresion de los puntos del equipo **/
            
        } else { /** ELSE Comprobacion de si la etiqueta del Equipo esta Vacia **/
            
            /** EN CASO NEGATIVO **/
            
            System.out.println("\nEl equipo "+Lecturadeequipo+" | "+etiquetaequipos[Lecturadeequipo]+" | tiene un total de "+puntos[Lecturadeequipo]+" puntos\n") ; /** Impresion de los puntos del Equipo **/
        } /** FIN Comprobacion Etiqueta de Equipo **/
    
    } /** FIN DEL METODO VER PUNTOS DE UN EQUIPO **/
    
	private static void sobreescrituradeetiqueta (String [] etiquetaequipos, int equipo) { /** METODO SOBRE ESCRITURA ETIQUETA **/
    
    	int menu ; /** Inicializacion de la variable menu **/
    
    	System.out.println("\n\nYa has introducido una etiqueta en este equipo, Deseas sobreescribir la etiqueta?\nEscribe un 1 para Sobreescribirla, 2 Para ignorarla, 3 Para ver la etiqueta introducida") ; /** Impresion del mensaje de Advertencia **/
                             		
       	do { /** Bucle de Respuesta del Menu **/
       	
       		menu = leer.nextInt() ; /** Lectura de la opcion del menu  **/
            String Vacio = leer.nextLine() ;   /** String Vacio **/
         				
            switch ( menu ) { /** Menu **/
            
            	case 1: { /** Caso 1 | Sobre Escribir la etiqueta **/
            	
            		System.out.println("\n\nElige un Nombre\n") ;       /** Etiqueta Lectura Nombre del Equipo **/
    	
					etiquetaequipos [ equipo ] = leer.nextLine() ;   /** Lectura del Nombre del Equipo **/
            		             	
                } break ; /** Fin del Caso 1 **/
                
                case 2: { /** Caso 2 | Etiqueta Ignorada **/
                
                	System.out.println("\n\n Etiqueta Ignorada\n") ; /** Mensaje Etiqueta Ignorada **/
                	
                } break ; /** Fin del Caso 2 **/
                
                case 3: { /** Caso 3 | Ver Etiqueta existente **/
                
                	System.out.println("\n\n"+etiquetaequipos[equipo]+" \n"); /** Impresion de etiqueta existente **/
    				System.out.println("\n\nYa has introducido una etiqueta en este equipo, Deseas sobreescribir la etiqueta?\nEscribe un 1 para Sobreescribirla, 2 Para ignorarla, 3 Para ver la etiqueta introducida") ; /** Impresion del mensaje de Advertencia **/
		
                } break ; /** Fin del Caso 3 **/
                
                default: { /** En otro Caso **/
                
                	System.out.println("\n\nOpcion no valida\n\nEscribe un 1 para Sobreescribirla, 2 Para ignorarla, 3 Para ver la etiqueta existente");
                                				
                } break ; /** Fin de otro Caso **/
                                		
            } /** Fin del Switch Menu **/
                                		 
        } while ( menu != 1 && menu != 2 ) ; /** Fin del Bucle de Respuesta del Menu **/
                             		
   } /** FIN DEL METODO SOBRE ESCRITURA DE ETIQUETA **/
    
    private static void borrar (int [][] resultados, String [] etiquetaequipos, int n, int[]puntos) {
    
    int menu ; /** Inicializacion de la variable menu **/
    int comprobacion = -1 ;
    
    	System.out.println("\n\nQue deseas borrar?\n\nEscribe un 1 para borrar todos los puntos.\nEscribe un 2 para borrar todas las etiquetas.\nEscribe un 3 borrar todo.") ; /** Impresion del menu **/
                             		
       	do { /** Bucle de Respuesta del Menu **/
       	
       		menu = leer.nextInt() ; /** Lectura de la opcion del menu  **/
            String Vacio = leer.nextLine() ;   /** String Vacio **/
	
            switch ( menu ) { /** Menu **/
            
            	case 1: { /** Caso 1 | Borrar todos los puntos **/
            	
            		System.out.println("\nEstas seguro de que deseas eliminar todos los puntos?\nEscribe un 0 para un NO\nEscribe un 1 para un SI");
            		comprobacion = leer.nextInt() ; /** Lectura de la opcion comprobacion  **/
            		Vacio = leer.nextLine() ;   /** String Vacio **/

            		if ( comprobacion == 1 ) {
            			
            			inicializacionresultados ( resultados, n ) ;
            			inicializacionpuntos ( puntos, n ) ;
            			
            			System.out.println("\nDatos eliminados correctamente\n\n") ;

            		}
            	
            	} break ; /** Fin del Caso 1 **/
                
                case 2: { /** Caso 2 | Puntos Ignorados **/
                
					System.out.println("\nEstas seguro de que deseas eliminar todas los nombres de los equipos?\nEscribe un 0 para un NO\nEscribe un 1 para un SI");
            		comprobacion = leer.nextInt() ; /** Lectura de la opcion comprobacion  **/
            		Vacio = leer.nextLine() ;   /** String Vacio **/

            		if ( comprobacion == 1 ) {
            			
						inicializacionetiqueta (etiquetaequipos , n) ;
            			
            			System.out.println("\nDatos eliminados correctamente\n\n") ;
            		}	
                	
                } break ; /** Fin del Caso 2 **/
                
                case 3: { /** Caso 3 | Borrar Todo **/
                
            		System.out.println("\nEstas seguro de que deseas eliminar todos los datos de la liga?\nEscribe un 0 para un NO\nEscribe un 1 para un SI");
            		comprobacion = leer.nextInt() ; /** Lectura de la opcion comprobacion  **/
            		Vacio = leer.nextLine() ;   /** String Vacio **/

            		if ( comprobacion == 1 ) {
            			
            			inicializacionresultados ( resultados, n ) ;
						inicializacionetiqueta (etiquetaequipos , n) ;
            			inicializacionpuntos ( puntos, n ) ;
            			
            			System.out.println("\nDatos eliminados correctamente\n\n") ;
            		}	
            			
                } break ; /** Fin del Caso 3 **/
                
                default: { /** En otro Caso **/
                
    				System.out.println("\n\nOpcion no valida\nEscribe un 1 para borrar todos los puntos.\nEscribe un 2 para borrar todas las etiquetas.\nEscribe un 3 borrar todo.") ; /** Impresion del menu **/
                                				
                } break ; /** Fin de otro Caso **/
                                		
            } /** Fin del Switch Menu **/
                                		 
        } while ( menu != 1 && menu != 2 && menu != 3 ) ; /** Fin del Bucle de Respuesta del Menu **/	
    
    
    
    }
    
    private static void inicializacionpuntos (int []puntos, int n) { /** METODO INICIALIZACION VECTOR PUNTOS **/
		
		int contador = 0 ; /** Inicializacion de Variable Contador a 0 **/
            
    		do { /** Bucle de Recorrido del Vector Puntos **/ 
        
        		puntos[contador] = 0 ; /** Inicializa el vector a -1 **/
            
            	contador++ ; /** La Variable Contador incrementa una unidad **/
            
        	} while ( contador < n ) ;         

} /** FIN METODO INICIALIZACION VECTOR PUNTOS **/
    
    private static void inicializacionetiqueta ( String  [] etiquetaequipos , int n ) { /** METODO INICIALIZACION STRING ETIQUETA **/
    
    int contador = 0 ; /** Inicializacion de Variable Contador a 0 **/
            
    		do { /** Bucle de Recorrido del Vector Puntos **/ 
        
        		etiquetaequipos[contador] = null ; /** Inicializa el vector a -1 **/
            
            	contador++ ; /** La Variable Contador incrementa una unidad **/
            
        	} while ( contador < n ) ;         

	} /** FIN METODO INICIALIZACION STRING ETIQUETA **/
    
    public static void main( String [] args ) {               /** METODO PRINCIPAL **/
    
        int n =  Integer.parseInt( args[0] ) ;                /** Declaracion Variable "n" Numero total de equipos **/
        
        int[][] resultados = new int [n][n] ;                 /** Inicializacion y Declaracion Matriz de Resultados **/
        
        inicializacionresultados ( resultados , n ) ;		  /** Metodo Inicializacion Vector Resultados a -1 **/
        
        int LecturaMenu ;                                     /** Declaracion Variable de Lectura del Menu **/
        
        int[]puntos = new int [n] ;                           /** Inicializacion y  Declaracion Vector de Puntos Totales **/
        
        String etiquetaequipos[] = new String [n] ;           /** Declaracion Vector de Etiqueta de Equipos **/
        
        System.out.println("\n \n ~~ Inicio de la Practica Final ~~ \n ~~ Gestion de Liga ~~ \n") ;   /** Cabecera **/

        do { /** Bucle Menu Principal **/
            
            imprimirMenu ( ) ; 	/** METODO Impresion de las opciones del Menu **/
                        
            LecturaMenu = leer.nextInt() ;  /** Lectura Opcion Menu **/ 
                
            switch ( LecturaMenu ) { /** Bucle Lectura de Menu **/
                                
                case 1: { /** Opcion Menu 1 | Introducir puntos de un partido concreto **/ 
                    
                    int casa ; /** Inicializacion de la variable Casa **/
                    int visitante ; /** Inicializacion de la variable Visitante **/
                    int comprobacion ; /** Iniciailzacion de la variable Comprobacion **/
                    
                    do { /** Bucle de Lectura de Puntos **/
                        
                        System.out.println("\n \n Introduce de que partido deseas introducir los puntos\n") ; /** Impresion Mensaje Introducir Equipos **/
                        
                        System.out.println("Equipo que juega en casa:") ; /** Impresion Mensaje LOCAL **/
                        casa = leer.nextInt() ;                        /** Lectura Casa **/

                        System.out.println("\nEquipo Visitante:") ;       /** Impresion Mensaje VISITANTE **/
                        visitante = leer.nextInt() ;                        /** Lectura Visitante**/
                        
                        comprobacion = existenciaequipos ( casa, visitante, n ) ; /** Metodo Comprobacion de la existencia de los equipos **/
                        
                        if ( comprobacion == 1 ) { /** Si ambos equipos existen **/
                        	
                        	if ( casa == visitante ) { /** Si el equipo Visitante es el mismo que el equipo de casa **/
                        		
                        			System.out.println("\n\nError, El equipo "+casa+" no puede jugar contra si mismo\n") ; /** Error, los equipos son los mismos **/
                               		
                             } else { /** Si los equipos son distintos **/
                             
                             	escanerpuntosetiquetaequipos (casa, etiquetaequipos) ; /** Llamada al metodo escanerpuntosetiquetaequipos **/
									
								if ( resultados[casa][visitante] == -1 ) { /** Si no se ha introducido ningun punto anteriormente **/
                                		
                                	resultados[casa][visitante] = leer.nextInt() ; /** Lectura de puntos del equipo1 (Equipo Local) **/
                           	
                                	calculodepuntos(casa, visitante, resultados, puntos, etiquetaequipos) ; /** Llamada al metodo calculodepuntos **/
                             		
                             	} else { /** Si ya hay puntos introducidos **/
                             		
                             		menusobreescritura ( puntos, resultados, casa, visitante, etiquetaequipos ) ; /** METODO Sobre Escritura de Puntos **/
                             		
                             	} /** Fin comprobacion existencia de puntos **/
                             
                             } /** Fin de comprobacion de equipos **/
                             		   
                        } else { /** Si alguno de los dos equipos no existen **/
                            
                        	if ( comprobacion == 0 ) { /** Si el equipo Casa no existe **/
                            	
                            	System.out.println("\n\nError, El equipo "+casa+" no existe\n") ; /** Impresion Mensaje de Error | Casa No existe **/
                            	
                            } else { /** Si el equipo Visitante no existe **/
                            	
                            	System.out.println("\n\nError, El equipo "+visitante+" no existe\n") ; /** Impresion Mensaje de Error | Visitante No existe **/
                            	
                            } /** Fin comprobacion existencia de equipos **/
                            	
                        } /** Fin comprobacion existencia de equipos **/
                          
                    } while ( ( casa < n ) && ( visitante < n ) && ( resultados[casa][visitante] != 1 ) && ( resultados[casa][visitante] != 0 ) && ( resultados[casa][visitante] != 3) || ( casa == visitante ) ) ;  /** FIN del bucle cuando los puntos leidos son 1, 0, 3 y Casa es distinto de Visitante y los equipos estan dentro de los n posibles **/
                    
                } break ; /** FIN OPCION 1 **/
                
                case 2: { /** Opcion Menu 2 | Introducir puntos de todos los partidos **/
                
                	calculopuntosall(etiquetaequipos, resultados, puntos, n);                 
                                        
                } ; break ; /** FIN OPCION 2 **/
                    
                case 3: { /** Opcion Menu 3 | Ver puntos de equipo concreto **/
                    
                    int Lecturadeequipo ; /** Inicializacion de la Variable Lecturadeequipo **/
                    int comprobacion ;
                    
                    System.out.println("\n\nElige un Equipo\n") ; /** Impresion Elegir un Equipo **/

					Lecturadeequipo = leer.nextInt() ;                    /** Lectura Equipo del que se quiere ver los puntos **/
                    
                    if (Lecturadeequipo < n) {
                    
                    	comprobacion = comprobacionequipo ( Lecturadeequipo, resultados, n ) ;
                    
                    	if ( comprobacion == 0 ) { /** Comprobacion de si hay puntos introducidos **/
                       
                        	verpuntosunequipo(etiquetaequipos, puntos, n, Lecturadeequipo) ; /** Llamada al Metodo verpuntosunequipo **/
                    
                    	} else { /** ELSE | Comprobacion de si hay puntos introducidos **/
                        
                       		System.out.println("\nAtencion | aun no has introducido todos los puntos del equipo\n") ; /** Impresion Advertencia | Aun no se ha introducido todos los puntos **/
                    
                    		verpuntosunequipo(etiquetaequipos, puntos, n, Lecturadeequipo ) ; /** Llamada al Metodo verpuntosunequipo **/
                    	
                    	}
                    	
                    } else {
                    
                    	System.out.println("\nError | el equipo no existe\n") ; /** Impresion Error | Aun no se ha introducido ningun punto **/

                    } /** FIN Comprobacion de si hay puntos introducidos **/
                    
                } break ; /** FIN OPCION 3 **/
                
                case 4: { /** Opcion Menu 4 | Ver puntos de todos los equipos **/
                    
                   verpuntosallequipos (etiquetaequipos, puntos, n, resultados) ; /** Llamada al Metodo verpuntosallequipos **/
                        
                } ; break ; /** FIN OPCION 4 **/
                
                case 5: { /** Opcion Menu 5 | Ver Equipo Ganador **/
                
                	equipoganador (n, puntos, etiquetaequipos, resultados) ; /** Llamada al Metodo equipoganador **/

                } break ; /** FIN OPCION 5 **/
                    
                case 6: { /** Opcion Menu 6 | Introducir nombre de un equipo concreto **/
                    
                    int Lecturadeequipo ; /** Inicializacion de la Variable de Lectura de Equipo al que se desea Asignar un Nombre **/

                    do { /** Inicio de Bucle **/
                        
                        System.out.println("\n\nElige un Equipo\n") ;          /** Etiqueta Lectura de equipo al que se desea asignar un nombre **/
                        Lecturadeequipo = leer.nextInt() ;                             /** Lectura Equipo al que se desea asignar un Nombre **/
                        String Vacio = leer.nextLine() ;   /** String Vacio **/

                    
                    } while ( Lecturadeequipo > n ) ;   /** FIN de Bucle | Este se repite hasta que no se introduzca un equipo dentro del rango de los "n" equipos **/ 
                    
                    etiquetadorunequipo ( Lecturadeequipo, etiquetaequipos ) ;       /** Llamada al Metodo etiquetadorequipo **/

                } break ; /** FIN OPCION 6 **/
                    
                case 7: { /** Opcion Menu 7 | Introducir nombre de todos los equipos **/ 
                    
                    String Vacio = leer.nextLine() ;   /** String Vacio **/

                    etiquetadorallequipo (etiquetaequipos, n) ; /** Llamada al Metodo etiquetadorallequipo **/
                                       
                } break ; /** FIN OPCION 7 **/
                
                case 8: { /** Opcion Menu 8 | Borrar Todo **/
                
                	borrar ( resultados, etiquetaequipos, n, puntos ) ; /** Metodo Borrar **/
                
                } break ; /** FIN OPCION 8 **/
                
                case 9: { } break ; /** Opcion Menu 9 | FIN del Programa **/

                default: { /** Opcion Menu Default | Opcion No Valida **/
                    
                    System.out.println("\n \n Error, Opcion no Valida, intentelo de nuevo \n \n") ; /** Impresion Error | Opcion de Menu No Valida **/
                
                } break ; /** FIN OPCION DEFAULT **/
            
            } /** FIN Bucle Lectura de Menu **/
        
        } while ( LecturaMenu != 9  ) ;   /** FIN de Bucle Menu Principal con Opcion 9 **/
        
        System.out.println("\n \n ~~ Fin del Programa ~~\n \n") ;     /** FIN del Programa **/

    }  /** FIN del main **/ 
    
}  /** FIN de la clase **/
}