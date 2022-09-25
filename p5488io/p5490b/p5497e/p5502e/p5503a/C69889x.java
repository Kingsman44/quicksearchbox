package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.Arrays;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.x */
/* compiled from: PG */
final class C69889x implements C69801b, C69803b {

    /* renamed from: a */
    final C69801b f186290a;

    /* renamed from: b */
    C69803b f186291b;

    /* renamed from: c */
    final /* synthetic */ C69890y f186292c;

    public C69889x(C69890y yVar, C69801b bVar) {
        this.f186292c = yVar;
        this.f186290a = bVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        if (this.f186291b != C69828d.f186198a) {
            try {
                this.f186292c.f186296d.mo25795a();
                this.f186290a.mo26090a();
            } catch (Throwable th) {
                C69813f.m101292a(th);
                this.f186290a.mo26091b(th);
            }
        }
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        if (this.f186291b == C69828d.f186198a) {
            C70101a.m102023e(th);
            return;
        }
        try {
            this.f186292c.f186295c.mo25818a(th);
        } catch (Throwable th2) {
            C69813f.m101292a(th2);
            th = new C69812e(Arrays.asList(new Throwable[]{th, th2}));
        }
        this.f186290a.mo26091b(th);
    }

    public final void dispose() {
        this.f186291b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        try {
            this.f186292c.f186294b.mo25818a(bVar);
            if (C69828d.m101308d(this.f186291b, bVar)) {
                this.f186291b = bVar;
                this.f186290a.mo61460lO(this);
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            bVar.dispose();
            this.f186291b = C69828d.f186198a;
            C69829e.m101315f(th, this.f186290a);
        }
    }
}
