package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.d */
/* compiled from: PG */
final class C27162d {

    /* renamed from: a */
    final TextView f74246a;

    /* renamed from: b */
    final TextView f74247b;

    /* renamed from: c */
    final MaterialButton f74248c;

    /* renamed from: d */
    final MaterialButton f74249d;

    public C27162d(TextView textView, TextView textView2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f74246a = textView;
        this.f74247b = textView2;
        this.f74248c = materialButton;
        this.f74249d = materialButton2;
    }

    /* renamed from: a */
    static C27162d m50375a(View view) {
        return new C27162d((TextView) view.findViewById(16908310), (TextView) view.findViewById(16908308), (MaterialButton) view.findViewById(R.id.lens_card_filled_button), (MaterialButton) view.findViewById(R.id.lens_card_outlined_button));
    }

    /* renamed from: b */
    static void m50376b(MaterialButton materialButton, String str, View.OnClickListener onClickListener) {
        if (str.isEmpty()) {
            materialButton.setVisibility(8);
            return;
        }
        materialButton.setText(str);
        materialButton.setVisibility(0);
        materialButton.setOnClickListener(onClickListener);
    }
}
