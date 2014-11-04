package com.senai.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SejaBemVindoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seja_bem_vindo);
		
		Intent intent = getIntent();
		String nome = intent.getStringExtra("nome");
		
		TextView tvNome = (TextView)findViewById(R.id.tv_boas_vindas);
		tvNome.setText("Olá " + nome + "! Seja bem vindo.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seja_bem_vindo, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.item_voltar) {
			abreTelaInicial();
		}else if (id == R.id.item_trocar_imagem) {
			trocarImagem();
		}
		return super.onOptionsItemSelected(item);
	}

	private void trocarImagem() {
		ImageView imageView = (ImageView)findViewById(R.id.im_smile);
		imageView.setImageResource(R.drawable.smile2);
	}

	private void abreTelaInicial() {
		Intent intent = new Intent(this, OlaActivity.class);
		startActivity(intent);
	}
}
