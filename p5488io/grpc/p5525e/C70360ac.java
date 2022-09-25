package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.text.MessageFormat;
import java.util.logging.Level;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70896k;

/* renamed from: io.grpc.e.ac */
/* compiled from: PG */
final class C70360ac extends C70896k {

    /* renamed from: a */
    private final C70361ad f187533a;

    /* renamed from: b */
    private final C70675lu f187534b;

    public C70360ac(C70361ad adVar, C70675lu luVar) {
        C58838bb.m90866a(adVar, "tracer");
        this.f187533a = adVar;
        C58838bb.m90866a(luVar, "time");
        this.f187534b = luVar;
    }

    /* renamed from: c */
    public static Level m102656c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    /* renamed from: d */
    private final boolean m102657d(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.f187533a.f187536b) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo62076a(int i, String str) {
        C70248bs bsVar = this.f187533a.f187537c;
        Level c = m102656c(i);
        if (C70361ad.f187535a.isLoggable(c)) {
            C70361ad.m102660a(bsVar, c, str);
        }
        m102657d(i);
    }

    /* renamed from: b */
    public final void mo62077b(int i, String str, Object... objArr) {
        Level c = m102656c(i);
        m102657d(i);
        mo62076a(i, C70361ad.f187535a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
