package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dg */
/* compiled from: PG */
final class C70445dg implements C70375ar {

    /* renamed from: a */
    final Status f187758a;

    /* renamed from: b */
    private final C70373ap f187759b;

    public C70445dg(Status status, C70373ap apVar) {
        C58838bb.m90869d(!status.mo61679g(), "error must not be OK");
        this.f187758a = status;
        this.f187759b = apVar;
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    /* renamed from: e */
    public final C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        return new C70444df(this.f187758a, this.f187759b, uVarArr);
    }
}
