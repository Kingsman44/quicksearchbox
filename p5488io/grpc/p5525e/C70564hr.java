package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59332o;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p5488io.grpc.C70157au;
import p5488io.grpc.C70908w;
import p5488io.grpc.C70910y;

/* renamed from: io.grpc.e.hr */
/* compiled from: PG */
public final class C70564hr implements C70451dm {

    /* renamed from: a */
    public int f188107a = -1;

    /* renamed from: b */
    public final C70682ma f188108b;

    /* renamed from: c */
    private final C70563hq f188109c;

    /* renamed from: d */
    private C70680lz f188110d;

    /* renamed from: e */
    private C70910y f188111e = C70908w.f189099a;

    /* renamed from: f */
    private final C70562hp f188112f = new C70562hp(this);

    /* renamed from: g */
    private final ByteBuffer f188113g = ByteBuffer.allocate(5);

    /* renamed from: h */
    private final C70670lp f188114h;

    /* renamed from: i */
    private boolean f188115i;

    /* renamed from: j */
    private int f188116j;

    /* renamed from: k */
    private int f188117k = -1;

    /* renamed from: l */
    private long f188118l;

    public C70564hr(C70563hq hqVar, C70682ma maVar, C70670lp lpVar) {
        this.f188109c = hqVar;
        C58838bb.m90866a(maVar, "bufferAllocator");
        this.f188108b = maVar;
        this.f188114h = lpVar;
    }

    /* renamed from: g */
    private static int m103074g(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof C70157au) {
            return ((C70157au) inputStream).mo61730a(outputStream);
        }
        long b = C59332o.m92211b(inputStream, outputStream);
        C58838bb.m90872g(b <= 2147483647L, "Message size overflow: %s", b);
        return (int) b;
    }

    /* renamed from: h */
    private final void m103075h(boolean z, boolean z2) {
        C70680lz lzVar = this.f188110d;
        this.f188110d = null;
        this.f188109c.mo62157w(lzVar, z, z2, this.f188116j);
        this.f188116j = 0;
    }

    /* renamed from: i */
    private final void m103076i(C70561ho hoVar, boolean z) {
        int i = 0;
        for (C70680lz a : hoVar.f188103a) {
            i += a.mo61934a();
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f188113g.clear();
        this.f188113g.put(z ? (byte) 1 : 0).putInt(i);
        C70680lz a2 = this.f188108b.mo61938a(5);
        a2.mo61937d(this.f188113g.array(), 0, this.f188113g.position());
        if (i == 0) {
            this.f188110d = a2;
            return;
        }
        this.f188109c.mo62157w(a2, false, false, this.f188116j - 1);
        this.f188116j = 1;
        List list = hoVar.f188103a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.f188109c.mo62157w((C70680lz) list.get(i2), false, false, 0);
        }
        this.f188110d = (C70680lz) list.get(list.size() - 1);
        this.f188118l = (long) i;
    }

    /* renamed from: a */
    public final void mo62171a() {
        if (!this.f188115i) {
            this.f188115i = true;
            C70680lz lzVar = this.f188110d;
            if (!(lzVar == null || lzVar.mo61934a() != 0 || this.f188110d == null)) {
                this.f188110d = null;
            }
            m103075h(true, true);
        }
    }

    /* renamed from: b */
    public final void mo62172b() {
        C70680lz lzVar = this.f188110d;
        if (lzVar != null && lzVar.mo61934a() > 0) {
            m103075h(false, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e A[Catch:{ all -> 0x0077, IOException -> 0x0161, RuntimeException -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4 A[Catch:{ all -> 0x0077, IOException -> 0x0161, RuntimeException -> 0x0150 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62173c(java.io.InputStream r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Failed to frame message"
            boolean r1 = r12.f188115i
            if (r1 != 0) goto L_0x0172
            int r1 = r12.f188116j
            r2 = 1
            int r1 = r1 + r2
            r12.f188116j = r1
            int r1 = r12.f188117k
            int r1 = r1 + r2
            r12.f188117k = r1
            r3 = 0
            r12.f188118l = r3
            io.grpc.e.lp r1 = r12.f188114h
            r1.mo62420i()
            io.grpc.y r1 = r12.f188111e
            io.grpc.x r3 = p5488io.grpc.C70908w.f189099a
            r4 = 0
            boolean r5 = r13 instanceof p5488io.grpc.C70255bz     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r6 = -1
            if (r5 != 0) goto L_0x002b
            boolean r5 = r13 instanceof java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            if (r5 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = -1
            goto L_0x002f
        L_0x002b:
            int r5 = r13.available()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x002f:
            java.lang.String r7 = "message too large %d > %d"
            r8 = 2
            r9 = 0
            if (r5 == 0) goto L_0x007c
            if (r1 == r3) goto L_0x007c
            io.grpc.e.ho r1 = new io.grpc.e.ho     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.y r3 = r12.f188111e     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.io.OutputStream r3 = r3.mo62591b(r1)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r13 = m103074g(r13, r3)     // Catch:{ all -> 0x0077 }
            r3.close()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r3 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            if (r3 < 0) goto L_0x0072
            if (r13 > r3) goto L_0x0050
            goto L_0x0072
        L_0x0050:
            io.grpc.Status r1 = p5488io.grpc.Status.f186911i     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r5[r9] = r13     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r13 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r5[r2] = r13     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.String r13 = java.lang.String.format(r3, r7, r5)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.Status r13 = r1.withDescription(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.fa r1 = new io.grpc.fa     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.<init>(r13, r4, r2)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            throw r1     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x0072:
            r12.m103076i(r1, r2)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            goto L_0x0119
        L_0x0077:
            r13 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            throw r13     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x007c:
            if (r5 == r6) goto L_0x00e4
            long r10 = (long) r5     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r12.f188118l = r10     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r1 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            if (r1 < 0) goto L_0x00aa
            if (r5 > r1) goto L_0x0088
            goto L_0x00aa
        L_0x0088:
            io.grpc.Status r13 = p5488io.grpc.Status.f186911i     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r3[r9] = r5     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r5 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r3[r2] = r5     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.String r1 = java.lang.String.format(r1, r7, r3)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.Status r13 = r13.withDescription(r1)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.fa r1 = new io.grpc.fa     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.<init>(r13, r4, r2)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            throw r1     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x00aa:
            java.nio.ByteBuffer r1 = r12.f188113g     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.Buffer r1 = r1.clear()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.ByteBuffer r1 = r12.f188113g     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.ByteBuffer r1 = r1.put(r9)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.putInt(r5)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.e.lz r1 = r12.f188110d     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            if (r1 != 0) goto L_0x00ce
            io.grpc.e.ma r1 = r12.f188108b     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.ByteBuffer r3 = r12.f188113g     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r3 = r3.position()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r3 = r3 + r5
            io.grpc.e.lz r1 = r1.mo61938a(r3)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r12.f188110d = r1     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x00ce:
            java.nio.ByteBuffer r1 = r12.f188113g     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            byte[] r1 = r1.array()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.nio.ByteBuffer r3 = r12.f188113g     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r3 = r3.position()     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r12.mo62318f(r1, r9, r3)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.e.hp r1 = r12.f188112f     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r13 = m103074g(r13, r1)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            goto L_0x0119
        L_0x00e4:
            io.grpc.e.ho r1 = new io.grpc.e.ho     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r13 = m103074g(r13, r1)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r3 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            if (r3 < 0) goto L_0x0116
            if (r13 > r3) goto L_0x00f4
            goto L_0x0116
        L_0x00f4:
            io.grpc.Status r1 = p5488io.grpc.Status.f186911i     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r5[r9] = r13     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            int r13 = r12.f188107a     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r5[r2] = r13     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            java.lang.String r13 = java.lang.String.format(r3, r7, r5)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.Status r13 = r1.withDescription(r13)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            io.grpc.fa r1 = new io.grpc.fa     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            r1.<init>(r13, r4, r2)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
            throw r1     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x0116:
            r12.m103076i(r1, r9)     // Catch:{ IOException -> 0x0161, RuntimeException -> 0x0150 }
        L_0x0119:
            if (r5 == r6) goto L_0x013e
            if (r13 != r5) goto L_0x011e
            goto L_0x013e
        L_0x011e:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r9] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r0[r2] = r13
            java.lang.String r13 = "Message length inaccurate %s != %s"
            java.lang.String r13 = java.lang.String.format(r13, r0)
            io.grpc.Status r0 = p5488io.grpc.Status.f186915m
            io.grpc.Status r13 = r0.withDescription(r13)
            io.grpc.fa r0 = new io.grpc.fa
            r0.<init>(r13, r4, r2)
            throw r0
        L_0x013e:
            io.grpc.e.lp r13 = r12.f188114h
            r13.mo62422k()
            io.grpc.e.lp r13 = r12.f188114h
            long r0 = r12.f188118l
            r13.mo62415d(r0)
            io.grpc.e.lp r13 = r12.f188114h
            r13.mo62421j()
            return
        L_0x0150:
            r13 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186915m
            io.grpc.Status r0 = r1.withDescription(r0)
            io.grpc.Status r13 = r0.mo61678e(r13)
            io.grpc.fa r0 = new io.grpc.fa
            r0.<init>(r13, r4, r2)
            throw r0
        L_0x0161:
            r13 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186915m
            io.grpc.Status r0 = r1.withDescription(r0)
            io.grpc.Status r13 = r0.mo61678e(r13)
            io.grpc.fa r0 = new io.grpc.fa
            r0.<init>(r13, r4, r2)
            throw r0
        L_0x0172:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Framer already closed"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70564hr.mo62173c(java.io.InputStream):void");
    }

    /* renamed from: d */
    public final boolean mo62174d() {
        return this.f188115i;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo62175e(C70910y yVar) {
        this.f188111e = yVar;
    }

    /* renamed from: f */
    public final void mo62318f(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            C70680lz lzVar = this.f188110d;
            if (lzVar != null && lzVar.mo61935b() == 0) {
                m103075h(false, false);
            }
            if (this.f188110d == null) {
                this.f188110d = this.f188108b.mo61938a(i2);
            }
            int min = Math.min(i2, this.f188110d.mo61935b());
            this.f188110d.mo61937d(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
