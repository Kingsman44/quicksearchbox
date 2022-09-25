package com.google.android.material.datepicker;

import android.support.p033v7.widget.C0673gh;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.datepicker.ak */
/* compiled from: PG */
public final class C44615ak extends C0673gh {

    /* renamed from: a */
    final TextView f116253a;

    /* renamed from: b */
    final MaterialCalendarGridView f116254b;

    public C44615ak(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f116253a = textView;
        C2043bi.m5593v().mo5186e(textView, true);
        this.f116254b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
