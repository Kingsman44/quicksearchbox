package com.google.android.apps.gsa.searchplate;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchplate.c */
/* compiled from: PG */
public final class C88926c extends C88896f {

    /* renamed from: a */
    public final View f240896a;

    /* renamed from: b */
    public final ImageView f240897b;

    /* renamed from: c */
    public C88893c f240898c;

    public C88926c(View view, ImageView imageView) {
        this.f240896a = view;
        this.f240897b = imageView;
        view.setOnClickListener(new C88924b(this));
        view.setContentDescription(view.getResources().getString(R.string.accessibility_feed_button));
    }

    /* renamed from: c */
    public final void mo82744c(C88893c cVar) {
        this.f240898c = cVar;
    }
}
