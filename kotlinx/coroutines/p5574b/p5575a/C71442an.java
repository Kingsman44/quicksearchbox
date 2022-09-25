package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71556df;
import kotlinx.coroutines.p5574b.C71571du;

/* renamed from: kotlinx.coroutines.b.a.an */
/* compiled from: PG */
final class C71442an extends C71556df implements C71571du {
    public C71442an(int i) {
        super(1, Integer.MAX_VALUE, C71387t.DROP_OLDEST);
        mo62806d(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo62784e() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) mo62810h()).intValue());
        }
        return valueOf;
    }

    /* renamed from: o */
    public final void mo62785o(int i) {
        synchronized (this) {
            mo62806d(Integer.valueOf(((Number) mo62810h()).intValue() + i));
        }
    }
}
