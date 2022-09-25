package p5488io.grpc;

/* renamed from: io.grpc.ea */
/* compiled from: PG */
final class C70696ea implements C70697eb {

    /* renamed from: a */
    private final Object f188441a;

    /* renamed from: b */
    private final Object f188442b;

    public C70696ea(Object obj, Object obj2) {
        this.f188441a = obj;
        this.f188442b = obj2;
    }

    /* renamed from: a */
    public final int mo62067a() {
        return 1;
    }

    /* renamed from: b */
    public final C70697eb mo62068b(Object obj, Object obj2, int i, int i2) {
        int hashCode = this.f188441a.hashCode();
        if (hashCode != i) {
            return C70355dz.m102644d(new C70696ea(obj, obj2), i, this, hashCode, i2);
        }
        Object obj3 = this.f188441a;
        if (obj3 == obj) {
            return new C70696ea(obj, obj2);
        }
        return new C70354dy(new Object[]{obj3, obj}, new Object[]{this.f188442b, obj2});
    }

    /* renamed from: c */
    public final Object mo62069c(Object obj, int i, int i2) {
        if (this.f188441a == obj) {
            return this.f188442b;
        }
        return null;
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", new Object[]{this.f188441a, this.f188442b});
    }
}
