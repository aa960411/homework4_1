import java.util.*;


public class C {

    int count = 0;
      

          public static void main(String[] args)
	      {
	              new C().start();
		          }

			      void start()
			          {
				          Scanner s = new Scanner(System.in);
					          System.out.print("input month : ");
						          int month = s.nextInt();
							          System.out.print("input day : ");
								          int days = s.nextInt();
									          monthCount(month);
										          day(days);

											      }

											          void monthCount(int month)
												      {
												              while (month>1)
													              {
														                  if (month <= 12 && month >= 1) {
																                  if (month == 2) {
																		                      count += 28;
																				                          --month;
																							                  } else if (month == 4 || month == 6 || month == 9 || month == 11) {
																									                      count += 30;
																											                          --month;
																														                  } else  {
																																                      count += 31;
																																		                          --month;
																																					                  }
																																							              }
																																								                  
																																										          }
																																											      }

																																											          void day(int days)
																																												      {

																																												              if(days <=  31 && days > 0) { 
																																													      	System.out.println("it is " +(days+count)+" days of year "); 
																																															}
																																															    }
																																															    }
