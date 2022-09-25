package com.google.android.libraries.lens.view.filters.p2097a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.a.ap */
/* compiled from: PG */
final class C25866ap extends C0673gh {

    /* renamed from: a */
    final TextView f70276a;

    /* renamed from: b */
    final TextView f70277b;

    /* renamed from: c */
    final TextView f70278c;

    public C25866ap(View view) {
        super(view);
        this.f70276a = (TextView) view.findViewById(R.id.restaurant_name);
        this.f70277b = (TextView) view.findViewById(R.id.restaurant_address);
        this.f70278c = (TextView) view.findViewById(R.id.restaurant_distance);
    }

    public final String toString() {
        String ghVar = super.toString();
        String valueOf = String.valueOf(this.f70276a.getText());
        return ghVar + " '" + valueOf + "'";
    }
}
