package p5488io.grpc;

import com.google.common.base.C58838bb;

/* renamed from: io.grpc.ab */
/* compiled from: PG */
public final class C70138ab {

    /* renamed from: a */
    public final C70137aa f186972a;

    /* renamed from: b */
    public final Status f186973b;

    public C70138ab(C70137aa aaVar, Status status) {
        C58838bb.m90866a(aaVar, "state is null");
        this.f186972a = aaVar;
        C58838bb.m90866a(status, "status is null");
        this.f186973b = status;
    }

    /* renamed from: a */
    public static C70138ab m102114a(C70137aa aaVar) {
        C58838bb.m90869d(aaVar != C70137aa.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C70138ab(aaVar, Status.f186902OK);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70138ab)) {
            return false;
        }
        C70138ab abVar = (C70138ab) obj;
        if (!this.f186972a.equals(abVar.f186972a) || !this.f186973b.equals(abVar.f186973b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f186972a.hashCode() ^ this.f186973b.hashCode();
    }

    public final String toString() {
        if (this.f186973b.mo61679g()) {
            return this.f186972a.toString();
        }
        return this.f186972a + "(" + this.f186973b + ")";
    }
}
