package androidx.media3.exoplayer;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2653bo;
import androidx.media3.common.C2656br;
import androidx.media3.common.C2657bs;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p145h.C3023af;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3095cf;
import androidx.media3.exoplayer.p145h.C3107cr;
import androidx.media3.exoplayer.p145h.C3110e;
import androidx.media3.exoplayer.p150j.C3193a;
import androidx.media3.exoplayer.p150j.C3195ab;
import androidx.media3.exoplayer.p150j.C3196ac;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p150j.C3198ae;
import androidx.media3.exoplayer.p150j.C3199af;
import androidx.media3.exoplayer.p150j.C3201ah;
import androidx.media3.exoplayer.p150j.C3204ak;
import androidx.media3.exoplayer.p150j.C3205al;
import androidx.media3.exoplayer.p150j.C3206b;
import androidx.media3.exoplayer.p150j.C3210f;
import androidx.media3.exoplayer.p150j.C3211g;
import androidx.media3.exoplayer.p150j.C3212h;
import androidx.media3.exoplayer.p150j.C3213i;
import androidx.media3.exoplayer.p150j.C3214j;
import androidx.media3.exoplayer.p150j.C3215k;
import androidx.media3.exoplayer.p150j.C3219o;
import androidx.media3.exoplayer.p150j.C3221q;
import androidx.media3.exoplayer.p150j.C3222r;
import androidx.media3.exoplayer.p150j.C3223s;
import androidx.media3.exoplayer.p150j.C3224t;
import androidx.media3.exoplayer.p150j.C3225u;
import androidx.media3.exoplayer.p151k.C3240f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58673nt;
import com.google.common.p4522b.C58677nx;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: androidx.media3.exoplayer.cf */
/* compiled from: PG */
final class C2877cf {

    /* renamed from: a */
    public final C3034aq f8098a;

    /* renamed from: b */
    public final Object f8099b;

    /* renamed from: c */
    public final C3095cf[] f8100c;

    /* renamed from: d */
    public boolean f8101d;

    /* renamed from: e */
    public boolean f8102e;

    /* renamed from: f */
    public C2878cg f8103f;

    /* renamed from: g */
    public boolean f8104g;

    /* renamed from: h */
    public C2877cf f8105h;

    /* renamed from: i */
    public C3107cr f8106i = C3107cr.f9108a;

    /* renamed from: j */
    public C3205al f8107j;

    /* renamed from: k */
    public long f8108k;

    /* renamed from: l */
    private final boolean[] f8109l;

    /* renamed from: m */
    private final C2894cw[] f8110m;

    /* renamed from: n */
    private final C3204ak f8111n;

    /* renamed from: o */
    private final C2887cp f8112o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.media3.exoplayer.h.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.media3.exoplayer.h.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.media3.exoplayer.h.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.media3.exoplayer.h.ak} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2877cf(androidx.media3.exoplayer.C2894cw[] r8, long r9, androidx.media3.exoplayer.p150j.C3204ak r11, androidx.media3.exoplayer.p151k.C3241g r12, androidx.media3.exoplayer.C2887cp r13, androidx.media3.exoplayer.C2878cg r14, androidx.media3.exoplayer.p150j.C3205al r15) {
        /*
            r7 = this;
            r7.<init>()
            r7.f8110m = r8
            r7.f8108k = r9
            r7.f8111n = r11
            r7.f8112o = r13
            androidx.media3.exoplayer.h.as r9 = r14.f8113a
            java.lang.Object r9 = r9.f7204a
            r7.f8099b = r9
            r7.f8103f = r14
            androidx.media3.exoplayer.h.cr r9 = androidx.media3.exoplayer.p145h.C3107cr.f9108a
            r7.f8106i = r9
            r7.f8107j = r15
            int r8 = r8.length
            androidx.media3.exoplayer.h.cf[] r9 = new androidx.media3.exoplayer.p145h.C3095cf[r8]
            r7.f8100c = r9
            boolean[] r8 = new boolean[r8]
            r7.f8109l = r8
            androidx.media3.exoplayer.h.as r8 = r14.f8113a
            long r9 = r14.f8114b
            long r5 = r14.f8116d
            java.lang.Object r11 = r8.f7204a
            android.util.Pair r11 = (android.util.Pair) r11
            java.lang.Object r11 = r11.first
            java.lang.Object r14 = r8.f7204a
            android.util.Pair r14 = (android.util.Pair) r14
            java.lang.Object r14 = r14.second
            androidx.media3.exoplayer.h.as r8 = r8.mo6972b(r14)
            java.util.Map r14 = r13.f8153c
            java.lang.Object r11 = r14.get(r11)
            androidx.media3.exoplayer.cn r11 = (androidx.media3.exoplayer.C2885cn) r11
            r11.getClass()
            java.util.Set r14 = r13.f8158h
            r14.add(r11)
            java.util.HashMap r14 = r13.f8157g
            java.lang.Object r14 = r14.get(r11)
            androidx.media3.exoplayer.cm r14 = (androidx.media3.exoplayer.C2884cm) r14
            if (r14 == 0) goto L_0x0059
            androidx.media3.exoplayer.h.au r15 = r14.f8143a
            androidx.media3.exoplayer.h.at r14 = r14.f8144b
            r15.mo6949v(r14)
        L_0x0059:
            java.util.List r14 = r11.f8148c
            r14.add(r8)
            androidx.media3.exoplayer.h.an r14 = r11.f8146a
            androidx.media3.exoplayer.h.ak r1 = r14.mo6757m(r8, r12, r9)
            java.util.IdentityHashMap r8 = r13.f8152b
            r8.put(r1, r11)
            r13.mo6662c()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x007f
            androidx.media3.exoplayer.h.e r8 = new androidx.media3.exoplayer.h.e
            r2 = 1
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5)
            r1 = r8
        L_0x007f:
            r7.f8098a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C2877cf.<init>(androidx.media3.exoplayer.cw[], long, androidx.media3.exoplayer.j.ak, androidx.media3.exoplayer.k.g, androidx.media3.exoplayer.cp, androidx.media3.exoplayer.cg, androidx.media3.exoplayer.j.al):void");
    }

    /* renamed from: l */
    private final void m7985l() {
        if (mo6639i()) {
            int i = 0;
            while (true) {
                C3205al alVar = this.f8107j;
                if (i < alVar.f9613a) {
                    boolean b = alVar.mo7207b(i);
                    C3197ad adVar = this.f8107j.f9615c[i];
                    if (b && adVar != null) {
                        adVar.mo7036n();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private final void m7986m() {
        if (mo6639i()) {
            int i = 0;
            while (true) {
                C3205al alVar = this.f8107j;
                if (i < alVar.f9613a) {
                    boolean b = alVar.mo7207b(i);
                    C3197ad adVar = this.f8107j.f9615c[i];
                    if (b && adVar != null) {
                        adVar.mo7037o();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo6631a(C3205al alVar, long j, boolean z, boolean[] zArr) {
        C3205al alVar2 = alVar;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= alVar2.f9613a) {
                break;
            }
            boolean[] zArr2 = this.f8109l;
            if (z || !alVar2.mo7206a(this.f8107j, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        C3095cf[] cfVarArr = this.f8100c;
        int i2 = 0;
        while (true) {
            C2894cw[] cwVarArr = this.f8110m;
            if (i2 >= cwVarArr.length) {
                break;
            }
            if (cwVarArr[i2].mo6701eV() == -2) {
                cfVarArr[i2] = null;
            }
            i2++;
        }
        m7985l();
        this.f8107j = alVar2;
        m7986m();
        long g = this.f8098a.mo6813g(alVar2.f9615c, this.f8109l, this.f8100c, zArr, j);
        C3095cf[] cfVarArr2 = this.f8100c;
        int i3 = 0;
        while (true) {
            C2894cw[] cwVarArr2 = this.f8110m;
            if (i3 >= cwVarArr2.length) {
                break;
            }
            if (cwVarArr2[i3].mo6701eV() == -2 && this.f8107j.mo7207b(i3)) {
                cfVarArr2[i3] = new C3023af();
            }
            i3++;
        }
        this.f8102e = false;
        int i4 = 0;
        while (true) {
            C3095cf[] cfVarArr3 = this.f8100c;
            if (i4 >= cfVarArr3.length) {
                return g;
            }
            if (cfVarArr3[i4] != null) {
                C2601a.m6832d(alVar2.mo7207b(i4));
                if (this.f8110m[i4].mo6701eV() != -2) {
                    this.f8102e = true;
                }
            } else {
                C2601a.m6832d(alVar2.f9615c[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: b */
    public final long mo6632b() {
        if (!this.f8101d) {
            return this.f8103f.f8114b;
        }
        long c = this.f8102e ? this.f8098a.mo6808c() : Long.MIN_VALUE;
        return c == Long.MIN_VALUE ? this.f8103f.f8117e : c;
    }

    /* renamed from: c */
    public final long mo6633c() {
        if (!this.f8101d) {
            return 0;
        }
        return this.f8098a.mo6809d();
    }

    /* renamed from: d */
    public final long mo6634d() {
        return this.f8103f.f8114b + this.f8108k;
    }

    /* renamed from: e */
    public final void mo6635e() {
        m7985l();
        C2887cp cpVar = this.f8112o;
        C3034aq aqVar = this.f8098a;
        try {
            if (aqVar instanceof C3110e) {
                cpVar.mo6664e(((C3110e) aqVar).f9115a);
            } else {
                cpVar.mo6664e(aqVar);
            }
        } catch (RuntimeException e) {
            C2633u.m7048c("MediaPeriodHolder", C2633u.m7046a("Period release failed.", e));
        }
    }

    /* renamed from: f */
    public final void mo6636f(C2877cf cfVar) {
        if (cfVar != this.f8105h) {
            m7985l();
            this.f8105h = cfVar;
            m7986m();
        }
    }

    /* renamed from: g */
    public final void mo6637g() {
        C3034aq aqVar = this.f8098a;
        if (aqVar instanceof C3110e) {
            long j = this.f8103f.f8116d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C3110e eVar = (C3110e) aqVar;
            eVar.f9116b = 0;
            eVar.f9117c = j;
        }
    }

    /* renamed from: h */
    public final boolean mo6638h() {
        if (this.f8101d) {
            return !this.f8102e || this.f8098a.mo6808c() == Long.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo6639i() {
        return this.f8105h == null;
    }

    /* renamed from: j */
    public final long mo6640j(C3205al alVar, long j) {
        return mo6631a(alVar, j, false, new boolean[this.f8110m.length]);
    }

    /* renamed from: k */
    public final C3205al mo6641k(float f) {
        int length;
        C3221q qVar;
        boolean z;
        String str;
        boolean z2;
        C3240f fVar;
        int[] iArr;
        int length2;
        C3197ad adVar;
        C3240f fVar2;
        C3199af afVar;
        double d;
        C3196ac acVar;
        C2652bn bnVar;
        C3225u uVar;
        int length3;
        int[] iArr2;
        C3204ak akVar = this.f8111n;
        C2894cw[] cwVarArr = this.f8110m;
        C3107cr crVar = this.f8106i;
        C3036as asVar = this.f8103f.f8113a;
        int length4 = cwVarArr.length + 1;
        int[] iArr3 = new int[length4];
        C2652bn[][] bnVarArr = new C2652bn[length4][];
        int[][][] iArr4 = new int[length4][][];
        for (int i = 0; i < length4; i++) {
            int i2 = crVar.f9109b;
            bnVarArr[i] = new C2652bn[i2];
            iArr4[i] = new int[i2][];
        }
        int length5 = cwVarArr.length;
        int[] iArr5 = new int[length5];
        for (int i3 = 0; i3 < length5; i3++) {
            iArr5[i3] = cwVarArr[i3].mo6700e();
        }
        int i4 = 0;
        while (i4 < crVar.f9109b) {
            C2652bn b = crVar.mo7097b(i4);
            int i5 = b.f7356c;
            int length6 = cwVarArr.length;
            int i6 = 0;
            int i7 = 0;
            boolean z3 = true;
            while (true) {
                length3 = cwVarArr.length;
                if (i6 >= length3) {
                    break;
                }
                C2894cw cwVar = cwVarArr[i6];
                C3107cr crVar2 = crVar;
                int i8 = 0;
                for (int i9 = 0; i9 < b.f7354a; i9++) {
                    i8 = Math.max(i8, cwVar.mo6699L(b.f7357d[i9]) & 7);
                }
                boolean z4 = iArr3[i6] == 0;
                if (i8 > i7) {
                    i7 = i8;
                    z3 = z4;
                    length6 = i6;
                } else if (i8 == i7 && i5 == 5 && !z3 && z4) {
                    i7 = i8;
                    length6 = i6;
                    z3 = true;
                }
                i6++;
                crVar = crVar2;
            }
            C3107cr crVar3 = crVar;
            if (length6 == length3) {
                iArr2 = new int[b.f7354a];
            } else {
                C2894cw cwVar2 = cwVarArr[length6];
                int[] iArr6 = new int[b.f7354a];
                for (int i10 = 0; i10 < b.f7354a; i10++) {
                    iArr6[i10] = cwVar2.mo6699L(b.f7357d[i10]);
                }
                iArr2 = iArr6;
            }
            int i11 = iArr3[length6];
            bnVarArr[length6][i11] = b;
            iArr4[length6][i11] = iArr2;
            iArr3[length6] = i11 + 1;
            i4++;
            crVar = crVar3;
        }
        int length7 = cwVarArr.length;
        C3107cr[] crVarArr = new C3107cr[length7];
        String[] strArr = new String[length7];
        int[] iArr7 = new int[length7];
        int i12 = 0;
        while (true) {
            length = cwVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr3[i12];
            crVarArr[i12] = new C3107cr((C2652bn[]) C2612ak.m6965ao(bnVarArr[i12], i13));
            iArr4[i12] = (int[][]) C2612ak.m6965ao(iArr4[i12], i13);
            strArr[i12] = cwVarArr[i12].mo6504H();
            iArr7[i12] = cwVarArr[i12].mo6701eV();
            i12++;
        }
        int[] iArr8 = iArr5;
        C3199af afVar2 = new C3199af(iArr7, crVarArr, iArr5, iArr4, new C3107cr((C2652bn[]) C2612ak.m6965ao(bnVarArr[length], iArr3[length])));
        C3195ab abVar = (C3195ab) akVar;
        synchronized (abVar.f9598c) {
            qVar = ((C3195ab) akVar).f9600e;
            if (qVar.f9683K && C2612ak.f7249a >= 32 && (uVar = ((C3195ab) akVar).f9601f) != null) {
                Looper myLooper = Looper.myLooper();
                C2601a.m6829a(myLooper);
                if (uVar.f9694d == null && uVar.f9693c == null) {
                    uVar.f9694d = new C3224t((C3195ab) akVar);
                    uVar.f9693c = new Handler(myLooper);
                    Spatializer spatializer = uVar.f9691a;
                    Handler handler = uVar.f9693c;
                    Objects.requireNonNull(handler);
                    spatializer.addOnSpatializerStateChangedListener(new C3223s(handler), uVar.f9694d);
                }
            }
        }
        int i14 = afVar2.f9605a;
        C3196ac[] acVarArr = new C3196ac[i14];
        int i15 = 2;
        Pair g = C3195ab.m9360g(2, afVar2, iArr4, new C3212h(qVar, iArr8), C3213i.f9639a);
        if (g != null) {
            acVarArr[((Integer) g.second).intValue()] = (C3196ac) g.first;
        }
        int i16 = 0;
        while (true) {
            if (i16 < afVar2.f9605a) {
                if (afVar2.f9606b[i16] == 2 && afVar2.f9607c[i16].f9109b > 0) {
                    z = true;
                    break;
                }
                i16++;
            } else {
                z = false;
                break;
            }
        }
        Pair g2 = C3195ab.m9360g(1, afVar2, iArr4, new C3210f(abVar, qVar, z), C3211g.f9636a);
        if (g2 != null) {
            acVarArr[((Integer) g2.second).intValue()] = (C3196ac) g2.first;
        }
        if (g2 == null) {
            str = null;
        } else {
            str = ((C3196ac) g2.first).f9603a.f7357d[((C3196ac) g2.first).f9604b[0]].f7487e;
        }
        int i17 = 3;
        Pair g3 = C3195ab.m9360g(3, afVar2, iArr4, new C3214j(qVar, str), C3215k.f9642a);
        if (g3 != null) {
            acVarArr[((Integer) g3.second).intValue()] = (C3196ac) g3.first;
        }
        int i18 = 0;
        while (i18 < i14) {
            int i19 = afVar2.f9606b[i18];
            if (!(i19 == i15 || i19 == 1 || i19 == i17)) {
                C3107cr crVar4 = afVar2.f9607c[i18];
                int[][] iArr9 = iArr4[i18];
                int i20 = 0;
                C2652bn bnVar2 = null;
                C3219o oVar = null;
                for (int i21 = 0; i21 < crVar4.f9109b; i21++) {
                    C2652bn b2 = crVar4.mo7097b(i21);
                    int[] iArr10 = iArr9[i21];
                    int i22 = 0;
                    while (i22 < b2.f7354a) {
                        int i23 = iArr10[i22];
                        C3107cr crVar5 = crVar4;
                        if (C3195ab.m9359f(i23, qVar.f9684L)) {
                            bnVar = b2;
                            C3219o oVar2 = new C3219o(b2.f7357d[i22], i23);
                            if (oVar == null || oVar2.compareTo(oVar) > 0) {
                                oVar = oVar2;
                                i20 = i22;
                                bnVar2 = bnVar;
                            }
                        } else {
                            bnVar = b2;
                        }
                        i22++;
                        crVar4 = crVar5;
                        b2 = bnVar;
                    }
                    C3107cr crVar6 = crVar4;
                }
                if (bnVar2 == null) {
                    acVar = null;
                } else {
                    acVar = new C3196ac(bnVar2, new int[]{i20});
                }
                acVarArr[i18] = acVar;
            }
            i18++;
            i15 = 2;
            i17 = 3;
        }
        int i24 = afVar2.f9605a;
        HashMap hashMap = new HashMap();
        for (int i25 = 0; i25 < i24; i25++) {
            C3195ab.m9361h(afVar2.f9607c[i25], qVar);
        }
        C3195ab.m9361h(afVar2.f9610f, qVar);
        int i26 = 0;
        while (i26 < i24) {
            if (((C2653bo) hashMap.get(Integer.valueOf(afVar2.f9606b[i26]))) == null) {
                i26++;
            } else {
                throw null;
            }
        }
        int i27 = afVar2.f9605a;
        for (int i28 = 0; i28 < i27; i28++) {
            C3107cr crVar7 = afVar2.f9607c[i28];
            Map map = (Map) qVar.f9687O.get(i28);
            if (map != null && map.containsKey(crVar7)) {
                Map map2 = (Map) qVar.f9687O.get(i28);
                if ((map2 != null ? (C3222r) map2.get(crVar7) : null) == null) {
                    acVarArr[i28] = null;
                } else {
                    throw null;
                }
            }
        }
        for (int i29 = 0; i29 < i14; i29++) {
            int i30 = afVar2.f9606b[i29];
            if (qVar.f9688P.get(i29) || qVar.f7400z.contains(Integer.valueOf(i30))) {
                acVarArr[i29] = null;
            }
        }
        C3240f fVar3 = akVar.f9612i;
        C2601a.m6829a(fVar3);
        ArrayList arrayList = new ArrayList();
        for (int i31 = 0; i31 < i14; i31++) {
            C3196ac acVar2 = acVarArr[i31];
            if (acVar2 == null || acVar2.f9604b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C58480gp e = C58485gu.m89837e();
                e.mo55395g(new C3193a(0, 0));
                arrayList.add(e);
            }
        }
        long[][] jArr = new long[i14][];
        for (int i32 = 0; i32 < i14; i32++) {
            C3196ac acVar3 = acVarArr[i32];
            if (acVar3 == null) {
                jArr[i32] = new long[0];
            } else {
                jArr[i32] = new long[acVar3.f9604b.length];
                int i33 = 0;
                while (true) {
                    int[] iArr11 = acVar3.f9604b;
                    if (i33 >= iArr11.length) {
                        break;
                    }
                    jArr[i32][i33] = (long) acVar3.f9603a.f7357d[iArr11[i33]].f7492j;
                    i33++;
                }
                Arrays.sort(jArr[i32]);
            }
        }
        int[] iArr12 = new int[i14];
        long[] jArr2 = new long[i14];
        for (int i34 = 0; i34 < i14; i34++) {
            long[] jArr3 = jArr[i34];
            jArr2[i34] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        C3206b.m9391t(arrayList, jArr2);
        C58585km a = new C58677nx(new C58673nt(C58701ou.f156429a)).mo55746a();
        int i35 = 0;
        while (i35 < i14) {
            int length8 = jArr[i35].length;
            if (length8 <= 1) {
                fVar2 = fVar3;
                afVar = afVar2;
            } else {
                double[] dArr = new double[length8];
                int i36 = 0;
                while (true) {
                    long[] jArr4 = jArr[i35];
                    int length9 = jArr4.length;
                    double d2 = C59203do.f157270a;
                    if (i36 >= length9) {
                        break;
                    }
                    C3240f fVar4 = fVar3;
                    C3199af afVar3 = afVar2;
                    long j = jArr4[i36];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i36] = d2;
                    i36++;
                    afVar2 = afVar3;
                    fVar3 = fVar4;
                }
                fVar2 = fVar3;
                afVar = afVar2;
                int i37 = length8 - 1;
                double d3 = dArr[i37] - dArr[0];
                int i38 = 0;
                while (i38 < i37) {
                    int i39 = i38 + 1;
                    double d4 = (dArr[i38] + dArr[i39]) * 0.5d;
                    if (d3 == C59203do.f157270a) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[0]) / d3;
                    }
                    a.mo54920x(Double.valueOf(d), Integer.valueOf(i35));
                    i38 = i39;
                    d3 = d3;
                }
            }
            i35++;
            afVar2 = afVar;
            fVar3 = fVar2;
        }
        C3240f fVar5 = fVar3;
        C3199af afVar4 = afVar2;
        C58485gu j2 = C58485gu.m89842j(a.mo54949B());
        for (int i40 = 0; i40 < j2.size(); i40++) {
            int intValue = ((Integer) j2.get(i40)).intValue();
            int i41 = iArr12[intValue] + 1;
            iArr12[intValue] = i41;
            jArr2[intValue] = jArr[intValue][i41];
            C3206b.m9391t(arrayList, jArr2);
        }
        for (int i42 = 0; i42 < i14; i42++) {
            if (arrayList.get(i42) != null) {
                long j3 = jArr2[i42];
                jArr2[i42] = j3 + j3;
            }
        }
        C3206b.m9391t(arrayList, jArr2);
        C58480gp e2 = C58485gu.m89837e();
        for (int i43 = 0; i43 < arrayList.size(); i43++) {
            C58480gp gpVar = (C58480gp) arrayList.get(i43);
            e2.mo55395g(gpVar == null ? C58485gu.m89845m() : gpVar.mo55394f());
        }
        C58485gu f2 = e2.mo55394f();
        C3197ad[] adVarArr = new C3197ad[i14];
        int i44 = 0;
        while (i44 < i14) {
            C3196ac acVar4 = acVarArr[i44];
            if (acVar4 == null || (length2 = iArr.length) == 0) {
                fVar = fVar5;
            } else {
                if (length2 == 1) {
                    adVar = new C3198ae(acVar4.f9603a, (iArr = acVar4.f9604b)[0]);
                    fVar = fVar5;
                } else {
                    fVar = fVar5;
                    adVar = new C3206b(acVar4.f9603a, iArr, fVar, (C58485gu) f2.get(i44));
                }
                adVarArr[i44] = adVar;
            }
            i44++;
            fVar5 = fVar;
        }
        C2895cx[] cxVarArr = new C2895cx[i14];
        for (int i45 = 0; i45 < i14; i45++) {
            cxVarArr[i45] = (qVar.f9688P.get(i45) || qVar.f7400z.contains(Integer.valueOf(afVar4.f9606b[i45])) || (afVar4.f9606b[i45] != -2 && adVarArr[i45] == null)) ? null : C2895cx.f8201a;
        }
        boolean z5 = qVar.f9685M;
        Pair create = Pair.create(cxVarArr, adVarArr);
        C3201ah[] ahVarArr = (C3201ah[]) create.second;
        List[] listArr = new List[ahVarArr.length];
        for (int i46 = 0; i46 < ahVarArr.length; i46++) {
            C3201ah ahVar = ahVarArr[i46];
            listArr[i46] = ahVar != null ? C58485gu.m89846n(ahVar) : C58485gu.m89845m();
        }
        int i47 = 4;
        C58480gp gpVar2 = new C58480gp(4);
        int i48 = 0;
        while (i48 < afVar4.f9605a) {
            C3107cr crVar8 = afVar4.f9607c[i48];
            List list = listArr[i48];
            int i49 = 0;
            while (i49 < crVar8.f9109b) {
                C2652bn b3 = crVar8.mo7097b(i49);
                int i50 = afVar4.f9607c[i48].mo7097b(i49).f7354a;
                int[] iArr13 = new int[i50];
                int i51 = 0;
                for (int i52 = 0; i52 < i50; i52++) {
                    if ((afVar4.f9609e[i48][i49][i52] & 7) == i47) {
                        iArr13[i51] = i52;
                        i51++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr13, i51);
                String str2 = null;
                int i53 = 0;
                boolean z6 = false;
                int i54 = 0;
                int i55 = 16;
                while (i53 < copyOf.length) {
                    List[] listArr2 = listArr;
                    String str3 = afVar4.f9607c[i48].mo7097b(i49).f7357d[copyOf[i53]].f7496n;
                    int i56 = i54 + 1;
                    if (i54 != 0) {
                        z6 = (!C2612ak.m6951aa(str2, str3)) | z6;
                    } else {
                        str2 = str3;
                    }
                    i55 = Math.min(i55, afVar4.f9609e[i48][i49][i53] & 24);
                    i53++;
                    i54 = i56;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                if (z6) {
                    i55 = Math.min(i55, afVar4.f9608d[i48]);
                }
                boolean z7 = i55 != 0;
                int i57 = b3.f7354a;
                int[] iArr14 = new int[i57];
                boolean[] zArr = new boolean[i57];
                for (int i58 = 0; i58 < b3.f7354a; i58++) {
                    iArr14[i58] = afVar4.f9609e[i48][i49][i58] & 7;
                    int i59 = 0;
                    while (true) {
                        if (i59 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        C3201ah ahVar2 = (C3201ah) list.get(i59);
                        if (ahVar2.mo7035m().equals(b3) && ahVar2.mo7029h(i58) != -1) {
                            z2 = true;
                            break;
                        }
                        i59++;
                    }
                    zArr[i58] = z2;
                }
                gpVar2.mo55395g(new C2656br(b3, z7, iArr14, zArr));
                i49++;
                listArr = listArr3;
                i47 = 4;
            }
            List[] listArr4 = listArr;
            i48++;
            i47 = 4;
        }
        C3107cr crVar9 = afVar4.f9610f;
        for (int i60 = 0; i60 < crVar9.f9109b; i60++) {
            C2652bn b4 = crVar9.mo7097b(i60);
            int[] iArr15 = new int[b4.f7354a];
            Arrays.fill(iArr15, 0);
            gpVar2.mo55395g(new C2656br(b4, false, iArr15, new boolean[b4.f7354a]));
        }
        C3205al alVar = new C3205al((C2895cx[]) create.first, (C3197ad[]) create.second, new C2657bs(gpVar2.mo55394f()), afVar4);
        for (C3197ad adVar2 : alVar.f9615c) {
            float f3 = f;
            if (adVar2 != null) {
                adVar2.mo7038p(f3);
            }
        }
        return alVar;
    }
}
