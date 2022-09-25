package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.exoplayer.h.cj */
/* compiled from: PG */
public final class C3099cj extends C2651bm {

    /* renamed from: a */
    private static final Object f9068a = new Object();

    /* renamed from: b */
    private final long f9069b;

    /* renamed from: d */
    private final long f9070d;

    /* renamed from: e */
    private final long f9071e;

    /* renamed from: f */
    private final long f9072f;

    /* renamed from: g */
    private final long f9073g;

    /* renamed from: h */
    private final long f9074h;

    /* renamed from: i */
    private final boolean f9075i;

    /* renamed from: j */
    private final boolean f9076j;

    /* renamed from: k */
    private final boolean f9077k;

    /* renamed from: l */
    private final Object f9078l;

    /* renamed from: m */
    private final C2590aq f9079m;

    /* renamed from: n */
    private final C2583aj f9080n;

    static {
        C2576ac acVar = new C2576ac();
        acVar.f7103a = "SinglePeriodTimeline";
        acVar.f7104b = Uri.EMPTY;
        acVar.mo6082a();
    }

    public C3099cj(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, C2590aq aqVar, C2583aj ajVar) {
        this.f9069b = j;
        this.f9070d = j2;
        this.f9071e = j3;
        this.f9072f = j4;
        this.f9073g = j5;
        this.f9074h = j6;
        this.f9075i = z;
        this.f9076j = z2;
        this.f9077k = z3;
        this.f9078l = obj;
        aqVar.getClass();
        this.f9079m = aqVar;
        this.f9080n = ajVar;
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        return f9068a.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo6022c() {
        return 1;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        C2601a.m6834f(i, 1);
        bkVar.mo6291j((Object) null, z ? f9068a : null, 0, this.f9071e, -this.f9073g);
        return bkVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > r3) goto L_0x0023;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.C2650bl mo6024e(int r30, androidx.media3.common.C2650bl r31, long r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = 1
            r2 = r30
            androidx.media3.common.p136b.C2601a.m6834f(r2, r1)
            long r1 = r0.f9074h
            boolean r3 = r0.f9076j
            if (r3 == 0) goto L_0x002d
            boolean r3 = r0.f9077k
            if (r3 != 0) goto L_0x002d
            r3 = 0
            int r5 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002d
            long r3 = r0.f9072f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0026
        L_0x0023:
            r21 = r5
            goto L_0x002f
        L_0x0026:
            long r1 = r1 + r32
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x002d
            goto L_0x0023
        L_0x002d:
            r21 = r1
        L_0x002f:
            java.lang.Object r9 = androidx.media3.common.C2650bl.f7335a
            androidx.media3.common.aq r10 = r0.f9079m
            java.lang.Object r11 = r0.f9078l
            long r12 = r0.f9069b
            long r14 = r0.f9070d
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r1 = r0.f9075i
            r18 = r1
            boolean r1 = r0.f9076j
            r19 = r1
            androidx.media3.common.aj r1 = r0.f9080n
            r20 = r1
            long r1 = r0.f9072f
            r23 = r1
            r25 = 0
            r26 = 0
            long r1 = r0.f9073g
            r27 = r1
            r8 = r31
            r8.mo6293b(r9, r10, r11, r12, r14, r16, r18, r19, r20, r21, r23, r25, r26, r27)
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3099cj.mo6024e(int, androidx.media3.common.bl, long):androidx.media3.common.bl");
    }

    /* renamed from: f */
    public final Object mo6026f(int i) {
        C2601a.m6834f(i, 1);
        return f9068a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3099cj(long r20, boolean r22, boolean r23, androidx.media3.common.C2590aq r24) {
        /*
            r19 = this;
            if (r23 == 0) goto L_0x0007
            r13 = r24
            androidx.media3.common.aj r0 = r13.f7156e
            goto L_0x000a
        L_0x0007:
            r13 = r24
            r0 = 0
        L_0x000a:
            r18 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r0 = r19
            r5 = r20
            r7 = r20
            r13 = r22
            r17 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3099cj.<init>(long, boolean, boolean, androidx.media3.common.aq):void");
    }
}
