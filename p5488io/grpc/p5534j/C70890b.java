package p5488io.grpc.p5534j;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import p5488io.grpc.C70276ce;
import p5488io.grpc.Status;

/* renamed from: io.grpc.j.b */
/* compiled from: PG */
final class C70890b extends C70893e {

    /* renamed from: a */
    private final Status f189080a;

    public C70890b(Status status) {
        C58838bb.m90866a(status, "status");
        this.f189080a = status;
    }

    /* renamed from: a */
    public final C70276ce mo61957a() {
        return this.f189080a.mo61679g() ? C70276ce.f187346a : C70276ce.m102450b(this.f189080a);
    }

    /* renamed from: b */
    public final boolean mo62584b(C70893e eVar) {
        if (!(eVar instanceof C70890b)) {
            return false;
        }
        C70890b bVar = (C70890b) eVar;
        if (!C58832aw.m90831a(this.f189080a, bVar.f189080a)) {
            return this.f189080a.mo61679g() && bVar.f189080a.mo61679g();
        }
        return true;
    }

    public final String toString() {
        C58830au a = C58831av.m90828a(C70890b.class);
        a.mo56102b("status", this.f189080a);
        return a.toString();
    }
}
