package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.Callable;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5494b.C69804c;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.l */
/* compiled from: PG */
public final class C69877l extends C69794a {

    /* renamed from: a */
    final Callable f186270a;

    public C69877l(Callable callable) {
        this.f186270a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo61454l(C69801b bVar) {
        C69803b a = C69804c.m101282a(C69840i.f186209b);
        bVar.mo61460lO(a);
        try {
            this.f186270a.call();
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
