package p5488io.p5490b.p5494b;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.b.d */
/* compiled from: PG */
abstract class C69805d extends AtomicReference implements C69803b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69805d(Object obj) {
        super(obj);
        C69841j.m101337b(obj, "value is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61465a(Object obj);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo61465a(andSet);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        return get() == null;
    }
}
