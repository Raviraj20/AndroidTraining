package com.vipul.training;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fima.cardsui.views.CardUI;

public class TrainingDetailFragment extends Fragment {

	private CardUI mCardView;

	public static TrainingDetailFragment getInstance() {
		TrainingDetailFragment fragment = new TrainingDetailFragment();
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
		getActivity().setTitle("Course Details");

		ArrayList<String> contents = new ArrayList<String>();
		contents.add(Html.fromHtml(
				Utils.getContentString("Private Tutions",
						"2 students per batch")).toString());
		contents.add(Html.fromHtml(Utils.getContentString("60 Hours"))
				.toString());
		contents.add(Html.fromHtml(Utils.getContentString("Only on Weekends"))
				.toString());
		contents.add(Html.fromHtml(Utils.getContentString("12000 `"))
				.toString());

		mCardView = (CardUI) getActivity().findViewById(R.id.cardsview);

		mCardView.addCard(new MyCard("Course Type", contents.get(0)));

		mCardView.addCard(new MyCard("Course Duration", contents.get(1)));

		mCardView.addCard(new MyCard("Batch Timings", contents.get(2)));

		mCardView.addCard(new MyCard("Course Fees", contents.get(3)));

		mCardView.refresh();

	}
}
