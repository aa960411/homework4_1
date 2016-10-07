
import java.util.*;

public class B {

    int count = 0;

        public static void main(String[] args)
	    {
	            new B().start();
		        }
			    void start()
			        {
				        Scanner s = new Scanner(System.in);
					        System.out.print("To compare the number is  : ");
						        count = s.nextInt();
								
								        print(count);

									    }

									        void print(int c)
										    {
										            int max = Integer.MIN_VALUE;
											            int min = Integer.MAX_VALUE;
												            Scanner s = new Scanner(System.in);
													            
														            int[] intAraay = new int[count];
															            for(int i=0; i<c; i++)
																            {
																	              
																		                  intAraay[i] = s.nextInt();
																				              if(intAraay[i] > max)
																					                  {
																							                  max = intAraay[i];
																									              }
																										                  if(intAraay[i] < min)
																												              {
																													                      min = intAraay[i];
																															                  }
																																	          }
																																		          System.out.println("MAX : " + max);
																																			          System.out.println("MIN : " + min);
																																				      }
																																				      }
