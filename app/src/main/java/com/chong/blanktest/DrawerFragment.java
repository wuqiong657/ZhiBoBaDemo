package com.chong.blanktest;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment {

    @Bind(R.id.drawer_listview)
    ListView listView;
    private String[] names = new String[]{"user", "following", "followers"};

    public DrawerFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_drawer, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {  //Activity调用onCreate（）时回调
        super.onActivityCreated(savedInstanceState);
        final Context context = getActivity();
        listView.setAdapter(new ArrayAdapter<String>(context, R.layout.listview_item, names));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListView listView = (ListView)adapterView;
                switch (i) {
                    case 0:
                        Toast.makeText(context, "userinfo",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(context, "following",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

    }

//add item click event


    @Override
    public void onDestroyView() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
