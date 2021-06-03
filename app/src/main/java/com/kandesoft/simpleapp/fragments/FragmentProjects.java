package com.kandesoft.simpleapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.kandesoft.simpleapp.AdapterClient;
import com.kandesoft.simpleapp.ClientModel;
import com.kandesoft.simpleapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentProjects#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentProjects extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    List<ClientModel> clientModels;
    GridView gridView;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentProjects.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentProjects newInstance(String param1, String param2) {
        FragmentProjects fragment = new FragmentProjects();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.grid_view);
        clientModels = new ArrayList<>();
        clientModels.add(new ClientModel("Amazon", R.drawable.amazon));
        clientModels.add(new ClientModel("Amazon", R.drawable.apple));
        clientModels.add(new ClientModel("Amazon", R.drawable.operamini));
        clientModels.add(new ClientModel("Amazon", R.drawable.bitcoin));
        clientModels.add(new ClientModel("Amazon", R.drawable.firefox));

        AdapterClient adapterClient = new AdapterClient(getContext(), clientModels);
        gridView.setAdapter(adapterClient);

    }
}