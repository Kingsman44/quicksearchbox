package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.graphics.Rect;
import android.view.TouchDelegate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.c */
/* compiled from: PG */
public final /* synthetic */ class C106405c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C106410h f296811a;

    public /* synthetic */ C106405c(C106410h hVar) {
        this.f296811a = hVar;
    }

    public final void run() {
        C106410h hVar = this.f296811a;
        Rect rect = new Rect();
        hVar.f296829n.getHitRect(rect);
        rect.top -= 32;
        rect.bottom += 32;
        rect.left -= 32;
        rect.right += 32;
        hVar.f296830o.setTouchDelegate(new TouchDelegate(rect, hVar.f296829n));
    }
}
