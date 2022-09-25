package p5488io.p5490b.p5497e.p5502e.p5503a;

import p5488io.p5490b.C69794a;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5494b.C69804c;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.m */
/* compiled from: PG */
public final class C69878m extends C69794a {

    /* renamed from: a */
    final Runnable f186271a;

    public C69878m(Runnable runnable) {
        this.f186271a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo61454l(C69801b bVar) {
        C69803b a = C69804c.m101282a(C69840i.f186209b);
        bVar.mo61460lO(a);
        try {
            this.f186271a.run();
            if (!a.mo25859e()) {
                bVar.mo26090a();
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            if (!a.mo25859e()) {
                bVar.mo26091b(th);
            } else {
                C70101a.m102023e(th);
            }
        }
    }
}
