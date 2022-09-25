package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70342dm;

/* renamed from: io.grpc.e.cz */
/* compiled from: PG */
final class C70437cz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70441dc f187714a;

    /* renamed from: b */
    private final C70342dm f187715b;

    public C70437cz(C70441dc dcVar, C70342dm dmVar) {
        this.f187714a = dcVar;
        C58838bb.m90866a(dmVar, "savedListener");
        this.f187715b = dmVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02bf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02c2, code lost:
        r5 = new p5488io.grpc.C70340dk(p5488io.grpc.Status.f186905c.withDescription("failed to parse TXT records").mo61678e(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0341, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0344, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03ae, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03f6, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03f8, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013b, code lost:
        if (r11 != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0157, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        p5488io.grpc.p5525e.C70441dc.f187722a.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:179:0x02fa, B:197:0x0333] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0284 A[Catch:{ RuntimeException -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0288 A[Catch:{ RuntimeException -> 0x02a1 }, LOOP:3: B:108:0x01dc->B:151:0x0288, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d6 A[Catch:{ IOException -> 0x006d, all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02f0 A[SYNTHETIC, Splitter:B:173:0x02f0] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067 A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:10:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0333 A[SYNTHETIC, Splitter:B:197:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0341 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:179:0x02fa] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0360 A[Catch:{ IOException -> 0x03a8, all -> 0x03a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x037c A[SYNTHETIC, Splitter:B:216:0x037c] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03ae A[ExcHandler: all (th java.lang.Throwable), Splitter:B:22:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x028c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0287 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0152 A[SYNTHETIC, Splitter:B:83:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016e A[SYNTHETIC, Splitter:B:92:0x016e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "serviceConfig"
            java.lang.String r3 = "Unable to resolve host "
            java.lang.String r4 = "Using proxy address "
            java.util.logging.Logger r5 = p5488io.grpc.p5525e.C70441dc.f187722a
            java.util.logging.Level r6 = java.util.logging.Level.FINER
            boolean r5 = r5.isLoggable(r6)
            java.lang.String r6 = "run"
            java.lang.String r7 = "io.grpc.internal.DnsNameResolver$Resolve"
            if (r5 == 0) goto L_0x002b
            java.util.logging.Logger r5 = p5488io.grpc.p5525e.C70441dc.f187722a
            java.util.logging.Level r8 = java.util.logging.Level.FINER
            io.grpc.e.dc r9 = r1.f187714a
            java.lang.String r9 = r9.f187738k
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Attempting DNS resolution of "
            java.lang.String r9 = r10.concat(r9)
            r5.logp(r8, r7, r6, r9)
        L_0x002b:
            r5 = 1
            r8 = 0
            io.grpc.e.dc r10 = r1.f187714a     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.lang.String r11 = r10.f187738k     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            int r12 = r10.f187739l     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.net.InetSocketAddress r11 = java.net.InetSocketAddress.createUnresolved(r11, r12)     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            io.grpc.ed r10 = r10.f187734g     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            boolean r12 = r11 instanceof java.net.InetSocketAddress     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r12 != 0) goto L_0x003f
            r10 = 0
            goto L_0x0059
        L_0x003f:
            io.grpc.e.if r10 = (p5488io.grpc.p5525e.C70579if) r10     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.net.InetSocketAddress r10 = r10.f188153b     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r10 == 0) goto L_0x0055
            io.grpc.bi r12 = new io.grpc.bi     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r12.<init>()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r12.mo61746b(r10)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r12.mo61747c(r11)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.bj r10 = r12.mo61745a()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            goto L_0x0059
        L_0x0055:
            io.grpc.ec r10 = p5488io.grpc.p5525e.C70579if.m103131a(r11)     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
        L_0x0059:
            if (r10 == 0) goto L_0x0073
            io.grpc.av r11 = new io.grpc.av     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.c r12 = p5488io.grpc.C70256c.f187254a     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.List r10 = java.util.Collections.singletonList(r10)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r11.<init>(r10, r12)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            goto L_0x0074
        L_0x0067:
            r0 = move-exception
            r3 = r0
            r2 = 1
            r7 = 0
            goto L_0x03b2
        L_0x006d:
            r0 = move-exception
            r4 = r0
            r2 = 1
            r7 = 0
            goto L_0x03b8
        L_0x0073:
            r11 = 0
        L_0x0074:
            java.util.List r10 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            io.grpc.c r12 = p5488io.grpc.C70256c.f187254a     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r11 == 0) goto L_0x00a4
            java.util.logging.Logger r2 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.logging.Level r10 = java.util.logging.Level.FINER     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            boolean r2 = r2.isLoggable(r10)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            if (r2 == 0) goto L_0x0099
            java.util.logging.Logger r2 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.logging.Level r10 = java.util.logging.Level.FINER     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r13.<init>(r4)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r13.append(r11)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.String r4 = r13.toString()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r2.logp(r10, r7, r6, r4)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
        L_0x0099:
            java.util.List r2 = java.util.Collections.singletonList(r11)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r10 = r2
            r2 = 1
            r6 = 0
            r7 = 0
        L_0x00a1:
            r9 = 0
            goto L_0x0387
        L_0x00a4:
            io.grpc.e.dc r4 = r1.f187714a     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            io.grpc.e.cw r6 = new io.grpc.e.cw     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            r6.<init>()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            io.grpc.e.cv r7 = r4.f187736i     // Catch:{ Exception -> 0x031f, all -> 0x0318 }
            java.lang.String r7 = r4.f187738k     // Catch:{ Exception -> 0x031f, all -> 0x0318 }
            java.net.InetAddress[] r7 = java.net.InetAddress.getAllByName(r7)     // Catch:{ Exception -> 0x031f, all -> 0x0318 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ Exception -> 0x031f, all -> 0x0318 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ Exception -> 0x031f, all -> 0x0318 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            int r13 = r7.size()     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            r11.<init>(r13)     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
        L_0x00c8:
            boolean r13 = r7.hasNext()     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            if (r13 == 0) goto L_0x00f0
            java.lang.Object r13 = r7.next()     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            java.net.InetAddress r13 = (java.net.InetAddress) r13     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            io.grpc.av r14 = new io.grpc.av     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            java.net.InetSocketAddress r15 = new java.net.InetSocketAddress     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            int r9 = r4.f187739l     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            r15.<init>(r13, r9)     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            io.grpc.c r9 = p5488io.grpc.C70256c.f187254a     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            java.util.List r13 = java.util.Collections.singletonList(r15)     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            r14.<init>(r13, r9)     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            r11.add(r14)     // Catch:{ Exception -> 0x00ea, all -> 0x0067 }
            goto L_0x00c8
        L_0x00ea:
            r0 = move-exception
            r5 = r0
            r2 = 1
            r7 = 0
            goto L_0x0346
        L_0x00f0:
            java.util.List r7 = java.util.Collections.unmodifiableList(r11)     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            r6.f187708b = r7     // Catch:{ Exception -> 0x0314, all -> 0x03ae }
            boolean r7 = p5488io.grpc.p5525e.C70441dc.f187726e     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r7 == 0) goto L_0x0311
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            boolean r9 = p5488io.grpc.p5525e.C70441dc.f187724c     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            boolean r11 = p5488io.grpc.p5525e.C70441dc.f187725d     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.lang.String r13 = r4.f187738k     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 != 0) goto L_0x0108
        L_0x0106:
            r9 = 0
            goto L_0x0150
        L_0x0108:
            java.lang.String r9 = "localhost"
            boolean r9 = r9.equalsIgnoreCase(r13)     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 == 0) goto L_0x0113
            if (r11 != 0) goto L_0x013e
            goto L_0x0106
        L_0x0113:
            java.lang.String r9 = ":"
            boolean r9 = r13.contains(r9)     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 == 0) goto L_0x011c
            goto L_0x0106
        L_0x011c:
            r9 = 0
            r11 = 1
        L_0x011e:
            int r14 = r13.length()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 >= r14) goto L_0x013b
            char r14 = r13.charAt(r9)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r15 = 46
            if (r14 == r15) goto L_0x0138
            r15 = 48
            if (r14 < r15) goto L_0x0136
            r15 = 57
            if (r14 > r15) goto L_0x0136
            r14 = 1
            goto L_0x0137
        L_0x0136:
            r14 = 0
        L_0x0137:
            r11 = r11 & r14
        L_0x0138:
            int r9 = r9 + 1
            goto L_0x011e
        L_0x013b:
            if (r11 == 0) goto L_0x013e
            goto L_0x0106
        L_0x013e:
            java.util.concurrent.atomic.AtomicReference r9 = r4.f187737j     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.lang.Object r9 = r9.get()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            io.grpc.e.da r9 = (p5488io.grpc.p5525e.C70439da) r9     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 != 0) goto L_0x0150
            io.grpc.e.db r11 = p5488io.grpc.p5525e.C70441dc.f187727f     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            if (r11 == 0) goto L_0x0150
            io.grpc.e.da r9 = r11.mo62159a()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
        L_0x0150:
            if (r9 == 0) goto L_0x0168
            java.util.List r7 = r9.mo62158a()     // Catch:{ Exception -> 0x0157, all -> 0x0067 }
            goto L_0x0168
        L_0x0157:
            r0 = move-exception
            r9 = r0
            java.util.logging.Logger r16 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.logging.Level r17 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.String r18 = "io.grpc.internal.DnsNameResolver"
            java.lang.String r19 = "resolveServiceConfig"
            java.lang.String r20 = "ServiceConfig resolution failure"
            r21 = r9
            r16.logp(r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
        L_0x0168:
            boolean r9 = r7.isEmpty()     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            if (r9 != 0) goto L_0x02f0
            java.util.Random r9 = r4.f187735h     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.String r11 = p5488io.grpc.p5525e.C70441dc.m102807b()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r13.<init>()     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
        L_0x017d:
            boolean r14 = r7.hasNext()     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            if (r14 == 0) goto L_0x01d7
            java.lang.Object r14 = r7.next()     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r15 = "grpc_config="
            boolean r15 = r14.startsWith(r15)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            if (r15 != 0) goto L_0x01a5
            java.util.logging.Logger r16 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.util.logging.Level r17 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r15[r8] = r14     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r18 = "io.grpc.internal.DnsNameResolver"
            java.lang.String r19 = "parseTxtResults"
            java.lang.String r20 = "Ignoring non service config {0}"
            r21 = r15
            r16.logp(r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            goto L_0x017d
        L_0x01a5:
            r15 = 12
            java.lang.String r14 = r14.substring(r15)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.Object r14 = p5488io.grpc.p5525e.C70494fb.m102938a(r14)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            boolean r15 = r14 instanceof java.util.List     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            if (r15 == 0) goto L_0x01bc
            java.util.List r14 = (java.util.List) r14     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            p5488io.grpc.p5525e.C70495fc.m102948i(r14)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r13.addAll(r14)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            goto L_0x017d
        L_0x01bc:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r7.<init>()     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r9 = "wrong type "
            r7.append(r9)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r7.append(r14)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r7 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            java.lang.String r7 = r9.concat(r7)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
            throw r2     // Catch:{ IOException -> 0x02c1, RuntimeException -> 0x02bf, all -> 0x0067 }
        L_0x01d7:
            java.util.Iterator r7 = r13.iterator()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r13 = 0
        L_0x01dc:
            boolean r14 = r7.hasNext()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            if (r14 == 0) goto L_0x02b5
            java.lang.Object r13 = r7.next()     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.Set r14 = r13.entrySet()     // Catch:{ RuntimeException -> 0x02a1 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ RuntimeException -> 0x02a1 }
        L_0x01f0:
            boolean r15 = r14.hasNext()     // Catch:{ RuntimeException -> 0x02a1 }
            if (r15 == 0) goto L_0x020e
            java.lang.Object r15 = r14.next()     // Catch:{ RuntimeException -> 0x02a1 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ RuntimeException -> 0x02a1 }
            java.util.Set r5 = p5488io.grpc.p5525e.C70441dc.f187723b     // Catch:{ RuntimeException -> 0x02a1 }
            java.lang.Object r8 = r15.getKey()     // Catch:{ RuntimeException -> 0x02a1 }
            boolean r5 = r5.contains(r8)     // Catch:{ RuntimeException -> 0x02a1 }
            java.lang.String r8 = "Bad key: %s"
            com.google.common.base.C58893dc.m90998c(r5, r8, r15)     // Catch:{ RuntimeException -> 0x02a1 }
            r5 = 1
            r8 = 0
            goto L_0x01f0
        L_0x020e:
            java.lang.String r5 = "clientLanguage"
            java.util.List r5 = p5488io.grpc.p5525e.C70495fc.m102946g(r13, r5)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r5 == 0) goto L_0x0237
            boolean r8 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 != 0) goto L_0x0237
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x02a1 }
        L_0x0220:
            boolean r8 = r5.hasNext()     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 == 0) goto L_0x0235
            java.lang.String r8 = "java"
            java.lang.Object r14 = r5.next()     // Catch:{ RuntimeException -> 0x02a1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ RuntimeException -> 0x02a1 }
            boolean r8 = r8.equalsIgnoreCase(r14)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 == 0) goto L_0x0220
            goto L_0x0237
        L_0x0235:
            r13 = 0
            goto L_0x0285
        L_0x0237:
            java.lang.String r5 = "percentage"
            java.lang.Double r5 = p5488io.grpc.p5525e.C70495fc.m102940a(r13, r5)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r5 == 0) goto L_0x025a
            int r8 = r5.intValue()     // Catch:{ RuntimeException -> 0x02a1 }
            r14 = 100
            if (r8 < 0) goto L_0x024b
            if (r8 > r14) goto L_0x024b
            r15 = 1
            goto L_0x024c
        L_0x024b:
            r15 = 0
        L_0x024c:
            java.lang.String r14 = "Bad percentage: %s"
            com.google.common.base.C58893dc.m90998c(r15, r14, r5)     // Catch:{ RuntimeException -> 0x02a1 }
            r5 = 100
            int r5 = r9.nextInt(r5)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r5 < r8) goto L_0x025a
            goto L_0x0235
        L_0x025a:
            java.lang.String r5 = "clientHostname"
            java.util.List r5 = p5488io.grpc.p5525e.C70495fc.m102946g(r13, r5)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r5 == 0) goto L_0x027e
            boolean r8 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 != 0) goto L_0x027e
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x02a1 }
        L_0x026c:
            boolean r8 = r5.hasNext()     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 == 0) goto L_0x0235
            java.lang.Object r8 = r5.next()     // Catch:{ RuntimeException -> 0x02a1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ RuntimeException -> 0x02a1 }
            boolean r8 = r8.equals(r11)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r8 == 0) goto L_0x026c
        L_0x027e:
            java.util.Map r5 = p5488io.grpc.p5525e.C70495fc.m102947h(r13, r2)     // Catch:{ RuntimeException -> 0x02a1 }
            if (r5 == 0) goto L_0x028c
            r13 = r5
        L_0x0285:
            if (r13 == 0) goto L_0x0288
            goto L_0x02b5
        L_0x0288:
            r5 = 1
            r8 = 0
            goto L_0x01dc
        L_0x028c:
            com.google.common.base.dd r5 = new com.google.common.base.dd     // Catch:{ RuntimeException -> 0x02a1 }
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ RuntimeException -> 0x02a1 }
            r8 = 0
            r7[r8] = r13     // Catch:{ RuntimeException -> 0x02a1 }
            r8 = 1
            r7[r8] = r2     // Catch:{ RuntimeException -> 0x02a1 }
            java.lang.String r2 = "key '%s' missing in '%s'"
            java.lang.String r2 = java.lang.String.format(r2, r7)     // Catch:{ RuntimeException -> 0x02a1 }
            r5.<init>((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x02a1 }
            throw r5     // Catch:{ RuntimeException -> 0x02a1 }
        L_0x02a1:
            r0 = move-exception
            r2 = r0
            io.grpc.Status r5 = p5488io.grpc.Status.f186905c     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.String r7 = "failed to pick service config choice"
            io.grpc.Status r5 = r5.withDescription(r7)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.Status r2 = r5.mo61678e(r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.dk r5 = new io.grpc.dk     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r5.<init>((p5488io.grpc.Status) r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            goto L_0x02d4
        L_0x02b5:
            if (r13 != 0) goto L_0x02b9
            r5 = 0
            goto L_0x02d4
        L_0x02b9:
            io.grpc.dk r5 = new io.grpc.dk     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r5.<init>((java.lang.Object) r13)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            goto L_0x02d4
        L_0x02bf:
            r0 = move-exception
            goto L_0x02c2
        L_0x02c1:
            r0 = move-exception
        L_0x02c2:
            r2 = r0
            io.grpc.Status r5 = p5488io.grpc.Status.f186905c     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.lang.String r7 = "failed to parse TXT records"
            io.grpc.Status r5 = r5.withDescription(r7)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.Status r2 = r5.mo61678e(r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.dk r5 = new io.grpc.dk     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r5.<init>((p5488io.grpc.Status) r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
        L_0x02d4:
            if (r5 == 0) goto L_0x02ec
            io.grpc.Status r2 = r5.f187510a     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            if (r2 == 0) goto L_0x02e1
            io.grpc.dk r4 = new io.grpc.dk     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            r4.<init>((p5488io.grpc.Status) r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
        L_0x02df:
            r2 = 1
            goto L_0x02ee
        L_0x02e1:
            java.lang.Object r2 = r5.f187511b     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.do r4 = r4.f187744q     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            io.grpc.dk r4 = r4.mo62054a(r2)     // Catch:{ IOException -> 0x006d, all -> 0x0067 }
            goto L_0x02df
        L_0x02ec:
            r2 = 1
            r4 = 0
        L_0x02ee:
            r7 = 0
            goto L_0x0308
        L_0x02f0:
            java.util.logging.Logger r18 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            java.util.logging.Level r19 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x03b4, all -> 0x03ae }
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x030e, all -> 0x030b }
            java.lang.String r4 = r4.f187738k     // Catch:{ IOException -> 0x030e, all -> 0x030b }
            r7 = 0
            r5[r7] = r4     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            java.lang.String r20 = "io.grpc.internal.DnsNameResolver"
            java.lang.String r21 = "resolveServiceConfig"
            java.lang.String r22 = "No TXT records found for {0}"
            r23 = r5
            r18.logp(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            r4 = 0
        L_0x0308:
            r6.f187709c = r4     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            goto L_0x035c
        L_0x030b:
            r0 = move-exception
            goto L_0x03b0
        L_0x030e:
            r0 = move-exception
            goto L_0x03b6
        L_0x0311:
            r2 = 1
            r7 = 0
            goto L_0x035c
        L_0x0314:
            r0 = move-exception
            r2 = 1
            r7 = 0
            goto L_0x0345
        L_0x0318:
            r0 = move-exception
            r2 = 1
            r7 = 0
            r5 = r0
            r21 = 0
            goto L_0x0331
        L_0x031f:
            r0 = move-exception
            r2 = 1
            r7 = 0
            r5 = r0
            com.google.common.base.C58887cx.m90980g(r5)     // Catch:{ all -> 0x032c }
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x032c }
            r8.<init>(r5)     // Catch:{ all -> 0x032c }
            throw r8     // Catch:{ all -> 0x032c }
        L_0x032c:
            r0 = move-exception
            r8 = r0
            r21 = r5
            r5 = r8
        L_0x0331:
            if (r21 == 0) goto L_0x0340
            java.util.logging.Logger r16 = p5488io.grpc.p5525e.C70441dc.f187722a     // Catch:{ Exception -> 0x0344, all -> 0x0341 }
            java.util.logging.Level r17 = java.util.logging.Level.FINE     // Catch:{ Exception -> 0x0344, all -> 0x0341 }
            java.lang.String r18 = "io.grpc.internal.DnsNameResolver"
            java.lang.String r19 = "resolveAddresses"
            java.lang.String r20 = "Address resolution failure"
            r16.logp(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0344, all -> 0x0341 }
        L_0x0340:
            throw r5     // Catch:{ Exception -> 0x0344, all -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            goto L_0x03b1
        L_0x0344:
            r0 = move-exception
        L_0x0345:
            r5 = r0
        L_0x0346:
            io.grpc.Status r8 = p5488io.grpc.Status.f186916n     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            java.lang.String r4 = r4.f187738k     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            java.lang.String r4 = r3.concat(r4)     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            io.grpc.Status r4 = r8.withDescription(r4)     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            io.grpc.Status r4 = r4.mo61678e(r5)     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
            r6.f187707a = r4     // Catch:{ IOException -> 0x03ac, all -> 0x0341 }
        L_0x035c:
            io.grpc.Status r4 = r6.f187707a     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            if (r4 == 0) goto L_0x037c
            io.grpc.dm r5 = r1.f187715b     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            r5.mo62049a(r4)     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            io.grpc.Status r3 = r6.f187707a
            if (r3 != 0) goto L_0x036b
            r5 = 1
            goto L_0x036c
        L_0x036b:
            r5 = 0
        L_0x036c:
            io.grpc.e.dc r2 = r1.f187714a
            io.grpc.ff r2 = r2.f187741n
            io.grpc.e.cy r3 = new io.grpc.e.cy
            r3.<init>(r1, r5)
        L_0x0375:
            r2.mo62446c(r3)
            r2.mo62445b()
            return
        L_0x037c:
            java.util.List r4 = r6.f187708b     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            if (r4 != 0) goto L_0x0381
            goto L_0x0382
        L_0x0381:
            r10 = r4
        L_0x0382:
            io.grpc.dk r4 = r6.f187709c     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            if (r4 == 0) goto L_0x00a1
            r9 = r4
        L_0x0387:
            io.grpc.dm r4 = r1.f187715b     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            io.grpc.dn r5 = new io.grpc.dn     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            r5.<init>(r10, r12, r9)     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            r4.mo62050b(r5)     // Catch:{ IOException -> 0x03a8, all -> 0x03a4 }
            if (r6 == 0) goto L_0x0399
            io.grpc.Status r3 = r6.f187707a
            if (r3 != 0) goto L_0x0399
            r5 = 1
            goto L_0x039a
        L_0x0399:
            r5 = 0
        L_0x039a:
            io.grpc.e.dc r2 = r1.f187714a
            io.grpc.ff r2 = r2.f187741n
            io.grpc.e.cy r3 = new io.grpc.e.cy
            r3.<init>(r1, r5)
            goto L_0x0375
        L_0x03a4:
            r0 = move-exception
            r3 = r0
            r9 = r6
            goto L_0x03f0
        L_0x03a8:
            r0 = move-exception
            r4 = r0
            r9 = r6
            goto L_0x03b9
        L_0x03ac:
            r0 = move-exception
            goto L_0x03b7
        L_0x03ae:
            r0 = move-exception
            r2 = 1
        L_0x03b0:
            r7 = 0
        L_0x03b1:
            r3 = r0
        L_0x03b2:
            r9 = 0
            goto L_0x03f0
        L_0x03b4:
            r0 = move-exception
            r2 = 1
        L_0x03b6:
            r7 = 0
        L_0x03b7:
            r4 = r0
        L_0x03b8:
            r9 = 0
        L_0x03b9:
            io.grpc.dm r5 = r1.f187715b     // Catch:{ all -> 0x03ee }
            io.grpc.Status r6 = p5488io.grpc.Status.f186916n     // Catch:{ all -> 0x03ee }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ee }
            r8.<init>()     // Catch:{ all -> 0x03ee }
            r8.append(r3)     // Catch:{ all -> 0x03ee }
            io.grpc.e.dc r3 = r1.f187714a     // Catch:{ all -> 0x03ee }
            java.lang.String r3 = r3.f187738k     // Catch:{ all -> 0x03ee }
            r8.append(r3)     // Catch:{ all -> 0x03ee }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x03ee }
            io.grpc.Status r3 = r6.withDescription(r3)     // Catch:{ all -> 0x03ee }
            io.grpc.Status r3 = r3.mo61678e(r4)     // Catch:{ all -> 0x03ee }
            r5.mo62049a(r3)     // Catch:{ all -> 0x03ee }
            if (r9 == 0) goto L_0x03e3
            io.grpc.Status r3 = r9.f187707a
            if (r3 != 0) goto L_0x03e3
            r5 = 1
            goto L_0x03e4
        L_0x03e3:
            r5 = 0
        L_0x03e4:
            io.grpc.e.dc r2 = r1.f187714a
            io.grpc.ff r2 = r2.f187741n
            io.grpc.e.cy r3 = new io.grpc.e.cy
            r3.<init>(r1, r5)
            goto L_0x0375
        L_0x03ee:
            r0 = move-exception
            r3 = r0
        L_0x03f0:
            if (r9 == 0) goto L_0x03f8
            io.grpc.Status r4 = r9.f187707a
            if (r4 != 0) goto L_0x03f8
            r5 = 1
            goto L_0x03f9
        L_0x03f8:
            r5 = 0
        L_0x03f9:
            io.grpc.e.dc r2 = r1.f187714a
            io.grpc.ff r2 = r2.f187741n
            io.grpc.e.cy r4 = new io.grpc.e.cy
            r4.<init>(r1, r5)
            r2.mo62446c(r4)
            r2.mo62445b()
            goto L_0x040a
        L_0x0409:
            throw r3
        L_0x040a:
            goto L_0x0409
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70437cz.run():void");
    }
}
