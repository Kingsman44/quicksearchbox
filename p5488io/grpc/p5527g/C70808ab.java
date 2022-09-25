package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.p5527g.p5528a.p5529a.C70772a;
import p5488io.grpc.p5527g.p5528a.p5529a.C70786o;
import p5589m.C71828e;
import p5589m.C71832i;

/* renamed from: io.grpc.g.ab */
/* compiled from: PG */
public final class C70808ab {

    /* renamed from: a */
    public final Logger f188842a;

    /* renamed from: b */
    public final Level f188843b;

    public C70808ab(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        C58838bb.m90866a(level, "level");
        this.f188843b = level;
        C58838bb.m90866a(logger, "logger");
        this.f188842a = logger;
    }

    /* renamed from: a */
    public final boolean mo62511a() {
        return this.f188842a.isLoggable(this.f188843b);
    }

    /* renamed from: b */
    public final void mo62512b(int i, int i2, C71828e eVar, int i3, boolean z) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            String h = m103575h(eVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", C70845z.m103689a(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h);
        }
    }

    /* renamed from: c */
    public final void mo62513c(int i, int i2, C70772a aVar, C71832i iVar) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            String valueOf = String.valueOf(aVar);
            int b = iVar.mo63094b();
            C71828e eVar = new C71828e();
            eVar.mo63083s(iVar);
            String h = m103575h(eVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", C70845z.m103689a(i) + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + valueOf + " length=" + b + " bytes=" + h);
        }
    }

    /* renamed from: d */
    public final void mo62514d(int i, long j) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", C70845z.m103689a(i) + " PING: ack=false bytes=" + j);
        }
    }

    /* renamed from: e */
    public final void mo62515e(int i, int i2, C70772a aVar) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            String valueOf = String.valueOf(aVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", C70845z.m103689a(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + valueOf);
        }
    }

    /* renamed from: f */
    public final void mo62516f(int i, C70786o oVar) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            String a = C70845z.m103689a(i);
            EnumMap enumMap = new EnumMap(C70807aa.class);
            for (C70807aa aaVar : C70807aa.values()) {
                int i2 = aaVar.f188841g;
                if (oVar.mo62480b(i2)) {
                    enumMap.put(aaVar, Integer.valueOf(oVar.f188770b[i2]));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", a + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    /* renamed from: g */
    public final void mo62517g(int i, int i2, long j) {
        if (mo62511a()) {
            Logger logger = this.f188842a;
            Level level = this.f188843b;
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", C70845z.m103689a(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    /* renamed from: h */
    private static String m103575h(C71828e eVar) {
        long j = eVar.f191356b;
        if (j <= 64) {
            return eVar.mo63074k().mo63095c();
        }
        return String.valueOf(eVar.mo63075l((int) Math.min(j, 64)).mo63095c()).concat("...");
    }
}
