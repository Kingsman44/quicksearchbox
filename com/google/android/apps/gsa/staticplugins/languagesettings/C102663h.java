package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.h */
/* compiled from: PG */
public final class C102663h extends C0673gh {

    /* renamed from: a */
    public final TextView f286564a;

    /* renamed from: b */
    public final TextView f286565b;

    /* renamed from: c */
    private final ImageView f286566c;

    public C102663h(View view) {
        super(view);
        this.f286564a = (TextView) view.findViewById(R.id.discover_feed_language_preference_text);
        this.f286565b = (TextView) view.findViewById(R.id.discover_feed_language_preference_subtitle);
        this.f286566c = (ImageView) view.findViewById(R.id.discover_feed_language_selected_check);
    }

    /* renamed from: a */
    public final void mo93369a(boolean z) {
        this.f286566c.setImageResource(true != z ? 0 : R.drawable.ic_check);
    }
}
