package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ac */
/* compiled from: PG */
final class C108205ac extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C108212aj f300967a;

    public C108205ac(C108212aj ajVar) {
        this.f300967a = ajVar;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C108212aj ajVar = this.f300967a;
        C28292j jVar = ajVar.f301030l;
        if (jVar != null && ajVar.f301034p == 2) {
            C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        }
        return false;
    }
}
