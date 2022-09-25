package androidx.camera.core.p069a;

/* renamed from: androidx.camera.core.a.e */
/* compiled from: PG */
public final class C1378e extends C1322bi {

    /* renamed from: a */
    private final Object f3882a;

    public C1378e(Object obj) {
        this.f3882a = obj;
    }

    /* renamed from: a */
    public final Object mo4184a() {
        return this.f3882a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1322bi) {
            return this.f3882a.equals(((C1322bi) obj).mo4184a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3882a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f3882a + "}";
    }
}
