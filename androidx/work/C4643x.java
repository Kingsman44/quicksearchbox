package androidx.work;

/* renamed from: androidx.work.x */
/* compiled from: PG */
public final class C4643x extends C4377aa {

    /* renamed from: a */
    public final C4632m f14566a;

    public C4643x() {
        this.f14566a = C4632m.f14549a;
    }

    public C4643x(C4632m mVar) {
        this.f14566a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14566a.equals(((C4643x) obj).f14566a);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f14566a + '}';
    }

    public final int hashCode() {
        return -545391232 + this.f14566a.hashCode();
    }
}
