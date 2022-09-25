package androidx.media3.exoplayer.p137a;

import android.util.Base64;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3036as;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: androidx.media3.exoplayer.a.bn */
/* compiled from: PG */
public final class C2725bn implements C2729br {

    /* renamed from: d */
    private static final Random f7568d = new Random();

    /* renamed from: a */
    public final C2650bl f7569a;

    /* renamed from: b */
    public final C2649bk f7570b;

    /* renamed from: c */
    public C2728bq f7571c;

    /* renamed from: e */
    private final HashMap f7572e;

    /* renamed from: f */
    private C2651bm f7573f;

    /* renamed from: g */
    private String f7574g;

    public C2725bn() {
        throw null;
    }

    /* renamed from: a */
    public static String m7503a() {
        byte[] bArr = new byte[12];
        f7568d.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: i */
    private final C2724bm m7504i(int i, C3036as asVar) {
        C2724bm bmVar = null;
        long j = Long.MAX_VALUE;
        for (C2724bm bmVar2 : this.f7572e.values()) {
            bmVar2.mo6411a(i, asVar);
            if (bmVar2.mo6412b(i, asVar)) {
                long j2 = bmVar2.f7563c;
                if (j2 == -1 || j2 < j) {
                    bmVar = bmVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = C2612ak.f7249a;
                    if (!(bmVar.f7564d == null || bmVar2.f7564d == null)) {
                        bmVar = bmVar2;
                    }
                }
            }
        }
        if (bmVar != null) {
            return bmVar;
        }
        String a = m7503a();
        C2724bm bmVar3 = new C2724bm(this, a, i, asVar);
        this.f7572e.put(a, bmVar3);
        return bmVar3;
    }

    /* renamed from: j */
    private final void m7505j(C2711b bVar) {
        C3036as asVar;
        if (bVar.f7528b.mo6304o()) {
            this.f7574g = null;
            return;
        }
        C2724bm bmVar = (C2724bm) this.f7572e.get(this.f7574g);
        C2724bm i = m7504i(bVar.f7529c, bVar.f7530d);
        this.f7574g = i.f7561a;
        mo6417e(bVar);
        C3036as asVar2 = bVar.f7530d;
        if (asVar2 != null && asVar2.mo6102a()) {
            if (bmVar == null || bmVar.f7563c != asVar2.f7207d || (asVar = bmVar.f7564d) == null || asVar.f7205b != asVar2.f7205b || asVar.f7206c != asVar2.f7206c) {
                this.f7571c.mo6421A(bVar, m7504i(bVar.f7529c, new C3036as(asVar2.f7204a, asVar2.f7207d)).f7561a, i.f7561a);
            }
        }
    }

    /* renamed from: b */
    public final synchronized String mo6414b() {
        return this.f7574g;
    }

    /* renamed from: c */
    public final synchronized String mo6415c(C2651bm bmVar, C3036as asVar) {
        return m7504i(bmVar.mo6303n(asVar.f7204a, this.f7570b).f7330c, asVar).f7561a;
    }

    /* renamed from: d */
    public final synchronized void mo6416d(C2711b bVar) {
        C2728bq bqVar;
        this.f7574g = null;
        Iterator it = this.f7572e.values().iterator();
        while (it.hasNext()) {
            C2724bm bmVar = (C2724bm) it.next();
            it.remove();
            if (bmVar.f7565e && (bqVar = this.f7571c) != null) {
                bqVar.mo6424D(bVar, bmVar.f7561a, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r3.f7207d < r4) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6417e(androidx.media3.exoplayer.p137a.C2711b r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            androidx.media3.exoplayer.a.bq r2 = r1.f7571c     // Catch:{ all -> 0x00ed }
            r2.getClass()
            androidx.media3.common.bm r2 = r0.f7528b     // Catch:{ all -> 0x00ed }
            boolean r2 = r2.mo6304o()     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap r2 = r1.f7572e     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = r1.f7574g     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bm r2 = (androidx.media3.exoplayer.p137a.C2724bm) r2     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.h.as r3 = r0.f7530d     // Catch:{ all -> 0x00ed }
            if (r3 == 0) goto L_0x003b
            if (r2 == 0) goto L_0x003b
            long r4 = r2.f7563c     // Catch:{ all -> 0x00ed }
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0033
            int r2 = r2.f7562b     // Catch:{ all -> 0x00ed }
            int r4 = r0.f7529c     // Catch:{ all -> 0x00ed }
            if (r2 != r4) goto L_0x0039
            goto L_0x003b
        L_0x0033:
            long r6 = r3.f7207d     // Catch:{ all -> 0x00ed }
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
        L_0x0039:
            monitor-exit(r24)
            return
        L_0x003b:
            int r2 = r0.f7529c     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bm r2 = r1.m7504i(r2, r3)     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = r1.f7574g     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = r2.f7561a     // Catch:{ all -> 0x00ed }
            r1.f7574g = r3     // Catch:{ all -> 0x00ed }
        L_0x0049:
            androidx.media3.exoplayer.h.as r3 = r0.f7530d     // Catch:{ all -> 0x00ed }
            r4 = 1
            if (r3 == 0) goto L_0x00c3
            boolean r5 = r3.mo6102a()     // Catch:{ all -> 0x00ed }
            if (r5 == 0) goto L_0x00c3
            androidx.media3.exoplayer.h.as r11 = new androidx.media3.exoplayer.h.as     // Catch:{ all -> 0x00ed }
            java.lang.Object r5 = r3.f7204a     // Catch:{ all -> 0x00ed }
            long r6 = r3.f7207d     // Catch:{ all -> 0x00ed }
            int r3 = r3.f7205b     // Catch:{ all -> 0x00ed }
            r11.<init>(r5, r6, r3)     // Catch:{ all -> 0x00ed }
            int r3 = r0.f7529c     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bm r3 = r1.m7504i(r3, r11)     // Catch:{ all -> 0x00ed }
            boolean r5 = r3.f7565e     // Catch:{ all -> 0x00ed }
            if (r5 != 0) goto L_0x00c3
            r3.f7565e = r4     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bm r5 = r0.f7528b     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.h.as r6 = r0.f7530d     // Catch:{ all -> 0x00ed }
            java.lang.Object r6 = r6.f7204a     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bk r7 = r1.f7570b     // Catch:{ all -> 0x00ed }
            r5.mo6303n(r6, r7)     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bk r5 = r1.f7570b     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.h.as r6 = r0.f7530d     // Catch:{ all -> 0x00ed }
            int r6 = r6.f7205b     // Catch:{ all -> 0x00ed }
            long r5 = r5.mo6286f(r6)     // Catch:{ all -> 0x00ed }
            long r5 = androidx.media3.common.p136b.C2612ak.m6918A(r5)     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bk r7 = r1.f7570b     // Catch:{ all -> 0x00ed }
            long r7 = r7.f7332e     // Catch:{ all -> 0x00ed }
            long r7 = androidx.media3.common.p136b.C2612ak.m6918A(r7)     // Catch:{ all -> 0x00ed }
            long r5 = r5 + r7
            r7 = 0
            long r12 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.b r5 = new androidx.media3.exoplayer.a.b     // Catch:{ all -> 0x00ed }
            long r7 = r0.f7527a     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bm r9 = r0.f7528b     // Catch:{ all -> 0x00ed }
            int r10 = r0.f7529c     // Catch:{ all -> 0x00ed }
            androidx.media3.common.bm r14 = r0.f7532f     // Catch:{ all -> 0x00ed }
            int r15 = r0.f7533g     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.h.as r6 = r0.f7534h     // Catch:{ all -> 0x00ed }
            r21 = r5
            long r4 = r0.f7535i     // Catch:{ all -> 0x00ed }
            r22 = r2
            r23 = r3
            long r2 = r0.f7536j     // Catch:{ all -> 0x00ed }
            r16 = r6
            r6 = r21
            r17 = r4
            r19 = r2
            r6.<init>(r7, r9, r10, r11, r12, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bq r2 = r1.f7571c     // Catch:{ all -> 0x00ed }
            r3 = r23
            java.lang.String r3 = r3.f7561a     // Catch:{ all -> 0x00ed }
            r4 = r21
            r2.mo6423C(r4, r3)     // Catch:{ all -> 0x00ed }
            r2 = r22
        L_0x00c3:
            boolean r3 = r2.f7565e     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x00d1
            r3 = 1
            r2.f7565e = r3     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bq r3 = r1.f7571c     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r2.f7561a     // Catch:{ all -> 0x00ed }
            r3.mo6423C(r0, r4)     // Catch:{ all -> 0x00ed }
        L_0x00d1:
            java.lang.String r3 = r2.f7561a     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r1.f7574g     // Catch:{ all -> 0x00ed }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00ed }
            if (r3 == 0) goto L_0x00eb
            boolean r3 = r2.f7566f     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x00eb
            r3 = 1
            r2.f7566f = r3     // Catch:{ all -> 0x00ed }
            androidx.media3.exoplayer.a.bq r3 = r1.f7571c     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r2.f7561a     // Catch:{ all -> 0x00ed }
            r3.mo6422B(r0, r2)     // Catch:{ all -> 0x00ed }
            monitor-exit(r24)
            return
        L_0x00eb:
            monitor-exit(r24)
            return
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p137a.C2725bn.mo6417e(androidx.media3.exoplayer.a.b):void");
    }

    /* renamed from: f */
    public final synchronized void mo6418f(C2711b bVar, int i) {
        this.f7571c.getClass();
        Iterator it = this.f7572e.values().iterator();
        while (it.hasNext()) {
            C2724bm bmVar = (C2724bm) it.next();
            if (bmVar.mo6413c(bVar)) {
                it.remove();
                if (bmVar.f7565e) {
                    boolean equals = bmVar.f7561a.equals(this.f7574g);
                    boolean z = false;
                    if (i == 0 && equals && bmVar.f7566f) {
                        z = true;
                    }
                    if (equals) {
                        this.f7574g = null;
                    }
                    this.f7571c.mo6424D(bVar, bmVar.f7561a, z);
                }
            }
        }
        m7505j(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r4 >= r3.mo6022c()) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r3.mo6020a(r4.f7204a) != -1) goto L_0x0077;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6419g(androidx.media3.exoplayer.p137a.C2711b r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            androidx.media3.exoplayer.a.bq r0 = r10.f7571c     // Catch:{ all -> 0x009f }
            r0.getClass()
            androidx.media3.common.bm r0 = r10.f7573f     // Catch:{ all -> 0x009f }
            androidx.media3.common.bm r1 = r11.f7528b     // Catch:{ all -> 0x009f }
            r10.f7573f = r1     // Catch:{ all -> 0x009f }
            java.util.HashMap r1 = r10.f7572e     // Catch:{ all -> 0x009f }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x009f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x009f }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x009f }
            androidx.media3.exoplayer.a.bm r2 = (androidx.media3.exoplayer.p137a.C2724bm) r2     // Catch:{ all -> 0x009f }
            androidx.media3.common.bm r3 = r10.f7573f     // Catch:{ all -> 0x009f }
            int r4 = r2.f7562b     // Catch:{ all -> 0x009f }
            int r5 = r0.mo6022c()     // Catch:{ all -> 0x009f }
            r6 = 0
            r7 = -1
            if (r4 < r5) goto L_0x0036
            int r5 = r3.mo6022c()     // Catch:{ all -> 0x009f }
            if (r4 < r5) goto L_0x0065
        L_0x0034:
            r4 = -1
            goto L_0x0065
        L_0x0036:
            androidx.media3.exoplayer.a.bn r5 = r2.f7567g     // Catch:{ all -> 0x009f }
            androidx.media3.common.bl r5 = r5.f7569a     // Catch:{ all -> 0x009f }
            r8 = 0
            r0.mo6024e(r4, r5, r8)     // Catch:{ all -> 0x009f }
            androidx.media3.exoplayer.a.bn r4 = r2.f7567g     // Catch:{ all -> 0x009f }
            androidx.media3.common.bl r4 = r4.f7569a     // Catch:{ all -> 0x009f }
            int r4 = r4.f7350o     // Catch:{ all -> 0x009f }
        L_0x0045:
            androidx.media3.exoplayer.a.bn r5 = r2.f7567g     // Catch:{ all -> 0x009f }
            androidx.media3.common.bl r5 = r5.f7569a     // Catch:{ all -> 0x009f }
            int r5 = r5.f7351p     // Catch:{ all -> 0x009f }
            if (r4 > r5) goto L_0x0034
            java.lang.Object r5 = r0.mo6026f(r4)     // Catch:{ all -> 0x009f }
            int r5 = r3.mo6020a(r5)     // Catch:{ all -> 0x009f }
            if (r5 == r7) goto L_0x0062
            androidx.media3.exoplayer.a.bn r4 = r2.f7567g     // Catch:{ all -> 0x009f }
            androidx.media3.common.bk r4 = r4.f7570b     // Catch:{ all -> 0x009f }
            androidx.media3.common.bk r4 = r3.mo6023d(r5, r4, r6)     // Catch:{ all -> 0x009f }
            int r4 = r4.f7330c     // Catch:{ all -> 0x009f }
            goto L_0x0065
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0045
        L_0x0065:
            r2.f7562b = r4     // Catch:{ all -> 0x009f }
            if (r4 != r7) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            androidx.media3.exoplayer.h.as r4 = r2.f7564d     // Catch:{ all -> 0x009f }
            if (r4 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            java.lang.Object r4 = r4.f7204a     // Catch:{ all -> 0x009f }
            int r3 = r3.mo6020a(r4)     // Catch:{ all -> 0x009f }
            if (r3 == r7) goto L_0x007d
        L_0x0077:
            boolean r3 = r2.mo6413c(r11)     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x0016
        L_0x007d:
            r1.remove()     // Catch:{ all -> 0x009f }
            boolean r3 = r2.f7565e     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = r2.f7561a     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r10.f7574g     // Catch:{ all -> 0x009f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x0091
            r3 = 0
            r10.f7574g = r3     // Catch:{ all -> 0x009f }
        L_0x0091:
            androidx.media3.exoplayer.a.bq r3 = r10.f7571c     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.f7561a     // Catch:{ all -> 0x009f }
            r3.mo6424D(r11, r2, r6)     // Catch:{ all -> 0x009f }
            goto L_0x0016
        L_0x009a:
            r10.m7505j(r11)     // Catch:{ all -> 0x009f }
            monitor-exit(r10)
            return
        L_0x009f:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00a3
        L_0x00a2:
            throw r11
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p137a.C2725bn.mo6419g(androidx.media3.exoplayer.a.b):void");
    }

    /* renamed from: h */
    public final synchronized boolean mo6420h(C2711b bVar, String str) {
        C2724bm bmVar = (C2724bm) this.f7572e.get(str);
        if (bmVar == null) {
            return false;
        }
        bmVar.mo6411a(bVar.f7529c, bVar.f7530d);
        return bmVar.mo6412b(bVar.f7529c, bVar.f7530d);
    }

    public C2725bn(byte[] bArr) {
        this.f7569a = new C2650bl();
        this.f7570b = new C2649bk();
        this.f7572e = new HashMap();
        this.f7573f = C2651bm.f7353c;
    }
}
