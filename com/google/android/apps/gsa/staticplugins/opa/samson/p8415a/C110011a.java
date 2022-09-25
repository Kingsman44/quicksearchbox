package com.google.android.apps.gsa.staticplugins.opa.samson.p8415a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.a.a */
/* compiled from: PG */
final class C110011a implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C110018d f306493a;

    public C110011a(C110018d dVar) {
        this.f306493a = dVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C110018d dVar = this.f306493a;
        if (!dVar.f306505g) {
            return true;
        }
        dVar.f306499a.finish();
        return true;
    }
}
