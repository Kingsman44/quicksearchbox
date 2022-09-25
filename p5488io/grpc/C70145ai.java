package p5488io.grpc;

/* renamed from: io.grpc.ai */
/* compiled from: PG */
public final class C70145ai {

    /* renamed from: a */
    private final String f186988a;

    /* renamed from: b */
    private final Object f186989b;

    public C70145ai(String str, Object obj) {
        C70148al.m102136q(str, "name");
        this.f186988a = str;
        this.f186989b = obj;
    }

    /* renamed from: a */
    public final Object mo61711a(C70148al alVar) {
        Object obj;
        C70697eb ebVar = alVar.f186994f;
        if (ebVar == null) {
            obj = null;
        } else {
            obj = ebVar.mo62069c(this, hashCode(), 0);
        }
        return obj == null ? this.f186989b : obj;
    }

    public final String toString() {
        return this.f186988a;
    }
}
