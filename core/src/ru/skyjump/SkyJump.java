package ru.skyjump;

import com.badlogic.gdx.Game;
import ru.skyjump.screen.MenuScreen;

public class SkyJump extends Game {
	@Override
	public void create() {
		setScreen(new MenuScreen());
	}
}
