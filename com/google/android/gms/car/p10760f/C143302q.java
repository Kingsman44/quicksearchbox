package com.google.android.gms.car.p10760f;

import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.q */
/* compiled from: PG */
public final /* synthetic */ class C143302q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143268bb f388528a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f388529b;

    public /* synthetic */ C143302q(C143268bb bbVar, Runnable runnable) {
        this.f388528a = bbVar;
        this.f388529b = runnable;
    }

    public final void run() {
        C143268bb bbVar = this.f388528a;
        Runnable runnable = this.f388529b;
        if (!bbVar.f388439G || !bbVar.f388477z.mo117935q(37)) {
            runnable.run();
            return;
        }
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232511a("CAR.PROJECTION.CAHI", (Throwable) null, "Queuing command until after presentation configured");
        }
        bbVar.f388440H.add(runnable);
    }
}
