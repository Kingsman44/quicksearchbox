package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cx */
/* compiled from: PG */
public final /* synthetic */ class C114014cx implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ C114015cy f315658a;

    public /* synthetic */ C114014cx(C114015cy cyVar) {
        this.f315658a = cyVar;
    }

    public final boolean onPreDraw() {
        C114071eg egVar = this.f315658a.f315659a;
        TextView textView = egVar.f315791A;
        textView.getClass();
        textView.setTranslationY((float) (-egVar.f315985u.getHeight()));
        return true;
    }
}
