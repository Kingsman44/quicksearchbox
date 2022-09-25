package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.d */
/* compiled from: PG */
public final class C137601d extends C0673gh {

    /* renamed from: a */
    public final TextView f374281a;

    /* renamed from: b */
    public final TextView f374282b;

    /* renamed from: c */
    public final ImageView f374283c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137601d(View view) {
        super(view);
        C69664n.m101061g(view, "view");
        View findViewById = view.findViewById(R.id.googleapp_search_language_preference_text);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.g…language_preference_text)");
        this.f374281a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.googleapp_search_language_preference_subtitle);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.g…uage_preference_subtitle)");
        this.f374282b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.googleapp_search_language_selected_check);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.g…_language_selected_check)");
        this.f374283c = (ImageView) findViewById3;
    }
}
