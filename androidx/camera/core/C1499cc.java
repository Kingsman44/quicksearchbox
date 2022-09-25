package androidx.camera.core;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.cc */
/* compiled from: PG */
public final /* synthetic */ class C1499cc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1505ci f4132a;

    /* renamed from: b */
    public final /* synthetic */ C1547dx f4133b;

    public /* synthetic */ C1499cc(C1505ci ciVar, C1547dx dxVar) {
        this.f4132a = ciVar;
        this.f4133b = dxVar;
    }

    public final void run() {
        C1505ci ciVar = this.f4132a;
        C1547dx dxVar = this.f4133b;
        Executor executor = C1506cj.f4143a;
        ciVar.mo4335a(dxVar);
    }
}
