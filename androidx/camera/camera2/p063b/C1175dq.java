package androidx.camera.camera2.p063b;

import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.dq */
/* compiled from: PG */
public final /* synthetic */ class C1175dq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1182dx f3461a;

    /* renamed from: b */
    public final /* synthetic */ C1174dp f3462b;

    public /* synthetic */ C1175dq(C1182dx dxVar, C1174dp dpVar) {
        this.f3461a = dxVar;
        this.f3462b = dpVar;
    }

    public final void run() {
        C1182dx dxVar = this.f3461a;
        C1174dp dpVar = this.f3462b;
        Objects.requireNonNull(dxVar.f3477d);
        dxVar.f3477d.mo3919d(dpVar);
    }
}
