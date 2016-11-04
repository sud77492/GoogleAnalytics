package karman.com.googleanalytics.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import karman.com.googleanalytics.R;
import karman.com.googleanalytics.app.MyApplication;

public class FooterFragment extends Fragment {

    public FooterFragment () {
        // Required empty public constructor
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_footer, container, false);
    }

    @Override
    public void onResume () {
        super.onResume ();

        // Tracking the screen view
        MyApplication.getInstance ().trackScreenView ("Footer Fragment");
    }
}