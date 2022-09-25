package p5488io.grpc;

import com.google.common.base.C58838bb;

/* renamed from: io.grpc.cu */
/* compiled from: PG */
final class C70292cu extends C70297cz {

    /* renamed from: d */
    private final C70293cv f187362d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70292cu(String str, C70293cv cvVar) {
        super(str, false, cvVar);
        boolean z = false;
        C58838bb.m90879n(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        C58838bb.m90869d(str.length() > 4 ? true : z, "empty key name");
        C58838bb.m90866a(cvVar, "marshaller is null");
        this.f187362d = cvVar;
    }

    /* renamed from: a */
    public final Object mo61979a(byte[] bArr) {
        return this.f187362d.mo23994a(bArr);
    }

    /* renamed from: b */
    public final byte[] mo61980b(Object obj) {
        return this.f187362d.mo23995b(obj);
    }
}
