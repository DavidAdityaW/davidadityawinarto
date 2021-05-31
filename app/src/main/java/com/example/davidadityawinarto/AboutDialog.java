package com.example.davidadityawinarto;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/*
    Dikerjakan pada tanggal : 22 Mei 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class AboutDialog extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.custom_dialog_about,container,false);
    }
}
