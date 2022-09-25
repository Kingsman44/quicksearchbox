package p5488io.grpc.p5527g;

import java.util.logging.Level;
import p5488io.grpc.p5527g.p5528a.p5529a.C70773b;

/* renamed from: io.grpc.g.x */
/* compiled from: PG */
public final class C70843x implements Runnable {

    /* renamed from: a */
    public final C70808ab f188963a = new C70808ab(Level.FINE, C70844y.class);

    /* renamed from: b */
    final C70773b f188964b;

    /* renamed from: c */
    public boolean f188965c = true;

    /* renamed from: d */
    public final /* synthetic */ C70844y f188966d;

    public C70843x(C70844y yVar, C70773b bVar) {
        this.f188966d = yVar;
        this.f188964b = bVar;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = "OkHttpClientTransport"
            r3.setName(r4)
        L_0x0013:
            io.grpc.g.a.a.b r4 = r1.f188964b     // Catch:{ all -> 0x089a }
            java.lang.String r5 = "INBOUND HEADERS: streamId="
            java.lang.String r6 = "INBOUND PUSH_PROMISE: streamId="
            r7 = r4
            io.grpc.g.a.a.j r7 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r7     // Catch:{ IOException -> 0x0856 }
            m.g r7 = r7.f188752a     // Catch:{ IOException -> 0x0856 }
            r8 = 9
            r7.mo63077n(r8)     // Catch:{ IOException -> 0x0856 }
            r7 = r4
            io.grpc.g.a.a.j r7 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r7     // Catch:{ all -> 0x089a }
            m.g r7 = r7.f188752a     // Catch:{ all -> 0x089a }
            int r7 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103528b(r7)     // Catch:{ all -> 0x089a }
            r8 = 16384(0x4000, float:2.2959E-41)
            r9 = 1
            if (r7 > r8) goto L_0x0845
            r10 = r4
            io.grpc.g.a.a.j r10 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r10     // Catch:{ all -> 0x089a }
            m.g r10 = r10.f188752a     // Catch:{ all -> 0x089a }
            byte r10 = r10.mo63062c()     // Catch:{ all -> 0x089a }
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch:{ all -> 0x089a }
            r11 = r4
            io.grpc.g.a.a.j r11 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r11     // Catch:{ all -> 0x089a }
            m.g r11 = r11.f188752a     // Catch:{ all -> 0x089a }
            byte r11 = r11.mo63062c()     // Catch:{ all -> 0x089a }
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11     // Catch:{ all -> 0x089a }
            r12 = r4
            io.grpc.g.a.a.j r12 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r12     // Catch:{ all -> 0x089a }
            m.g r12 = r12.f188752a     // Catch:{ all -> 0x089a }
            int r12 = r12.mo63065e()     // Catch:{ all -> 0x089a }
            r13 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r13
            java.util.logging.Logger r14 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.f188760a     // Catch:{ all -> 0x089a }
            java.util.logging.Level r15 = java.util.logging.Level.FINE     // Catch:{ all -> 0x089a }
            boolean r14 = r14.isLoggable(r15)     // Catch:{ all -> 0x089a }
            if (r14 == 0) goto L_0x006f
            java.util.logging.Logger r14 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.f188760a     // Catch:{ all -> 0x089a }
            java.util.logging.Level r15 = java.util.logging.Level.FINE     // Catch:{ all -> 0x089a }
            java.lang.String r8 = "io.grpc.okhttp.internal.framed.Http2$Reader"
            java.lang.String r13 = "nextFrame"
            java.lang.String r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70780i.m103513a(r9, r12, r7, r10, r11)     // Catch:{ all -> 0x089a }
            r14.logp(r15, r8, r13, r3)     // Catch:{ all -> 0x089a }
        L_0x006f:
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r18 = 0
            r15 = 4
            r3 = 8
            r8 = 0
            switch(r10) {
                case 0: goto L_0x0746;
                case 1: goto L_0x05e5;
                case 2: goto L_0x05be;
                case 3: goto L_0x0523;
                case 4: goto L_0x0361;
                case 5: goto L_0x02df;
                case 6: goto L_0x01ee;
                case 7: goto L_0x010a;
                case 8: goto L_0x007f;
                default: goto L_0x007b;
            }     // Catch:{ all -> 0x089a }
        L_0x007b:
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            goto L_0x0834
        L_0x007f:
            if (r7 != r15) goto L_0x00fa
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            m.g r3 = r4.f188752a     // Catch:{ all -> 0x089a }
            int r3 = r3.mo63065e()     // Catch:{ all -> 0x089a }
            long r3 = (long) r3     // Catch:{ all -> 0x089a }
            long r3 = r3 & r13
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x00f0
            io.grpc.g.ab r5 = r1.f188963a     // Catch:{ all -> 0x089a }
            r5.mo62517g(r9, r12, r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r5 = r5.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r5)     // Catch:{ all -> 0x089a }
            if (r12 != 0) goto L_0x00a6
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x00ec }
            io.grpc.g.am r6 = r6.f188987i     // Catch:{ all -> 0x00ec }
            int r4 = (int) r3     // Catch:{ all -> 0x00ec }
            r6.mo62533d(r8, r4)     // Catch:{ all -> 0x00ec }
            monitor-exit(r5)     // Catch:{ all -> 0x00ec }
            goto L_0x083a
        L_0x00a6:
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x00ec }
            java.util.Map r6 = r6.f188989k     // Catch:{ all -> 0x00ec }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x00ec }
            io.grpc.g.s r6 = (p5488io.grpc.p5527g.C70838s) r6     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00c5
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x00ec }
            io.grpc.g.am r7 = r7.f188987i     // Catch:{ all -> 0x00ec }
            io.grpc.g.r r6 = r6.f188954f     // Catch:{ all -> 0x00ec }
            io.grpc.g.aj r6 = r6.mo62545f()     // Catch:{ all -> 0x00ec }
            int r4 = (int) r3     // Catch:{ all -> 0x00ec }
            r7.mo62533d(r6, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x00ce
        L_0x00c5:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x00ec }
            boolean r3 = r3.mo62558q(r12)     // Catch:{ all -> 0x00ec }
            if (r3 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            monitor-exit(r5)     // Catch:{ all -> 0x00ec }
            if (r9 == 0) goto L_0x083a
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.PROTOCOL_ERROR     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r5.<init>()     // Catch:{ all -> 0x089a }
            java.lang.String r6 = "Received window_update for unknown stream: "
            r5.append(r6)     // Catch:{ all -> 0x089a }
            r5.append(r12)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x089a }
            r3.mo62554j(r4, r5)     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x00ec:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x00ec }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x00f0:
            java.lang.String r3 = "windowSizeIncrement was 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x00fa:
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x010a:
            if (r7 < r3) goto L_0x01de
            if (r12 != 0) goto L_0x01d4
            r3 = r4
            io.grpc.g.a.a.j r3 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r3     // Catch:{ all -> 0x089a }
            m.g r3 = r3.f188752a     // Catch:{ all -> 0x089a }
            int r3 = r3.mo63065e()     // Catch:{ all -> 0x089a }
            r5 = r4
            io.grpc.g.a.a.j r5 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r5     // Catch:{ all -> 0x089a }
            m.g r5 = r5.f188752a     // Catch:{ all -> 0x089a }
            int r5 = r5.mo63065e()     // Catch:{ all -> 0x089a }
            int r7 = r7 + -8
            io.grpc.g.a.a.a r6 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.m103487a(r5)     // Catch:{ all -> 0x089a }
            if (r6 == 0) goto L_0x01c4
            m.i r5 = p5589m.C71832i.f191357a     // Catch:{ all -> 0x089a }
            if (r7 <= 0) goto L_0x0135
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            m.g r4 = r4.f188752a     // Catch:{ all -> 0x089a }
            long r10 = (long) r7     // Catch:{ all -> 0x089a }
            m.i r5 = r4.mo63073j(r10)     // Catch:{ all -> 0x089a }
        L_0x0135:
            io.grpc.g.ab r4 = r1.f188963a     // Catch:{ all -> 0x089a }
            r4.mo62513c(r9, r3, r6, r5)     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.ENHANCE_YOUR_CALM     // Catch:{ all -> 0x089a }
            if (r6 != r4) goto L_0x016a
            java.lang.String r4 = r5.mo63097d()     // Catch:{ all -> 0x089a }
            java.util.logging.Logger r7 = p5488io.grpc.p5527g.C70844y.f188968a     // Catch:{ all -> 0x089a }
            java.util.logging.Level r10 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x089a }
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x089a }
            r12 = 0
            r11[r12] = r1     // Catch:{ all -> 0x089a }
            r11[r9] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r9 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r12 = "goAway"
            java.lang.String r13 = "%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s"
            java.lang.String r11 = java.lang.String.format(r13, r11)     // Catch:{ all -> 0x089a }
            r7.logp(r10, r9, r12, r11)     // Catch:{ all -> 0x089a }
            java.lang.String r7 = "too_many_pings"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x089a }
            if (r4 == 0) goto L_0x016a
            io.grpc.g.y r4 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Runnable r4 = r4.f189004z     // Catch:{ all -> 0x089a }
            r4.run()     // Catch:{ all -> 0x089a }
        L_0x016a:
            int r4 = r6.f188718s     // Catch:{ all -> 0x089a }
            long r6 = (long) r4     // Catch:{ all -> 0x089a }
            io.grpc.e.dt[] r4 = p5488io.grpc.p5525e.C70458dt.f187778o     // Catch:{ all -> 0x089a }
            int r9 = r4.length     // Catch:{ all -> 0x089a }
            long r9 = (long) r9     // Catch:{ all -> 0x089a }
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x017e
            int r9 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x017a
            goto L_0x017e
        L_0x017a:
            int r9 = (int) r6     // Catch:{ all -> 0x089a }
            r4 = r4[r9]     // Catch:{ all -> 0x089a }
            goto L_0x017f
        L_0x017e:
            r4 = r8
        L_0x017f:
            if (r4 != 0) goto L_0x01a7
            io.grpc.e.dt r4 = p5488io.grpc.p5525e.C70458dt.INTERNAL_ERROR     // Catch:{ all -> 0x089a }
            io.grpc.Status r4 = r4.f187780p     // Catch:{ all -> 0x089a }
            io.grpc.Status$Code r4 = r4.getCode()     // Catch:{ all -> 0x089a }
            int r4 = r4.value()     // Catch:{ all -> 0x089a }
            io.grpc.Status r4 = p5488io.grpc.Status.fromCodeValue(r4)     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r9.<init>()     // Catch:{ all -> 0x089a }
            java.lang.String r10 = "Unrecognized HTTP/2 error code: "
            r9.append(r10)     // Catch:{ all -> 0x089a }
            r9.append(r6)     // Catch:{ all -> 0x089a }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x089a }
            io.grpc.Status r4 = r4.withDescription(r6)     // Catch:{ all -> 0x089a }
            goto L_0x01a9
        L_0x01a7:
            io.grpc.Status r4 = r4.f187780p     // Catch:{ all -> 0x089a }
        L_0x01a9:
            java.lang.String r6 = "Received Goaway"
            io.grpc.Status r4 = r4.mo61677b(r6)     // Catch:{ all -> 0x089a }
            int r6 = r5.mo63094b()     // Catch:{ all -> 0x089a }
            if (r6 <= 0) goto L_0x01bd
            java.lang.String r5 = r5.mo63097d()     // Catch:{ all -> 0x089a }
            io.grpc.Status r4 = r4.mo61677b(r5)     // Catch:{ all -> 0x089a }
        L_0x01bd:
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x089a }
            r5.mo62556n(r3, r8, r4)     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x01c4:
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x01d4:
            java.lang.String r3 = "TYPE_GOAWAY streamId != 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x01de:
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x01ee:
            if (r7 != r3) goto L_0x02ce
            if (r12 != 0) goto L_0x02c4
            r3 = r4
            io.grpc.g.a.a.j r3 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r3     // Catch:{ all -> 0x089a }
            m.g r3 = r3.f188752a     // Catch:{ all -> 0x089a }
            int r3 = r3.mo63065e()     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            m.g r4 = r4.f188752a     // Catch:{ all -> 0x089a }
            int r4 = r4.mo63065e()     // Catch:{ all -> 0x089a }
            r5 = r11 & 1
            long r6 = (long) r3     // Catch:{ all -> 0x089a }
            r10 = 32
            long r6 = r6 << r10
            long r10 = (long) r4     // Catch:{ all -> 0x089a }
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r6 = r6 | r10
            io.grpc.g.ab r10 = r1.f188963a     // Catch:{ all -> 0x089a }
            r10.mo62514d(r9, r6)     // Catch:{ all -> 0x089a }
            if (r5 != 0) goto L_0x022b
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r5 = r5.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r5)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x0227 }
            io.grpc.g.h r6 = r6.f188986h     // Catch:{ all -> 0x0227 }
            r6.mo62454e(r9, r3, r4)     // Catch:{ all -> 0x0227 }
            monitor-exit(r5)     // Catch:{ all -> 0x0227 }
            goto L_0x083a
        L_0x0227:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x0227 }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x022b:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r4 = r1.f188966d     // Catch:{ all -> 0x02c0 }
            io.grpc.e.eb r5 = r4.f188995q     // Catch:{ all -> 0x02c0 }
            if (r5 == 0) goto L_0x026a
            long r10 = r5.f187813a     // Catch:{ all -> 0x02c0 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x023f
            r4.f188995q = r8     // Catch:{ all -> 0x02c0 }
            goto L_0x0278
        L_0x023f:
            java.util.logging.Logger r4 = p5488io.grpc.p5527g.C70844y.f188968a     // Catch:{ all -> 0x02c0 }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x02c0 }
            java.lang.String r10 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r11 = "ping"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ all -> 0x02c0 }
            java.lang.String r13 = "Received unexpected ping ack. Expecting %d, got %d"
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x02c0 }
            io.grpc.g.y r15 = r1.f188966d     // Catch:{ all -> 0x02c0 }
            io.grpc.e.eb r15 = r15.f188995q     // Catch:{ all -> 0x02c0 }
            long r8 = r15.f187813a     // Catch:{ all -> 0x02c0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x02c0 }
            r9 = 0
            r14[r9] = r8     // Catch:{ all -> 0x02c0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02c0 }
            r7 = 1
            r14[r7] = r6     // Catch:{ all -> 0x02c0 }
            java.lang.String r6 = java.lang.String.format(r12, r13, r14)     // Catch:{ all -> 0x02c0 }
            r4.logp(r5, r10, r11, r6)     // Catch:{ all -> 0x02c0 }
            goto L_0x0277
        L_0x026a:
            java.util.logging.Logger r4 = p5488io.grpc.p5527g.C70844y.f188968a     // Catch:{ all -> 0x02c0 }
            java.util.logging.Level r5 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x02c0 }
            java.lang.String r6 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r7 = "ping"
            java.lang.String r8 = "Received unexpected ping ack. No ping outstanding"
            r4.logp(r5, r6, r7, r8)     // Catch:{ all -> 0x02c0 }
        L_0x0277:
            r5 = 0
        L_0x0278:
            monitor-exit(r3)     // Catch:{ all -> 0x02c0 }
            if (r5 == 0) goto L_0x083a
            monitor-enter(r5)     // Catch:{ all -> 0x089a }
            boolean r3 = r5.f187816d     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x0283
            monitor-exit(r5)     // Catch:{ all -> 0x02bc }
            goto L_0x083a
        L_0x0283:
            r3 = 1
            r5.f187816d = r3     // Catch:{ all -> 0x02bc }
            com.google.common.base.ci r3 = r5.f187814b     // Catch:{ all -> 0x02bc }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x02bc }
            r3.mo56158a(r4)     // Catch:{ all -> 0x02bc }
            java.util.Map r3 = r5.f187815c     // Catch:{ all -> 0x02bc }
            r6 = 0
            r5.f187815c = r6     // Catch:{ all -> 0x02bc }
            monitor-exit(r5)     // Catch:{ all -> 0x02bc }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x089a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x089a }
        L_0x029b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x089a }
            if (r4 == 0) goto L_0x083a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x089a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x089a }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x089a }
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5     // Catch:{ all -> 0x089a }
            java.lang.Object r4 = r4.getKey()     // Catch:{ all -> 0x089a }
            io.grpc.e.fd r4 = (p5488io.grpc.p5525e.C70496fd) r4     // Catch:{ all -> 0x089a }
            io.grpc.e.dz r4 = new io.grpc.e.dz     // Catch:{ all -> 0x089a }
            r4.<init>()     // Catch:{ all -> 0x089a }
            p5488io.grpc.p5525e.C70467eb.m102898a(r5, r4)     // Catch:{ all -> 0x089a }
            goto L_0x029b
        L_0x02bc:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x02bc }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x02c0:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x02c0 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x02c4:
            java.lang.String r3 = "TYPE_PING streamId != 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x02ce:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_PING length != 8: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x02df:
            if (r12 == 0) goto L_0x0357
            r3 = r11 & 8
            if (r3 == 0) goto L_0x02f1
            r3 = r4
            io.grpc.g.a.a.j r3 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r3     // Catch:{ all -> 0x089a }
            m.g r3 = r3.f188752a     // Catch:{ all -> 0x089a }
            byte r3 = r3.mo63062c()     // Catch:{ all -> 0x089a }
            r3 = r3 & 255(0xff, float:3.57E-43)
            goto L_0x02f2
        L_0x02f1:
            r3 = 0
        L_0x02f2:
            r5 = r4
            io.grpc.g.a.a.j r5 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r5     // Catch:{ all -> 0x089a }
            m.g r5 = r5.f188752a     // Catch:{ all -> 0x089a }
            int r5 = r5.mo63065e()     // Catch:{ all -> 0x089a }
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5 = r5 & r8
            int r7 = r7 + -4
            short r3 = (short) r3     // Catch:{ all -> 0x089a }
            int r7 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103527a(r7, r11, r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            java.util.List r3 = r4.mo62474a(r7, r3, r11, r12)     // Catch:{ all -> 0x089a }
            io.grpc.g.ab r4 = r1.f188963a     // Catch:{ all -> 0x089a }
            boolean r7 = r4.mo62511a()     // Catch:{ all -> 0x089a }
            if (r7 == 0) goto L_0x0342
            java.util.logging.Logger r7 = r4.f188842a     // Catch:{ all -> 0x089a }
            java.util.logging.Level r4 = r4.f188843b     // Catch:{ all -> 0x089a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r8.<init>()     // Catch:{ all -> 0x089a }
            r8.append(r6)     // Catch:{ all -> 0x089a }
            r8.append(r12)     // Catch:{ all -> 0x089a }
            java.lang.String r6 = " promisedStreamId="
            r8.append(r6)     // Catch:{ all -> 0x089a }
            r8.append(r5)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = " headers="
            r8.append(r5)     // Catch:{ all -> 0x089a }
            r8.append(r3)     // Catch:{ all -> 0x089a }
            java.lang.String r3 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r5 = "logPushPromise"
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x089a }
            r7.logp(r4, r3, r5, r6)     // Catch:{ all -> 0x089a }
        L_0x0342:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r4 = r1.f188966d     // Catch:{ all -> 0x0353 }
            io.grpc.g.h r4 = r4.f188986h     // Catch:{ all -> 0x0353 }
            io.grpc.g.a.a.a r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.PROTOCOL_ERROR     // Catch:{ all -> 0x0353 }
            r4.mo62455f(r12, r5)     // Catch:{ all -> 0x0353 }
            monitor-exit(r3)     // Catch:{ all -> 0x0353 }
            goto L_0x083a
        L_0x0353:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0353 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x0357:
            java.lang.String r3 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0361:
            if (r12 != 0) goto L_0x0519
            r5 = r11 & 1
            if (r5 == 0) goto L_0x0375
            if (r7 != 0) goto L_0x036b
            goto L_0x083a
        L_0x036b:
            java.lang.String r3 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0375:
            int r5 = r7 % 6
            if (r5 != 0) goto L_0x0508
            io.grpc.g.a.a.o r5 = new io.grpc.g.a.a.o     // Catch:{ all -> 0x089a }
            r5.<init>()     // Catch:{ all -> 0x089a }
            r6 = 0
        L_0x037f:
            r8 = 7
            if (r6 >= r7) goto L_0x0435
            r9 = r4
            io.grpc.g.a.a.j r9 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r9     // Catch:{ all -> 0x089a }
            m.g r9 = r9.f188752a     // Catch:{ all -> 0x089a }
            r10 = r9
            m.r r10 = (p5589m.C71841r) r10     // Catch:{ all -> 0x089a }
            r11 = 2
            r10.mo63077n(r11)     // Catch:{ all -> 0x089a }
            m.r r9 = (p5589m.C71841r) r9     // Catch:{ all -> 0x089a }
            m.e r9 = r9.f191371b     // Catch:{ all -> 0x089a }
            long r13 = r9.f191356b     // Catch:{ all -> 0x089a }
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x042f
            m.s r10 = r9.f191355a     // Catch:{ all -> 0x089a }
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)     // Catch:{ all -> 0x089a }
            int r11 = r10.f191374b     // Catch:{ all -> 0x089a }
            int r12 = r10.f191375c     // Catch:{ all -> 0x089a }
            int r13 = r12 - r11
            r14 = 2
            if (r13 >= r14) goto L_0x03b7
            byte r10 = r9.mo63062c()     // Catch:{ all -> 0x089a }
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r3
            byte r9 = r9.mo63062c()     // Catch:{ all -> 0x089a }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            short r9 = (short) r9     // Catch:{ all -> 0x089a }
            goto L_0x03de
        L_0x03b7:
            byte[] r13 = r10.f191373a     // Catch:{ all -> 0x089a }
            int r14 = r11 + 1
            byte r11 = r13[r11]     // Catch:{ all -> 0x089a }
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r3
            int r3 = r14 + 1
            byte r13 = r13[r14]     // Catch:{ all -> 0x089a }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            long r13 = r9.f191356b     // Catch:{ all -> 0x089a }
            r18 = -2
            long r13 = r13 + r18
            r9.f191356b = r13     // Catch:{ all -> 0x089a }
            if (r3 != r12) goto L_0x03db
            m.s r3 = r10.mo63123a()     // Catch:{ all -> 0x089a }
            r9.f191355a = r3     // Catch:{ all -> 0x089a }
            p5589m.C71843t.m105211b(r10)     // Catch:{ all -> 0x089a }
            goto L_0x03dd
        L_0x03db:
            r10.f191374b = r3     // Catch:{ all -> 0x089a }
        L_0x03dd:
            short r9 = (short) r11     // Catch:{ all -> 0x089a }
        L_0x03de:
            r3 = r4
            io.grpc.g.a.a.j r3 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r3     // Catch:{ all -> 0x089a }
            m.g r3 = r3.f188752a     // Catch:{ all -> 0x089a }
            int r3 = r3.mo63065e()     // Catch:{ all -> 0x089a }
            r10 = 16384(0x4000, float:2.2959E-41)
            switch(r9) {
                case 1: goto L_0x0425;
                case 2: goto L_0x0415;
                case 3: goto L_0x0413;
                case 4: goto L_0x0406;
                case 5: goto L_0x03ed;
                case 6: goto L_0x0425;
                default: goto L_0x03ec;
            }     // Catch:{ all -> 0x089a }
        L_0x03ec:
            goto L_0x0429
        L_0x03ed:
            if (r3 < r10) goto L_0x03f5
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r8) goto L_0x03f5
            goto L_0x0425
        L_0x03f5:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x089a }
            r5 = 0
            r4[r5] = r3     // Catch:{ all -> 0x089a }
            java.lang.String r3 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r4)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0406:
            if (r3 < 0) goto L_0x0409
            goto L_0x0426
        L_0x0409:
            java.lang.String r3 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0413:
            r8 = 4
            goto L_0x0426
        L_0x0415:
            if (r3 == 0) goto L_0x0425
            r8 = 1
            if (r3 != r8) goto L_0x041b
            goto L_0x0425
        L_0x041b:
            java.lang.String r3 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0425:
            r8 = r9
        L_0x0426:
            r5.mo62481c(r8, r3)     // Catch:{ all -> 0x089a }
        L_0x0429:
            int r6 = r6 + 6
            r3 = 8
            goto L_0x037f
        L_0x042f:
            java.io.EOFException r3 = new java.io.EOFException     // Catch:{ all -> 0x089a }
            r3.<init>()     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0435:
            io.grpc.g.ab r3 = r1.f188963a     // Catch:{ all -> 0x089a }
            r6 = 1
            r3.mo62516f(r6, r5)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            boolean r6 = r5.mo62480b(r15)     // Catch:{ all -> 0x0504 }
            if (r6 == 0) goto L_0x044e
            int[] r6 = r5.f188770b     // Catch:{ all -> 0x0504 }
            r6 = r6[r15]     // Catch:{ all -> 0x0504 }
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x0504 }
            r7.f189000v = r6     // Catch:{ all -> 0x0504 }
        L_0x044e:
            boolean r6 = r5.mo62480b(r8)     // Catch:{ all -> 0x0504 }
            if (r6 == 0) goto L_0x0491
            int[] r6 = r5.f188770b     // Catch:{ all -> 0x0504 }
            r6 = r6[r8]     // Catch:{ all -> 0x0504 }
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x0504 }
            io.grpc.g.am r7 = r7.f188987i     // Catch:{ all -> 0x0504 }
            if (r6 < 0) goto L_0x047a
            int r8 = r7.f188876c     // Catch:{ all -> 0x0504 }
            int r8 = r6 - r8
            r7.f188876c = r6     // Catch:{ all -> 0x0504 }
            io.grpc.g.ak r6 = r7.f188874a     // Catch:{ all -> 0x0504 }
            io.grpc.g.aj[] r6 = r6.mo62528s()     // Catch:{ all -> 0x0504 }
            int r7 = r6.length     // Catch:{ all -> 0x0504 }
            r9 = 0
        L_0x046c:
            if (r9 >= r7) goto L_0x0476
            r10 = r6[r9]     // Catch:{ all -> 0x0504 }
            r10.mo62527f(r8)     // Catch:{ all -> 0x0504 }
            int r9 = r9 + 1
            goto L_0x046c
        L_0x0476:
            if (r8 <= 0) goto L_0x0491
            r6 = 1
            goto L_0x0492
        L_0x047a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0504 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0504 }
            r5.<init>()     // Catch:{ all -> 0x0504 }
            java.lang.String r7 = "Invalid initial window size: "
            r5.append(r7)     // Catch:{ all -> 0x0504 }
            r5.append(r6)     // Catch:{ all -> 0x0504 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0504 }
            r4.<init>(r5)     // Catch:{ all -> 0x0504 }
            throw r4     // Catch:{ all -> 0x0504 }
        L_0x0491:
            r6 = 0
        L_0x0492:
            boolean r7 = r1.f188965c     // Catch:{ all -> 0x0504 }
            if (r7 == 0) goto L_0x04a0
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x0504 }
            io.grpc.e.hi r7 = r7.f188985g     // Catch:{ all -> 0x0504 }
            r7.mo62206b()     // Catch:{ all -> 0x0504 }
            r7 = 0
            r1.f188965c = r7     // Catch:{ all -> 0x0504 }
        L_0x04a0:
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x0504 }
            io.grpc.g.h r7 = r7.f188986h     // Catch:{ all -> 0x0504 }
            io.grpc.g.ab r8 = r7.f188897c     // Catch:{ all -> 0x0504 }
            boolean r9 = r8.mo62511a()     // Catch:{ all -> 0x0504 }
            if (r9 == 0) goto L_0x04c2
            java.util.logging.Logger r9 = r8.f188842a     // Catch:{ all -> 0x0504 }
            java.util.logging.Level r8 = r8.f188843b     // Catch:{ all -> 0x0504 }
            java.lang.String r10 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r11 = "logSettingsAck"
            r12 = 2
            java.lang.String r12 = p5488io.grpc.p5527g.C70845z.m103689a(r12)     // Catch:{ all -> 0x0504 }
            java.lang.String r13 = " SETTINGS: ack=true"
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x0504 }
            r9.logp(r8, r10, r11, r12)     // Catch:{ all -> 0x0504 }
        L_0x04c2:
            io.grpc.g.a.a.c r8 = r7.f188896b     // Catch:{ IOException -> 0x04d7 }
            r9 = r8
            io.grpc.g.d r9 = (p5488io.grpc.p5527g.C70823d) r9     // Catch:{ IOException -> 0x04d7 }
            io.grpc.g.f r9 = r9.f188880a     // Catch:{ IOException -> 0x04d7 }
            int r10 = r9.f188889h     // Catch:{ IOException -> 0x04d7 }
            r11 = 1
            int r10 = r10 + r11
            r9.f188889h = r10     // Catch:{ IOException -> 0x04d7 }
            io.grpc.g.i r8 = (p5488io.grpc.p5527g.C70828i) r8     // Catch:{ IOException -> 0x04d7 }
            io.grpc.g.a.a.c r8 = r8.f188898b     // Catch:{ IOException -> 0x04d7 }
            r8.mo62450a(r5)     // Catch:{ IOException -> 0x04d7 }
            goto L_0x04de
        L_0x04d7:
            r0 = move-exception
            r8 = r0
            io.grpc.g.g r7 = r7.f188895a     // Catch:{ all -> 0x0504 }
            r7.mo62539a(r8)     // Catch:{ all -> 0x0504 }
        L_0x04de:
            if (r6 == 0) goto L_0x04e7
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x0504 }
            io.grpc.g.am r6 = r6.f188987i     // Catch:{ all -> 0x0504 }
            r6.mo62532c()     // Catch:{ all -> 0x0504 }
        L_0x04e7:
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x0504 }
            r6.mo62559r()     // Catch:{ all -> 0x0504 }
            monitor-exit(r3)     // Catch:{ all -> 0x0504 }
            int r3 = r5.mo62479a()     // Catch:{ all -> 0x089a }
            if (r3 < 0) goto L_0x083a
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.e r3 = r4.f188753b     // Catch:{ all -> 0x089a }
            int r4 = r5.mo62479a()     // Catch:{ all -> 0x089a }
            r3.f188729c = r4     // Catch:{ all -> 0x089a }
            r3.f188730d = r4     // Catch:{ all -> 0x089a }
            r3.mo62467e()     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x0504:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0504 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x0508:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0519:
            java.lang.String r3 = "TYPE_SETTINGS streamId != 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0523:
            if (r7 != r15) goto L_0x05ad
            if (r12 == 0) goto L_0x05a3
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            m.g r3 = r4.f188752a     // Catch:{ all -> 0x089a }
            int r3 = r3.mo63065e()     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.m103487a(r3)     // Catch:{ all -> 0x089a }
            if (r4 == 0) goto L_0x0592
            io.grpc.g.ab r3 = r1.f188963a     // Catch:{ all -> 0x089a }
            r5 = 1
            r3.mo62515e(r5, r12, r4)     // Catch:{ all -> 0x089a }
            io.grpc.Status r3 = p5488io.grpc.p5527g.C70844y.m103669b(r4)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = "Rst Stream"
            io.grpc.Status r16 = r3.mo61677b(r5)     // Catch:{ all -> 0x089a }
            io.grpc.Status$Code r3 = r16.getCode()     // Catch:{ all -> 0x089a }
            io.grpc.Status$Code r5 = p5488io.grpc.Status.Code.CANCELLED     // Catch:{ all -> 0x089a }
            if (r3 == r5) goto L_0x0559
            io.grpc.Status$Code r3 = r16.getCode()     // Catch:{ all -> 0x089a }
            io.grpc.Status$Code r5 = p5488io.grpc.Status.Code.DEADLINE_EXCEEDED     // Catch:{ all -> 0x089a }
            if (r3 != r5) goto L_0x0556
            goto L_0x0559
        L_0x0556:
            r18 = 0
            goto L_0x055b
        L_0x0559:
            r18 = 1
        L_0x055b:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x058e }
            java.util.Map r5 = r5.f188989k     // Catch:{ all -> 0x058e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x058e }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x058e }
            io.grpc.g.s r5 = (p5488io.grpc.p5527g.C70838s) r5     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x058b
            io.grpc.g.r r5 = r5.f188954f     // Catch:{ all -> 0x058e }
            io.a.c r5 = r5.f188944u     // Catch:{ all -> 0x058e }
            int r5 = p5488io.p5489a.C69792b.f186180a     // Catch:{ all -> 0x058e }
            io.grpc.g.y r14 = r1.f188966d     // Catch:{ all -> 0x058e }
            io.grpc.g.a.a.a r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.REFUSED_STREAM     // Catch:{ all -> 0x058e }
            if (r4 != r5) goto L_0x057f
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.REFUSED     // Catch:{ all -> 0x058e }
            goto L_0x0581
        L_0x057f:
            io.grpc.e.ap r4 = p5488io.grpc.p5525e.C70373ap.PROCESSED     // Catch:{ all -> 0x058e }
        L_0x0581:
            r17 = r4
            r19 = 0
            r20 = 0
            r15 = r12
            r14.mo62552h(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x058e }
        L_0x058b:
            monitor-exit(r3)     // Catch:{ all -> 0x058e }
            goto L_0x083a
        L_0x058e:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x058e }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x0592:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x089a }
            r5 = 0
            r4[r5] = r3     // Catch:{ all -> 0x089a }
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r4)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x05a3:
            java.lang.String r3 = "TYPE_RST_STREAM streamId == 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x05ad:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x05be:
            r3 = 5
            if (r7 != r3) goto L_0x05d4
            if (r12 == 0) goto L_0x05ca
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            r4.mo62475b()     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x05ca:
            java.lang.String r3 = "TYPE_PRIORITY streamId == 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x05d4:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x05e5:
            r6 = r8
            if (r12 == 0) goto L_0x073c
            r3 = r11 & 1
            r8 = r11 & 8
            if (r8 == 0) goto L_0x05fa
            r8 = r4
            io.grpc.g.a.a.j r8 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r8     // Catch:{ all -> 0x089a }
            m.g r8 = r8.f188752a     // Catch:{ all -> 0x089a }
            byte r8 = r8.mo63062c()     // Catch:{ all -> 0x089a }
            r8 = r8 & 255(0xff, float:3.57E-43)
            goto L_0x05fb
        L_0x05fa:
            r8 = 0
        L_0x05fb:
            r9 = r11 & 32
            if (r9 == 0) goto L_0x0607
            r9 = r4
            io.grpc.g.a.a.j r9 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r9     // Catch:{ all -> 0x089a }
            r9.mo62475b()     // Catch:{ all -> 0x089a }
            int r7 = r7 + -5
        L_0x0607:
            short r8 = (short) r8     // Catch:{ all -> 0x089a }
            int r7 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103527a(r7, r11, r8)     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            java.util.List r4 = r4.mo62474a(r7, r8, r11, r12)     // Catch:{ all -> 0x089a }
            io.grpc.g.ab r7 = r1.f188963a     // Catch:{ all -> 0x089a }
            boolean r8 = r7.mo62511a()     // Catch:{ all -> 0x089a }
            if (r8 == 0) goto L_0x064e
            java.util.logging.Logger r8 = r7.f188842a     // Catch:{ all -> 0x089a }
            java.util.logging.Level r7 = r7.f188843b     // Catch:{ all -> 0x089a }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r10.<init>()     // Catch:{ all -> 0x089a }
            r10.append(r5)     // Catch:{ all -> 0x089a }
            r10.append(r12)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = " headers="
            r10.append(r5)     // Catch:{ all -> 0x089a }
            r10.append(r9)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = " endStream="
            r10.append(r5)     // Catch:{ all -> 0x089a }
            r5 = 1
            if (r5 == r3) goto L_0x063f
            r5 = 0
            goto L_0x0640
        L_0x063f:
            r5 = 1
        L_0x0640:
            r10.append(r5)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = "io.grpc.okhttp.OkHttpFrameLogger"
            java.lang.String r9 = "logHeaders"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x089a }
            r8.logp(r7, r5, r9, r10)     // Catch:{ all -> 0x089a }
        L_0x064e:
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x089a }
            int r5 = r5.f188969A     // Catch:{ all -> 0x089a }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r7) goto L_0x06b4
            r7 = r18
            r5 = 0
        L_0x065a:
            int r9 = r4.size()     // Catch:{ all -> 0x089a }
            if (r5 >= r9) goto L_0x067b
            java.lang.Object r9 = r4.get(r5)     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.d r9 = (p5488io.grpc.p5527g.p5528a.p5529a.C70775d) r9     // Catch:{ all -> 0x089a }
            m.i r10 = r9.f188724f     // Catch:{ all -> 0x089a }
            int r10 = r10.mo63094b()     // Catch:{ all -> 0x089a }
            r11 = 32
            int r10 = r10 + r11
            m.i r9 = r9.f188725g     // Catch:{ all -> 0x089a }
            int r9 = r9.mo63094b()     // Catch:{ all -> 0x089a }
            int r10 = r10 + r9
            long r9 = (long) r10     // Catch:{ all -> 0x089a }
            long r7 = r7 + r9
            int r5 = r5 + 1
            goto L_0x065a
        L_0x067b:
            long r7 = java.lang.Math.min(r7, r13)     // Catch:{ all -> 0x089a }
            int r5 = (int) r7     // Catch:{ all -> 0x089a }
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x089a }
            int r7 = r7.f188969A     // Catch:{ all -> 0x089a }
            if (r5 <= r7) goto L_0x06b4
            io.grpc.Status r6 = p5488io.grpc.Status.f186911i     // Catch:{ all -> 0x089a }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x089a }
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x089a }
            java.lang.String r9 = "trailer"
            java.lang.String r10 = "header"
            r11 = 1
            if (r11 == r3) goto L_0x0695
            r9 = r10
        L_0x0695:
            r10 = 0
            r8[r10] = r9     // Catch:{ all -> 0x089a }
            io.grpc.g.y r9 = r1.f188966d     // Catch:{ all -> 0x089a }
            int r9 = r9.f188969A     // Catch:{ all -> 0x089a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x089a }
            r8[r11] = r9     // Catch:{ all -> 0x089a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x089a }
            r9 = 2
            r8[r9] = r5     // Catch:{ all -> 0x089a }
            java.lang.String r5 = "Response %s metadata larger than %d: %d"
            java.lang.String r5 = java.lang.String.format(r7, r5, r8)     // Catch:{ all -> 0x089a }
            io.grpc.Status r8 = r6.withDescription(r5)     // Catch:{ all -> 0x089a }
            goto L_0x06b5
        L_0x06b4:
            r8 = r6
        L_0x06b5:
            io.grpc.g.y r5 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r5 = r5.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r5)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x0738 }
            java.util.Map r6 = r6.f188989k     // Catch:{ all -> 0x0738 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0738 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0738 }
            io.grpc.g.s r6 = (p5488io.grpc.p5527g.C70838s) r6     // Catch:{ all -> 0x0738 }
            if (r6 != 0) goto L_0x06de
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x0738 }
            boolean r3 = r3.mo62558q(r12)     // Catch:{ all -> 0x0738 }
            if (r3 == 0) goto L_0x06dc
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x0738 }
            io.grpc.g.h r3 = r3.f188986h     // Catch:{ all -> 0x0738 }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.STREAM_CLOSED     // Catch:{ all -> 0x0738 }
            r3.mo62455f(r12, r4)     // Catch:{ all -> 0x0738 }
            goto L_0x071a
        L_0x06dc:
            r9 = 1
            goto L_0x071b
        L_0x06de:
            if (r8 != 0) goto L_0x0702
            io.grpc.g.r r7 = r6.f188954f     // Catch:{ all -> 0x0738 }
            io.a.c r7 = r7.f188944u     // Catch:{ all -> 0x0738 }
            int r7 = p5488io.p5489a.C69792b.f186180a     // Catch:{ all -> 0x0738 }
            io.grpc.g.r r6 = r6.f188954f     // Catch:{ all -> 0x0738 }
            if (r3 == 0) goto L_0x06f6
            byte[][] r3 = p5488io.grpc.p5527g.C70820an.m103615a(r4)     // Catch:{ all -> 0x0738 }
            io.grpc.de r3 = p5488io.grpc.C70251bv.m102400c(r3)     // Catch:{ all -> 0x0738 }
            r6.mo62184r(r3)     // Catch:{ all -> 0x0738 }
            goto L_0x071a
        L_0x06f6:
            byte[][] r3 = p5488io.grpc.p5527g.C70820an.m103615a(r4)     // Catch:{ all -> 0x0738 }
            io.grpc.de r3 = p5488io.grpc.C70251bv.m102400c(r3)     // Catch:{ all -> 0x0738 }
            r6.mo62183q(r3)     // Catch:{ all -> 0x0738 }
            goto L_0x071a
        L_0x0702:
            if (r3 != 0) goto L_0x070d
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x0738 }
            io.grpc.g.h r3 = r3.f188986h     // Catch:{ all -> 0x0738 }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.CANCEL     // Catch:{ all -> 0x0738 }
            r3.mo62455f(r12, r4)     // Catch:{ all -> 0x0738 }
        L_0x070d:
            io.grpc.g.r r3 = r6.f188954f     // Catch:{ all -> 0x0738 }
            io.grpc.de r4 = new io.grpc.de     // Catch:{ all -> 0x0738 }
            r4.<init>()     // Catch:{ all -> 0x0738 }
            io.grpc.e.ap r6 = p5488io.grpc.p5525e.C70373ap.PROCESSED     // Catch:{ all -> 0x0738 }
            r7 = 0
            r3.mo62131j(r8, r6, r7, r4)     // Catch:{ all -> 0x0738 }
        L_0x071a:
            r9 = 0
        L_0x071b:
            monitor-exit(r5)     // Catch:{ all -> 0x0738 }
            if (r9 == 0) goto L_0x083a
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r4 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.PROTOCOL_ERROR     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r5.<init>()     // Catch:{ all -> 0x089a }
            java.lang.String r6 = "Received header for unknown stream: "
            r5.append(r6)     // Catch:{ all -> 0x089a }
            r5.append(r12)     // Catch:{ all -> 0x089a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x089a }
            r3.mo62554j(r4, r5)     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x0738:
            r0 = move-exception
            r3 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x0738 }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x073c:
            java.lang.String r3 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0746:
            r3 = r11 & 1
            r5 = r11 & 32
            if (r5 != 0) goto L_0x082a
            r5 = r11 & 8
            if (r5 == 0) goto L_0x075c
            r5 = r4
            io.grpc.g.a.a.j r5 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r5     // Catch:{ all -> 0x089a }
            m.g r5 = r5.f188752a     // Catch:{ all -> 0x089a }
            byte r5 = r5.mo63062c()     // Catch:{ all -> 0x089a }
            r5 = r5 & 255(0xff, float:3.57E-43)
            goto L_0x075d
        L_0x075c:
            r5 = 0
        L_0x075d:
            short r6 = (short) r5     // Catch:{ all -> 0x089a }
            int r6 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103527a(r7, r11, r6)     // Catch:{ all -> 0x089a }
            r7 = r4
            io.grpc.g.a.a.j r7 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r7     // Catch:{ all -> 0x089a }
            m.g r7 = r7.f188752a     // Catch:{ all -> 0x089a }
            io.grpc.g.ab r14 = r1.f188963a     // Catch:{ all -> 0x089a }
            r8 = r7
            m.r r8 = (p5589m.C71841r) r8     // Catch:{ all -> 0x089a }
            m.e r8 = r8.f191371b     // Catch:{ all -> 0x089a }
            r9 = 1
            if (r9 == r3) goto L_0x0773
            r9 = 0
            goto L_0x0774
        L_0x0773:
            r9 = 1
        L_0x0774:
            r15 = 1
            r16 = r12
            r17 = r8
            r18 = r6
            r19 = r9
            r14.mo62512b(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r8 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r8)     // Catch:{ all -> 0x089a }
            java.util.Map r3 = r3.f188989k     // Catch:{ all -> 0x0826 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0826 }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ all -> 0x0826 }
            io.grpc.g.s r3 = (p5488io.grpc.p5527g.C70838s) r3     // Catch:{ all -> 0x0826 }
            monitor-exit(r8)     // Catch:{ all -> 0x0826 }
            if (r3 != 0) goto L_0x07cd
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            boolean r3 = r3.mo62558q(r12)     // Catch:{ all -> 0x089a }
            if (r3 == 0) goto L_0x07b4
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r8 = r1.f188966d     // Catch:{ all -> 0x07b0 }
            io.grpc.g.h r8 = r8.f188986h     // Catch:{ all -> 0x07b0 }
            io.grpc.g.a.a.a r9 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.STREAM_CLOSED     // Catch:{ all -> 0x07b0 }
            r8.mo62455f(r12, r9)     // Catch:{ all -> 0x07b0 }
            monitor-exit(r3)     // Catch:{ all -> 0x07b0 }
            long r8 = (long) r6
            r7.mo63078o(r8)     // Catch:{ all -> 0x089a }
            goto L_0x07ee
        L_0x07b0:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x07b0 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x07b4:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r6 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.PROTOCOL_ERROR     // Catch:{ all -> 0x089a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x089a }
            r7.<init>()     // Catch:{ all -> 0x089a }
            java.lang.String r8 = "Received data for unknown stream: "
            r7.append(r8)     // Catch:{ all -> 0x089a }
            r7.append(r12)     // Catch:{ all -> 0x089a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x089a }
            r3.mo62554j(r6, r7)     // Catch:{ all -> 0x089a }
            goto L_0x0819
        L_0x07cd:
            long r10 = (long) r6     // Catch:{ all -> 0x089a }
            r7.mo63077n(r10)     // Catch:{ all -> 0x089a }
            m.e r8 = new m.e     // Catch:{ all -> 0x089a }
            r8.<init>()     // Catch:{ all -> 0x089a }
            m.r r7 = (p5589m.C71841r) r7     // Catch:{ all -> 0x089a }
            m.e r7 = r7.f191371b     // Catch:{ all -> 0x089a }
            r8.mo62538mq(r7, r10)     // Catch:{ all -> 0x089a }
            io.grpc.g.r r7 = r3.f188954f     // Catch:{ all -> 0x089a }
            io.a.c r7 = r7.f188944u     // Catch:{ all -> 0x089a }
            int r7 = p5488io.p5489a.C69792b.f186180a     // Catch:{ all -> 0x089a }
            io.grpc.g.y r7 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r7 = r7.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r7)     // Catch:{ all -> 0x089a }
            io.grpc.g.r r3 = r3.f188954f     // Catch:{ all -> 0x0822 }
            r3.mo62547t(r8, r9)     // Catch:{ all -> 0x0822 }
            monitor-exit(r7)     // Catch:{ all -> 0x0822 }
        L_0x07ee:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            int r7 = r3.f188991m     // Catch:{ all -> 0x089a }
            int r7 = r7 + r6
            r3.f188991m = r7     // Catch:{ all -> 0x089a }
            float r6 = (float) r7     // Catch:{ all -> 0x089a }
            int r7 = r3.f188984f     // Catch:{ all -> 0x089a }
            float r7 = (float) r7     // Catch:{ all -> 0x089a }
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x0819
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r6 = r1.f188966d     // Catch:{ all -> 0x0815 }
            io.grpc.g.h r7 = r6.f188986h     // Catch:{ all -> 0x0815 }
            int r6 = r6.f188991m     // Catch:{ all -> 0x0815 }
            long r8 = (long) r6     // Catch:{ all -> 0x0815 }
            r6 = 0
            r7.mo62457h(r6, r8)     // Catch:{ all -> 0x0815 }
            monitor-exit(r3)     // Catch:{ all -> 0x0815 }
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            r3.f188991m = r6     // Catch:{ all -> 0x089a }
            goto L_0x0819
        L_0x0815:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0815 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x0819:
            io.grpc.g.a.a.j r4 = (p5488io.grpc.p5527g.p5528a.p5529a.C70781j) r4     // Catch:{ all -> 0x089a }
            m.g r3 = r4.f188752a     // Catch:{ all -> 0x089a }
            long r4 = (long) r5     // Catch:{ all -> 0x089a }
            r3.mo63078o(r4)     // Catch:{ all -> 0x089a }
            goto L_0x083a
        L_0x0822:
            r0 = move-exception
            r3 = r0
            monitor-exit(r7)     // Catch:{ all -> 0x0822 }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0826:
            r0 = move-exception
            r3 = r0
            monitor-exit(r8)     // Catch:{ all -> 0x0826 }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x082a:
            java.lang.String r3 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x089a }
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r3, r5)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0834:
            m.g r3 = r4.f188752a     // Catch:{ all -> 0x089a }
            long r4 = (long) r7     // Catch:{ all -> 0x089a }
            r3.mo63078o(r4)     // Catch:{ all -> 0x089a }
        L_0x083a:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            io.grpc.e.ff r3 = r3.f189003y     // Catch:{ all -> 0x089a }
            if (r3 == 0) goto L_0x0013
            r3.mo62218a()     // Catch:{ all -> 0x089a }
            goto L_0x0013
        L_0x0845:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x089a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x089a }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r3 = p5488io.grpc.p5527g.p5528a.p5529a.C70783l.m103529c(r4, r3)     // Catch:{ all -> 0x089a }
            throw r3     // Catch:{ all -> 0x089a }
        L_0x0856:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            java.lang.Object r3 = r3.f188988j     // Catch:{ all -> 0x089a }
            monitor-enter(r3)     // Catch:{ all -> 0x089a }
            io.grpc.g.y r4 = r1.f188966d     // Catch:{ all -> 0x0896 }
            io.grpc.Status r4 = r4.f188994p     // Catch:{ all -> 0x0896 }
            monitor-exit(r3)     // Catch:{ all -> 0x0896 }
            if (r4 != 0) goto L_0x086a
            io.grpc.Status r3 = p5488io.grpc.Status.f186916n     // Catch:{ all -> 0x089a }
            java.lang.String r4 = "End of stream or IOException"
            io.grpc.Status r4 = r3.withDescription(r4)     // Catch:{ all -> 0x089a }
        L_0x086a:
            io.grpc.g.y r3 = r1.f188966d     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.a r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.INTERNAL_ERROR     // Catch:{ all -> 0x089a }
            r6 = 0
            r3.mo62556n(r6, r5, r4)     // Catch:{ all -> 0x089a }
            io.grpc.g.a.a.b r3 = r1.f188964b     // Catch:{ IOException -> 0x0878 }
            r3.close()     // Catch:{ IOException -> 0x0878 }
            goto L_0x0887
        L_0x0878:
            r0 = move-exception
            r9 = r0
            java.util.logging.Logger r4 = p5488io.grpc.p5527g.C70844y.f188968a
            java.util.logging.Level r5 = java.util.logging.Level.INFO
            java.lang.String r6 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r7 = "run"
            java.lang.String r8 = "Exception closing frame reader"
        L_0x0884:
            r4.logp(r5, r6, r7, r8, r9)
        L_0x0887:
            io.grpc.g.y r3 = r1.f188966d
            io.grpc.e.hi r3 = r3.f188985g
            r3.mo62208d()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.setName(r2)
            return
        L_0x0896:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0896 }
            throw r4     // Catch:{ all -> 0x089a }
        L_0x089a:
            r0 = move-exception
            r3 = r0
            io.grpc.g.y r4 = r1.f188966d     // Catch:{ all -> 0x08c3 }
            io.grpc.g.a.a.a r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70772a.PROTOCOL_ERROR     // Catch:{ all -> 0x08c3 }
            io.grpc.Status r6 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x08c3 }
            java.lang.String r7 = "error in frame handler"
            io.grpc.Status r6 = r6.withDescription(r7)     // Catch:{ all -> 0x08c3 }
            io.grpc.Status r3 = r6.mo61678e(r3)     // Catch:{ all -> 0x08c3 }
            r6 = 0
            r4.mo62556n(r6, r5, r3)     // Catch:{ all -> 0x08c3 }
            io.grpc.g.a.a.b r3 = r1.f188964b     // Catch:{ IOException -> 0x08b6 }
            r3.close()     // Catch:{ IOException -> 0x08b6 }
            goto L_0x0887
        L_0x08b6:
            r0 = move-exception
            r9 = r0
            java.util.logging.Logger r4 = p5488io.grpc.p5527g.C70844y.f188968a
            java.util.logging.Level r5 = java.util.logging.Level.INFO
            java.lang.String r6 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r7 = "run"
            java.lang.String r8 = "Exception closing frame reader"
            goto L_0x0884
        L_0x08c3:
            r0 = move-exception
            r3 = r0
            io.grpc.g.a.a.b r4 = r1.f188964b     // Catch:{ IOException -> 0x08cb }
            r4.close()     // Catch:{ IOException -> 0x08cb }
            goto L_0x08da
        L_0x08cb:
            r0 = move-exception
            r10 = r0
            java.util.logging.Logger r5 = p5488io.grpc.p5527g.C70844y.f188968a
            java.util.logging.Level r6 = java.util.logging.Level.INFO
            java.lang.String r7 = "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler"
            java.lang.String r8 = "run"
            java.lang.String r9 = "Exception closing frame reader"
            r5.logp(r6, r7, r8, r9, r10)
        L_0x08da:
            io.grpc.g.y r4 = r1.f188966d
            io.grpc.e.hi r4 = r4.f188985g
            r4.mo62208d()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.setName(r2)
            goto L_0x08ea
        L_0x08e9:
            throw r3
        L_0x08ea:
            goto L_0x08e9
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.C70843x.run():void");
    }
}
