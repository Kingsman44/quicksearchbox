package p5488io.grpc.p5527g.p5528a.p5529a;

import p5589m.C71830g;

/* renamed from: io.grpc.g.a.a.j */
/* compiled from: PG */
public final class C70781j implements C70773b {

    /* renamed from: a */
    public final C71830g f188752a;

    /* renamed from: b */
    public final C70776e f188753b;

    /* renamed from: c */
    private final C70779h f188754c;

    public C70781j(C71830g gVar) {
        this.f188752a = gVar;
        C70779h hVar = new C70779h(gVar);
        this.f188754c = hVar;
        this.f188753b = new C70776e(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f7, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo62474a(int r3, short r4, byte r5, int r6) {
        /*
            r2 = this;
            io.grpc.g.a.a.h r0 = r2.f188754c
            r0.f188746d = r3
            r0.f188743a = r3
            r0.f188747e = r4
            r0.f188744b = r5
            r0.f188745c = r6
            io.grpc.g.a.a.e r3 = r2.f188753b
        L_0x000e:
            m.g r4 = r3.f188728b
            m.r r4 = (p5589m.C71841r) r4
            boolean r5 = r4.f191372c
            if (r5 != 0) goto L_0x013a
            m.e r5 = r4.f191371b
            boolean r6 = r5.mo63079p()
            if (r6 == 0) goto L_0x003c
            m.x r4 = r4.f191370a
            r0 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.mo62472a(r5, r0)
            r0 = -1
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            io.grpc.g.a.a.e r3 = r2.f188753b
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r3.f188727a
            r4.<init>(r5)
            java.util.List r3 = r3.f188727a
            r3.clear()
            return r4
        L_0x003c:
            m.g r4 = r3.f188728b
            byte r4 = r4.mo63062c()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0132
            r6 = r4 & 128(0x80, float:1.794E-43)
            if (r6 != r5) goto L_0x0094
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.mo62464b(r4, r5)
            int r4 = r4 + -1
            boolean r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70776e.m103498g(r4)
            if (r5 == 0) goto L_0x0064
            io.grpc.g.a.a.d[] r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70778g.f188741b
            r4 = r5[r4]
            java.util.List r5 = r3.f188727a
            r5.add(r4)
            goto L_0x000e
        L_0x0064:
            io.grpc.g.a.a.d[] r5 = p5488io.grpc.p5527g.p5528a.p5529a.C70778g.f188741b
            int r5 = r5.length
            int r5 = r4 + -61
            int r5 = r3.mo62463a(r5)
            if (r5 < 0) goto L_0x007e
            io.grpc.g.a.a.d[] r6 = r3.f188731e
            int r0 = r6.length
            int r0 = r0 + -1
            if (r5 > r0) goto L_0x007e
            java.util.List r4 = r3.f188727a
            r5 = r6[r5]
            r4.add(r5)
            goto L_0x000e
        L_0x007e:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Header index too large "
            r5.<init>(r6)
            int r4 = r4 + 1
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x0094:
            r5 = 64
            if (r4 != r5) goto L_0x00ad
            m.i r4 = r3.mo62466d()
            p5488io.grpc.p5527g.p5528a.p5529a.C70778g.m103511a(r4)
            m.i r5 = r3.mo62466d()
            io.grpc.g.a.a.d r6 = new io.grpc.g.a.a.d
            r6.<init>((p5589m.C71832i) r4, (p5589m.C71832i) r5)
            r3.mo62468f(r6)
            goto L_0x000e
        L_0x00ad:
            r6 = r4 & 64
            if (r6 != r5) goto L_0x00cb
            r5 = 63
            int r4 = r3.mo62464b(r4, r5)
            int r4 = r4 + -1
            m.i r4 = r3.mo62465c(r4)
            m.i r5 = r3.mo62466d()
            io.grpc.g.a.a.d r6 = new io.grpc.g.a.a.d
            r6.<init>((p5589m.C71832i) r4, (p5589m.C71832i) r5)
            r3.mo62468f(r6)
            goto L_0x000e
        L_0x00cb:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00f8
            r5 = 31
            int r4 = r3.mo62464b(r4, r5)
            r3.f188730d = r4
            if (r4 < 0) goto L_0x00e4
            int r5 = r3.f188729c
            if (r4 > r5) goto L_0x00e4
            r3.mo62467e()
            goto L_0x000e
        L_0x00e4:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x00f8:
            r5 = 16
            if (r4 == r5) goto L_0x011b
            if (r4 != 0) goto L_0x00ff
            goto L_0x011b
        L_0x00ff:
            r5 = 15
            int r4 = r3.mo62464b(r4, r5)
            int r4 = r4 + -1
            m.i r4 = r3.mo62465c(r4)
            m.i r5 = r3.mo62466d()
            java.util.List r6 = r3.f188727a
            io.grpc.g.a.a.d r0 = new io.grpc.g.a.a.d
            r0.<init>((p5589m.C71832i) r4, (p5589m.C71832i) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x011b:
            m.i r4 = r3.mo62466d()
            p5488io.grpc.p5527g.p5528a.p5529a.C70778g.m103511a(r4)
            m.i r5 = r3.mo62466d()
            java.util.List r6 = r3.f188727a
            io.grpc.g.a.a.d r0 = new io.grpc.g.a.a.d
            r0.<init>((p5589m.C71832i) r4, (p5589m.C71832i) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0132:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x013a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "closed"
            r3.<init>(r4)
            goto L_0x0143
        L_0x0142:
            throw r3
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.p5528a.p5529a.C70781j.mo62474a(int, short, byte, int):java.util.List");
    }

    /* renamed from: b */
    public final void mo62475b() {
        this.f188752a.mo63065e();
        this.f188752a.mo63062c();
    }

    public final void close() {
        this.f188752a.close();
    }
}
