package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ad */
/* compiled from: PG */
final class C108206ad implements C90656ba {

    /* renamed from: a */
    final /* synthetic */ GestureDetector f300968a;

    public C108206ad(GestureDetector gestureDetector) {
        this.f300968a = gestureDetector;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        this.f300968a.onTouchEvent(motionEvent);
        return false;
    }
}
