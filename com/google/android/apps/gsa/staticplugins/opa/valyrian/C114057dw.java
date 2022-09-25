package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dw */
/* compiled from: PG */
final class C114057dw extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315760a;

    public C114057dw(C114071eg egVar) {
        this.f315760a = egVar;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.f315760a.mo101042dw(motionEvent, motionEvent2)) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(y) > C91115n.m148870b((float) ((int) this.f315760a.f315982r.mo79743a(C90014bt.f247726mb)), this.f315760a.f315981q)) {
            C114071eg egVar = this.f315760a;
            if (egVar.f315911bu != null) {
                if (y < 0.0f || egVar.f315856an.mo101172s() != 3 || !egVar.f315853ak.mo100800x()) {
                    egVar.f315853ak.mo100786j(false);
                } else {
                    egVar.f315853ak.mo100796t(false);
                }
            }
        }
        return false;
    }
}
