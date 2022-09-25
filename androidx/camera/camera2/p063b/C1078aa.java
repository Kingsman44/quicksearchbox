package androidx.camera.camera2.p063b;

import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C1078aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3214a;

    /* renamed from: b */
    public final /* synthetic */ String f3215b;

    /* renamed from: c */
    public final /* synthetic */ C1357cq f3216c;

    /* renamed from: d */
    public final /* synthetic */ C1373df f3217d;

    public /* synthetic */ C1078aa(C1091an anVar, String str, C1357cq cqVar, C1373df dfVar) {
        this.f3214a = anVar;
        this.f3215b = str;
        this.f3216c = cqVar;
        this.f3217d = dfVar;
    }

    public final void run() {
        C1091an anVar = this.f3214a;
        String str = this.f3215b;
        C1357cq cqVar = this.f3216c;
        C1373df dfVar = this.f3217d;
        anVar.mo3822h("Use case " + str + " ACTIVE", (Throwable) null);
        anVar.f3242a.mo4268e(str, cqVar, dfVar);
        anVar.f3242a.mo4271h(str, cqVar, dfVar);
        anVar.mo3834t();
    }
}
