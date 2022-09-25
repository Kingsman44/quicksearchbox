package p5488io.grpc;

import com.google.common.base.C58838bb;

/* renamed from: io.grpc.dc */
/* compiled from: PG */
final class C70332dc extends C70297cz {

    /* renamed from: d */
    private final C70333dd f187478d;

    public C70332dc(String str, boolean z, C70333dd ddVar) {
        super(str, z, ddVar);
        C58838bb.m90879n(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        C58838bb.m90866a(ddVar, "marshaller");
        this.f187478d = ddVar;
    }

    /* renamed from: a */
    public final Object mo61979a(byte[] bArr) {
        return this.f187478d.mo62024a(bArr);
    }

    /* renamed from: b */
    public final byte[] mo61980b(Object obj) {
        return this.f187478d.mo62025b(obj);
    }
}
