package com.google.android.libraries.p1975k.p1980e;

import android.content.Context;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.libraries.p1975k.C23977a;
import com.google.android.libraries.p1975k.C23995c;
import com.google.android.libraries.p1975k.C24019l;
import com.google.android.libraries.p1975k.C24020m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.k.e.d */
/* compiled from: PG */
public final class C24006d implements C143623ad {

    /* renamed from: a */
    private final C23995c f65612a;

    /* renamed from: b */
    private final C24020m f65613b;

    protected C24006d(Context context, C24020m mVar) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        Throwable th = new Throwable();
        C58836b bVar = C58836b.f156633a;
        if (applicationContext != null) {
            this.f65612a = new C23977a(applicationContext, bVar, C58833ax.m90834k(th), bVar);
            this.f65613b = mVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: b */
    public static C143623ad m44596b(Context context, C24019l lVar) {
        return new C24006d(context, new C24020m(lVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0298, code lost:
        if (com.google.android.libraries.p1975k.p1978c.C23996a.m44587a() == false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x029a, code lost:
        r1 = r0.mo29414b(9);
        r2 = com.google.common.base.C58837ba.m90858g(r7);
        r1.copyOnWrite();
        r3 = (com.google.protos.p5066i.p5067a.C65473d) r1.instance;
        r4 = com.google.protos.p5066i.p5067a.C65473d.f177963m;
        r3.f177965a |= 32;
        r3.f177971g = r2;
        r0.mo29413a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0159, code lost:
        if (com.google.android.libraries.p1975k.C24017j.m44614c(r11, com.google.android.libraries.p1975k.C24017j.m44613b(r3, r4), r13, r2, com.google.common.base.C58836b.f156633a) == false) goto L_0x04c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0206 A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021e A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0294 A[EDGE_INSN: B:133:0x0294->B:134:? ?: BREAK  , SYNTHETIC, Splitter:B:133:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02ba A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02fd A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x031e A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x032c A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0374 A[Catch:{ IOException -> 0x0427 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04c8 A[EDGE_INSN: B:231:0x04c8->B:219:0x04c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0360 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01db A[Catch:{ IOException -> 0x0427 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29411a(com.google.protobuf.C63088z r34) {
        /*
            r33 = this;
            r1 = r33
            com.google.android.libraries.k.m r0 = r1.f65613b
            com.google.android.libraries.k.c r11 = r1.f65612a
            byte[] r12 = r34.mo59174N()
            com.google.android.libraries.k.l r0 = r0.f65645a
            com.google.android.libraries.k.i r2 = com.google.android.libraries.p1975k.C24015h.f65633b
            com.google.android.libraries.k.d r13 = com.google.android.libraries.p1975k.C24015h.f65632a
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Looper r4 = android.os.Looper.myLooper()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x04e0
            r3 = r2
            com.google.android.libraries.k.j r3 = (com.google.android.libraries.p1975k.C24017j) r3
            com.google.android.libraries.k.d.d r3 = r3.f65639f
            com.google.android.libraries.k.e.a r3 = com.google.android.libraries.p1975k.C24017j.f65636c
            r14 = r11
            com.google.android.libraries.k.a r14 = (com.google.android.libraries.p1975k.C23977a) r14
            android.content.Context r4 = r14.f65576a
            boolean r5 = com.google.android.libraries.p1975k.p1979d.C24001d.f65605a
            r15 = 1
            if (r5 != 0) goto L_0x006f
            java.lang.Object r5 = com.google.android.libraries.p1975k.p1979d.C24001d.f65606b
            monitor-enter(r5)
            boolean r6 = com.google.android.libraries.p1975k.p1979d.C24001d.f65605a     // Catch:{ all -> 0x006c }
            if (r6 != 0) goto L_0x006a
            com.google.android.libraries.p1975k.p1979d.C24001d.f65605a = r15     // Catch:{ all -> 0x006c }
            com.google.android.libraries.phenotype.client.C31760t.m59102i(r4)     // Catch:{ all -> 0x006c }
            com.google.android.libraries.phenotype.client.C31654aj.m58985d(r4)     // Catch:{ all -> 0x006c }
            boolean r6 = com.google.android.libraries.p1975k.C24014g.m44611a(r4)     // Catch:{ all -> 0x006c }
            if (r6 != 0) goto L_0x006a
            e.a.a.n.c.a.a r6 = p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68841a.f185038a     // Catch:{ all -> 0x006c }
            e.a.a.n.c.a.b r6 = r6.mo6453a()     // Catch:{ all -> 0x006c }
            boolean r6 = r6.mo60639e()     // Catch:{ all -> 0x006c }
            if (r6 == 0) goto L_0x0067
            com.google.android.gms.common.ac r6 = com.google.android.gms.common.C143701ac.m233450a(r4)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x006c }
            boolean r4 = r6.mo119084c(r4)     // Catch:{ all -> 0x006c }
            if (r4 != 0) goto L_0x0067
            java.lang.String r3 = "CBVerifier"
            java.lang.String r4 = "Phenotype flags were not sycned because package was not Google Signed."
            android.util.Log.w(r3, r4)     // Catch:{ all -> 0x006c }
            monitor-exit(r5)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x0067:
            com.google.android.libraries.p1975k.p1979d.C24001d.m44591a(r11, r3)     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r5)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006c }
            throw r0
        L_0x006f:
            e.a.a.n.c.a.d r3 = p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68844d.f185049a
            r3.mo6453a()
            e.a.a.n.c.a.a r3 = p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68841a.f185038a
            e.a.a.n.c.a.b r3 = r3.mo6453a()
            boolean r3 = r3.mo60638d()
            if (r3 != 0) goto L_0x0083
        L_0x0080:
            r7 = 1
            goto L_0x04c9
        L_0x0083:
            android.content.Context r3 = r14.f65576a
            com.google.android.libraries.k.e.a r4 = com.google.android.libraries.p1975k.C24017j.f65636c
            com.google.android.libraries.k.e.e r5 = com.google.android.libraries.p1975k.p1980e.C24008f.f65614a
            if (r5 == 0) goto L_0x0093
            boolean r5 = com.google.android.libraries.p1975k.p1980e.C24008f.f65616c
            boolean r6 = com.google.android.libraries.p1975k.p1980e.C24008f.m44599a(r3, r4)
            if (r5 == r6) goto L_0x00c0
        L_0x0093:
            java.lang.Object r5 = com.google.android.libraries.p1975k.p1980e.C24008f.f65615b
            monitor-enter(r5)
            boolean r4 = com.google.android.libraries.p1975k.p1980e.C24008f.m44599a(r3, r4)     // Catch:{ all -> 0x04dd }
            com.google.android.libraries.k.e.e r6 = com.google.android.libraries.p1975k.p1980e.C24008f.f65614a     // Catch:{ all -> 0x04dd }
            if (r6 == 0) goto L_0x00a2
            boolean r6 = com.google.android.libraries.p1975k.p1980e.C24008f.f65616c     // Catch:{ all -> 0x04dd }
            if (r6 == r4) goto L_0x00bf
        L_0x00a2:
            if (r4 == 0) goto L_0x00b6
            com.google.android.libraries.k.e.c r6 = new com.google.android.libraries.k.e.c     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = "COLLECTION_BASIS_VERIFIER"
            com.google.android.gms.clearcut.h r3 = com.google.android.gms.clearcut.C143658k.m233373b(r3, r7)     // Catch:{ all -> 0x04dd }
            com.google.android.gms.clearcut.k r3 = r3.mo118952a()     // Catch:{ all -> 0x04dd }
            r6.<init>(r3)     // Catch:{ all -> 0x04dd }
            com.google.android.libraries.p1975k.p1980e.C24008f.f65614a = r6     // Catch:{ all -> 0x04dd }
            goto L_0x00bd
        L_0x00b6:
            com.google.android.libraries.k.e.i r3 = new com.google.android.libraries.k.e.i     // Catch:{ all -> 0x04dd }
            r3.<init>()     // Catch:{ all -> 0x04dd }
            com.google.android.libraries.p1975k.p1980e.C24008f.f65614a = r3     // Catch:{ all -> 0x04dd }
        L_0x00bd:
            com.google.android.libraries.p1975k.p1980e.C24008f.f65616c = r4     // Catch:{ all -> 0x04dd }
        L_0x00bf:
            monitor-exit(r5)     // Catch:{ all -> 0x04dd }
        L_0x00c0:
            com.google.android.libraries.k.e.e r3 = com.google.android.libraries.p1975k.p1980e.C24008f.f65614a
            com.google.common.base.ax r16 = com.google.common.base.C58833ax.m90834k(r3)
            r10 = 8
            r9 = 4
            r8 = 2
            r7 = 0
            com.google.android.libraries.k.f r6 = new com.google.android.libraries.k.f     // Catch:{ IOException -> 0x041f }
            r3 = r11
            com.google.android.libraries.k.a r3 = (com.google.android.libraries.p1975k.C23977a) r3     // Catch:{ IOException -> 0x041f }
            android.content.Context r3 = r3.f65576a     // Catch:{ IOException -> 0x041f }
            int r4 = r0.mappingRes()     // Catch:{ IOException -> 0x041f }
            r5 = r2
            com.google.android.libraries.k.j r5 = (com.google.android.libraries.p1975k.C24017j) r5     // Catch:{ IOException -> 0x041f }
            android.util.LruCache r5 = r5.f65637d     // Catch:{ IOException -> 0x041f }
            com.google.android.libraries.k.j r2 = (com.google.android.libraries.p1975k.C24017j) r2     // Catch:{ IOException -> 0x041f }
            android.util.LruCache r2 = r2.f65638e     // Catch:{ IOException -> 0x041f }
            r6.<init>(r3, r4, r5, r2)     // Catch:{ IOException -> 0x041f }
            int r5 = r0.javaClassNameHash()     // Catch:{ IOException -> 0x041f }
            int r4 = r0.featureNameHash()     // Catch:{ IOException -> 0x041f }
            r2 = r16
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2     // Catch:{ IOException -> 0x041f }
            java.lang.Object r2 = r2.f156646a     // Catch:{ IOException -> 0x041f }
            r17 = r2
            com.google.android.libraries.k.e.e r17 = (com.google.android.libraries.p1975k.p1980e.C24007e) r17     // Catch:{ IOException -> 0x041f }
            int r2 = com.google.protobuf.C62897ae.f169827g     // Catch:{ IOException -> 0x041f }
            int r3 = r12.length     // Catch:{ IOException -> 0x041f }
            com.google.protobuf.ae r2 = com.google.protobuf.C62897ae.m95112O(r12, r7, r3)     // Catch:{ IOException -> 0x041f }
            java.util.ArrayDeque r15 = new java.util.ArrayDeque     // Catch:{ IOException -> 0x041f }
            r15.<init>()     // Catch:{ IOException -> 0x041f }
            com.google.android.libraries.k.e.h r1 = new com.google.android.libraries.k.e.h     // Catch:{ IOException -> 0x041f }
            com.google.android.libraries.k.e.a r18 = com.google.android.libraries.p1975k.C24017j.f65636c     // Catch:{ IOException -> 0x041f }
            java.util.Map r19 = com.google.android.libraries.p1975k.C24017j.f65635b     // Catch:{ IOException -> 0x041f }
            r20 = r2
            r2 = r1
            r21 = r3
            r3 = r18
            r18 = r4
            r4 = r19
            r19 = r5
            r5 = r17
            r17 = r12
            r12 = r6
            r6 = r11
            r22 = 0
            r7 = r19
            r23 = r0
            r0 = 2
            r8 = r18
            r9 = r21
            r0 = 8
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x041c }
            r2 = r19
            q.a.a.a.a.a.i r3 = r12.mo29415a(r2)     // Catch:{ IOException -> 0x041c }
            if (r3 != 0) goto L_0x0147
            boolean r2 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0142 }
            if (r2 == 0) goto L_0x04c8
            r2 = 7
            com.google.protos.i.a.c r2 = r1.mo29414b(r2)     // Catch:{ IOException -> 0x0142 }
            r1.mo29413a(r2)     // Catch:{ IOException -> 0x0142 }
            goto L_0x04c8
        L_0x0142:
            r30 = r14
            goto L_0x0428
        L_0x0147:
            boolean r4 = r20.mo58661D()     // Catch:{ IOException -> 0x041c }
            if (r4 != 0) goto L_0x015d
            r4 = r18
            q.a.a.a.a.a.e r5 = com.google.android.libraries.p1975k.C24017j.m44613b(r3, r4)     // Catch:{ IOException -> 0x0142 }
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ IOException -> 0x0142 }
            boolean r5 = com.google.android.libraries.p1975k.C24017j.m44614c(r11, r5, r13, r1, r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 != 0) goto L_0x015f
            goto L_0x04c8
        L_0x015d:
            r4 = r18
        L_0x015f:
            q.a.a.a.a.a.e r5 = com.google.android.libraries.p1975k.C24017j.m44613b(r3, r4)     // Catch:{ IOException -> 0x041c }
            boolean r5 = com.google.android.libraries.p1975k.C24017j.m44615d(r5)     // Catch:{ IOException -> 0x041c }
            r7 = 0
            r26 = 0
            r27 = 0
        L_0x016c:
            boolean r8 = r20.mo58661D()     // Catch:{ IOException -> 0x041c }
            if (r8 != 0) goto L_0x0080
            int r8 = r20.mo58678m()     // Catch:{ IOException -> 0x041c }
            int r9 = r8 >>> 3
            r10 = r8 & 7
            com.google.protobuf.dn r6 = r3.f193444b     // Catch:{ IOException -> 0x041c }
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)     // Catch:{ IOException -> 0x041c }
            r19 = r1
            long r0 = (long) r9
            r30 = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0427 }
            boolean r6 = r6.containsKey(r14)     // Catch:{ IOException -> 0x0427 }
            if (r6 != 0) goto L_0x01b3
            if (r5 == 0) goto L_0x019d
            r6 = r20
            r6.mo58663F(r8)     // Catch:{ IOException -> 0x0427 }
            r24 = r3
            r3 = r15
            r0 = r19
            goto L_0x0396
        L_0x019d:
            boolean r2 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r2 == 0) goto L_0x04c8
            r2 = r19
            r3 = 8
            com.google.protos.i.a.c r4 = r2.mo29414b(r3)     // Catch:{ IOException -> 0x0427 }
            r4.mo59378a(r0)     // Catch:{ IOException -> 0x0427 }
            r2.mo29413a(r4)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x01b3:
            r6 = r20
            r31 = r0
            r0 = r19
            r19 = r31
            com.google.protobuf.dn r1 = r3.f193444b     // Catch:{ IOException -> 0x0427 }
            boolean r24 = r1.containsKey(r14)     // Catch:{ IOException -> 0x0427 }
            if (r24 == 0) goto L_0x0416
            java.lang.Object r1 = r1.get(r14)     // Catch:{ IOException -> 0x0427 }
            q.a.a.a.a.a.c r1 = (p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c) r1     // Catch:{ IOException -> 0x0427 }
            r14 = 3
            r24 = r3
            r3 = 2
            if (r10 == r3) goto L_0x01d7
            if (r10 == r14) goto L_0x01d7
            r14 = 4
            if (r10 == r14) goto L_0x01d8
            r14 = r10
            r10 = 1
            goto L_0x01d9
        L_0x01d7:
            r14 = r10
        L_0x01d8:
            r10 = 0
        L_0x01d9:
            if (r10 != 0) goto L_0x032c
            int r10 = r1.f193430a     // Catch:{ IOException -> 0x0427 }
            r10 = r10 & r3
            if (r10 == 0) goto L_0x01e1
            goto L_0x01eb
        L_0x01e1:
            if (r7 == 0) goto L_0x0350
            boolean r10 = com.google.android.libraries.p1975k.C24017j.m44616e(r2, r9)     // Catch:{ IOException -> 0x0427 }
            if (r10 != 0) goto L_0x01eb
            goto L_0x0350
        L_0x01eb:
            if (r14 == r3) goto L_0x01f7
            r3 = 3
            if (r14 != r3) goto L_0x01f3
            r10 = 3
            r14 = 3
            goto L_0x01f8
        L_0x01f3:
            r10 = r14
        L_0x01f4:
            r3 = r15
            goto L_0x0396
        L_0x01f7:
            r10 = r14
        L_0x01f8:
            int r3 = r1.f193431b     // Catch:{ IOException -> 0x0427 }
            boolean r3 = r12.mo29418d(r3)     // Catch:{ IOException -> 0x0427 }
            if (r3 != 0) goto L_0x021e
            boolean r3 = com.google.android.libraries.p1975k.C24017j.m44616e(r2, r9)     // Catch:{ IOException -> 0x0427 }
            if (r3 != 0) goto L_0x021e
            q.a.a.a.a.a.e r1 = com.google.android.libraries.p1975k.C24017j.m44612a(r1, r4)     // Catch:{ IOException -> 0x0427 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0427 }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ IOException -> 0x0427 }
            boolean r1 = com.google.android.libraries.p1975k.C24017j.m44614c(r11, r1, r13, r0, r3)     // Catch:{ IOException -> 0x0427 }
            if (r1 != 0) goto L_0x021a
            goto L_0x04c8
        L_0x021a:
            r6.mo58663F(r8)     // Catch:{ IOException -> 0x0427 }
            goto L_0x01f4
        L_0x021e:
            com.google.android.libraries.k.k r3 = new com.google.android.libraries.k.k     // Catch:{ IOException -> 0x0427 }
            r24 = r3
            r25 = r2
            r28 = r5
            r29 = r9
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0427 }
            r15.push(r3)     // Catch:{ IOException -> 0x0427 }
            boolean r2 = com.google.android.libraries.p1975k.C24017j.m44616e(r2, r9)     // Catch:{ IOException -> 0x0427 }
            if (r2 == 0) goto L_0x02bf
            if (r7 != 0) goto L_0x0238
        L_0x0236:
            r2 = 0
            goto L_0x0292
        L_0x0238:
            java.lang.String r2 = "type.googleapis.com/"
            boolean r2 = r7.startsWith(r2)     // Catch:{ IOException -> 0x0427 }
            if (r2 != 0) goto L_0x0241
            goto L_0x0236
        L_0x0241:
            r2 = 20
            java.lang.String r2 = r7.substring(r2)     // Catch:{ IOException -> 0x0427 }
            int r2 = com.google.p4230bn.p4231a.p4232a.p4233a.C56114a.m87896a(r2)     // Catch:{ IOException -> 0x0427 }
            android.util.LruCache r3 = r12.f65626a     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x0290 }
            if (r3 != 0) goto L_0x0287
            q.a.a.a.a.a.m r3 = r12.f65627b     // Catch:{ IllegalArgumentException -> 0x0290 }
            if (r3 != 0) goto L_0x0263
            q.a.a.a.a.a.m r3 = r12.mo29417c()     // Catch:{ IllegalArgumentException -> 0x0290 }
            r12.f65627b = r3     // Catch:{ IllegalArgumentException -> 0x0290 }
        L_0x0263:
            q.a.a.a.a.a.m r3 = r12.f65627b     // Catch:{ IllegalArgumentException -> 0x0290 }
            com.google.protobuf.dn r3 = r3.f193455b     // Catch:{ IllegalArgumentException -> 0x0290 }
            boolean r8 = r3.containsKey(r2)     // Catch:{ IllegalArgumentException -> 0x0290 }
            if (r8 == 0) goto L_0x0281
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x0290 }
            int r3 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0290 }
            android.util.LruCache r8 = r12.f65626a     // Catch:{ IllegalArgumentException -> 0x0290 }
            r8.put(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0290 }
            goto L_0x0287
        L_0x0281:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0290 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0290 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0290 }
        L_0x0287:
            int r2 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x0290 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0290 }
            goto L_0x0292
        L_0x0290:
            goto L_0x0236
        L_0x0292:
            if (r2 != 0) goto L_0x02ba
            boolean r1 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            r1 = 9
            com.google.protos.i.a.c r1 = r0.mo29414b(r1)     // Catch:{ IOException -> 0x0427 }
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r7)     // Catch:{ IOException -> 0x0427 }
            r1.copyOnWrite()     // Catch:{ IOException -> 0x0427 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ IOException -> 0x0427 }
            com.google.protos.i.a.d r3 = (com.google.protos.p5066i.p5067a.C65473d) r3     // Catch:{ IOException -> 0x0427 }
            com.google.protos.i.a.d r4 = com.google.protos.p5066i.p5067a.C65473d.f177963m     // Catch:{ IOException -> 0x0427 }
            int r4 = r3.f177965a     // Catch:{ IOException -> 0x0427 }
            r4 = r4 | 32
            r3.f177965a = r4     // Catch:{ IOException -> 0x0427 }
            r3.f177971g = r2     // Catch:{ IOException -> 0x0427 }
            r0.mo29413a(r1)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x02ba:
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x0427 }
            goto L_0x02c1
        L_0x02bf:
            int r2 = r1.f193431b     // Catch:{ IOException -> 0x0427 }
        L_0x02c1:
            r3 = 3
            if (r14 != r3) goto L_0x02c7
            r26 = 0
            goto L_0x02d1
        L_0x02c7:
            int r3 = r6.mo58675j()     // Catch:{ IOException -> 0x0427 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0427 }
            r26 = r3
        L_0x02d1:
            r3 = r6
            com.google.protobuf.aa r3 = (com.google.protobuf.C62893aa) r3     // Catch:{ IOException -> 0x0427 }
            int r3 = r3.f169792a     // Catch:{ IOException -> 0x0427 }
            r7 = r6
            com.google.protobuf.aa r7 = (com.google.protobuf.C62893aa) r7     // Catch:{ IOException -> 0x0427 }
            int r7 = r7.f169793b     // Catch:{ IOException -> 0x0427 }
            int r27 = r3 - r7
            q.a.a.a.a.a.i r3 = r12.mo29416b(r2)     // Catch:{ IOException -> 0x0427 }
            if (r5 != 0) goto L_0x02fa
            q.a.a.a.a.a.e r5 = com.google.android.libraries.p1975k.C24017j.m44612a(r1, r4)     // Catch:{ IOException -> 0x0427 }
            boolean r5 = com.google.android.libraries.p1975k.C24017j.m44615d(r5)     // Catch:{ IOException -> 0x0427 }
            if (r5 != 0) goto L_0x02fa
            q.a.a.a.a.a.e r5 = com.google.android.libraries.p1975k.C24017j.m44613b(r3, r4)     // Catch:{ IOException -> 0x0427 }
            boolean r5 = com.google.android.libraries.p1975k.C24017j.m44615d(r5)     // Catch:{ IOException -> 0x0427 }
            if (r5 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r7 = 0
            goto L_0x02fb
        L_0x02fa:
            r7 = 1
        L_0x02fb:
            if (r26 == 0) goto L_0x030c
            int r5 = r26.intValue()     // Catch:{ IOException -> 0x0427 }
            if (r5 <= 0) goto L_0x0304
            goto L_0x030c
        L_0x0304:
            r24 = r3
            r5 = r7
            r10 = r14
            r3 = r15
            r7 = 0
            goto L_0x0396
        L_0x030c:
            q.a.a.a.a.a.e r1 = com.google.android.libraries.p1975k.C24017j.m44612a(r1, r4)     // Catch:{ IOException -> 0x0427 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0427 }
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ IOException -> 0x0427 }
            boolean r1 = com.google.android.libraries.p1975k.C24017j.m44614c(r11, r1, r13, r0, r5)     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            q.a.a.a.a.a.e r1 = com.google.android.libraries.p1975k.C24017j.m44613b(r3, r4)     // Catch:{ IOException -> 0x0427 }
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a     // Catch:{ IOException -> 0x0427 }
            boolean r1 = com.google.android.libraries.p1975k.C24017j.m44614c(r11, r1, r13, r0, r5)     // Catch:{ IOException -> 0x0427 }
            if (r1 != 0) goto L_0x0304
            goto L_0x04c8
        L_0x032c:
            int r3 = r1.f193430a     // Catch:{ IOException -> 0x0427 }
            r7 = 2
            r3 = r3 & r7
            if (r3 == 0) goto L_0x0350
            int r3 = r1.f193431b     // Catch:{ IOException -> 0x0427 }
            boolean r3 = r12.mo29418d(r3)     // Catch:{ IOException -> 0x0427 }
            if (r3 == 0) goto L_0x0350
            boolean r1 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            r1 = 10
            com.google.protos.i.a.c r1 = r0.mo29414b(r1)     // Catch:{ IOException -> 0x0427 }
            r2 = r19
            r1.mo59378a(r2)     // Catch:{ IOException -> 0x0427 }
            r0.mo29413a(r1)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x0350:
            r7 = r14
            r3 = r15
            r14 = r19
            q.a.a.a.a.a.e r1 = com.google.android.libraries.p1975k.C24017j.m44612a(r1, r4)     // Catch:{ IOException -> 0x0427 }
            if (r5 != 0) goto L_0x0374
            boolean r10 = com.google.android.libraries.p1975k.C24017j.m44615d(r1)     // Catch:{ IOException -> 0x0427 }
            if (r10 != 0) goto L_0x0374
            boolean r1 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            r1 = 8
            com.google.protos.i.a.c r2 = r0.mo29414b(r1)     // Catch:{ IOException -> 0x0427 }
            r2.mo59378a(r14)     // Catch:{ IOException -> 0x0427 }
            r0.mo29413a(r2)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x0374:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0427 }
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ IOException -> 0x0427 }
            boolean r1 = com.google.android.libraries.p1975k.C24017j.m44614c(r11, r1, r13, r0, r10)     // Catch:{ IOException -> 0x0427 }
            if (r1 != 0) goto L_0x0384
            goto L_0x04c8
        L_0x0384:
            int r1 = com.google.android.libraries.p1975k.C24017j.f65634a     // Catch:{ IOException -> 0x0427 }
            if (r2 != r1) goto L_0x0390
            r1 = 1
            if (r9 != r1) goto L_0x0390
            java.lang.String r1 = r6.mo58690y()     // Catch:{ IOException -> 0x0427 }
            goto L_0x0394
        L_0x0390:
            r6.mo58663F(r8)     // Catch:{ IOException -> 0x0427 }
            r1 = 0
        L_0x0394:
            r10 = r7
            r7 = r1
        L_0x0396:
            if (r26 != 0) goto L_0x039b
            r1 = 4
            if (r10 != r1) goto L_0x040a
        L_0x039b:
            if (r26 != 0) goto L_0x03a9
            r1 = r6
            com.google.protobuf.aa r1 = (com.google.protobuf.C62893aa) r1     // Catch:{ IOException -> 0x0427 }
            int r1 = r1.f169792a     // Catch:{ IOException -> 0x0427 }
            r8 = r6
            com.google.protobuf.aa r8 = (com.google.protobuf.C62893aa) r8     // Catch:{ IOException -> 0x0427 }
            int r8 = r8.f169793b     // Catch:{ IOException -> 0x0427 }
            int r1 = r1 - r8
            goto L_0x03af
        L_0x03a9:
            int r1 = r26.intValue()     // Catch:{ IOException -> 0x0427 }
            int r1 = r27 + r1
        L_0x03af:
            r8 = r6
            com.google.protobuf.aa r8 = (com.google.protobuf.C62893aa) r8     // Catch:{ IOException -> 0x0427 }
            int r8 = r8.f169792a     // Catch:{ IOException -> 0x0427 }
            r9 = r6
            com.google.protobuf.aa r9 = (com.google.protobuf.C62893aa) r9     // Catch:{ IOException -> 0x0427 }
            int r9 = r9.f169793b     // Catch:{ IOException -> 0x0427 }
            int r8 = r8 - r9
            if (r8 < r1) goto L_0x040a
            r2 = 11
            if (r8 <= r1) goto L_0x03cf
            boolean r1 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            com.google.protos.i.a.c r1 = r0.mo29414b(r2)     // Catch:{ IOException -> 0x0427 }
            r0.mo29413a(r1)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x03cf:
            boolean r1 = r3.isEmpty()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x03e4
            boolean r1 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()     // Catch:{ IOException -> 0x0427 }
            if (r1 == 0) goto L_0x04c8
            com.google.protos.i.a.c r1 = r0.mo29414b(r2)     // Catch:{ IOException -> 0x0427 }
            r0.mo29413a(r1)     // Catch:{ IOException -> 0x0427 }
            goto L_0x04c8
        L_0x03e4:
            java.lang.Object r1 = r3.pop()     // Catch:{ IOException -> 0x0427 }
            com.google.android.libraries.k.k r1 = (com.google.android.libraries.p1975k.C24018k) r1     // Catch:{ IOException -> 0x0427 }
            int r2 = r1.f65640a     // Catch:{ IOException -> 0x0427 }
            java.lang.Integer r5 = r1.f65641b     // Catch:{ IOException -> 0x0427 }
            int r8 = r1.f65642c     // Catch:{ IOException -> 0x0427 }
            boolean r1 = r1.f65643d     // Catch:{ IOException -> 0x0427 }
            q.a.a.a.a.a.i r24 = r12.mo29416b(r2)     // Catch:{ IOException -> 0x0427 }
            if (r5 != 0) goto L_0x03fe
            r26 = r5
            r27 = r8
            r5 = r1
            goto L_0x040a
        L_0x03fe:
            int r9 = r5.intValue()     // Catch:{ IOException -> 0x0427 }
            int r9 = r9 + r8
            r26 = r5
            r27 = r8
            r5 = r1
            r1 = r9
            goto L_0x03af
        L_0x040a:
            r1 = r0
            r15 = r3
            r20 = r6
            r3 = r24
            r14 = r30
            r0 = 8
            goto L_0x016c
        L_0x0416:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0427 }
            r0.<init>()     // Catch:{ IOException -> 0x0427 }
            throw r0     // Catch:{ IOException -> 0x0427 }
        L_0x041c:
            r30 = r14
            goto L_0x0427
        L_0x041f:
            r23 = r0
            r17 = r12
            r30 = r14
            r22 = 0
        L_0x0427:
        L_0x0428:
            boolean r0 = com.google.android.libraries.p1975k.p1978c.C23996a.m44587a()
            if (r0 == 0) goto L_0x04c8
            com.google.protos.i.a.d r0 = com.google.protos.p5066i.p5067a.C65473d.f177963m
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.i.a.c r0 = (com.google.protos.p5066i.p5067a.C65472c) r0
            r11 = r30
            android.content.Context r1 = r11.f65576a
            java.lang.String r1 = r1.getPackageName()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.i.a.d r2 = (com.google.protos.p5066i.p5067a.C65473d) r2
            r1.getClass()
            int r3 = r2.f177965a
            r4 = 1
            r3 = r3 | r4
            r2.f177965a = r3
            r2.f177966b = r1
            com.google.android.libraries.k.e.a r1 = com.google.android.libraries.p1975k.C24017j.f65636c
            android.content.Context r2 = r11.f65576a
            int r1 = r1.mo29404a(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.i.a.d r2 = (com.google.protos.p5066i.p5067a.C65473d) r2
            int r3 = r2.f177965a
            r4 = 2
            r3 = r3 | r4
            r2.f177965a = r3
            r2.f177967c = r1
            int r1 = r23.javaClassNameHash()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.i.a.d r2 = (com.google.protos.p5066i.p5067a.C65473d) r2
            int r3 = r2.f177965a
            r4 = 4
            r3 = r3 | r4
            r2.f177965a = r3
            long r3 = (long) r1
            r2.f177968d = r3
            int r1 = r23.featureNameHash()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.i.a.d r2 = (com.google.protos.p5066i.p5067a.C65473d) r2
            int r3 = r2.f177965a
            r4 = 8
            r3 = r3 | r4
            r2.f177965a = r3
            long r3 = (long) r1
            r2.f177969e = r3
            r1 = r17
            int r1 = r1.length
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.i.a.d r2 = (com.google.protos.p5066i.p5067a.C65473d) r2
            int r3 = r2.f177965a
            r3 = r3 | 16
            r2.f177965a = r3
            long r3 = (long) r1
            r2.f177970f = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.i.a.d r1 = (com.google.protos.p5066i.p5067a.C65473d) r1
            r2 = 5
            int r2 = com.google.protos.p5066i.p5067a.C65471b.m96686a(r2)
            r1.f177972h = r2
            int r2 = r1.f177965a
            r2 = r2 | 64
            r1.f177965a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.i.a.d r0 = (com.google.protos.p5066i.p5067a.C65473d) r0
            r1 = r16
            com.google.common.base.bk r1 = (com.google.common.base.C58847bk) r1
            java.lang.Object r1 = r1.f156646a
            com.google.android.libraries.k.e.e r1 = (com.google.android.libraries.p1975k.p1980e.C24007e) r1
            r1.mo29410a(r0)
        L_0x04c8:
            r7 = 0
        L_0x04c9:
            e.a.a.n.c.a.d r0 = p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68844d.f185049a
            r0.mo6453a()
            e.a.a.n.c.a.a r0 = p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68841a.f185038a
            e.a.a.n.c.a.b r0 = r0.mo6453a()
            boolean r0 = r0.mo60643i()
            if (r0 == 0) goto L_0x04db
            return r7
        L_0x04db:
            r0 = 1
            return r0
        L_0x04dd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x04dd }
            throw r0
        L_0x04e0:
            android.os.NetworkOnMainThreadException r0 = new android.os.NetworkOnMainThreadException
            r0.<init>()
            goto L_0x04e7
        L_0x04e6:
            throw r0
        L_0x04e7:
            goto L_0x04e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1975k.p1980e.C24006d.mo29411a(com.google.protobuf.z):boolean");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.f65612a + ", basis=" + this.f65613b + "}";
    }
}
