package androidx.work;

/* renamed from: androidx.work.z */
/* compiled from: PG */
public final class C4645z extends C4377aa {

    /* renamed from: a */
    public final C4632m f14567a;

    public C4645z() {
        this.f14567a = C4632m.f14549a;
    }

    public C4645z(C4632m mVar) {
        this.f14567a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14567a.equals(((C4645z) obj).f14567a);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f14567a + '}';
    }

    public final int hashCode() {
        return -545391170 + this.f14567a.hashCode();
    }
}
