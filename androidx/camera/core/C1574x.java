package androidx.camera.core;

import androidx.p104d.p105a.C2164c;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.x */
/* compiled from: PG */
public final /* synthetic */ class C1574x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1400aa f4299a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4300b;

    /* renamed from: c */
    public final /* synthetic */ long f4301c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f4302d;

    public /* synthetic */ C1574x(C1400aa aaVar, Executor executor, long j, C2164c cVar) {
        this.f4299a = aaVar;
        this.f4300b = executor;
        this.f4301c = j;
        this.f4302d = cVar;
    }

    public final void run() {
        C1400aa aaVar = this.f4299a;
        aaVar.mo4294a(this.f4300b, this.f4301c, aaVar.f3937i, this.f4302d);
    }
}
