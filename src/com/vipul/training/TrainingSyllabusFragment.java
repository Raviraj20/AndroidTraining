package com.vipul.training;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fima.cardsui.views.CardUI;

public class TrainingSyllabusFragment extends Fragment {

	private CardUI mCardView;

	public static TrainingSyllabusFragment getInstance() {
		TrainingSyllabusFragment fragment = new TrainingSyllabusFragment();
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
		getActivity().setTitle("Syllabus");

		ArrayList<String> contents = new ArrayList<String>();
		contents.add(Html.fromHtml(
				Utils.getContentString("Android Overview", "History",
						"Android Versions")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Stack Overview", "Linux",
						"Native Libraries", "Dalvik", "App Framework",
						"Applications")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Installing SDK", "Hello, World!",
						"The Emulator", "Android Activity Life Cycle",
						"Android manifest.xml file")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("LinearLayout", "RelativeLayout",
						"TableLayout", "TabLayout", "ListView", "GalleryView",
						"ViewFlipper", "ViewStub")).toString());
		contents.add(Html
				.fromHtml(
						Utils.getContentString("TimePickerDialog", "Spinner",
								"AutoComplete", "Imageview", "WebView",
								"CheckBox", "Radiobuttons", "ToggleButton",
								"SeekBar", "RatingBar")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("DatePickerdialog",
						"TextView,EditText,Buttons", "ProgressDialog",
						"ScrollView", "GestureOverlayView", "Toast",
						"AlertDialog", "AlarmManager", "TextSwitcher",
						"CountDownTimer")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Creating Multiple Page Application",
						"Passing Data between Activities",
						"Passing Custom Object Using Parcelable",
						"Explicit and Implicit Intents",
						"Various Intent Actions.",
						"StartActivity and StartActivityForResult",
						"Adding Color and Graphics",
						"Using strings and Arrays resources",
						"Using TimerTask in Android.", "Creating Custom Views",
						"Adding Custom Attributes to view",
						"JavaScript Injection")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Applying Styles to views",
						"Exploring Themes", "Animating Views",
						"Using 9-patch Images.", "Using declare-styleable"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Using MediaPlayer to play audio",
						"Using VideoView to play video",
						"Capturing Snaps with Inbuilt Camera",
						"Using AudioManager to Control volume",
						"Designing Barcode Scanner")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Options Menu", "Context Menus",
						"Android File System", "Using Android FileObserver"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Creating Android Services",
						"Android Interface Definition Language",
						"Using IntentService to Download Things in Background",
						"Using PowerManager.WakeLock")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("About SQLite",
						"Using SQLiteOpenHelper",
						"Using notifyDataSetChanged()",
						"Refreshing Cursor using requery()",
						"Introduction to SimpleCursorAdapter",
						"Fetching Contact Name,Number,Email Address",
						"Designing Custom SimpleCursorAdapter",
						"Implementing CursorLoaders",
						"Pick Image from Gallery and display on screen"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Introduction to ListView",
						"Introduction to BaseAdapter",
						"Designing Custom ListView",
						"Designing ExpandableListView")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Introduction to Broadcast Receivers",
						"Boot Receiver", "Detect Network State",
						"Detect Inbound and Outbound Calls",
						"Intercept SMS Messages",
						"Adding Broadcast Receiver Dynamically",
						"Using sendBroadcast for custom Broadcasting"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Introduction Content Provider",
						"Using Inbuilt contacts Content Provider",
						"Building ContactAPI Bridge")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Handlers", "Threads", "AsyncTask"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Record audio using MediaRecorder"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Custom Toast Message",
						"Custom Dialogs", "Custom Listview")).toString());
		contents.add(Html
				.fromHtml(
						Utils.getContentString(
								"Introduction to Shared Preference",
								"Reading and Writing Shared Preference",
								"Introduction To PreferenceActivity & PreferenceFragment",
								"onSaveInstanceState and OnRetainNonconfigurationInstance"))
				.toString());
		contents.add(Html
				.fromHtml(
						Utils.getContentString("Simple JSON Parser",
								"Download using HttpUrlConnection",
								"DefaultHttpClient in Android",
								"IntentService Ê& ResultReceiver",
								"Using XML Parsers")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Using LocationManager",
						"using GeoCoder", "Google Maps & adding overlays"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Exploring Bluetooth API")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Fragments", "ActionBar",
						"DialogFragment", "Android ViewPager",
						"DownloadManager Implementation", "GridLayout & Space",
						"JellyBean Style Notification", "Custom Notifications",
						"PopupMenu", "Using AccountManager")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Android Facebook Integration"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Using Robotium Test Framework",
						"Using Robolectric Test Framework")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Introduction",
						"Creating Simple Calculator")).toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Implementing SwipeDismiss",
						"PullToRefreshListView Integration", "PageIndicators",
						"RoboGuice Integration", "PhotoView Integration",
						"Universal Image Loader", "3D Quick Actions"))
				.toString());
		contents.add(Html.fromHtml(
				Utils.getContentString("Steps to sign application",
						"Publishing Application in market")).toString());

		mCardView = (CardUI) getActivity().findViewById(R.id.cardsview);

		mCardView.addCard(new MyCard("Android Overview", contents.get(0)));

		mCardView.addCard(new MyCard("The Stack", contents.get(1)));

		mCardView.addCard(new MyCard("Quick Start", contents.get(2)));

		mCardView.addCard(new MyCard("Android Layouts", contents.get(3)));

		mCardView.addCard(new MyCard("Android Views I", contents.get(4)));

		mCardView.addCard(new MyCard("Android Views II", contents.get(5)));

		mCardView.addCard(new MyCard("User Interface", contents.get(6)));

		mCardView.addCard(new MyCard("Themes & Animation", contents.get(7)));

		mCardView.addCard(new MyCard("Audio & Video", contents.get(8)));

		mCardView.addCard(new MyCard("File System & Menus", contents.get(9)));

		mCardView.addCard(new MyCard("Services", contents.get(10)));

		mCardView.addCard(new MyCard("Databse Programming", contents.get(11)));

		mCardView.addCard(new MyCard("List & Adapters", contents.get(12)));

		mCardView.addCard(new MyCard("Broadcast Receivers", contents.get(13)));

		mCardView.addCard(new MyCard("Content Providers", contents.get(14)));

		mCardView.addCard(new MyCard("Concurrency", contents.get(15)));

		mCardView.addCard(new MyCard("Using MediaRecorder", contents.get(16)));

		mCardView.addCard(new MyCard("Custom Layouts", contents.get(17)));

		mCardView.addCard(new MyCard("Retaining States", contents.get(18)));
		mCardView.addCard(new MyCard("Android Networking", contents.get(19)));
		mCardView.addCard(new MyCard("Accessing Locations", contents.get(20)));
		mCardView
				.addCard(new MyCard("Bluetooth Programming", contents.get(21)));
		mCardView.addCard(new MyCard("Advance Features ", contents.get(22)));
		mCardView.addCard(new MyCard("Getting Social", contents.get(23)));
		mCardView.addCard(new MyCard("Test Automation", contents.get(24)));
		mCardView.addCard(new MyCard("Native Development", contents.get(25)));
		mCardView.addCard(new MyCard("Noticable Libraries", contents.get(26)));
		mCardView.addCard(new MyCard("Sign & Publish App", contents.get(27)));
		mCardView.refresh();
		mCardView.setSwipeable(true);

	}
}
