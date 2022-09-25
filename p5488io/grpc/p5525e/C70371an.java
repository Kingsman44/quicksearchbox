package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70911z;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.an */
/* compiled from: PG */
final class C70371an extends C70898m {

    /* renamed from: i */
    private static final Logger f187556i = Logger.getLogger(C70371an.class.getName());

    /* renamed from: a */
    public final C70338di f187557a;

    /* renamed from: b */
    public final Executor f187558b;

    /* renamed from: c */
    public final C70359ab f187559c;

    /* renamed from: d */
    public final C70148al f187560d;

    /* renamed from: e */
    public C70372ao f187561e;

    /* renamed from: f */
    public volatile boolean f187562f;

    /* renamed from: g */
    public C70156at f187563g = C70156at.f187007b;

    /* renamed from: h */
    public C70911z f187564h = C70911z.f189100a;

    /* renamed from: j */
    private final boolean f187565j;

    /* renamed from: k */
    private volatile ScheduledFuture f187566k;

    /* renamed from: l */
    private final boolean f187567l;

    /* renamed from: m */
    private C70851i f187568m;

    /* renamed from: n */
    private boolean f187569n;

    /* renamed from: o */
    private boolean f187570o;

    /* renamed from: p */
    private final C70369al f187571p = new C70369al(this);

    /* renamed from: q */
    private final ScheduledExecutorService f187572q;

    /* renamed from: r */
    private final C70512ft f187573r;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public C70371an(C70338di diVar, Executor executor, C70851i iVar, C70512ft ftVar, ScheduledExecutorService scheduledExecutorService, C70359ab abVar) {
        this.f187557a = diVar;
        String str = diVar.f187497b;
        System.identityHashCode(this);
        int i = C69792b.f186180a;
        boolean z = false;
        if (executor == C60826bg.f164896a) {
            this.f187558b = new C70629kb();
            this.f187565j = true;
        } else {
            this.f187558b = new C70633kf(executor);
            this.f187565j = false;
        }
        this.f187559c = abVar;
        this.f187560d = C70148al.m102135m();
        C70337dh dhVar = diVar.f187496a;
        this.f187567l = (dhVar == C70337dh.UNARY || dhVar == C70337dh.SERVER_STREAMING) ? true : z;
        this.f187568m = iVar;
        this.f187573r = ftVar;
        this.f187572q = scheduledExecutorService;
    }

    /* renamed from: j */
    private final void m102674j(Object obj) {
        C58838bb.m90884s(this.f187561e != null, "Not started");
        C58838bb.m90884s(!this.f187569n, "call was cancelled");
        C58838bb.m90884s(!this.f187570o, "call was half-closed");
        try {
            C70372ao aoVar = this.f187561e;
            if (aoVar instanceof C70625jy) {
                C70625jy jyVar = (C70625jy) aoVar;
                C70612jl jlVar = jyVar.f188266v;
                if (jlVar.f188204a) {
                    jlVar.f188209f.f188235a.mo61768n(jyVar.f188253i.mo62043a(obj));
                } else {
                    jyVar.mo62369v(new C70601ja(jyVar, obj));
                }
            } else {
                aoVar.mo61768n(this.f187557a.mo62043a(obj));
            }
            if (!this.f187567l) {
                this.f187561e.mo61758d();
            }
        } catch (RuntimeException e) {
            this.f187561e.mo61757c(Status.f186904b.mo61678e(e).withDescription("Failed to stream message"));
        } catch (Error e2) {
            this.f187561e.mo61757c(Status.f186904b.withDescription("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27478a(p5488io.grpc.C70897l r16, p5488io.grpc.C70334de r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r5 = r17
            java.lang.String r2 = "ClientCall started after deadline exceeded: "
            int r3 = p5488io.p5489a.C69792b.f186180a
            io.grpc.e.ao r3 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            r4 = 1
            r6 = 0
            if (r3 != 0) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            java.lang.String r7 = "Already started"
            com.google.common.base.C58838bb.m90884s(r3, r7)     // Catch:{ all -> 0x02b8 }
            boolean r3 = r1.f187569n     // Catch:{ all -> 0x02b8 }
            r3 = r3 ^ r4
            java.lang.String r7 = "call was cancelled"
            com.google.common.base.C58838bb.m90884s(r3, r7)     // Catch:{ all -> 0x02b8 }
            java.lang.String r3 = "observer"
            com.google.common.base.C58838bb.m90866a(r0, r3)     // Catch:{ all -> 0x02b8 }
            java.lang.String r3 = "headers"
            com.google.common.base.C58838bb.m90866a(r5, r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.al r3 = r1.f187560d     // Catch:{ all -> 0x02b8 }
            boolean r3 = r3.mo61705i()     // Catch:{ all -> 0x02b8 }
            if (r3 != 0) goto L_0x02a9
            io.grpc.i r3 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.h r7 = p5488io.grpc.p5525e.C70552hf.f188067a     // Catch:{ all -> 0x02b8 }
            java.lang.Object r3 = r3.mo62571g(r7)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.hf r3 = (p5488io.grpc.p5525e.C70552hf) r3     // Catch:{ all -> 0x02b8 }
            if (r3 != 0) goto L_0x003f
            goto L_0x00d8
        L_0x003f:
            java.lang.Long r7 = r3.f188068b     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x0063
            long r7 = r7.longValue()     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            io.grpc.ao r10 = p5488io.grpc.C70153aq.f186997a     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r7 = p5488io.grpc.C70153aq.m102154c(r7, r9, r10)     // Catch:{ all -> 0x02b8 }
            io.grpc.i r8 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r8 = r8.f189016b     // Catch:{ all -> 0x02b8 }
            if (r8 == 0) goto L_0x005b
            int r8 = r7.compareTo(r8)     // Catch:{ all -> 0x02b8 }
            if (r8 >= 0) goto L_0x0063
        L_0x005b:
            io.grpc.i r8 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.i r7 = r8.mo62565a(r7)     // Catch:{ all -> 0x02b8 }
            r1.f187568m = r7     // Catch:{ all -> 0x02b8 }
        L_0x0063:
            java.lang.Boolean r7 = r3.f188069c     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x0086
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x0079
            io.grpc.i r7 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.i r8 = new io.grpc.i     // Catch:{ all -> 0x02b8 }
            r8.<init>(r7)     // Catch:{ all -> 0x02b8 }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02b8 }
            r8.f189021g = r7     // Catch:{ all -> 0x02b8 }
            goto L_0x0084
        L_0x0079:
            io.grpc.i r7 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.i r8 = new io.grpc.i     // Catch:{ all -> 0x02b8 }
            r8.<init>(r7)     // Catch:{ all -> 0x02b8 }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02b8 }
            r8.f189021g = r7     // Catch:{ all -> 0x02b8 }
        L_0x0084:
            r1.f187568m = r8     // Catch:{ all -> 0x02b8 }
        L_0x0086:
            java.lang.Integer r7 = r3.f188070d     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x00af
            io.grpc.i r8 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r9 = r8.f189022h     // Catch:{ all -> 0x02b8 }
            if (r9 == 0) goto L_0x00a5
            int r7 = r9.intValue()     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r9 = r3.f188070d     // Catch:{ all -> 0x02b8 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x02b8 }
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ all -> 0x02b8 }
            io.grpc.i r7 = r8.mo62567c(r7)     // Catch:{ all -> 0x02b8 }
            r1.f187568m = r7     // Catch:{ all -> 0x02b8 }
            goto L_0x00af
        L_0x00a5:
            int r7 = r7.intValue()     // Catch:{ all -> 0x02b8 }
            io.grpc.i r7 = r8.mo62567c(r7)     // Catch:{ all -> 0x02b8 }
            r1.f187568m = r7     // Catch:{ all -> 0x02b8 }
        L_0x00af:
            java.lang.Integer r7 = r3.f188071e     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x00d8
            io.grpc.i r8 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r9 = r8.f189023i     // Catch:{ all -> 0x02b8 }
            if (r9 == 0) goto L_0x00ce
            int r7 = r9.intValue()     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r3 = r3.f188071e     // Catch:{ all -> 0x02b8 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x02b8 }
            int r3 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.i r3 = r8.mo62568d(r3)     // Catch:{ all -> 0x02b8 }
            r1.f187568m = r3     // Catch:{ all -> 0x02b8 }
            goto L_0x00d8
        L_0x00ce:
            int r3 = r7.intValue()     // Catch:{ all -> 0x02b8 }
            io.grpc.i r3 = r8.mo62568d(r3)     // Catch:{ all -> 0x02b8 }
            r1.f187568m = r3     // Catch:{ all -> 0x02b8 }
        L_0x00d8:
            io.grpc.i r3 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            java.lang.String r3 = r3.f189019e     // Catch:{ all -> 0x02b8 }
            if (r3 == 0) goto L_0x00fa
            io.grpc.z r7 = r1.f187564h     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.ConcurrentMap r7 = r7.f189101b     // Catch:{ all -> 0x02b8 }
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.y r7 = (p5488io.grpc.C70910y) r7     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x00eb
            goto L_0x00fc
        L_0x00eb:
            io.grpc.e.ht r2 = p5488io.grpc.p5525e.C70566ht.f188130c     // Catch:{ all -> 0x02b8 }
            r1.f187561e = r2     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.Executor r2 = r1.f187558b     // Catch:{ all -> 0x02b8 }
            io.grpc.e.af r4 = new io.grpc.e.af     // Catch:{ all -> 0x02b8 }
            r4.<init>(r15, r0, r3)     // Catch:{ all -> 0x02b8 }
            r2.execute(r4)     // Catch:{ all -> 0x02b8 }
            return
        L_0x00fa:
            io.grpc.x r7 = p5488io.grpc.C70908w.f189099a     // Catch:{ all -> 0x02b8 }
        L_0x00fc:
            r11 = r7
            io.grpc.at r3 = r1.f187563g     // Catch:{ all -> 0x02b8 }
            io.grpc.cz r7 = p5488io.grpc.p5525e.C70460dv.f187788g     // Catch:{ all -> 0x02b8 }
            r5.mo62031f(r7)     // Catch:{ all -> 0x02b8 }
            io.grpc.cz r7 = p5488io.grpc.p5525e.C70460dv.f187784c     // Catch:{ all -> 0x02b8 }
            r5.mo62031f(r7)     // Catch:{ all -> 0x02b8 }
            io.grpc.x r7 = p5488io.grpc.C70908w.f189099a     // Catch:{ all -> 0x02b8 }
            if (r11 == r7) goto L_0x0116
            io.grpc.cz r7 = p5488io.grpc.p5525e.C70460dv.f187784c     // Catch:{ all -> 0x02b8 }
            java.lang.String r8 = r11.mo61728c()     // Catch:{ all -> 0x02b8 }
            r5.mo62033h(r7, r8)     // Catch:{ all -> 0x02b8 }
        L_0x0116:
            io.grpc.cz r7 = p5488io.grpc.p5525e.C70460dv.f187785d     // Catch:{ all -> 0x02b8 }
            r5.mo62031f(r7)     // Catch:{ all -> 0x02b8 }
            byte[] r3 = r3.f187008c     // Catch:{ all -> 0x02b8 }
            int r7 = r3.length     // Catch:{ all -> 0x02b8 }
            if (r7 == 0) goto L_0x0125
            io.grpc.cz r7 = p5488io.grpc.p5525e.C70460dv.f187785d     // Catch:{ all -> 0x02b8 }
            r5.mo62033h(r7, r3)     // Catch:{ all -> 0x02b8 }
        L_0x0125:
            io.grpc.cz r3 = p5488io.grpc.p5525e.C70460dv.f187786e     // Catch:{ all -> 0x02b8 }
            r5.mo62031f(r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.cz r3 = p5488io.grpc.p5525e.C70460dv.f187787f     // Catch:{ all -> 0x02b8 }
            r5.mo62031f(r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r12 = r15.mo62086c()     // Catch:{ all -> 0x02b8 }
            if (r12 == 0) goto L_0x0162
            boolean r3 = r12.mo61723e()     // Catch:{ all -> 0x02b8 }
            if (r3 == 0) goto L_0x0162
            io.grpc.i r3 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.u[] r3 = p5488io.grpc.p5525e.C70460dv.m102885m(r3, r6, r6)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.df r4 = new io.grpc.e.df     // Catch:{ all -> 0x02b8 }
            io.grpc.Status r5 = p5488io.grpc.Status.f186907e     // Catch:{ all -> 0x02b8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b8 }
            r6.<init>(r2)     // Catch:{ all -> 0x02b8 }
            r6.append(r12)     // Catch:{ all -> 0x02b8 }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x02b8 }
            java.lang.String r2 = r2.concat(r6)     // Catch:{ all -> 0x02b8 }
            io.grpc.Status r2 = r5.withDescription(r2)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ap r5 = p5488io.grpc.p5525e.C70373ap.PROCESSED     // Catch:{ all -> 0x02b8 }
            r4.<init>(r2, r5, r3)     // Catch:{ all -> 0x02b8 }
            r1.f187561e = r4     // Catch:{ all -> 0x02b8 }
            goto L_0x0223
        L_0x0162:
            io.grpc.al r2 = r1.f187560d     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r2 = r2.mo61697b()     // Catch:{ all -> 0x02b8 }
            io.grpc.i r3 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r3 = r3.f189016b     // Catch:{ all -> 0x02b8 }
            java.util.logging.Logger r7 = f187556i     // Catch:{ all -> 0x02b8 }
            java.util.logging.Level r8 = java.util.logging.Level.FINE     // Catch:{ all -> 0x02b8 }
            boolean r8 = r7.isLoggable(r8)     // Catch:{ all -> 0x02b8 }
            if (r8 == 0) goto L_0x01ce
            if (r12 == 0) goto L_0x01ce
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x02b8 }
            if (r2 != 0) goto L_0x017f
            goto L_0x01ce
        L_0x017f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            long r8 = r12.mo61720b(r2)     // Catch:{ all -> 0x02b8 }
            r13 = 0
            long r8 = java.lang.Math.max(r13, r8)     // Catch:{ all -> 0x02b8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b8 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x02b8 }
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b8 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x02b8 }
            r13[r6] = r8     // Catch:{ all -> 0x02b8 }
            java.lang.String r8 = "Call timeout set to '%d' ns, due to context deadline."
            java.lang.String r8 = java.lang.String.format(r10, r8, r13)     // Catch:{ all -> 0x02b8 }
            r2.<init>(r8)     // Catch:{ all -> 0x02b8 }
            if (r3 != 0) goto L_0x01a8
            java.lang.String r3 = " Explicit call timeout was not set."
            r2.append(r3)     // Catch:{ all -> 0x02b8 }
            goto L_0x01c1
        L_0x01a8:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            long r8 = r3.mo61720b(r8)     // Catch:{ all -> 0x02b8 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x02b8 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b8 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x02b8 }
            r4[r6] = r8     // Catch:{ all -> 0x02b8 }
            java.lang.String r8 = " Explicit call timeout was '%d' ns."
            java.lang.String r3 = java.lang.String.format(r3, r8, r4)     // Catch:{ all -> 0x02b8 }
            r2.append(r3)     // Catch:{ all -> 0x02b8 }
        L_0x01c1:
            java.util.logging.Level r3 = java.util.logging.Level.FINE     // Catch:{ all -> 0x02b8 }
            java.lang.String r4 = "io.grpc.internal.ClientCallImpl"
            java.lang.String r8 = "logIfContextNarrowedTimeout"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02b8 }
            r7.logp(r3, r4, r8, r2)     // Catch:{ all -> 0x02b8 }
        L_0x01ce:
            io.grpc.e.ft r3 = r1.f187573r     // Catch:{ all -> 0x02b8 }
            io.grpc.di r4 = r1.f187557a     // Catch:{ all -> 0x02b8 }
            io.grpc.i r7 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            io.grpc.al r10 = r1.f187560d     // Catch:{ all -> 0x02b8 }
            io.grpc.e.gw r2 = r3.f187894a     // Catch:{ all -> 0x02b8 }
            boolean r8 = r2.f187986U     // Catch:{ all -> 0x02b8 }
            if (r8 != 0) goto L_0x01fb
            io.grpc.e.ic r2 = new io.grpc.e.ic     // Catch:{ all -> 0x02b8 }
            r2.<init>(r4, r5, r7)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ar r2 = r3.mo62234a(r2)     // Catch:{ all -> 0x02b8 }
            io.grpc.al r3 = r10.mo61696a()     // Catch:{ all -> 0x02b8 }
            io.grpc.u[] r6 = p5488io.grpc.p5525e.C70460dv.m102885m(r7, r6, r6)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ao r2 = r2.mo61824e(r4, r5, r7, r6)     // Catch:{ all -> 0x01f5 }
            r10.mo61702f(r3)     // Catch:{ all -> 0x02b8 }
            goto L_0x0221
        L_0x01f5:
            r0 = move-exception
            r2 = r0
            r10.mo61702f(r3)     // Catch:{ all -> 0x02b8 }
            throw r2     // Catch:{ all -> 0x02b8 }
        L_0x01fb:
            io.grpc.e.hh r2 = r2.f187979N     // Catch:{ all -> 0x02b8 }
            io.grpc.e.jx r9 = r2.f188075a     // Catch:{ all -> 0x02b8 }
            io.grpc.h r2 = p5488io.grpc.p5525e.C70552hf.f188067a     // Catch:{ all -> 0x02b8 }
            java.lang.Object r2 = r7.mo62571g(r2)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.hf r2 = (p5488io.grpc.p5525e.C70552hf) r2     // Catch:{ all -> 0x02b8 }
            r6 = 0
            if (r2 != 0) goto L_0x020c
            r8 = r6
            goto L_0x020e
        L_0x020c:
            io.grpc.e.jz r8 = r2.f188072f     // Catch:{ all -> 0x02b8 }
        L_0x020e:
            if (r2 != 0) goto L_0x0212
            r13 = r6
            goto L_0x0215
        L_0x0212:
            io.grpc.e.dw r2 = r2.f188073g     // Catch:{ all -> 0x02b8 }
            r13 = r2
        L_0x0215:
            io.grpc.e.fs r14 = new io.grpc.e.fs     // Catch:{ all -> 0x02b8 }
            r2 = r14
            r5 = r17
            r6 = r7
            r7 = r8
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02b8 }
            r2 = r14
        L_0x0221:
            r1.f187561e = r2     // Catch:{ all -> 0x02b8 }
        L_0x0223:
            boolean r2 = r1.f187565j     // Catch:{ all -> 0x02b8 }
            if (r2 == 0) goto L_0x022c
            io.grpc.e.ao r2 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            r2.mo61760f()     // Catch:{ all -> 0x02b8 }
        L_0x022c:
            io.grpc.i r2 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r2 = r2.f189022h     // Catch:{ all -> 0x02b8 }
            if (r2 == 0) goto L_0x023b
            io.grpc.e.ao r3 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x02b8 }
            r3.mo61765k(r2)     // Catch:{ all -> 0x02b8 }
        L_0x023b:
            io.grpc.i r2 = r1.f187568m     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r2 = r2.f189023i     // Catch:{ all -> 0x02b8 }
            if (r2 == 0) goto L_0x024a
            io.grpc.e.ao r3 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x02b8 }
            r3.mo61766l(r2)     // Catch:{ all -> 0x02b8 }
        L_0x024a:
            if (r12 == 0) goto L_0x0251
            io.grpc.e.ao r2 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            r2.mo61763i(r12)     // Catch:{ all -> 0x02b8 }
        L_0x0251:
            io.grpc.e.ao r2 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            r2.mo61762h(r11)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ao r2 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            io.grpc.at r3 = r1.f187563g     // Catch:{ all -> 0x02b8 }
            r2.mo61764j(r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ab r2 = r1.f187559c     // Catch:{ all -> 0x02b8 }
            r2.mo62075b()     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ao r2 = r1.f187561e     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ak r3 = new io.grpc.e.ak     // Catch:{ all -> 0x02b8 }
            r3.<init>(r15, r0)     // Catch:{ all -> 0x02b8 }
            r2.mo61767m(r3)     // Catch:{ all -> 0x02b8 }
            io.grpc.al r0 = r1.f187560d     // Catch:{ all -> 0x02b8 }
            io.grpc.e.al r2 = r1.f187571p     // Catch:{ all -> 0x02b8 }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x02b8 }
            r0.mo61700d(r2, r3)     // Catch:{ all -> 0x02b8 }
            if (r12 == 0) goto L_0x02a1
            io.grpc.al r0 = r1.f187560d     // Catch:{ all -> 0x02b8 }
            io.grpc.aq r0 = r0.mo61697b()     // Catch:{ all -> 0x02b8 }
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x02b8 }
            if (r0 != 0) goto L_0x02a1
            java.util.concurrent.ScheduledExecutorService r0 = r1.f187572q     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x02a1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            long r2 = r12.mo61720b(r0)     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.ScheduledExecutorService r0 = r1.f187572q     // Catch:{ all -> 0x02b8 }
            io.grpc.e.fg r4 = new io.grpc.e.fg     // Catch:{ all -> 0x02b8 }
            io.grpc.e.am r5 = new io.grpc.e.am     // Catch:{ all -> 0x02b8 }
            r5.<init>(r15, r2)     // Catch:{ all -> 0x02b8 }
            r4.<init>(r5)     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r4, r2, r5)     // Catch:{ all -> 0x02b8 }
            r1.f187566k = r0     // Catch:{ all -> 0x02b8 }
        L_0x02a1:
            boolean r0 = r1.f187562f     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x02a8
            r15.mo62087e()     // Catch:{ all -> 0x02b8 }
        L_0x02a8:
            return
        L_0x02a9:
            io.grpc.e.ht r2 = p5488io.grpc.p5525e.C70566ht.f188130c     // Catch:{ all -> 0x02b8 }
            r1.f187561e = r2     // Catch:{ all -> 0x02b8 }
            java.util.concurrent.Executor r2 = r1.f187558b     // Catch:{ all -> 0x02b8 }
            io.grpc.e.ae r3 = new io.grpc.e.ae     // Catch:{ all -> 0x02b8 }
            r3.<init>(r15, r0)     // Catch:{ all -> 0x02b8 }
            r2.execute(r3)     // Catch:{ all -> 0x02b8 }
            return
        L_0x02b8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70371an.mo27478a(io.grpc.l, io.grpc.de):void");
    }

    /* renamed from: b */
    public final C70256c mo62057b() {
        C70372ao aoVar = this.f187561e;
        if (aoVar != null) {
            return aoVar.mo61755a();
        }
        return C70256c.f187254a;
    }

    /* renamed from: c */
    public final C70153aq mo62086c() {
        C70153aq aqVar = this.f187568m.f189016b;
        C70153aq b = this.f187560d.mo61697b();
        if (aqVar == null) {
            return b;
        }
        if (b == null) {
            return aqVar;
        }
        aqVar.mo61722d(b);
        aqVar.mo61722d(b);
        return aqVar.f187002c - b.f187002c < 0 ? aqVar : b;
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        Status status;
        int i = C69792b.f186180a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f187556i.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.f187569n) {
            this.f187569n = true;
            try {
                if (this.f187561e != null) {
                    Status status2 = Status.f186904b;
                    if (str != null) {
                        status = status2.withDescription(str);
                    } else {
                        status = status2.withDescription("Call cancelled without message");
                    }
                    if (th != null) {
                        status = status.mo61678e(th);
                    }
                    this.f187561e.mo61757c(status);
                }
            } finally {
                mo62087e();
            }
        }
    }

    /* renamed from: e */
    public final void mo62087e() {
        this.f187560d.mo61703g(this.f187571p);
        ScheduledFuture scheduledFuture = this.f187566k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: f */
    public final void mo27481f() {
        int i = C69792b.f186180a;
        C58838bb.m90884s(this.f187561e != null, "Not started");
        C58838bb.m90884s(!this.f187569n, "call was cancelled");
        C58838bb.m90884s(!this.f187570o, "call already half-closed");
        this.f187570o = true;
        this.f187561e.mo61759e();
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        int i2 = C69792b.f186180a;
        C58838bb.m90884s(this.f187561e != null, "Not started");
        this.f187561e.mo61761g(i);
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        int i = C69792b.f186180a;
        m102674j(obj);
    }

    /* renamed from: i */
    public final boolean mo62058i() {
        if (this.f187570o) {
            return false;
        }
        return this.f187561e.mo61769o();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("method", this.f187557a);
        return b.toString();
    }
}
