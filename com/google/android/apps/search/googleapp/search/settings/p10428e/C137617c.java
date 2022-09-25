package com.google.android.apps.search.googleapp.search.settings.p10428e;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.e.c */
/* compiled from: PG */
public final class C137617c extends C0673gh {

    /* renamed from: a */
    public final TextView f374331a;

    /* renamed from: b */
    public final ImageView f374332b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137617c(View view) {
        super(view);
        C69664n.m101061g(view, "view");
        View findViewById = view.findViewById(R.id.googleapp_search_region_preference_text);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.g…h_region_preference_text)");
        this.f374331a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.googleapp_search_region_selected_check);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.g…ch_region_selected_check)");
        this.f374332b = (ImageView) findViewById2;
    }
}
