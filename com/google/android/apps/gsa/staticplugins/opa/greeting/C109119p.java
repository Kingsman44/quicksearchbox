package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.p */
/* compiled from: PG */
public final /* synthetic */ class C109119p implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303875a;

    public /* synthetic */ C109119p(C109100ar arVar) {
        this.f303875a = arVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C109100ar arVar = this.f303875a;
        if (motionEvent.getAction() == 1) {
            C89949q.m146521e(C28285c.m52882i(arVar.f303783p, 5, (Integer) null), false);
            arVar.mo97603s();
        }
        return true;
    }
}
