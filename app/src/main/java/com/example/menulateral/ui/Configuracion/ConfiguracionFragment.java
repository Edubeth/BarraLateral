package com.example.menulateral.ui.Configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.menulateral.databinding.FragmentBasurerosBinding;
import com.example.menulateral.databinding.FragmentConfiguracionBinding;
import com.example.menulateral.ui.Basureros.BasurerosViewModel;

public class ConfiguracionFragment extends Fragment {
    private FragmentConfiguracionBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ConfiguracionViewModel configuracionViewModel =
                new ViewModelProvider(this).get(ConfiguracionViewModel.class);
        binding = FragmentConfiguracionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textConfiguracion;
        configuracionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

