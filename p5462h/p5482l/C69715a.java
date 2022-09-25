package p5462h.p5482l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h.l.a */
/* compiled from: PG */
public final class C69715a implements C69731k {

    /* renamed from: a */
    private final AtomicReference f186074a;

    public C69715a(C69731k kVar) {
        this.f186074a = new AtomicReference(kVar);
    }

    /* renamed from: a */
    public final Iterator mo5191a() {
        C69731k kVar = (C69731k) this.f186074a.getAndSet((Object) null);
        if (kVar != null) {
            return kVar.mo5191a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
