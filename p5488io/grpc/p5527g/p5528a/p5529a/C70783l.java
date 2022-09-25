package p5488io.grpc.p5527g.p5528a.p5529a;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import p5589m.C71830g;
import p5589m.C71831h;
import p5589m.C71832i;

/* renamed from: io.grpc.g.a.a.l */
/* compiled from: PG */
public final class C70783l {

    /* renamed from: a */
    public static final Logger f188760a = Logger.getLogger(C70780i.class.getName());

    /* renamed from: b */
    public static final C71832i f188761b = C71831h.m105170a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static {
        C71832i iVar = C71832i.f191357a;
    }

    /* renamed from: a */
    public static int m103527a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw m103529c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static int m103528b(C71830g gVar) {
        return (gVar.mo63062c() & 255) | ((gVar.mo63062c() & 255) << 16) | ((gVar.mo63062c() & 255) << 8);
    }

    /* renamed from: c */
    public static IOException m103529c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: d */
    public static IllegalArgumentException m103530d(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }
}
