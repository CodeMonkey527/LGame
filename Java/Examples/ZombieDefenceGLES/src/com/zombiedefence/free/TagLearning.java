﻿package com.zombiedefence.free;

import loon.action.sprite.SpriteBatch;
import loon.core.geom.Vector2f;
import loon.core.graphics.opengl.LTexture;

public class TagLearning extends Button {
	public TagLearning(LTexture buttonTexture, Vector2f position,
			float rotation, Help.ButtonID buttonID, int delayBeforeEffect) {
		super(buttonTexture, position, rotation, buttonID, delayBeforeEffect);
		super.description = "Learning";
		super.subDescription = "Gain extra 10% experience";
	}

	@Override
	public void ApplyEffect(Bunker player) {
		player.learningMultiplier += 0.1f;
	}

	@Override
	public void CheckPrerequisite(Bunker player) {
		super.isPrerequisiteMet = true;
	}

	@Override
	public void Draw(SpriteBatch batch) {
		super.Draw(batch);
	}
}