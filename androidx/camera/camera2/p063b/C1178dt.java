package androidx.camera.camera2.p063b;

import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.dt */
/* compiled from: PG */
public final /* synthetic */ class C1178dt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1182dx f3469a;

    /* renamed from: b */
    public final /* synthetic */ C1174dp f3470b;

    public /* synthetic */ C1178dt(C1182dx dxVar, C1174dp dpVar) {
        this.f3469a = dxVar;
        this.f3470b = dpVar;
    }

    public final void run() {
        C1182dx dxVar = this.f3469a;
        C1174dp dpVar = this.f3470b;
        C1151ct ctVar = dxVar.f3475b;
        synchronized (ctVar.f3381b) {
            ctVar.f3382c.remove(dxVar);
            ctVar.f3383d.remove(dxVar);
        }
        dxVar.mo3919d(dpVar);
        Objects.requireNonNull(dxVar.f3477d);
        dxVar.f3477d.mo3979g(dpVar);
    }
}
