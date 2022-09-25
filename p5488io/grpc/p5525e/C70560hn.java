package p5488io.grpc.p5525e;

import java.io.Closeable;
import p5488io.grpc.C70154ar;

/* renamed from: io.grpc.e.hn */
/* compiled from: PG */
public final class C70560hn implements Closeable, C70391bg {

    /* renamed from: a */
    public C70557hk f188087a;

    /* renamed from: b */
    public int f188088b;

    /* renamed from: c */
    public C70154ar f188089c;

    /* renamed from: d */
    public C70386bb f188090d = new C70386bb();

    /* renamed from: e */
    public long f188091e;

    /* renamed from: f */
    public boolean f188092f = false;

    /* renamed from: g */
    public volatile boolean f188093g = false;

    /* renamed from: h */
    private final C70670lp f188094h;

    /* renamed from: i */
    private final C70679ly f188095i;

    /* renamed from: j */
    private int f188096j = 5;

    /* renamed from: k */
    private boolean f188097k;

    /* renamed from: l */
    private C70386bb f188098l;

    /* renamed from: m */
    private boolean f188099m = false;

    /* renamed from: n */
    private int f188100n = -1;

    /* renamed from: o */
    private int f188101o;

    /* renamed from: p */
    private int f188102p = 1;

    public C70560hn(C70557hk hkVar, C70154ar arVar, int i, C70670lp lpVar, C70679ly lyVar) {
        this.f188087a = hkVar;
        this.f188089c = arVar;
        this.f188088b = i;
        this.f188094h = lpVar;
        this.f188095i = lyVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r3 <= 0) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8.f188087a.mo61918a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        if (r8.f188102p != 2) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r8.f188094h.mo62414c((long) r3);
        r8.f188101o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r3 <= 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8.f188087a.mo61918a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r8.f188102p != 2) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r8.f188094h.mo62414c((long) r3);
        r8.f188101o += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        r3 = r8.f188102p;
        r4 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r3 == 0) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        if (r4 == 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r4 == 1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("Invalid state: ");
        r5 = r8.f188102p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r5 == 1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r5 == 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        r0 = "BODY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        r0 = "HEADER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        r8.f188094h.mo62418g();
        r8.f188101o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        if (r8.f188097k == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        r2 = r8.f188089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r2 == p5488io.grpc.C70908w.f189099a) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r3 = new p5488io.grpc.p5525e.C70559hm(r2.mo61727a(p5488io.grpc.p5525e.C70584ik.m103164c(r8.f188098l)), r8.f188088b, r8.f188094h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d8, code lost:
        throw new p5488io.grpc.C70761fa(p5488io.grpc.Status.f186915m.withDescription("Can't decode compressed gRPC message as compression not configured"), (p5488io.grpc.C70334de) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        r2 = r8.f188094h;
        r3 = r8.f188098l.f187592b;
        r2.mo62419h();
        r3 = p5488io.grpc.p5525e.C70584ik.m103164c(r8.f188098l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        r8.f188098l = null;
        r8.f188087a.mo62305k(new p5488io.grpc.p5525e.C70558hl(r3));
        r8.f188102p = 1;
        r8.f188096j = 5;
        r8.f188091e--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r3 = r8.f188098l.mo62098f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        if ((r3 & 254) != 0) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (1 == (r3 & 1)) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        r8.f188097k = r3;
        r3 = r8.f188098l;
        r3.mo62209a(4);
        r3 = r3.mo62098f() | (((r3.mo62098f() << 24) | (r3.mo62098f() << 16)) | (r3.mo62098f() << 8));
        r8.f188096j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        if (r3 < 0) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013a, code lost:
        if (r3 > r8.f188088b) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013c, code lost:
        r8.f188100n++;
        r8.f188094h.mo62417f();
        r3 = r8.f188095i;
        r3.f188413g.mo62224a();
        r3.f188414h = r3.f188408b.mo62424a();
        r8.f188102p = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018c, code lost:
        throw new p5488io.grpc.C70761fa(p5488io.grpc.Status.f186915m.withDescription("gRPC frame header malformed: reserved bits not zero"), (p5488io.grpc.C70334de) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a9, code lost:
        if (r8.f188092f == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01af, code lost:
        if (mo62313c() == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b1, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b4, code lost:
        r8.f188099m = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62311a() {
        /*
            r8 = this;
            boolean r0 = r8.f188099m
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r8.f188099m = r0
        L_0x0008:
            r1 = 0
            long r2 = r8.f188091e     // Catch:{ all -> 0x01b7 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x01a7
            r2 = 2
            io.grpc.e.bb r3 = r8.f188098l     // Catch:{ all -> 0x018e }
            if (r3 != 0) goto L_0x001d
            io.grpc.e.bb r3 = new io.grpc.e.bb     // Catch:{ all -> 0x018e }
            r3.<init>()     // Catch:{ all -> 0x018e }
            r8.f188098l = r3     // Catch:{ all -> 0x018e }
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r4 = r8.f188096j     // Catch:{ all -> 0x0056 }
            io.grpc.e.bb r5 = r8.f188098l     // Catch:{ all -> 0x0056 }
            int r5 = r5.f187592b     // Catch:{ all -> 0x0056 }
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0059
            io.grpc.e.bb r5 = r8.f188090d     // Catch:{ all -> 0x0056 }
            int r5 = r5.f187592b     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0045
            if (r3 <= 0) goto L_0x01a7
            io.grpc.e.hk r0 = r8.f188087a     // Catch:{ all -> 0x01b7 }
            r0.mo61918a(r3)     // Catch:{ all -> 0x01b7 }
            int r0 = r8.f188102p     // Catch:{ all -> 0x01b7 }
            if (r0 != r2) goto L_0x01a7
            io.grpc.e.lp r0 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            long r4 = (long) r3     // Catch:{ all -> 0x01b7 }
            r0.mo62414c(r4)     // Catch:{ all -> 0x01b7 }
            int r0 = r8.f188101o     // Catch:{ all -> 0x01b7 }
            int r0 = r0 + r3
            r8.f188101o = r0     // Catch:{ all -> 0x01b7 }
            goto L_0x01a7
        L_0x0045:
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0056 }
            int r3 = r3 + r4
            io.grpc.e.bb r5 = r8.f188098l     // Catch:{ all -> 0x0056 }
            io.grpc.e.bb r6 = r8.f188090d     // Catch:{ all -> 0x0056 }
            io.grpc.e.ig r4 = r6.mo62100h(r4)     // Catch:{ all -> 0x0056 }
            r5.mo62101i(r4)     // Catch:{ all -> 0x0056 }
            goto L_0x001e
        L_0x0056:
            r0 = move-exception
            goto L_0x0190
        L_0x0059:
            if (r3 <= 0) goto L_0x006f
            io.grpc.e.hk r4 = r8.f188087a     // Catch:{ all -> 0x01b7 }
            r4.mo61918a(r3)     // Catch:{ all -> 0x01b7 }
            int r4 = r8.f188102p     // Catch:{ all -> 0x01b7 }
            if (r4 != r2) goto L_0x006f
            io.grpc.e.lp r4 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            long r5 = (long) r3     // Catch:{ all -> 0x01b7 }
            r4.mo62414c(r5)     // Catch:{ all -> 0x01b7 }
            int r4 = r8.f188101o     // Catch:{ all -> 0x01b7 }
            int r4 = r4 + r3
            r8.f188101o = r4     // Catch:{ all -> 0x01b7 }
        L_0x006f:
            int r3 = r8.f188102p     // Catch:{ all -> 0x01b7 }
            int r4 = r3 + -1
            r5 = 0
            if (r3 == 0) goto L_0x018d
            if (r4 == 0) goto L_0x0102
            if (r4 == r0) goto L_0x009f
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch:{ all -> 0x01b7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            r4.<init>()     // Catch:{ all -> 0x01b7 }
            java.lang.String r5 = "Invalid state: "
            r4.append(r5)     // Catch:{ all -> 0x01b7 }
            int r5 = r8.f188102p     // Catch:{ all -> 0x01b7 }
            if (r5 == r0) goto L_0x0092
            if (r5 == r2) goto L_0x008f
            java.lang.String r0 = "null"
            goto L_0x0094
        L_0x008f:
            java.lang.String r0 = "BODY"
            goto L_0x0094
        L_0x0092:
            java.lang.String r0 = "HEADER"
        L_0x0094:
            r4.append(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01b7 }
            r3.<init>(r0)     // Catch:{ all -> 0x01b7 }
            throw r3     // Catch:{ all -> 0x01b7 }
        L_0x009f:
            io.grpc.e.lp r2 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            r2.mo62418g()     // Catch:{ all -> 0x01b7 }
            r8.f188101o = r1     // Catch:{ all -> 0x01b7 }
            boolean r2 = r8.f188097k     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x00d9
            io.grpc.ar r2 = r8.f188089c     // Catch:{ all -> 0x01b7 }
            io.grpc.x r3 = p5488io.grpc.C70908w.f189099a     // Catch:{ all -> 0x01b7 }
            if (r2 == r3) goto L_0x00cb
            io.grpc.e.bb r3 = r8.f188098l     // Catch:{ IOException -> 0x00c4 }
            java.io.InputStream r3 = p5488io.grpc.p5525e.C70584ik.m103164c(r3)     // Catch:{ IOException -> 0x00c4 }
            java.io.InputStream r2 = r2.mo61727a(r3)     // Catch:{ IOException -> 0x00c4 }
            io.grpc.e.hm r3 = new io.grpc.e.hm     // Catch:{ IOException -> 0x00c4 }
            int r4 = r8.f188088b     // Catch:{ IOException -> 0x00c4 }
            io.grpc.e.lp r6 = r8.f188094h     // Catch:{ IOException -> 0x00c4 }
            r3.<init>(r2, r4, r6)     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00e8
        L_0x00c4:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b7 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b7 }
            throw r2     // Catch:{ all -> 0x01b7 }
        L_0x00cb:
            io.grpc.Status r2 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x01b7 }
            java.lang.String r3 = "Can't decode compressed gRPC message as compression not configured"
            io.grpc.Status r2 = r2.withDescription(r3)     // Catch:{ all -> 0x01b7 }
            io.grpc.fa r3 = new io.grpc.fa     // Catch:{ all -> 0x01b7 }
            r3.<init>(r2, r5, r0)     // Catch:{ all -> 0x01b7 }
            throw r3     // Catch:{ all -> 0x01b7 }
        L_0x00d9:
            io.grpc.e.lp r2 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            io.grpc.e.bb r3 = r8.f188098l     // Catch:{ all -> 0x01b7 }
            int r3 = r3.f187592b     // Catch:{ all -> 0x01b7 }
            r2.mo62419h()     // Catch:{ all -> 0x01b7 }
            io.grpc.e.bb r2 = r8.f188098l     // Catch:{ all -> 0x01b7 }
            java.io.InputStream r3 = p5488io.grpc.p5525e.C70584ik.m103164c(r2)     // Catch:{ all -> 0x01b7 }
        L_0x00e8:
            r8.f188098l = r5     // Catch:{ all -> 0x01b7 }
            io.grpc.e.hk r2 = r8.f188087a     // Catch:{ all -> 0x01b7 }
            io.grpc.e.hl r4 = new io.grpc.e.hl     // Catch:{ all -> 0x01b7 }
            r4.<init>(r3)     // Catch:{ all -> 0x01b7 }
            r2.mo62305k(r4)     // Catch:{ all -> 0x01b7 }
            r8.f188102p = r0     // Catch:{ all -> 0x01b7 }
            r2 = 5
            r8.f188096j = r2     // Catch:{ all -> 0x01b7 }
            long r2 = r8.f188091e     // Catch:{ all -> 0x01b7 }
            r4 = -1
            long r2 = r2 + r4
            r8.f188091e = r2     // Catch:{ all -> 0x01b7 }
            goto L_0x0008
        L_0x0102:
            io.grpc.e.bb r3 = r8.f188098l     // Catch:{ all -> 0x01b7 }
            int r3 = r3.mo62098f()     // Catch:{ all -> 0x01b7 }
            r4 = r3 & 254(0xfe, float:3.56E-43)
            if (r4 != 0) goto L_0x017f
            r3 = r3 & 1
            if (r0 == r3) goto L_0x0112
            r3 = 0
            goto L_0x0113
        L_0x0112:
            r3 = 1
        L_0x0113:
            r8.f188097k = r3     // Catch:{ all -> 0x01b7 }
            io.grpc.e.bb r3 = r8.f188098l     // Catch:{ all -> 0x01b7 }
            r4 = 4
            r3.mo62209a(r4)     // Catch:{ all -> 0x01b7 }
            int r4 = r3.mo62098f()     // Catch:{ all -> 0x01b7 }
            int r6 = r3.mo62098f()     // Catch:{ all -> 0x01b7 }
            int r7 = r3.mo62098f()     // Catch:{ all -> 0x01b7 }
            int r3 = r3.mo62098f()     // Catch:{ all -> 0x01b7 }
            int r4 = r4 << 24
            int r6 = r6 << 16
            r4 = r4 | r6
            int r6 = r7 << 8
            r4 = r4 | r6
            r3 = r3 | r4
            r8.f188096j = r3     // Catch:{ all -> 0x01b7 }
            if (r3 < 0) goto L_0x0159
            int r4 = r8.f188088b     // Catch:{ all -> 0x01b7 }
            if (r3 > r4) goto L_0x0159
            int r3 = r8.f188100n     // Catch:{ all -> 0x01b7 }
            int r3 = r3 + r0
            r8.f188100n = r3     // Catch:{ all -> 0x01b7 }
            io.grpc.e.lp r3 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            r3.mo62417f()     // Catch:{ all -> 0x01b7 }
            io.grpc.e.ly r3 = r8.f188095i     // Catch:{ all -> 0x01b7 }
            io.grpc.e.fh r4 = r3.f188413g     // Catch:{ all -> 0x01b7 }
            r4.mo62224a()     // Catch:{ all -> 0x01b7 }
            io.grpc.e.lu r4 = r3.f188408b     // Catch:{ all -> 0x01b7 }
            long r4 = r4.mo62424a()     // Catch:{ all -> 0x01b7 }
            r3.f188414h = r4     // Catch:{ all -> 0x01b7 }
            r8.f188102p = r2     // Catch:{ all -> 0x01b7 }
            goto L_0x0008
        L_0x0159:
            io.grpc.Status r3 = p5488io.grpc.Status.f186911i     // Catch:{ all -> 0x01b7 }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b7 }
            int r6 = r8.f188088b     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01b7 }
            r2[r1] = r6     // Catch:{ all -> 0x01b7 }
            int r6 = r8.f188096j     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01b7 }
            r2[r0] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "gRPC message exceeds maximum size %d: %d"
            java.lang.String r2 = java.lang.String.format(r4, r6, r2)     // Catch:{ all -> 0x01b7 }
            io.grpc.Status r2 = r3.withDescription(r2)     // Catch:{ all -> 0x01b7 }
            io.grpc.fa r3 = new io.grpc.fa     // Catch:{ all -> 0x01b7 }
            r3.<init>(r2, r5, r0)     // Catch:{ all -> 0x01b7 }
            throw r3     // Catch:{ all -> 0x01b7 }
        L_0x017f:
            io.grpc.Status r2 = p5488io.grpc.Status.f186915m     // Catch:{ all -> 0x01b7 }
            java.lang.String r3 = "gRPC frame header malformed: reserved bits not zero"
            io.grpc.Status r2 = r2.withDescription(r3)     // Catch:{ all -> 0x01b7 }
            io.grpc.fa r3 = new io.grpc.fa     // Catch:{ all -> 0x01b7 }
            r3.<init>(r2, r5, r0)     // Catch:{ all -> 0x01b7 }
            throw r3     // Catch:{ all -> 0x01b7 }
        L_0x018d:
            throw r5     // Catch:{ all -> 0x01b7 }
        L_0x018e:
            r0 = move-exception
            r3 = 0
        L_0x0190:
            if (r3 <= 0) goto L_0x01a6
            io.grpc.e.hk r4 = r8.f188087a     // Catch:{ all -> 0x01b7 }
            r4.mo61918a(r3)     // Catch:{ all -> 0x01b7 }
            int r4 = r8.f188102p     // Catch:{ all -> 0x01b7 }
            if (r4 != r2) goto L_0x01a6
            io.grpc.e.lp r2 = r8.f188094h     // Catch:{ all -> 0x01b7 }
            long r4 = (long) r3     // Catch:{ all -> 0x01b7 }
            r2.mo62414c(r4)     // Catch:{ all -> 0x01b7 }
            int r2 = r8.f188101o     // Catch:{ all -> 0x01b7 }
            int r2 = r2 + r3
            r8.f188101o = r2     // Catch:{ all -> 0x01b7 }
        L_0x01a6:
            throw r0     // Catch:{ all -> 0x01b7 }
        L_0x01a7:
            boolean r0 = r8.f188092f     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r8.mo62313c()     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x01b4
            r8.close()     // Catch:{ all -> 0x01b7 }
        L_0x01b4:
            r8.f188099m = r1
            return
        L_0x01b7:
            r0 = move-exception
            r8.f188099m = r1
            goto L_0x01bc
        L_0x01bb:
            throw r0
        L_0x01bc:
            goto L_0x01bb
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70560hn.mo62311a():void");
    }

    /* renamed from: b */
    public final boolean mo62312b() {
        return this.f188090d == null;
    }

    /* renamed from: c */
    public final boolean mo62313c() {
        return this.f188090d.f187592b == 0;
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        if (!mo62312b()) {
            C70386bb bbVar = this.f188098l;
            boolean z = false;
            if (bbVar != null && bbVar.f187592b > 0) {
                z = true;
            }
            try {
                C70386bb bbVar2 = this.f188090d;
                if (bbVar2 != null) {
                    bbVar2.close();
                }
                C70386bb bbVar3 = this.f188098l;
                if (bbVar3 != null) {
                    bbVar3.close();
                }
                this.f188090d = null;
                this.f188098l = null;
                this.f188087a.mo62130i(z);
            } catch (Throwable th) {
                this.f188090d = null;
                this.f188098l = null;
                throw th;
            }
        }
    }
}
