package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.io.ByteArrayInputStream;

/* renamed from: io.grpc.da */
/* compiled from: PG */
final class C70330da extends C70297cz {

    /* renamed from: d */
    private final C70294cw f187474d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70330da(String str, C70294cw cwVar) {
        super(str, false, cwVar);
        boolean z = false;
        C58838bb.m90879n(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        C58838bb.m90869d(str.length() > 4 ? true : z, "empty key name");
        this.f187474d = cwVar;
    }

    /* renamed from: a */
    public final Object mo61979a(byte[] bArr) {
        return this.f187474d.mo61754b(new ByteArrayInputStream(bArr));
    }

    /* renamed from: b */
    public final byte[] mo61980b(Object obj) {
        return C70334de.m102578l(this.f187474d.mo61753a(obj));
    }

    /* renamed from: f */
    public final boolean mo61983f() {
        return true;
    }
}
