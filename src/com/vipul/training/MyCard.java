package com.vipul.training;

import android.content.Context;
import android.graphics.Typeface;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fima.cardsui.objects.Card;

public class MyCard extends Card {

	public MyCard(String title, String desc) {
		super(title, desc);
	}

	@Override
	public View getCardContent(Context context) {
		View view = LayoutInflater.from(context).inflate(R.layout.card_layout,
				null);

		TextView titleTxt = (TextView) view.findViewById(R.id.title);
		TextView descTxt = (TextView) view.findViewById(R.id.description);

		titleTxt.setText(title);

		if (desc.contains("`")) {
			descTxt.setTypeface(Typeface.createFromAsset(context.getAssets(),
					"Rupee.ttf"));
		} else if (desc.contains("+919022554085")) {
			descTxt.setAutoLinkMask(Linkify.PHONE_NUMBERS);
		} else if (desc.contains("gmail.com")) {
			descTxt.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);
		} else if (desc.contains("stack") || desc.contains("facebook")) {
			descTxt.setAutoLinkMask(Linkify.WEB_URLS);
		}

		descTxt.setText(desc);

		return view;
	}
}
