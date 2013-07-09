package com.example.brinquedo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;


import android.R.color;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;

// Classe respons�vel pelo gerenciamento das imagens. 
public  class ImageManager  
{
	Bitmap bitmap;	
	int positionX;
	int positionY;
	Context context;
	public ImageManager (Context context){
	this.context=context;
	}
	
	// M�todo pra carregar imagem da pasta Assets.
	public  Bitmap ImageManager(String name) 
	{
		try 
		{
			InputStream img = context.getAssets().open(name);
			bitmap = BitmapFactory.decodeStream(img);
		}
		
		catch (IOException e) 
		{
			Log.e("fooi", "Erro carregando imagem");
		}
		return bitmap;
	}
}