package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.h */
/* compiled from: PG */
public final class C138892h extends C0673gh {

    /* renamed from: a */
    public final TextView f377788a;

    /* renamed from: b */
    public final TextView f377789b;

    /* renamed from: c */
    public final ImageView f377790c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138892h(View view) {
        super(view);
        C69664n.m101061g(view, "view");
        View findViewById = view.findViewById(R.id.googleapp_voice_language_entry_text);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.g…oice_language_entry_text)");
        this.f377788a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.googleapp_voice_language_entry_subtitle);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.g…_language_entry_subtitle)");
        this.f377789b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.googleapp_voice_language_entry_selected_checkmark);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.g…entry_selected_checkmark)");
        this.f377790c = (ImageView) findViewById3;
    }
}
