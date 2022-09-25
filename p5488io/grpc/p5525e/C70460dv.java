package p5488io.grpc.p5525e;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.util.concurrent.C60908dv;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70699ed;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70904s;
import p5488io.grpc.C70905t;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dv */
/* compiled from: PG */
public final class C70460dv {

    /* renamed from: a */
    public static final Charset f187782a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final C70297cz f187783b = new C70290cs("grpc-timeout", new C70459du());

    /* renamed from: c */
    public static final C70297cz f187784c = new C70290cs("grpc-encoding", C70334de.f187481c);

    /* renamed from: d */
    public static final C70297cz f187785d = C70251bv.m102399b("grpc-accept-encoding", new C70457ds());

    /* renamed from: e */
    public static final C70297cz f187786e = new C70290cs("content-encoding", C70334de.f187481c);

    /* renamed from: f */
    public static final C70297cz f187787f = C70251bv.m102399b("accept-encoding", new C70457ds());

    /* renamed from: g */
    static final C70297cz f187788g = new C70290cs("content-length", C70334de.f187481c);

    /* renamed from: h */
    public static final C70297cz f187789h = new C70290cs("content-type", C70334de.f187481c);

    /* renamed from: i */
    public static final C70297cz f187790i = new C70290cs("te", C70334de.f187481c);

    /* renamed from: j */
    public static final C70297cz f187791j = new C70290cs("user-agent", C70334de.f187481c);

    /* renamed from: k */
    public static final C58869cf f187792k = C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b);

    /* renamed from: l */
    public static final long f187793l = TimeUnit.SECONDS.toNanos(20);

    /* renamed from: m */
    public static final C70699ed f187794m = new C70579if();

    /* renamed from: n */
    public static final C70846h f187795n = new C70846h("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", (Object) null);

    /* renamed from: o */
    public static final C70906u f187796o = new C70453do();

    /* renamed from: p */
    public static final C70667lm f187797p = new C70454dp();

    /* renamed from: q */
    public static final C70667lm f187798q = new C70455dq();

    /* renamed from: r */
    public static final C58881cr f187799r = new C70456dr();

    /* renamed from: s */
    private static final Logger f187800s = Logger.getLogger(C70460dv.class.getName());

    /* renamed from: t */
    private static final Set f187801t = Collections.unmodifiableSet(EnumSet.of(Status.Code.OK, new Status.Code[]{Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS}));

    static {
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }

    private C70460dv() {
    }

    /* renamed from: b */
    public static Status m102874b(Status status) {
        C58838bb.m90868c(status != null);
        if (!f187801t.contains(status.getCode())) {
            return status;
        }
        Status status2 = Status.f186915m;
        return status2.withDescription("Inappropriate status code from control plane: " + status.getCode() + " " + status.getDescription()).mo61678e(status.f186920q);
    }

    /* renamed from: c */
    static C70375ar m102875c(C70276ce ceVar, boolean z) {
        C70279ch chVar = ceVar.f187347b;
        C70375ar a = chVar != null ? ((C70677lw) chVar.mo61951b()).mo62210a() : null;
        if (a != null) {
            return a;
        }
        if (!ceVar.f187348c.mo61679g()) {
            if (ceVar.f187349d) {
                return new C70445dg(m102874b(ceVar.f187348c), C70373ap.DROPPED);
            }
            if (!z) {
                return new C70445dg(m102874b(ceVar.f187348c), C70373ap.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m102876d(String str, int i) {
        try {
            return new URI((String) null, (String) null, str, i, (String) null, (String) null, (String) null).getAuthority();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid host or port: " + str + " " + i, e);
        }
    }

    /* renamed from: e */
    public static String m102877e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.50.0-SNAPSHOT");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m102878f(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: g */
    public static URI m102879g(String str) {
        C58838bb.m90866a(str, "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: h */
    static void m102880h(C70672lr lrVar) {
        while (true) {
            InputStream g = lrVar.mo61868g();
            if (g != null) {
                m102881i(g);
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public static void m102881i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f187800s.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", e);
            }
        }
    }

    /* renamed from: j */
    public static boolean m102882j(String str) {
        char charAt;
        if (str == null || str.length() < 16) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m102883k(C70851i iVar) {
        return !Boolean.TRUE.equals(iVar.mo62571g(f187795n));
    }

    /* renamed from: l */
    public static ThreadFactory m102884l(String str) {
        C60908dv dvVar = new C60908dv();
        dvVar.f165020a = true;
        dvVar.mo57410b(str);
        return C60908dv.m93015a(dvVar);
    }

    /* renamed from: m */
    public static C70906u[] m102885m(C70851i iVar, int i, boolean z) {
        List list = iVar.f189020f;
        int size = list.size() + 1;
        C70906u[] uVarArr = new C70906u[size];
        C58838bb.m90866a(iVar, "callOptions cannot be null");
        new C70905t(iVar, i, z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            uVarArr[i2] = ((C70904s) list.get(i2)).mo46274a();
        }
        uVarArr[size - 1] = f187796o;
        return uVarArr;
    }

    /* renamed from: n */
    static boolean m102886n(Iterable iterable) {
        for (Object a : iterable) {
            if (C58832aw.m90831a(a, "identity")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Status m102873a(int i) {
        Status.Code code;
        if (i < 100 || i >= 200) {
            if (i != 400) {
                if (i == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i != 404) {
                    if (i != 429) {
                        if (i != 431) {
                            switch (i) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        } else {
            code = Status.Code.INTERNAL;
        }
        Status b = code.mo61684b();
        return b.withDescription("HTTP status code " + i);
    }
}
