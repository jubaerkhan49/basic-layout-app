package com.example.quiz_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.google.android.material.navigation.NavigationView;

public class HomeFragment extends Fragment {

    private TextView welcomeTextView;
    private Button settingsButton;
    private Button profileButton;
    private NavigationView navigationView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        welcomeTextView = view.findViewById(R.id.textViewWelcome);
        settingsButton = view.findViewById(R.id.buttonSettings);
        profileButton = view.findViewById(R.id.buttonProfile);
        navigationView = view.findViewById(R.id.drawer_nav_view);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_homeFragment_to_settingsFragment);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_homeFragment_to_profileFragment);
            }
        });

    }
}