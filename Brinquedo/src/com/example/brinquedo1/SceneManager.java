package com.example.brinquedo1;

import android.app.Activity;
import android.content.Context;

public class SceneManager {
	static private SCENE currentScene;
	static public Fase02 scene = null;
	static Scene carregar;

	public static Activity activity;

	static public void Setup(Activity game, int etapa) {
		if (etapa == 1) {
			carregar = new Fase1_Assets(game);

			SceneManager.currentScene = SCENE.SCN_LEVEL_01;
		}
		if (etapa == 2) {
			carregar = new Fase1_Assets_ETAPA2(game);

			SceneManager.currentScene = SCENE.SCN_LEVEL_01_ETAPA2;
		}
		SceneManager.scene = new Fase02(game, carregar);
		game.setContentView(scene);
		activity = game;
	}

	static public void ChangeScene(Context game) {

		switch (SceneManager.currentScene) {

		case SCN_LEVEL_01:

			carregar = new Fase2_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_02;

			break;
		case SCN_LEVEL_02:

			carregar = new Fase3_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_03;

			break;
		case SCN_LEVEL_03:

			carregar = new Fase4_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_04;

			break;
		case SCN_LEVEL_04:

			carregar = new Fase5_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_05;

			break;
		case SCN_LEVEL_05:

			carregar = new Fase6_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_06;

			break;

		case SCN_LEVEL_06:

			carregar = new Fase7_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_07;

			break;
		case SCN_LEVEL_07:

			carregar = new Fase8_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_08;

			break;
		case SCN_LEVEL_08:

			carregar = new Fase9_Assets(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_09;

			break;

		case SCN_LEVEL_01_ETAPA2:

			carregar = new Fase2_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_02_ETAPA2;

			break;
		case SCN_LEVEL_02_ETAPA2:

			carregar = new Fase3_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_03_ETAPA2;

			break;
		case SCN_LEVEL_03_ETAPA2:

			carregar = new Fase4_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_04_ETAPA2;

			break;
		case SCN_LEVEL_04_ETAPA2:

			carregar = new Fase5_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_05_ETAPA2;

			break;
		case SCN_LEVEL_05_ETAPA2:

			carregar = new Fase6_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_06_ETAPA2;

			break;

		case SCN_LEVEL_06_ETAPA2:

			carregar = new Fase7_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_07_ETAPA2;

			break;
		case SCN_LEVEL_07_ETAPA2:

			carregar = new Fase8_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_08_ETAPA2;

			break;
		case SCN_LEVEL_08_ETAPA2:

			carregar = new Fase9_Assets_ETAPA2(game);
			SceneManager.scene.setFase(carregar);
			SceneManager.currentScene = SCENE.SCN_LEVEL_09_ETAPA2;

			break;

		// case SCENE.SCN_GAMEOVER:
		// SceneManager.scene = new Opening(game);
		// SceneManager.currentScene = SCENE.SCN_OPENING;
		// break;

		default:
			carregar = new Fase1_Assets(game);
			SceneManager.scene = new Fase02(game, carregar);
			SceneManager.currentScene = SCENE.SCN_MENU;
			break;
		}

	}

	public enum SCENE {
		SCN_MENU, SCN_LEVEL_01, SCN_LEVEL_02, SCN_LEVEL_03, SCN_LEVEL_04, SCN_LEVEL_05, SCN_LEVEL_06, SCN_LEVEL_07, SCN_LEVEL_08, SCN_LEVEL_09, SCN_LEVEL_10, SCN_LEVEL_11, SCN_LEVEL_12, SCN_LEVEL_01_ETAPA2, SCN_LEVEL_02_ETAPA2, SCN_LEVEL_03_ETAPA2, SCN_LEVEL_04_ETAPA2, SCN_LEVEL_05_ETAPA2, SCN_LEVEL_06_ETAPA2, SCN_LEVEL_07_ETAPA2, SCN_LEVEL_08_ETAPA2, SCN_LEVEL_09_ETAPA2
	}

}