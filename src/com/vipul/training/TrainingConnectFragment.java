package com.vipul.training;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fima.cardsui.views.CardUI;

public class TrainingConnectFragment extends Fragment {

	private CardUI mCardView;

	public static TrainingConnectFragment getInstance() {
		TrainingConnectFragment fragment = new TrainingConnectFragment();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.screen_layout, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		getActivity().setTitle("Contact me");

		mCardView = (CardUI) getActivity().findViewById(R.id.cardsview);

		mCardView.addCard(new MyCard("Call", "+919022554085"));

		mCardView.addCard(new MyCard("Email", "vipulshah2010@gmail.com"));

		mCardView.addCard(new MyCard("stackoverflow",
				"http://stackoverflow.com/users/758104/vipul-shah"));

		mCardView.addCard(new MyCard("Facebook",
				"https://www.facebook.com/vipulshah2010"));

		mCardView.refresh();

	}
}
