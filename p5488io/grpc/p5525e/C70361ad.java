package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p5488io.grpc.C70240bk;
import p5488io.grpc.C70241bl;
import p5488io.grpc.C70242bm;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70254by;
import p5488io.grpc.C70896k;

/* renamed from: io.grpc.e.ad */
/* compiled from: PG */
final class C70361ad {

    /* renamed from: a */
    static final Logger f187535a = Logger.getLogger(C70896k.class.getName());

    /* renamed from: b */
    public final Object f187536b = new Object();

    /* renamed from: c */
    public final C70248bs f187537c;

    public C70361ad(C70248bs bsVar, long j, String str) {
        C58838bb.m90866a(bsVar, "logId");
        this.f187537c = bsVar;
        mo62078b(C70240bk.m102390a(str.concat(" created"), C70241bl.CT_INFO, Long.valueOf(j), (C70254by) null));
    }

    /* renamed from: a */
    static void m102660a(C70248bs bsVar, Level level, String str) {
        Logger logger = f187535a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + bsVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62078b(C70242bm bmVar) {
        Level level;
        C70241bl blVar = C70241bl.CT_UNKNOWN;
        int ordinal = bmVar.f187231b.ordinal();
        if (ordinal != 2) {
            level = ordinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f187536b) {
        }
        m102660a(this.f187537c, level, bmVar.f187230a);
    }
}
