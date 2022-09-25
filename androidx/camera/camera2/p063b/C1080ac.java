package androidx.camera.camera2.p063b;

import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C1080ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3219a;

    /* renamed from: b */
    public final /* synthetic */ String f3220b;

    /* renamed from: c */
    public final /* synthetic */ C1357cq f3221c;

    /* renamed from: d */
    public final /* synthetic */ C1373df f3222d;

    public /* synthetic */ C1080ac(C1091an anVar, String str, C1357cq cqVar, C1373df dfVar) {
        this.f3219a = anVar;
        this.f3220b = str;
        this.f3221c = cqVar;
        this.f3222d = dfVar;
    }

    public final void run() {
        C1091an anVar = this.f3219a;
        String str = this.f3220b;
        C1357cq cqVar = this.f3221c;
        C1373df dfVar = this.f3222d;
        anVar.mo3822h("Use case " + str + " UPDATED", (Throwable) null);
        anVar.f3242a.mo4271h(str, cqVar, dfVar);
        anVar.mo3834t();
    }
}
