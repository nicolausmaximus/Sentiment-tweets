package packagea;
import java.util.ArrayList;
import packagea.*;

public class WhatToThink {

	public static void main(String[] args) {
		String topic = "exam";
		ArrayList<String> tweets = TweetManager.getTweets(topic);
		NLP.init();
		for(String tweet : tweets) {
			System.out.println(tweet + " : " + NLP.findSentiment(tweet));
		}
	}
}
