package com.google.android.apps.search.podcasts;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.n */
/* compiled from: PG */
public final /* synthetic */ class C140647n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141182w f382012a;

    /* renamed from: b */
    public final /* synthetic */ View f382013b;

    /* renamed from: c */
    public final /* synthetic */ float f382014c;

    public /* synthetic */ C140647n(C141182w wVar, View view, float f) {
        this.f382012a = wVar;
        this.f382013b = view;
        this.f382014c = f;
    }

    public final void run() {
        C141182w wVar = this.f382012a;
        View view = this.f382013b;
        wVar.f383288b.requireView().findViewById(R.id.podcasts_bottom_nav).setTranslationY(((float) view.getHeight()) * this.f382014c);
    }
}
