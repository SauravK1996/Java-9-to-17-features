package com.example.instanceofexample;

public class InstanceOfExample {
	public static void main(String[] args) {
		AbstractFile abstractFile = new MusicFile();

		if (abstractFile instanceof MusicFile) {
			((MusicFile) abstractFile).playMusic();
		}

		if (abstractFile instanceof MusicFile musicFile) {
			musicFile.playMusic();
		}
	}
}
