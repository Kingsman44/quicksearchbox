package com.google.android.apps.search.podcasts.widgets.expandabledescription;

import android.view.View;

/* renamed from: com.google.android.apps.search.podcasts.widgets.expandabledescription.c */
/* compiled from: PG */
public final class C141238c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ ExpandableDescription f383447a;

    public C141238c(ExpandableDescription expandableDescription) {
        this.f383447a = expandableDescription;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f383447a.f383442a.getLineCount() <= 3) {
            this.f383447a.mo116257a();
        }
        this.f383447a.f383442a.removeOnLayoutChangeListener(this);
    }
}
