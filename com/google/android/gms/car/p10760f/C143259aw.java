package com.google.android.gms.car.p10760f;

import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.C143093ae;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143179df;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.aw */
/* compiled from: PG */
public final /* synthetic */ class C143259aw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388409a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent f388410b;

    public /* synthetic */ C143259aw(C143268bb bbVar, KeyEvent keyEvent) {
        this.f388409a = bbVar;
        this.f388410b = keyEvent;
    }

    public final void run() {
        C143179df dfVar;
        C143268bb bbVar = this.f388409a;
        KeyEvent keyEvent = this.f388410b;
        if (bbVar.f388461j != null) {
            if (bbVar.mo118326v() && (dfVar = bbVar.f388464m) != null) {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s injectKeyEvent(event:%s) [windowHasFocus:%b, isShowing:%b, ready:%b]", dfVar.f388260h, keyEvent, Boolean.valueOf(dfVar.f388266n), Boolean.valueOf(dfVar.isShowing()), Boolean.valueOf(dfVar.f388258f));
                }
                if (dfVar.f388273u) {
                    dfVar.f388267o = false;
                }
                if (dfVar.isShowing() && dfVar.f388258f && dfVar.f388266n) {
                    dfVar.mo118145d(true, false);
                    dfVar.mo118143c().injectInputEvent(keyEvent);
                    C143093ae aeVar = bbVar.f388475x;
                    return;
                }
            }
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s Couldn't inject (%d,%d)", bbVar.f388473v, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()));
            }
            try {
                C143150cf cfVar = bbVar.f388447O;
                if (cfVar != null) {
                    cfVar.mo118110f(false);
                }
            } catch (RemoteException unused) {
                bbVar.mo118322r();
            }
        }
    }
}
