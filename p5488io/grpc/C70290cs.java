package p5488io.grpc;

import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;

/* renamed from: io.grpc.cs */
/* compiled from: PG */
public final class C70290cs extends C70297cz {

    /* renamed from: d */
    private final C70291ct f187361d;

    public C70290cs(String str, C70291ct ctVar) {
        super(str, false, ctVar);
        C58838bb.m90879n(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        C58838bb.m90866a(ctVar, "marshaller");
        this.f187361d = ctVar;
    }

    /* renamed from: a */
    public final Object mo61979a(byte[] bArr) {
        return this.f187361d.mo61977a(new String(bArr, C58913w.f156752a));
    }

    /* renamed from: b */
    public final byte[] mo61980b(Object obj) {
        return this.f187361d.mo61978b(obj).getBytes(C58913w.f156752a);
    }
}
