package p5488io.grpc;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: io.grpc.a */
/* compiled from: PG */
public final class C70132a {

    /* renamed from: a */
    public C70256c f186946a;

    /* renamed from: b */
    public IdentityHashMap f186947b;

    public C70132a(C70256c cVar) {
        this.f186946a = cVar;
    }

    /* renamed from: a */
    public final C70256c mo61687a() {
        if (this.f186947b != null) {
            C70256c cVar = this.f186946a;
            C70256c cVar2 = C70256c.f187254a;
            for (Map.Entry entry : cVar.f187256b.entrySet()) {
                if (!this.f186947b.containsKey(entry.getKey())) {
                    this.f186947b.put((C70163b) entry.getKey(), entry.getValue());
                }
            }
            this.f186946a = new C70256c(this.f186947b);
            this.f186947b = null;
        }
        return this.f186946a;
    }

    /* renamed from: b */
    public final void mo61688b(C70163b bVar, Object obj) {
        if (this.f186947b == null) {
            this.f186947b = new IdentityHashMap(1);
        }
        this.f186947b.put(bVar, obj);
    }
}
