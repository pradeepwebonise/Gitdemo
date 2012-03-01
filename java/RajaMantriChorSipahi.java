public class RajaMantriChorSipahi extends Activity {
	@Override
	public void OnBackPressed() {
	}

	@Override
	protected void OnPostResume() {
		// TODO Auto-generated method stub
		super.OnPostResume();
	}

	@Override
	public boolean OnKeyDown(int keyCode, KeyEvent event) {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		dialog.setTitle("Exit game!");
		dialog.setMessage("Are you sure you want to exit the game?");
		dialog.setButton("Exit", new DialogInterface.OnClickListener() {
			public void OnClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		dialog.setButton2("Cancel", new DialogInterface.OnClickListener() {
			public void OnClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		dialog.show();
		return super.OnKeyDown(keyCode, event);
	}

	@Override
	public void OnLowMemory() {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		dialog.setTitle("Low memory!");
		dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
		dialog.setButton("Exit", new DialogInterface.OnClickListener() {
			public void OnClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		dialog.show();
		super.OnLowMemory();
	}
	@Override
	protected void OnPause() {
		// TODO Auto-generated method stub
		super.OnPause();
	}
	// DECLARE VARIABLES, PARAMETERS 
	String[] solution_array = { "RAJA", "MANTRI", "CHOR", "SIPAHI"};
	String[] players_array = {"player_one", "player_two", "Player3", "player_four"};
	static String player_one_name = "" ;
	static String player_two_name = "";
	static String player_three_name = "";
	static String player_four_name = "";
	static String player_one_role = "";
	static String player_two_role = "";
	static Stringplayer_three_role = "";
	static String player_four_role = "";
	static boolean guess = false;
	static String player_one = "";
	static String player_two = "";
	static String player_three = "";
	static String player_five = "";
	static int i=0,j=0,k=0,l=0;
	static intp_one_score = 0;
	static int p_two_score = 0;
	static int p_three_score = 0;
	static int p_four_score = 0;
	int count = 0;

	Button btn_RajaMantri;
	Button btn_Help;
	ImageView btn9;
	Button btn_Play;
	static Button btn_pod_one;
	static Button btn_pod_two;
	static Button btn_pod_three;
	static Button btn_pod_four;
	Button btn_show_result;
	Button btn_show_result;
	Button btn_signin;
	Button btn_guess;
	EditText editTxtPlayer_one;
	EditText editTxtPlayer_two;
	EditText edittxtPlayer_three;
	EditText editTxtPlayer_four;
	EditText edit_two;
	EditText edit_three;
	EditText edit_four;

	TextView lblPlayer_one;
	TextView lblPlayer_two;
	TextView lblPlayer_three;
	TextView lblPlayer_four;
	static TextView txtTurn;
	static TextView txtPlayer_one;
	static TextView txtPlayer_two;
	static TextView txtPlayer_three;
	static TextView txtPlayer_four;
	Bundle savedInstanceState_two;
	Button btn_main_menu;
	String next_turn = "";
    public void OnRestart(){
    	super.OnRestart();
    }

    public void OnResume(){

    	super.OnResume();
    }

    public void OnCreate(Bundle savedInstanceState) {
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        i = 0;
        j = 0;
        k = 0;
        l = 0;
        btn_Help = (Button)findViewById(R.id.btn_Help);
        btn_Help.setOnClickListener(new OnClickListener() {

			public void OnClick(View v) {
				setContentView(R.layout.help);
				 // Create the adView
			    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
			    // Lookup your LinearLayout assuming it’s been given
			    // the attribute android:id="@+id/mainLayout"
			    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutHelp);
			    // Add the adView to it
			    layout.addView(adView);
			    // Initiate a generic request to load it with an ad
			    adView.loadAd(new AdRequest());
				TextView txtHelp = (TextView)findViewById(R.id.txtHelp);
				String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
				txtHelp.setText(text);
				Button btnBack = (Button)findViewById(R.id.btn_main_menuHelp);
				btnBack.setOnClickListener(new OnClickListener() {

					public void OnClick(View v) {

						Intent i = new Intent(RajaMantri.this, RajaMantri.class);
						RajaMantri.this.startActivity(i);
						finish();

					}
				});
			}
		});
        btn_RajaMantri = (Button) findViewById(R.id.btn_RajaMantri);
        btn_RajaMantri.setOnClickListener(new OnClickListener() {

 		public void OnClick(View v) {
 			// TODO Auto-generated method stub
 		setContentView(R.layout.rmcsp);
 		 // Create the adView
	    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
	    // Lookup your LinearLayout assuming it’s been given
	    // the attribute android:id="@+id/mainLayout"
	    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutPlayer);
	    // Add the adView to it
	    layout.addView(adView);
	    // Initiate a generic request to load it with an ad
	    adView.loadAd(new AdRequest());

 		editTxtPlayer_one = (EditText) findViewById(R.id.editTxtPlayer_one);
 		editTxtPlayer_two = (EditText)findViewById(R.id.editTxtPlayer_two);
 		edittxtPlayer_three = (EditText)findViewById(R.id.edittxtPlayer_three);
 		editTxtPlayer_four = (EditText)findViewById(R.id.editTxtPlayer_four);

 		lblPlayer_one = (TextView) findViewById(R.id.lblPlayer_one);
 		lblPlayer_two = (TextView) findViewById(R.id.lblPlayer_two);
 		lblPlayer_three = (TextView) findViewById(R.id.lblPlayer_three);
 		lblPlayer_four = (TextView) findViewById(R.id.lblPlayer_four);

 		Display display = getWindowManager().getDefaultDisplay();
 		int width = display.getWidth();
 		int height = display.getHeight();



 		lblPlayer_one.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer_two.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer_three.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer_four.setGravity(Gravity.CENTER_HORIZONTAL);


 		Log.v("AkandBakar", "Playernames:" + player_one_name);
 		Log.v("AkandBakar", "Playernames:" + player_two_name);
 		Log.v("AkandBakar", "Playernames:" + player_three_name);
 		Log.v("AkandBakar", "Playernames:" + player_four_name);

 		btn_main_menu = (Button) findViewById(R.id.btn_main_menu);
 		btn_main_menu.setOnClickListener(new OnClickListener() {


			public void OnClick(View v) {
				Intent i = new Intent(RajaMantri.this, RajaMantri.class);
				RajaMantri.this.startActivity(i);
				finish();

			}
		});

 		btn_signin = (Button) findViewById(R.id.btn_signin);
 		btn_signin.setOnClickListener(new OnClickListener() {

			public void OnClick(View v) {
				// TODO Auto-generated method stub

				player_one_name = editTxtPlayer_one.getText().toString();
		 		player_two_name = editTxtPlayer_two.getText().toString();
		 		player_three_name = edittxtPlayer_three.getText().toString();
		 		player_four_name = editTxtPlayer_four.getText().toString();


				if(player_one_name.equals("")||player_two_name.equals("")||player_three_name.equals("")||player_four_name.equals("")){

					Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
					toast.show();

				}else{
					setContentView(R.layout.rmcsgnew);
					 // Create the adView
				    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
				    // Lookup your LinearLayout assuming it’s been given
				    // the attribute android:id="@+id/mainLayout"
				    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
				    // Add the adView to it
				    layout.addView(adView);
				    // Initiate a generic request to load it with an ad
				    adView.loadAd(new AdRequest());

					txtTurn = (TextView)findViewById(R.id.txtTurn);
					txtTurn.setText("Click on SHUFFLE!");
					players_array[0] = player_one_name;
			 		players_array[1] = player_two_name;
			 		players_array[2] = player_three_name;
			 		players_array[3] = player_four_name;



					txtPlayer_one = (TextView) findViewById(R.id.txtPlayer_one);
					txtPlayer_one.setText("1."+player_one_name + " [" +p_one_score + "]");

					txtPlayer_two = (TextView) findViewById(R.id.txtPlayer_two);
					txtPlayer_two.setText("2."+player_two_name+ " [" + p_two_score + "]");

					txtPlayer_three = (TextView) findViewById(R.id.txtPlayer_three);
					txtPlayer_three.setText("3."+player_three_name+ " [" + p_three_score + "]");

					txtPlayer_four = (TextView) findViewById(R.id.txtPlayer_four);
					txtPlayer_four.setText("4."+player_four_name+ " [" + p_four_score + "]");

				btn_Play = (Button) findViewById(R.id.btn_Play);

				btn_Play.setOnClickListener(new OnClickListener() {

		 			public void OnClick(View v) {
		 				// TODO Auto-generated method stub

		 				if(btn_Play.getText().equals("SHUFFLE")){

		 					RajaMantri.this.shuffle();

		 				}else{


		 					RajaMantri.this.makeGuess();

		 					Log.v("RajaMantri", "########## Player Name:" + player_one_name +" Role:" + player_one_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player_two_name +" Role:" + player_two_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player_three_name +" Role:" +player_three_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player_four_name +" Role:" + player_four_role);
						}


		 			}
		 		});



				}

		     }

		 	});
			}


		});


    }


    public void makeGuess(){

    	btn_Play.setText("SHUFFLE");
			count = 0;
			btn_Play.setText("SHUFFLE");

			btn_pod_one.setClickable(true);
			btn_pod_two.setClickable(true);
			btn_pod_three.setClickable(true);
			btn_pod_four.setClickable(true);

		if(player_one.equals("RAJA")){

			btn_pod_one.setText("RAJA");
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_one.setClickable(false);
		}
		if(player_two.equals("RAJA")){

			btn_pod_two.setText("RAJA");
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setClickable(false);
		}
		if(player3.equals("RAJA")){

			btn_pod_three.setText("RAJA");
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setClickable(false);
		}
		if(player_four.equals("RAJA")){

			btn_pod_four.setText("RAJA");
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setClickable(false);
		}

		if(player_one.equals("MANTRI")){

			btn_pod_one.setText("MANTRI");
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_one.setClickable(false);
		}
		if(player_two.equals("MANTRI")){

			btn_pod_two.setText("MANTRI");
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setClickable(false);
		}
		if(player3.equals("MANTRI")){

			btn_pod_three.setText("MANTRI");
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setClickable(false);
		}
		if(player_four.equals("MANTRI")){

			btn_pod_four.setText("MANTRI");
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setClickable(false);

		}

		if(player_one_role.equals("MANTRI")){
			txtTurn.setText(player_one_name + " will find the CHOR!");
		}
		if(player_two_role.equals("MANTRI")){
			txtTurn.setText(player_two_name + " will find the CHOR!");
		}
		if(player_three_role.equals("MANTRI")){
			txtTurn.setText(player_three_name + " will find the CHOR!");
		}
		if(player_four_role.equals("MANTRI")){
			txtTurn.setText(player_four_name + " will find the CHOR!");
		}

		Log.v("AkhandBakar","#########" + btn_pod_one.getText());

		if(btn_pod_one.getText().equals("")){

			btn_pod_one.setOnClickListener(new OnClickListener() {


				public void OnClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player_one);
					if(player_one.equals("CHOR")){

						RajaMantri.guess = true;
						btn_pod_one.setBackgroundResource(R.drawable.podopen);
						btn_pod_one.setText("CHOR");

					}else{

						RajaMantri.guess = false;
						btn_pod_one.setBackgroundResource(R.drawable.podopen);
						btn_pod_one.setText("SIPAHI");
					}
					btn_pod_one.setClickable(false);
					btn_pod_two.setClickable(false);
					btn_pod_three.setClickable(false);
					btn_pod_four.setClickable(false);
					UpdateScore();
				}
			});
		}


		Log.v("AkhandBakar","#########" + btn_pod_two.getText());
		if(btn_pod_two.getText().equals("")){

			btn_pod_two.setOnClickListener(new OnClickListener() {

				public void OnClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player_two);
					if(player_two.equals("CHOR")){

						RajaMantri.guess = true;
						btn_pod_two.setBackgroundResource(R.drawable.podopen);
						btn_pod_two.setText("CHOR");
					}else{

						RajaMantri.guess = false;
						btn_pod_two.setBackgroundResource(R.drawable.podopen);
						btn_pod_two.setText("SIPAHI");

					}
					btn_pod_one.setClickable(false);
					btn_pod_two.setClickable(false);
					btn_pod_three.setClickable(false);
					btn_pod_four.setClickable(false);
					UpdateScore();
				}
			});
		}

		Log.v("AkhandBakar","#########" + btn_pod_three.getText());
		if(btn_pod_three.getText().equals("")){

			btn_pod_three.setOnClickListener(new OnClickListener() {


				public void OnClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player3);
					if(player3.equals("CHOR")){

						RajaMantri.guess = true;
						btn_pod_three.setBackgroundResource(R.drawable.podopen);
						btn_pod_three.setText("CHOR");
					}else{

						RajaMantri.guess = false;
						btn_pod_three.setBackgroundResource(R.drawable.podopen);
						btn_pod_three.setText("SIPAHI");

					}
					btn_pod_one.setClickable(false);
					btn_pod_two.setClickable(false);
					btn_pod_three.setClickable(false);
					btn_pod_four.setClickable(false);
					UpdateScore();
				}
			});
		}


		Log.v("AkhandBakar","#########" + btn_pod_four.getText());
		if(btn_pod_four.getText().equals("")){

			btn_pod_four.setOnClickListener(new OnClickListener() {


				public void OnClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player_four);
					if(player_four.equals("CHOR")){

						RajaMantri.guess = true;
						btn_pod_four.setBackgroundResource(R.drawable.podopen);
						btn_pod_four.setText("CHOR");
					}else{

						RajaMantri.guess = false;
						btn_pod_four.setBackgroundResource(R.drawable.podopen);
						btn_pod_four.setText("SIPAHI");

					}
					btn_pod_one.setClickable(false);
					btn_pod_two.setClickable(false);
					btn_pod_three.setClickable(false);
					btn_pod_four.setClickable(false);
					UpdateScore();
				}
			});
		}

    }


    public void shuffle(){

    	btn_Play.setText("Guess");
			btn_Play.setClickable(false);
			ShuffleArray(solution_array);
			txtTurn.setText(player_one_name + "'s" + " turn!");
			next_turn = player_two_name;
			btn_pod_one = (Button)findViewById(R.id.btn_pod_one);
			btn_pod_one.setBackgroundResource(R.drawable.podtlclosed);
			btn_pod_one.setOnClickListener(new OnClickListener() {

				public void OnClick(View v) {
					// TODO Auto-generated method stub
					player_one = solution_array[0];
					btn_pod_one.setText(player_one);
					btn_pod_one.setBackgroundResource(R.drawable.podopen);
					btn_pod_two.setClickable(false);
					btn_pod_three.setClickable(false);
					btn_pod_four.setClickable(false);
					if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){

						if(player_one.equals("MANTRI")){

							player_one_role = "MANTRI";
						}
						if(player_one.equals("RAJA")){

							player_one_role = "RAJA";
						}
						if(player_one.equals("SIPAHI")){

							player_one_role = "SIPAHI";
						}
						if(player_one.equals("CHOR")){

							player_one_role = "CHOR";
						}


						next_turn = player_two_name + "'s" + " turn!";

					}
					if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){

						if(player_one.equals("MANTRI")){

							player_two_role = "MANTRI";
						}
						if(player_one.equals("RAJA")){

							player_two_role = "RAJA";
						}
						if(player_one.equals("SIPAHI")){

							player_two_role = "SIPAHI";
						}
						if(player_one.equals("CHOR")){

							player_two_role = "CHOR";
						}

						next_turn = player_three_name + "'s" + " turn!";

					}
					if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){

						if(player_one.equals("MANTRI")){

							player_three_role = "MANTRI";
						}
						if(player_one.equals("RAJA")){

							player_three_role = "RAJA";
						}
						if(player_one.equals("SIPAHI")){

							player_three_role = "SIPAHI";
						}
						if(player_one.equals("CHOR")){

							player_three_role = "CHOR";
						}

						next_turn = player_four_name + "'s" + " turn!";

					}

					if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){

						if(player_one.equals("MANTRI")){

							player_four_role = "MANTRI";
						}
						if(player_one.equals("RAJA")){

							player_four_role = "RAJA";
						}
						if(player_one.equals("SIPAHI")){

							player_four_role = "SIPAHI";
						}
						if(player_one.equals("CHOR")){

							player_four_role = "CHOR";
						}


						next_turn = "Click on Guess!";

					}

					txtTurn.setText("Click again to close the chit!");



					btn_pod_one.setOnClickListener(new OnClickListener() {

						public void OnClick(View v) {
							// TODO Auto-generated method stub
							btn_pod_one.setClickable(false);
							count++;
							btn_pod_one.setText("");
							btn_pod_one.setBackgroundResource(R.drawable.podtlhalf);
							txtTurn.setText(next_turn);
							btn_pod_two.setClickable(true);
							btn_pod_three.setClickable(true);
							btn_pod_four.setClickable(true);
							if(count == 4){

								txtTurn.setText("Click on Guess!");
								btn_Play.setClickable(true);
								count = 0;

							}
						}
					});
				}
			});

			btn_pod_two = (Button)findViewById(R.id.btn_pod_two);
			btn_pod_two.setBackgroundResource(R.drawable.podtrclosed);
			btn_pod_two.setOnClickListener(new OnClickListener() {

					public void OnClick(View v) {
						// TODO Auto-generated method stub
						player_two = solution_array[1];
						btn_pod_two.setText(player_two);
						btn_pod_two.setBackgroundResource(R.drawable.podopen);
						btn_pod_one.setClickable(false);
						btn_pod_three.setClickable(false);
						btn_pod_four.setClickable(false);
						if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){

							if(player_two.equals("MANTRI")){

								player_one_role = "MANTRI";
							}
							if(player_two.equals("RAJA")){

								player_one_role = "RAJA";
							}
							if(player_two.equals("SIPAHI")){

								player_one_role = "SIPAHI";
							}
							if(player_two.equals("CHOR")){

								player_one_role = "CHOR";
							}

							next_turn = player_two_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){

							if(player_two.equals("MANTRI")){

								player_two_role = "MANTRI";
							}
							if(player_two.equals("RAJA")){

								player_two_role = "RAJA";
							}
							if(player_two.equals("SIPAHI")){

								player_two_role = "SIPAHI";
							}
							if(player_two.equals("CHOR")){

								player_two_role = "CHOR";
							}

							next_turn = player_three_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){

							if(player_two.equals("MANTRI")){

								player_three_role = "MANTRI";
							}
							if(player_two.equals("RAJA")){

								player_three_role = "RAJA";
							}
							if(player_two.equals("SIPAHI")){

								player_three_role = "SIPAHI";
							}
							if(player_two.equals("CHOR")){

								player_three_role = "CHOR";
							}

							next_turn = player_four_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){

							if(player_two.equals("MANTRI")){

								player_four_role = "MANTRI";
							}
							if(player_two.equals("RAJA")){

								player_four_role = "RAJA";
							}
							if(player_two.equals("SIPAHI")){

								player_four_role = "SIPAHI";
							}
							if(player_two.equals("CHOR")){

								player_four_role = "CHOR";
							}

							next_turn = "Click on Guess!";

						}
						txtTurn.setText("Click again to close the chit!");
						btn_pod_two.setOnClickListener(new OnClickListener() {

							public void OnClick(View v) {
								// TODO Auto-generated method stub
								btn_pod_two.setClickable(false);
								count++;
								btn_pod_two.setText("");
								btn_pod_two.setBackgroundResource(R.drawable.podtrhalf);
								txtTurn.setText(next_turn);
								btn_pod_one.setClickable(true);
								btn_pod_three.setClickable(true);
								btn_pod_four.setClickable(true);
								if(count == 4){

									txtTurn.setText("Click on Guess!");
									btn_Play.setClickable(true);
									count = 0;

								}
							}
						});
					}
				});


			btn_pod_three = (Button)findViewById(R.id.btn_pod_three);
			btn_pod_three.setBackgroundResource(R.drawable.podblclosed);
			btn_pod_three.setOnClickListener(new OnClickListener() {

					public void OnClick(View v) {
						// TODO Auto-generated method stub
						player3 = solution_array[2];
						btn_pod_three.setText(player3);
						btn_pod_three.setBackgroundResource(R.drawable.podopen);

						btn_pod_two.setClickable(false);
						btn_pod_one.setClickable(false);
						btn_pod_four.setClickable(false);
						if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){

							if(player3.equals("MANTRI")){

								player_one_role = "MANTRI";
							}
							if(player3.equals("RAJA")){

								player_one_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player_one_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){

								player_one_role = "CHOR";
							}

							next_turn = player_two_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){

							if(player3.equals("MANTRI")){

								player_two_role = "MANTRI";
							}
							if(player3.equals("RAJA")){

								player_two_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player_two_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){

								player_two_role = "CHOR";
							}

							next_turn = player_three_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){

							if(player3.equals("MANTRI")){

								player_three_role = "MANTRI";
							}
							if(player3.equals("RAJA")){

								player_three_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player_three_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){

								player_three_role = "CHOR";
							}
							next_turn = player_four_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){

							if(player3.equals("MANTRI")){

								player_four_role = "MANTRI";
							}
							if(player3.equals("RAJA")){

								player_four_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player_four_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){

								player_four_role = "CHOR";
							}
							next_turn = "Click on Guess!";

						}

						txtTurn.setText("Click again to close the chit!");
						btn_pod_three.setOnClickListener(new OnClickListener() {

							public void OnClick(View v) {
								// TODO Auto-generated method stub
								btn_pod_three.setClickable(false);
								count++;
								btn_pod_three.setText("");
								btn_pod_three.setBackgroundResource(R.drawable.podblhalf);
								txtTurn.setText(next_turn);
								btn_pod_two.setClickable(true);
								btn_pod_one.setClickable(true);
								btn_pod_four.setClickable(true);
								if(count == 4){

									txtTurn.setText("Click on Guess!");
									btn_Play.setClickable(true);
									count = 0;

								}
							}
						});
					}
				});




			btn_pod_four = (Button)findViewById(R.id.btn_pod_four);
			btn_pod_four.setBackgroundResource(R.drawable.podbrclosed);

			btn_pod_four.setOnClickListener(new OnClickListener() {

					public void OnClick(View v) {
						// TODO Auto-generated method stub
						player_four = solution_array[3];
						btn_pod_four.setText(player_four);
						btn_pod_four.setBackgroundResource(R.drawable.podopen);


						btn_pod_two.setClickable(false);
						btn_pod_three.setClickable(false);
						btn_pod_one.setClickable(false);
						if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){

							if(player_four.equals("MANTRI")){

								player_one_role = "MANTRI";
							}
							if(player_four.equals("RAJA")){

								player_one_role = "RAJA";
							}
							if(player_four.equals("SIPAHI")){

								player_one_role = "SIPAHI";
							}
							if(player_four.equals("CHOR")){

								player_one_role = "CHOR";
							}
							next_turn = player_two_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){

							if(player_four.equals("MANTRI")){

								player_two_role = "MANTRI";
							}
							if(player_four.equals("RAJA")){

								player_two_role = "RAJA";
							}
							if(player_four.equals("SIPAHI")){

								player_two_role = "SIPAHI";
							}
							if(player_four.equals("CHOR")){

								player_two_role = "CHOR";
							}
							next_turn = player_three_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){

							if(player_four.equals("MANTRI")){

								player_three_role = "MANTRI";
							}
							if(player_four.equals("RAJA")){

								player_three_role = "RAJA";
							}
							if(player_four.equals("SIPAHI")){

								player_three_role = "SIPAHI";
							}
							if(player_four.equals("CHOR")){

								player_three_role = "CHOR";
							}
							next_turn = player_four_name+ "'s" + " turn!";

						}
						if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){

							if(player_four.equals("MANTRI")){

								player_four_role = "MANTRI";
							}
							if(player_four.equals("RAJA")){

								player_four_role = "RAJA";
							}
							if(player_four.equals("SIPAHI")){

								player_four_role = "SIPAHI";
							}
							if(player_four.equals("CHOR")){

								player_four_role = "CHOR";
							}
							next_turn = "Click on Guess!";

						}

						txtTurn.setText("Click again to close the chit!");
						btn_pod_four.setOnClickListener(new OnClickListener() {

							public void OnClick(View v) {
								// TODO Auto-generated method stub
								btn_pod_four.setClickable(false);
								count++;
								btn_pod_four.setText("");
								btn_pod_four.setBackgroundResource(R.drawable.podbrhalf);
								txtTurn.setText(next_turn);
								btn_pod_two.setClickable(true);
								btn_pod_three.setClickable(true);
								btn_pod_one.setClickable(true);
								if(count == 4){

									txtTurn.setText(next_turn);
									btn_Play.setClickable(true);
									count = 0;

								}
							}
						});
					}
				});

			btn_pod_one.setText("");
			btn_pod_two.setText("");
			btn_pod_three.setText("");
			btn_pod_four.setText("");


    }

    public void SetRole(String role, String player){

    	if(player_one.equals("MANTRI")){

			player_four_role = "MANTRI";
		}
		if(player_one.equals("RAJA")){

			player_four_role = "RAJA";
		}
		if(player_one.equals("SIPAHI")){

			player_four_role = "SIPAHI";
		}
		if(player_one.equals("CHOR")){

			player_four_role = "CHOR";
		}


    }

    void ShuffleArray(String[] solution_array)
    {
    	Random rnd = new Random();
    	for (int i = solution_array.length - 1; i >= 0; i--)
    		{
    			int index = rnd.nextInt(i + 1);

    			String a = solution_array[index];
    			solution_array[index] = solution_array[i];
    			solution_array[i] = a;
    		}
	}

    static void UpdateScore(){

    	Log.v("AkhandBakar", "##########"+ guess);
    	if(player_one_role.equals("MANTRI"))
    	{
    		Log.v("AkhandBakar", "##########Mantri"+ player_one_name);
    	if(guess)
    		{
    		i = i+80;
    		p_one_score=i;
    		txtTurn.setText(player_one_name+" is right!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
    		if(player_two_role.equals("CHOR"))
    			{
    			p_two_score=j;
    			if(player_three_role.equals("RAJA")){

    				k = k+100;
    				l = l+50;
    				p_three_score=k;
    				p_four_score=l;
    			}else{

    				l = l+100;
    				k = k+50;
    				p_four_score=l;
    				p_three_score=k;
    			}
    			}
    		if(player_three_role.equals("CHOR"))
    			{

    			p_three_score=k;


    			if(player_two_role.equals("RAJA")){

    				j = j+100;
    				l = l+50;
    				p_two_score=j;
    				p_four_score=l;
    			}else{

    				l = l+100;
    				j = j+50;
    				p_four_score=l;
    				p_two_score=j;
    			}
    			}
    		if(player_four_role.equals("CHOR"))
    			{

    			p_four_score=l;

    			if(player_three_role.equals("RAJA")){

    				k = k+100;
    				j = j+50;
    				p_two_score=j;
    				p_three_score=k;
    			}else{

    				j = j+100;
    				k = k+50;
    				p_three_score=k;
    				p_two_score=j;
    			}
    			}
    		}
    	else
    		{
    		i=i-80;
    		p1_score = i;
    		txtTurn.setText(player_one_name+" is wrong!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			if(player_two_role.equals("CHOR"))
			{
				j = j+25;
			p_two_score=j;
			if(player_three_role.equals("RAJA")){

				k = k+100;
				l = l+50;
				p_three_score=k;
				p_four_score=l;
			}else{

				l = l+100;
				k = k+50;
				p_four_score=l;
				p_three_score=k;
			}
			}
		if(player_three_role.equals("CHOR"))
			{
			k=k+25;
			p_three_score=k;


			if(player_two_role.equals("RAJA")){

				j = j+100;
				l = l+50;
				p_two_score=j;
				p_four_score=l;
			}else{

				l = l+100;
				j = j+50;
				p_four_score=l;
				p_two_score=j;
			}
			}
		if(player_four_role.equals("CHOR"))
			{
			l=l+25;
			p_four_score=l;

			if(player_three_role.equals("RAJA")){

				k = k+100;
				j = j+50;
				p_two_score=j;
				p_three_score=k;
			}else{

				j = j+100;
				k = k+50;
				p_three_score=k;
				p_two_score=j;
			}
			}
    		}

    	}
    if(player_two_role.equals("MANTRI"))
    	{
    	if(guess)
    		{
    		Log.v("AkhandBakar", "##########Mantri"+ player_two_name);
    		j = j+80;
    		p_two_score=j;
    		txtTurn.setText(player_two_name+" is right!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
    		if(player_one_role.equals("CHOR"))
    			{
    			p1_score=i;

    			if(player_three_role.equals("RAJA")){

    				k = k+100;
    				l = l+50;
    				p_three_score=k;
    				p_four_score=l;

    			}else{

    				l = l+100;
    				k = k+50;
    				p_four_score=l;
    				p_three_score=k;
    			}

    			}
    		if(player_three_role.equals("CHOR"))
    			{

    			p_three_score=k;


    			if(player_one_role.equals("RAJA")){

    				i = i+100;
    				l = l+50;
    				p1_score=i;
    				p_four_score=l;

    			}else{

    				l = l+100;
    				i = i+50;
    				p1_score=i;
    				p_four_score=l;

    			}

    			}
    		if(player_four_role.equals("CHOR"))
    			{

    			p_four_score=l;

    			if(player_one_role.equals("RAJA")){

    				i = i+100;
    				k = k+50;
    				p1_score=i;
        			p_three_score=k;

    			}else{

    				k = k+100;
    				i = i+50;
    				p1_score=i;
        			p_three_score=k;


    			}


    			}
    		}
    	else
    		{

    		j=j-80;
    		p_two_score = j;
    		txtTurn.setText(player_two_name+" is wrong!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			{
				i = i+25;
			p1_score=i;

			if(player_three_role.equals("RAJA")){

				k = k+100;
				l = l+50;
				p_three_score=k;
				p_four_score=l;

			}else{

				l = l+100;
				k = k+50;
				p_four_score=l;
				p_three_score=k;
			}

			}
		if(player_three_role.equals("CHOR"))
			{
			k = k+25;
			p_three_score=k;


			if(player_one_role.equals("RAJA")){

				i = i+100;
				l = l+50;
				p1_score=i;
				p_four_score=l;

			}else{

				l = l+100;
				i = i+50;
				p1_score=i;
				p_four_score=l;

			}

			}
		if(player_four_role.equals("CHOR"))
			{
			l = l+25;
			p_four_score=l;

			if(player_one_role.equals("RAJA")){

				i = i+100;
				k = k+50;
				p1_score=i;
    			p_three_score=k;

			}else{

				k = k+100;
				i = i+50;
				p1_score=i;
    			p_three_score=k;


			}


			}
    		}

    	}
    if(player_three_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player_three_name);
    	if(guess)
    		{
    		k = k+80;
    		p_three_score = k;
    		txtTurn.setText(player_three_name+" is right!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
    		if(player_one_role.equals("CHOR"))
    			{
    			p1_score=i;

    			if(player_two_role.equals("RAJA")){

    				j = j+100;
    				l = l+50;
    				p_two_score=j;
        			p_four_score=l;


    			}else{

    				l = l+100;
    				j = j+50;
    				p_two_score=j;
        			p_four_score=l;


    			}

    			}
    		if(player_two_role.equals("CHOR"))
    			{

    			p_two_score=j;


    			if(player_one_role.equals("RAJA")){

    				i = i+100;
    				l = l+50;
    				p1_score=i;
    				p_four_score=l;

    			}else{

    				i = i+50;
    				l = l+100;
    				p1_score=i;
    				p_four_score=l;

    			}

    			}
    		if(player_four_role.equals("CHOR"))
    			{

    			p_four_score=l;

    			if(player_two_role.equals("RAJA")){

    				j = j+100;
    				i = i+50;
    				p1_score=i;
        			p_two_score=j;

    			}else{

    				j = j+50;
    				i = i+100;
    				p1_score=i;
        			p_two_score=j;

    			}


    			}
    		}
    	else
    		{
    		k = k-80;
    		p_three_score = k;
    		txtTurn.setText(player_three_name+" is wrong!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			{
				i = i+25;
			p1_score=i;

			if(player_two_role.equals("RAJA")){

				j = j+100;
				l = l+50;
				p_two_score=j;
    			p_four_score=l;


			}else{

				l = l+100;
				j = j+50;
				p_two_score=j;
    			p_four_score=l;


			}

			}
		if(player_two_role.equals("CHOR"))
			{
			j = j+25;
			p_two_score=j;


			if(player_one_role.equals("RAJA")){

				i = i+100;
				l = l+50;
				p1_score=i;
				p_four_score=l;

			}else{

				i = i+50;
				l = l+100;
				p1_score=i;
				p_four_score=l;

			}

			}
		if(player_four_role.equals("CHOR"))
			{
			l = l+25;
			p_four_score=l;

			if(player_two_role.equals("RAJA")){

				j = j+100;
				i = i+50;
				p1_score=i;
    			p_two_score=j;

			}else{

				j = j+50;
				i = i+100;
				p1_score=i;
    			p_two_score=j;

			}


			}
    		}

    	}
    if(player_four_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player_four_name);
    	if(guess)
    		{
    		l = l+80;
    		p_four_score=l;
    		txtTurn.setText(player_four_name+" is right!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
    		if(player_one_role.equals("CHOR"))
    			{
    			p1_score=i;


    			if(player_two_role.equals("RAJA")){

    				j = j+100;
    				k = k+50;
    				p_two_score=j;
        			p_three_score=k;

    			}else{

    				j = j+50;
    				k = k+100;
    				p_two_score=j;
        			p_three_score=k;

    			}
    			}
    		if(player_two_role.equals("CHOR"))
    			{

    			p_two_score=j;


    			if(player_one_role.equals("RAJA")){

    				i = i+100;
    				k = k+50;
    				p1_score=i;
    				p_three_score=k;
    			}else{

    				i = i+50;
    				k = k+100;
    				p1_score=i;
    				p_three_score=k;

    			}

    			}
    		if(player_three_role.equals("CHOR"))
    			{

    			p_three_score=k;

    			if(player_one_role.equals("RAJA")){

    				i = i+100;
    				j = j+50;
    				p1_score=i;
        			p_two_score=j;
    			}else{

    				i = i+50;
    				j = j+100;
    				p1_score=i;
        			p_two_score=j;

    			}


    			}
    		}
    	else
    		{
    		l = l-80;
    		p_four_score = l;
    		txtTurn.setText(player_four_name+" is wrong!");
    		btn_pod_one.setText(player_one);
			btn_pod_two.setText(player_two);
			btn_pod_three.setText(player3);
			btn_pod_four.setText(player_four);
			btn_pod_one.setBackgroundResource(R.drawable.podopen);
			btn_pod_two.setBackgroundResource(R.drawable.podopen);
			btn_pod_three.setBackgroundResource(R.drawable.podopen);
			btn_pod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			{
				i = i+25;
			p1_score=i;


			if(player_two_role.equals("RAJA")){

				j = j+100;
				k = k+50;
				p_two_score=j;
    			p_three_score=k;

			}else{

				j = j+50;
				k = k+100;
				p_two_score=j;
    			p_three_score=k;

			}
			}
		if(player_two_role.equals("CHOR"))
			{
			j=j+25;
			p_two_score=j;


			if(player_one_role.equals("RAJA")){

				i = i+100;
				k = k+50;
				p1_score=i;
				p_three_score=k;
			}else{

				i = i+50;
				k = k+100;
				p1_score=i;
				p_three_score=k;

			}

			}
		if(player_three_role.equals("CHOR"))
			{
			k=k+25;
			p_three_score=k;

			if(player_one_role.equals("RAJA")){

				i = i+100;
				j = j+50;
				p1_score=i;
    			p_two_score=j;
			}else{

				i = i+50;
				j = j+100;
				p1_score=i;
    			p_two_score=j;

			}


			}
    		}

    	}


    Log.v("AkhandBakar", "##########Score "+ i);
	txtPlayer_one.setText("1."+ player_one_name + " [" + i + "]");
	Log.v("AkhandBakar", player_one + " [" + i + "]");

	txtPlayer_two.setText("2." + player_two_name+ " [" + j + "]");

	Log.v("AkhandBakar", player_two + " [" + p_two_score + "]");

	txtPlayer_three.setText("3." + player_three_name+ " [" + k + "]");
	Log.v("AkhandBakar", player3 + " [" + p_three_score + "]");

	txtPlayer_four.setText("4."+player_four_name+ " [" + l + "]");
	Log.v("AkhandBakar", player_four + " [" + p_four_score + "]");
    }
}
