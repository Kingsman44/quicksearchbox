package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dz */
/* compiled from: PG */
final class C114060dz extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315765a;

    public C114060dz(C114071eg egVar) {
        this.f315765a = egVar;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C59071e eVar = C114071eg.f315790j;
        C114071eg egVar = this.f315765a;
        if (egVar.f315824aH == null || !egVar.f315827aK) {
            egVar.mo101027cn();
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C59071e eVar = C114071eg.f315790j;
        if (motionEvent == null || motionEvent2 == null || this.f315765a.mo101042dw(motionEvent, motionEvent2)) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(y) > C91115n.m148870b((float) ((int) this.f315765a.f315982r.mo79743a(C90014bt.f247768nQ)), this.f315765a.f315981q) || y >= 0.0f) {
            C114071eg egVar = this.f315765a;
            if (egVar.f315911bu != null) {
                if (y >= 0.0f) {
                    egVar.mo101027cn();
                } else if (!egVar.f315835aS.f300678a || !egVar.f315982r.mo79746e(C90014bt.f247759nH)) {
                    egVar.mo101026cm();
                }
            }
        }
        return false;
    }
}
