package changyuheng.android.autotimepunch.fragment;

import android.os.Bundle;
import android.app.ListFragment;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import changyuheng.android.autotimepunch.fragment.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 */
public class CardFragment extends ListFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String PROJECT_NAME = "project_name";

    // TODO: Rename and change types of parameters
    private String mProjectName;

    // TODO: Rename and change types of parameters
    public static CardFragment newInstance(String param1) {
        CardFragment fragment = new CardFragment();
        Bundle args = new Bundle();
        args.putString(PROJECT_NAME, param1);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public CardFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mProjectName = getArguments().getString(PROJECT_NAME);
        }

        // TODO: Change Adapter to display your content
        setListAdapter(new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, DummyContent.ITEMS));
    }

    @Override
    public void onResume() {
        initOptionsMenu();

        super.onResume();
    }

    private void initOptionsMenu() {
        setHasOptionsMenu(true);
        getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
        getActivity().getActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                getFragmentManager().popBackStack();
                return true;
        }
        return false;
    }
}