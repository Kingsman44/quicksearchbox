package com.google.android.libraries.abuse.reporting;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.abuse.reporting.ac */
/* compiled from: PG */
public final class C146714ac {
    /* renamed from: a */
    static int m239055a(String str) {
        return (str.hashCode() % 100000) + 100000;
    }

    /* renamed from: b */
    public static void m239056b(String str, String str2, int i, int i2, ViewGroup viewGroup, C146713ab abVar) {
        RadioButton radioButton = (RadioButton) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_button, viewGroup, false);
        radioButton.setText(str2);
        radioButton.setId(i2);
        radioButton.setOnClickListener(new C146712aa(abVar, i, str));
        viewGroup.addView(radioButton);
    }
}
