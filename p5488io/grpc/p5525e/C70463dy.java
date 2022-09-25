package p5488io.grpc.p5525e;

import com.google.common.base.C58913w;
import java.nio.charset.Charset;
import java.util.logging.Level;
import p5488io.grpc.C70250bu;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70253bx;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dy */
/* compiled from: PG */
public abstract class C70463dy extends C70411c {

    /* renamed from: a */
    private static final C70250bu f187805a;

    /* renamed from: b */
    private static final C70297cz f187806b;

    /* renamed from: c */
    private Status f187807c;

    /* renamed from: d */
    private C70334de f187808d;

    /* renamed from: e */
    private Charset f187809e = C58913w.f156754c;

    /* renamed from: f */
    private boolean f187810f;

    static {
        C70462dx dxVar = new C70462dx();
        f187805a = dxVar;
        f187806b = C70251bv.m102399b(":status", dxVar);
    }

    protected C70463dy(int i, C70670lp lpVar, C70679ly lyVar) {
        super(i, lpVar, lyVar);
    }

    /* renamed from: f */
    private static Charset m102889f(C70334de deVar) {
        String str = (String) deVar.mo62027b(C70460dv.f187789h);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return C58913w.f156754c;
    }

    /* renamed from: s */
    private static void m102890s(C70334de deVar) {
        deVar.mo62031f(f187806b);
        deVar.mo62031f(C70253bx.f187253b);
        deVar.mo62031f(C70253bx.f187252a);
    }

    /* renamed from: t */
    private static final Status m102891t(C70334de deVar) {
        Integer num = (Integer) deVar.mo62027b(f187806b);
        if (num == null) {
            return Status.f186915m.withDescription("Missing HTTP status code");
        }
        String str = (String) deVar.mo62027b(C70460dv.f187789h);
        if (!C70460dv.m102882j(str)) {
            return C70460dv.m102873a(num.intValue()).mo61677b("invalid content-type: ".concat(String.valueOf(str)));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo61920c(Status status, boolean z, C70334de deVar);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62182p(p5488io.grpc.p5525e.C70580ig r9, boolean r10) {
        /*
            r8 = this;
            io.grpc.Status r0 = r8.f187807c
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.nio.charset.Charset r2 = r8.f187809e
            java.lang.String r2 = p5488io.grpc.p5525e.C70584ik.m103163b(r9, r2)
            java.lang.String r3 = "DATA-----------------------------\n"
            java.lang.String r2 = r3.concat(r2)
            io.grpc.Status r0 = r0.mo61677b(r2)
            r8.f187807c = r0
            r9.close()
            io.grpc.Status r9 = r8.f187807c
            java.lang.String r9 = r9.getDescription()
            int r9 = r9.length()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r9 > r0) goto L_0x002a
            if (r10 == 0) goto L_0x00bc
        L_0x002a:
            io.grpc.Status r9 = r8.f187807c
            io.grpc.de r10 = r8.f187808d
            r8.mo61920c(r9, r1, r10)
            return
        L_0x0032:
            boolean r0 = r8.f187810f
            if (r0 != 0) goto L_0x0047
            io.grpc.Status r9 = p5488io.grpc.Status.f186915m
            java.lang.String r10 = "headers not received before payload"
            io.grpc.Status r9 = r9.withDescription(r10)
            io.grpc.de r10 = new io.grpc.de
            r10.<init>()
            r8.mo61920c(r9, r1, r10)
            return
        L_0x0047:
            int r0 = r9.mo62099g()
            r2 = 1
            boolean r3 = r8.f187648n     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x0061
            java.util.logging.Logger r3 = p5488io.grpc.p5525e.C70438d.f187716q     // Catch:{ all -> 0x00bf }
            java.util.logging.Level r4 = java.util.logging.Level.INFO     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "io.grpc.internal.AbstractClientStream$TransportState"
            java.lang.String r6 = "inboundDataReceived"
            java.lang.String r7 = "Received data on closed stream"
            r3.logp(r4, r5, r6, r7)     // Catch:{ all -> 0x00bf }
            r9.close()
            goto L_0x0095
        L_0x0061:
            io.grpc.e.bg r3 = r8.f188140o     // Catch:{ all -> 0x0091 }
            r4 = r3
            io.grpc.e.hn r4 = (p5488io.grpc.p5525e.C70560hn) r4     // Catch:{ all -> 0x008a }
            boolean r4 = r4.mo62312b()     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x0086
            r4 = r3
            io.grpc.e.hn r4 = (p5488io.grpc.p5525e.C70560hn) r4     // Catch:{ all -> 0x008a }
            boolean r4 = r4.f188092f     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0074
            goto L_0x0086
        L_0x0074:
            r4 = r3
            io.grpc.e.hn r4 = (p5488io.grpc.p5525e.C70560hn) r4     // Catch:{ all -> 0x008a }
            io.grpc.e.bb r4 = r4.f188090d     // Catch:{ all -> 0x008a }
            r4.mo62101i(r9)     // Catch:{ all -> 0x008a }
            io.grpc.e.hn r3 = (p5488io.grpc.p5525e.C70560hn) r3     // Catch:{ all -> 0x0082 }
            r3.mo62311a()     // Catch:{ all -> 0x0082 }
            goto L_0x0095
        L_0x0082:
            r2 = move-exception
            r3 = r2
            r2 = 0
            goto L_0x008b
        L_0x0086:
            r9.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x008a:
            r3 = move-exception
        L_0x008b:
            if (r2 == 0) goto L_0x0090
            r9.close()     // Catch:{ all -> 0x0091 }
        L_0x0090:
            throw r3     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r2 = move-exception
            r8.mo61919b(r2)     // Catch:{ all -> 0x00bd }
        L_0x0095:
            if (r10 == 0) goto L_0x00bc
            if (r0 <= 0) goto L_0x00a4
            io.grpc.Status r9 = p5488io.grpc.Status.f186915m
            java.lang.String r10 = "Received unexpected EOS on non-empty DATA frame from server"
            io.grpc.Status r9 = r9.withDescription(r10)
            r8.f187807c = r9
            goto L_0x00ae
        L_0x00a4:
            io.grpc.Status r9 = p5488io.grpc.Status.f186915m
            java.lang.String r10 = "Received unexpected EOS on empty DATA frame from server"
            io.grpc.Status r9 = r9.withDescription(r10)
            r8.f187807c = r9
        L_0x00ae:
            io.grpc.de r9 = new io.grpc.de
            r9.<init>()
            r8.f187808d = r9
            io.grpc.Status r10 = r8.f187807c
            io.grpc.e.ap r0 = p5488io.grpc.p5525e.C70373ap.PROCESSED
            r8.mo62131j(r10, r0, r1, r9)
        L_0x00bc:
            return
        L_0x00bd:
            r10 = move-exception
            goto L_0x00c1
        L_0x00bf:
            r10 = move-exception
            r1 = 1
        L_0x00c1:
            if (r1 == 0) goto L_0x00c6
            r9.close()
        L_0x00c6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70463dy.mo62182p(io.grpc.e.ig, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62183q(p5488io.grpc.C70334de r7) {
        /*
            r6 = this;
            io.grpc.Status r0 = r6.f187807c
            java.lang.String r1 = "headers: "
            if (r0 == 0) goto L_0x001d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r1.concat(r7)
            io.grpc.Status r7 = r0.mo61677b(r7)
            r6.f187807c = r7
            return
        L_0x001d:
            boolean r0 = r6.f187810f     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x004c
            io.grpc.Status r0 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x012a }
            java.lang.String r2 = "Received headers twice"
            io.grpc.Status r0 = r0.withDescription(r2)     // Catch:{ all -> 0x012a }
            r6.f187807c = r0     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x004b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r2 = r7.toString()
            java.lang.String r1 = r1.concat(r2)
            io.grpc.Status r0 = r0.mo61677b(r1)
            r6.f187807c = r0
            r6.f187808d = r7
            java.nio.charset.Charset r7 = m102889f(r7)
            r6.f187809e = r7
        L_0x004b:
            return
        L_0x004c:
            io.grpc.cz r0 = f187806b     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r7.mo62027b(r0)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0089
            int r2 = r0.intValue()     // Catch:{ all -> 0x012a }
            r3 = 100
            if (r2 < r3) goto L_0x0089
            int r0 = r0.intValue()     // Catch:{ all -> 0x012a }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 >= r2) goto L_0x0089
            io.grpc.Status r0 = r6.f187807c
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r2 = r7.toString()
            java.lang.String r1 = r1.concat(r2)
            io.grpc.Status r0 = r0.mo61677b(r1)
            r6.f187807c = r0
            r6.f187808d = r7
            java.nio.charset.Charset r7 = m102889f(r7)
            r6.f187809e = r7
        L_0x0088:
            return
        L_0x0089:
            r0 = 1
            r6.f187810f = r0     // Catch:{ all -> 0x012a }
            io.grpc.Status r2 = m102891t(r7)     // Catch:{ all -> 0x012a }
            r6.f187807c = r2     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r7.toString()
            java.lang.String r0 = r1.concat(r0)
            io.grpc.Status r0 = r2.mo61677b(r0)
            r6.f187807c = r0
            r6.f187808d = r7
            java.nio.charset.Charset r7 = m102889f(r7)
            r6.f187809e = r7
            return
        L_0x00b3:
            m102890s(r7)     // Catch:{ all -> 0x012a }
            boolean r2 = r6.f187648n     // Catch:{ all -> 0x012a }
            r2 = r2 ^ r0
            java.lang.String r3 = "Received headers on closed stream"
            com.google.common.base.C58838bb.m90884s(r2, r3)     // Catch:{ all -> 0x012a }
            io.grpc.e.lp r2 = r6.f187644j     // Catch:{ all -> 0x012a }
            r2.mo62412a()     // Catch:{ all -> 0x012a }
            io.grpc.cz r2 = p5488io.grpc.p5525e.C70460dv.f187786e     // Catch:{ all -> 0x012a }
            java.lang.Object r2 = r7.mo62027b(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x012a }
            io.grpc.cz r2 = p5488io.grpc.p5525e.C70460dv.f187784c     // Catch:{ all -> 0x012a }
            java.lang.Object r2 = r7.mo62027b(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x0102
            io.grpc.at r3 = r6.f187646l     // Catch:{ all -> 0x012a }
            io.grpc.ar r3 = r3.mo61729a(r2)     // Catch:{ all -> 0x012a }
            if (r3 != 0) goto L_0x00f8
            io.grpc.Status r3 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x012a }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x012a }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x012a }
            java.lang.String r2 = "Can't find decompressor for %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ all -> 0x012a }
            io.grpc.Status r2 = r3.withDescription(r2)     // Catch:{ all -> 0x012a }
            io.grpc.fa r3 = new io.grpc.fa     // Catch:{ all -> 0x012a }
            r4 = 0
            r3.<init>(r2, r4, r0)     // Catch:{ all -> 0x012a }
            r6.mo61919b(r3)     // Catch:{ all -> 0x012a }
            goto L_0x0107
        L_0x00f8:
            io.grpc.x r0 = p5488io.grpc.C70908w.f189099a     // Catch:{ all -> 0x012a }
            if (r3 == r0) goto L_0x0102
            io.grpc.e.bg r0 = r6.f188140o     // Catch:{ all -> 0x012a }
            io.grpc.e.hn r0 = (p5488io.grpc.p5525e.C70560hn) r0     // Catch:{ all -> 0x012a }
            r0.f188089c = r3     // Catch:{ all -> 0x012a }
        L_0x0102:
            io.grpc.e.aq r0 = r6.f187645k     // Catch:{ all -> 0x012a }
            r0.mo62082c(r7)     // Catch:{ all -> 0x012a }
        L_0x0107:
            io.grpc.Status r0 = r6.f187807c
            if (r0 == 0) goto L_0x0129
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r2 = r7.toString()
            java.lang.String r1 = r1.concat(r2)
            io.grpc.Status r0 = r0.mo61677b(r1)
            r6.f187807c = r0
            r6.f187808d = r7
            java.nio.charset.Charset r7 = m102889f(r7)
            r6.f187809e = r7
        L_0x0129:
            return
        L_0x012a:
            r0 = move-exception
            io.grpc.Status r2 = r6.f187807c
            if (r2 != 0) goto L_0x0130
            goto L_0x014e
        L_0x0130:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r7)
            java.lang.String r3 = r7.toString()
            java.lang.String r1 = r1.concat(r3)
            io.grpc.Status r1 = r2.mo61677b(r1)
            r6.f187807c = r1
            r6.f187808d = r7
            java.nio.charset.Charset r7 = m102889f(r7)
            r6.f187809e = r7
        L_0x014e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70463dy.mo62183q(io.grpc.de):void");
    }

    /* renamed from: r */
    public final void mo62184r(C70334de deVar) {
        Status status;
        Status status2;
        Status status3 = this.f187807c;
        if (status3 == null && !this.f187810f) {
            status3 = m102891t(deVar);
            this.f187807c = status3;
            if (status3 != null) {
                this.f187808d = deVar;
            }
        }
        if (status3 == null) {
            Status status4 = (Status) deVar.mo62027b(C70253bx.f187253b);
            if (status4 != null) {
                status = status4.withDescription((String) deVar.mo62027b(C70253bx.f187252a));
            } else if (this.f187810f) {
                status = Status.f186905c.withDescription("missing GRPC status in response");
            } else {
                Integer num = (Integer) deVar.mo62027b(f187806b);
                if (num != null) {
                    status2 = C70460dv.m102873a(num.intValue());
                } else {
                    status2 = Status.f186915m.withDescription("missing HTTP status code");
                }
                status = status2.mo61677b("missing GRPC status, inferred error from HTTP status code");
            }
            m102890s(deVar);
            if (this.f187648n) {
                C70438d.f187716q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{status, deVar});
                return;
            }
            this.f187644j.mo62416e();
            mo62131j(status, C70373ap.PROCESSED, false, deVar);
            return;
        }
        new StringBuilder("trailers: ").append(deVar);
        Status b = status3.mo61677b("trailers: ".concat(deVar.toString()));
        this.f187807c = b;
        mo61920c(b, false, this.f187808d);
    }
}
