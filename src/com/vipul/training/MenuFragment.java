package com.vipul.training;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuFragment extends ListFragment {

	String contents[] = { "Syllabus", "Details", "Connect", "About Me" };
	int drawables[] = { R.drawable.ic_nav_messenger, R.drawable.ic_nav_events,
			R.drawable.ic_nav_circles, R.drawable.ic_nav_profile };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		setListAdapter(new MyAdapter());
	}

	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		Fragment newContent = null;
		switch (position) {
		case 0:
			newContent = TrainingSyllabusFragment.getInstance();
			break;
		case 1:
			newContent = TrainingDetailFragment.getInstance();
			break;
		case 2:
			newContent = TrainingConnectFragment.getInstance();
			break;
		case 3:
			newContent = TrainingAboutFragment.getInstance();
			break;
		}

		switchFragment(newContent);
	}

	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return 4;
		}

		@Override
		public Object getItem(int position) {
			return contents[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			View view = LayoutInflater.from(getActivity()).inflate(
					R.layout.row, null);
			ImageView imageView = (ImageView) view.findViewById(R.id.img);
			TextView textView = (TextView) view.findViewById(R.id.txt);

			Typeface typeface = Typeface.createFromAsset(getActivity()
					.getAssets(), "Roboto-Light.ttf");
			textView.setTypeface(typeface);
			imageView.setImageResource(drawables[position]);
			textView.setText(contents[position]);

			return view;
		}

	}

	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;

		MainActivity mainActivity = (MainActivity) getActivity();
		mainActivity.switchContent(fragment);

	}
}
