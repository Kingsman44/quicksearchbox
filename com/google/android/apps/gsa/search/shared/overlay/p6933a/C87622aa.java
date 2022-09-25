package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.aa */
/* compiled from: PG */
final class C87622aa implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236762a;

    public C87622aa(C87625ad adVar) {
        this.f236762a = adVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 3) {
            return this.f236762a.f236777G.onTouch(view, motionEvent);
        }
        return false;
    }
}
