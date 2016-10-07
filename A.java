
import java.util.*;


public class A {
    public static void main(String[] args)
        {
	        new A().input();
		    }

		        void input()
			    {
			            Scanner s = new Scanner(System.in);
				            System.out.print("input your house size ( square meter ) : ");
					            double a = s.nextDouble();
						            double pyung = a/3.305;
							            System.out.println("house pyung is  " + pyung );
								            apt(pyung);
									        }

										    void apt(double p)
										        {
											        if(p<15) { 
													System.out.println(" very small size "+ "apartment ") ;
														}
														        else if(p>=15 && p<30){
																System.out.println(" small size " +"apartment " );
																	}
																	        else if(p>=30 && p<50){ 
																			System.out.println(" middle size" + "apartment") ;
																				}
																				        else if (p>=50){																		System.out.println( " big size " + "apartment " ) ;
																							}
																							  

																							      }
																							      }
