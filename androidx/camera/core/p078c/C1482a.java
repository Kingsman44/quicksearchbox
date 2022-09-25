package androidx.camera.core.p078c;

import java.util.List;

/* renamed from: androidx.camera.core.c.a */
/* compiled from: PG */
public final class C1482a extends C1489h {

    /* renamed from: a */
    public final List f4078a;

    public C1482a(List list) {
        if (list != null) {
            this.f4078a = list;
            return;
        }
        throw new NullPointerException("Null surfaces");
    }

    /* renamed from: a */
    public final List mo4362a() {
        return this.f4078a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1489h) {
            return this.f4078a.equals(((C1489h) obj).mo4362a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4078a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SurfaceEdge{surfaces=" + this.f4078a + "}";
    }
}
