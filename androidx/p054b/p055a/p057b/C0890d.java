package androidx.p054b.p055a.p057b;

import java.util.Map;

/* renamed from: androidx.b.a.b.d */
/* compiled from: PG */
public final class C0890d implements Map.Entry {

    /* renamed from: a */
    public final Object f2965a;

    /* renamed from: b */
    public final Object f2966b;

    /* renamed from: c */
    C0890d f2967c;

    /* renamed from: d */
    public C0890d f2968d;

    public C0890d(Object obj, Object obj2) {
        this.f2965a = obj;
        this.f2966b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0890d)) {
            return false;
        }
        C0890d dVar = (C0890d) obj;
        return this.f2965a.equals(dVar.f2965a) && this.f2966b.equals(dVar.f2966b);
    }

    public final Object getKey() {
        return this.f2965a;
    }

    public final Object getValue() {
        return this.f2966b;
    }

    public final int hashCode() {
        return this.f2965a.hashCode() ^ this.f2966b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2965a + "=" + this.f2966b;
    }
}
