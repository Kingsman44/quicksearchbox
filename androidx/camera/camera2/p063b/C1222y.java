package androidx.camera.camera2.p063b;

import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.y */
/* compiled from: PG */
public final /* synthetic */ class C1222y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3597a;

    /* renamed from: b */
    public final /* synthetic */ String f3598b;

    /* renamed from: c */
    public final /* synthetic */ C1357cq f3599c;

    /* renamed from: d */
    public final /* synthetic */ C1373df f3600d;

    public /* synthetic */ C1222y(C1091an anVar, String str, C1357cq cqVar, C1373df dfVar) {
        this.f3597a = anVar;
        this.f3598b = str;
        this.f3599c = cqVar;
        this.f3600d = dfVar;
    }

    public final void run() {
        C1091an anVar = this.f3597a;
        String str = this.f3598b;
        C1357cq cqVar = this.f3599c;
        C1373df dfVar = this.f3600d;
        anVar.mo3822h("Use case " + str + " RESET", (Throwable) null);
        anVar.f3242a.mo4271h(str, cqVar, dfVar);
        anVar.mo3840y();
        anVar.mo3834t();
        if (anVar.f3253l == 4) {
            anVar.mo3829o();
        }
    }
}
