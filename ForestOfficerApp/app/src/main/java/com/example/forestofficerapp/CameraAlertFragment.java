package com.example.forestofficerapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CameraAlertFragment extends Fragment {

    public static final String TITLE = "Camera Alert";
    public static List<Alert> cameraAlertList = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    public static CameraAlertFragment newInstance() {
        return new CameraAlertFragment();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera_alert, container, false);
        recyclerView = view.findViewById(R.id.cameraAlertRecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        addAlerts();
        adapter = new AlertCardRecyclerViewAdapter(cameraAlertList, position -> {
            Intent mapActivityIntent = new Intent(view.getContext(), MapActivity.class);
            startActivity(mapActivityIntent);
        });
        recyclerView.setAdapter(adapter);

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void addAlerts() {

        for (int i=0;i<5;i++) {
            Alert alert = new Alert(
                    "Hunter spotted",
                    "Camera Alert",
                    new Date(),
                    LocalTime.now(),
                    19.75463,
                    79.32012
            );
            cameraAlertList.add(alert);
        }
    }
}
