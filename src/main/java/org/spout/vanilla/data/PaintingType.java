/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011-2012, VanillaDev <http://www.spout.org/>
 * Vanilla is licensed under the SpoutDev License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.vanilla.data;

import java.util.HashMap;
import java.util.Map;

public enum PaintingType {
	KEBAB("Kebab", 16, 16),
	AZTEC("Aztec", 16, 16),
	ALBAN("Alban", 16, 16),
	AZTEC_2("Aztec2", 16, 16),
	BOMB("Bomb", 16, 16),
	PLANT("Plant", 16, 16),
	WASTELAND("Wasteland", 16, 16),
	WANDERER("Wanderer", 16, 32),
	GRAHAM("Graham", 16, 32),
	POOL("Pool", 32, 16),
	COURBET("Courbet", 32, 16),
	SUNSET("Sunset", 32, 16),
	SEA("Sea", 32, 16),
	CREEBET("Creebet", 32, 16),
	MATCH("Match", 32, 32),
	BUST("Bust", 32, 32),
	STAGE("Stage", 32, 32),
	VOID("Void", 32, 32),
	SKULL_AND_ROSES("SkullAndRoses", 32, 32),
	WITHER("Wither", 32, 32),
	FIGHTERS("Fighters", 64, 32),
	SKELETON("Skeleton", 64, 48),
	DONKEY_KONG("DonkeyKong", 64, 48),
	POINTER("Pointer", 64, 64),
	PIG_SCENE("Pigscene", 64, 64),
	FLAMING_SKULL("Flaming Skull", 64, 64);

	private final String name;
	private final int width, height;
	private static final Map<String, PaintingType> nameMap = new HashMap<String, PaintingType>();

	private PaintingType(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public static PaintingType get(String name) {
		return nameMap.get(name);
	}
}