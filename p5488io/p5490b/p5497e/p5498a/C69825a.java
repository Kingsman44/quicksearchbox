package p5488io.p5490b.p5497e.p5498a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69820b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.a.a */
/* compiled from: PG */
public final class C69825a extends AtomicReference implements C69803b {
    private static final long serialVersionUID = 5718521705281392066L;

    public C69825a(C69820b bVar) {
        super(bVar);
    }

    public final void dispose() {
        C69820b bVar;
        if (get() != null && (bVar = (C69820b) getAndSet((Object) null)) != null) {
            try {
                bVar.mo26097a();
            } catch (Exception e) {
                C69813f.m101292a(e);
                C70101a.m102023e(e);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
