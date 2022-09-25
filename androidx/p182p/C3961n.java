package androidx.p182p;

import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4054i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.n */
/* compiled from: PG */
public final class C3961n implements C4054i, C3964q {

    /* renamed from: a */
    public final C3938c f12652a;

    /* renamed from: b */
    private final C4054i f12653b;

    /* renamed from: c */
    private final C3955h f12654c;

    public C3961n(C4054i iVar, C3938c cVar) {
        C69664n.m101061g(iVar, "delegate");
        this.f12653b = iVar;
        this.f12652a = cVar;
        C69664n.m101061g(iVar, "delegateOpenHelper");
        C69664n.m101061g(iVar, "<set-?>");
        cVar.f12598a = iVar;
        this.f12654c = new C3955h(cVar);
    }

    /* renamed from: a */
    public final C4049d mo8208a() {
        this.f12654c.f12642a.mo8222b(C3954g.f12641a);
        return this.f12654c;
    }

    /* renamed from: b */
    public final C4054i mo8209b() {
        return this.f12653b;
    }

    /* renamed from: c */
    public final void mo8210c(boolean z) {
        this.f12653b.mo8210c(z);
    }

    public final void close() {
        this.f12654c.f12642a.mo8223c();
    }
}
