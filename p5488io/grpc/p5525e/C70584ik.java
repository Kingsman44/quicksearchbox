package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: io.grpc.e.ik */
/* compiled from: PG */
public final class C70584ik {

    /* renamed from: a */
    public static final C70580ig f188160a = new C70582ii(new byte[0], 0, 0);

    /* renamed from: a */
    public static C70580ig m103162a(ByteBuffer byteBuffer) {
        return new C70583ij(byteBuffer);
    }

    /* renamed from: b */
    public static String m103163b(C70580ig igVar, Charset charset) {
        C58838bb.m90866a(charset, "charset");
        int g = igVar.mo62099g();
        byte[] bArr = new byte[g];
        igVar.mo62104l(bArr, 0, g);
        return new String(bArr, charset);
    }

    /* renamed from: c */
    public static InputStream m103164c(C70580ig igVar) {
        return new C70581ih(igVar);
    }
}
