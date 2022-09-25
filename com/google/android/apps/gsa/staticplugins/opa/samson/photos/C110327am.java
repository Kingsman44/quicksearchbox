package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.am */
/* compiled from: PG */
public final /* synthetic */ class C110327am implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C110332ar f307492a;

    public /* synthetic */ C110327am(C110332ar arVar) {
        this.f307492a = arVar;
    }

    public final void onGlobalLayout() {
        C110332ar arVar = this.f307492a;
        if (arVar.f307527v.getHeight() != arVar.f307531z.getHeight()) {
            arVar.f307527v.getLayoutParams().height = arVar.f307531z.getHeight() + arVar.f307499B;
        }
    }
}
