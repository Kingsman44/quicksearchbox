package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wj */
/* compiled from: PG */
final class C7389wj implements C7320tv, C7355vc, C7375vw {

    /* renamed from: b */
    private static final Pattern f24158b = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: c */
    private static final Pattern f24159c = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a */
    final int f24160a;

    /* renamed from: d */
    private final adh f24161d;

    /* renamed from: e */
    private final C7036jh f24162e;

    /* renamed from: f */
    private final long f24163f;

    /* renamed from: g */
    private final adb f24164g;

    /* renamed from: h */
    private final C7362vj f24165h;

    /* renamed from: i */
    private final C7388wi[] f24166i;

    /* renamed from: j */
    private final C7414xh f24167j;

    /* renamed from: k */
    private final IdentityHashMap f24168k = new IdentityHashMap();

    /* renamed from: l */
    private final C7332ug f24169l;

    /* renamed from: m */
    private final C7033je f24170m;

    /* renamed from: n */
    private C7319tu f24171n;

    /* renamed from: o */
    private C7376vx[] f24172o = new C7376vx[0];

    /* renamed from: p */
    private C7410xd[] f24173p = new C7410xd[0];

    /* renamed from: q */
    private C7356vd f24174q = aqd.m19292t(this.f24172o);

    /* renamed from: r */
    private C7416xj f24175r;

    /* renamed from: s */
    private int f24176s;

    /* renamed from: t */
    private List f24177t;

    /* renamed from: u */
    private final C7405wz f24178u;

    /* renamed from: v */
    private final acj f24179v;

    /* renamed from: w */
    private final acc f24180w;

    /* renamed from: x */
    private final aqd f24181x;

    public C7389wj(int i, C7416xj xjVar, int i2, C7405wz wzVar, adh adh, C7036jh jhVar, C7033je jeVar, acj acj, C7332ug ugVar, long j, adb adb, acc acc, aqd aqd, C7412xf xfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        List list;
        int i3;
        int i4;
        boolean[] zArr;
        C6864cy[] cyVarArr;
        C7419xm t;
        C7416xj xjVar2 = xjVar;
        C7036jh jhVar2 = jhVar;
        acc acc2 = acc;
        this.f24160a = i;
        this.f24175r = xjVar2;
        this.f24176s = i2;
        this.f24178u = wzVar;
        this.f24161d = adh;
        this.f24162e = jhVar2;
        this.f24170m = jeVar;
        this.f24179v = acj;
        this.f24169l = ugVar;
        this.f24163f = j;
        this.f24164g = adb;
        this.f24180w = acc2;
        this.f24181x = aqd;
        this.f24167j = new C7414xh(xjVar2, xfVar, acc2);
        int i5 = 0;
        C7421xo c = xjVar.mo16762c(i2);
        this.f24177t = c.f24330d;
        List list2 = c.f24329c;
        List list3 = this.f24177t;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(((C7415xi) list2.get(i6)).f24289a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            C7415xi xiVar = (C7415xi) list2.get(i7);
            C7419xm s = m22264s(xiVar.f24293e);
            s = s == null ? m22264s(xiVar.f24294f) : s;
            int i8 = (s == null || (i8 = sparseIntArray.get(Integer.parseInt(s.f24321b), -1)) == -1) ? i7 : i8;
            if (i8 == i7 && (t = m22265t(xiVar.f24294f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String parseInt : aeu.m18556z(t.f24321b, ",")) {
                    int i9 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i9 != -1) {
                        i8 = Math.min(i8, i9);
                    }
                }
            }
            if (i8 != i7) {
                List list4 = (List) sparseArray.get(i7);
                List list5 = (List) sparseArray.get(i8);
                list5.addAll(list4);
                sparseArray.put(i7, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] m = aqd.m19285m((Collection) arrayList.get(i10));
            iArr[i10] = m;
            Arrays.sort(m);
        }
        boolean[] zArr2 = new boolean[size2];
        C6864cy[][] cyVarArr2 = new C6864cy[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr2 = iArr[i11];
            int length = iArr2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List list6 = ((C7415xi) list2.get(iArr2[i13])).f24291c;
                while (i5 < list6.size()) {
                    if (!((C7426xt) list6.get(i5)).f24347e.isEmpty()) {
                        zArr2[i11] = true;
                        i12++;
                        break;
                    }
                    i5++;
                }
                i13++;
                i5 = 0;
            }
            int[] iArr3 = iArr[i11];
            int length2 = iArr3.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    cyVarArr = new C6864cy[0];
                    break;
                }
                int i15 = iArr3[i14];
                C7415xi xiVar2 = (C7415xi) list2.get(i15);
                List list7 = ((C7415xi) list2.get(i15)).f24292d;
                int[] iArr4 = iArr3;
                int i16 = 0;
                while (i16 < list7.size()) {
                    C7419xm xmVar = (C7419xm) list7.get(i16);
                    int i17 = length2;
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(xmVar.f24320a)) {
                        C6863cx cxVar = new C6863cx();
                        cxVar.mo15630ae("application/cea-608");
                        int i18 = xiVar2.f24289a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i18);
                        sb.append(":cea608");
                        cxVar.mo15617S(sb.toString());
                        cyVarArr = m22266u(xmVar, f24158b, cxVar.mo15625a());
                        break;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(xmVar.f24320a)) {
                        C6863cx cxVar2 = new C6863cx();
                        cxVar2.mo15630ae("application/cea-708");
                        int i19 = xiVar2.f24289a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i19);
                        sb2.append(":cea708");
                        cxVar2.mo15617S(sb2.toString());
                        cyVarArr = m22266u(xmVar, f24159c, cxVar2.mo15625a());
                        break;
                    } else {
                        i16++;
                        length2 = i17;
                        list7 = list8;
                    }
                }
                int i20 = length2;
                i14++;
                iArr3 = iArr4;
            }
            cyVarArr2[i11] = cyVarArr;
            if (cyVarArr.length != 0) {
                i12++;
            }
            i11++;
            i5 = 0;
        }
        int size3 = i12 + size2 + list3.size();
        C7360vh[] vhVarArr = new C7360vh[size3];
        C7388wi[] wiVarArr = new C7388wi[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr5 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length3) {
                arrayList3.addAll(((C7415xi) list2.get(iArr5[i24])).f24291c);
                i24++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            C6864cy[] cyVarArr3 = new C6864cy[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                C6864cy cyVar = ((C7426xt) arrayList3.get(i25)).f24344b;
                cyVarArr3[i25] = cyVar.mo15638c(jhVar2.mo16069a(cyVar));
                i25++;
                size4 = i26;
                arrayList3 = arrayList3;
            }
            C7415xi xiVar3 = (C7415xi) list2.get(iArr5[0]);
            int i27 = i22 + 1;
            if (zArr2[i21]) {
                list = list2;
                i3 = i27;
                i27++;
            } else {
                list = list2;
                i3 = -1;
            }
            if (cyVarArr2[i21].length != 0) {
                int i28 = i27;
                i27++;
                i4 = i28;
            } else {
                i4 = -1;
            }
            vhVarArr[i22] = new C7360vh(cyVarArr3);
            wiVarArr[i22] = C7388wi.m22259a(xiVar3.f24290b, iArr5, i22, i3, i4);
            int i29 = -1;
            if (i3 != -1) {
                C6863cx cxVar3 = new C6863cx();
                int i30 = xiVar3.f24289a;
                zArr = zArr2;
                StringBuilder sb3 = new StringBuilder(16);
                sb3.append(i30);
                sb3.append(":emsg");
                cxVar3.mo15617S(sb3.toString());
                cxVar3.mo15630ae("application/x-emsg");
                vhVarArr[i3] = new C7360vh(cxVar3.mo15625a());
                wiVarArr[i3] = C7388wi.m22260b(iArr5, i22);
                i29 = -1;
            } else {
                zArr = zArr2;
            }
            if (i4 != i29) {
                vhVarArr[i4] = new C7360vh(cyVarArr2[i21]);
                wiVarArr[i4] = C7388wi.m22261c(iArr5, i22);
            }
            i21++;
            size2 = i23;
            iArr = iArr6;
            jhVar2 = jhVar;
            zArr2 = zArr;
            i22 = i27;
            list2 = list;
        }
        int i31 = 0;
        while (i31 < list3.size()) {
            C6863cx cxVar4 = new C6863cx();
            cxVar4.mo15617S(((C7420xn) list3.get(i31)).mo16773a());
            cxVar4.mo15630ae("application/x-emsg");
            vhVarArr[i22] = new C7360vh(cxVar4.mo15625a());
            wiVarArr[i22] = C7388wi.m22262d(i31);
            i31++;
            i22++;
        }
        Pair create = Pair.create(new C7362vj(vhVarArr), wiVarArr);
        this.f24165h = (C7362vj) create.first;
        this.f24166i = (C7388wi[]) create.second;
    }

    /* renamed from: r */
    private final int m22263r(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f24166i[i2].f24155e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f24166i[i5].f24153c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: s */
    private static C7419xm m22264s(List list) {
        return m22265t(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: t */
    private static C7419xm m22265t(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C7419xm xmVar = (C7419xm) list.get(i);
            if (str.equals(xmVar.f24320a)) {
                return xmVar;
            }
        }
        return null;
    }

    /* renamed from: u */
    private static C6864cy[] m22266u(C7419xm xmVar, Pattern pattern, C6864cy cyVar) {
        String str = xmVar.f24321b;
        if (str == null) {
            return new C6864cy[]{cyVar};
        }
        String[] z = aeu.m18556z(str, ";");
        C6864cy[] cyVarArr = new C6864cy[z.length];
        for (int i = 0; i < z.length; i++) {
            Matcher matcher = pattern.matcher(z[i]);
            if (!matcher.matches()) {
                return new C6864cy[]{cyVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C6863cx a = cyVar.mo15636a();
            String str2 = cyVar.f21801a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            a.mo15617S(sb.toString());
            a.mo15604F(parseInt);
            a.mo15620V(matcher.group(2));
            cyVarArr[i] = a.mo15625a();
        }
        return cyVarArr;
    }

    /* renamed from: a */
    public final void mo16497a(C7319tu tuVar, long j) {
        this.f24171n = tuVar;
        tuVar.mo15597k(this);
    }

    /* renamed from: b */
    public final void mo16498b() {
        this.f24164g.mo14468a();
    }

    /* renamed from: c */
    public final C7362vj mo16499c() {
        return this.f24165h;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.ads.interactivemedia.v3.internal.wg, com.google.ads.interactivemedia.v3.internal.vy] */
    /* renamed from: d */
    public final long mo16500d(aba[] abaArr, boolean[] zArr, C7354vb[] vbVarArr, boolean[] zArr2, long j) {
        int i;
        int[] iArr;
        int[] iArr2;
        int i2;
        C7354vb[] vbVarArr2;
        int i3;
        C7360vh vhVar;
        C7360vh vhVar2;
        int i4;
        aba[] abaArr2 = abaArr;
        C7354vb[] vbVarArr3 = vbVarArr;
        long j2 = j;
        int[] iArr3 = new int[abaArr2.length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = -1;
            if (i6 >= abaArr2.length) {
                break;
            }
            aba aba = abaArr2[i6];
            if (aba != null) {
                iArr3[i6] = this.f24165h.mo16657b(aba.mo14331k());
            } else {
                iArr3[i6] = -1;
            }
            i6++;
        }
        for (int i7 = 0; i7 < abaArr2.length; i7++) {
            if (abaArr2[i7] == null || !zArr[i7]) {
                C7354vb vbVar = vbVarArr3[i7];
                if (vbVar instanceof C7376vx) {
                    ((C7376vx) vbVar).mo16692p(this);
                } else if (vbVar instanceof C7374vv) {
                    ((C7374vv) vbVar).mo16685a();
                }
                vbVarArr3[i7] = null;
            }
        }
        for (int i8 = 0; i8 < abaArr2.length; i8++) {
            C7354vb vbVar2 = vbVarArr3[i8];
            if ((vbVar2 instanceof C7309tk) || (vbVar2 instanceof C7374vv)) {
                int r = m22263r(i8, iArr3);
                if (r != -1) {
                    C7354vb vbVar3 = vbVarArr3[i8];
                    if ((vbVar3 instanceof C7374vv) && ((C7374vv) vbVar3).f24099a == vbVarArr3[r]) {
                    }
                } else if (vbVarArr3[i8] instanceof C7309tk) {
                }
                C7354vb vbVar4 = vbVarArr3[i8];
                if (vbVar4 instanceof C7374vv) {
                    ((C7374vv) vbVar4).mo16685a();
                }
                vbVarArr3[i8] = null;
            }
        }
        int i9 = 0;
        while (i9 < abaArr2.length) {
            aba aba2 = abaArr2[i9];
            if (aba2 == null) {
                i2 = i9;
                iArr2 = iArr3;
                vbVarArr2 = vbVarArr3;
            } else {
                C7354vb vbVar5 = vbVarArr3[i9];
                if (vbVar5 == null) {
                    zArr2[i9] = true;
                    C7388wi wiVar = this.f24166i[iArr3[i9]];
                    int i10 = wiVar.f24153c;
                    if (i10 == 0) {
                        int i11 = wiVar.f24156f;
                        boolean z = i11 != i;
                        if (z) {
                            vhVar = this.f24165h.mo16656a(i11);
                            i3 = 1;
                        } else {
                            vhVar = null;
                            i3 = 0;
                        }
                        int i12 = wiVar.f24157g;
                        if (i12 != i) {
                            vhVar2 = this.f24165h.mo16656a(i12);
                            i3 += vhVar2.f24048a;
                        } else {
                            vhVar2 = null;
                        }
                        C6864cy[] cyVarArr = new C6864cy[i3];
                        int[] iArr4 = new int[i3];
                        if (z) {
                            cyVarArr[i5] = vhVar.mo16648a(i5);
                            iArr4[i5] = 4;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (i12 != i) {
                            for (int i13 = 0; i13 < vhVar2.f24048a; i13++) {
                                C6864cy a = vhVar2.mo16648a(i13);
                                cyVarArr[i4] = a;
                                iArr4[i4] = 3;
                                arrayList.add(a);
                                i4++;
                            }
                        }
                        C7413xg e = (!this.f24175r.f24298d || !z) ? null : this.f24167j.mo16758e();
                        i2 = i9;
                        C7413xg xgVar = e;
                        iArr2 = iArr3;
                        C7354vb vbVar6 = r1;
                        C7376vx vxVar = new C7376vx(wiVar.f24152b, iArr4, cyVarArr, this.f24178u.mo16738a(this.f24164g, this.f24175r, this.f24176s, wiVar.f24151a, aba2, wiVar.f24152b, this.f24163f, z, arrayList, e, this.f24161d), this, this.f24180w, j, this.f24162e, this.f24170m, this.f24179v, this.f24169l);
                        synchronized (this) {
                            this.f24168k.put(vbVar6, xgVar);
                        }
                        vbVarArr2 = vbVarArr;
                        vbVarArr2[i2] = vbVar6;
                    } else {
                        i2 = i9;
                        iArr2 = iArr3;
                        vbVarArr2 = vbVarArr3;
                        if (i10 == 2) {
                            vbVarArr2[i2] = new C7410xd((C7420xn) this.f24177t.get(wiVar.f24154d), aba2.mo14331k().mo16648a(0), this.f24175r.f24298d);
                        }
                    }
                } else {
                    i2 = i9;
                    iArr2 = iArr3;
                    vbVarArr2 = vbVarArr3;
                    if (vbVar5 instanceof C7376vx) {
                        ((C7376vx) vbVar5).mo16689i().mo16713j(aba2);
                    }
                }
                i9 = i2 + 1;
                long j3 = j;
                vbVarArr3 = vbVarArr2;
                iArr3 = iArr2;
                i = -1;
                i5 = 0;
                abaArr2 = abaArr;
            }
            i9 = i2 + 1;
            long j32 = j;
            vbVarArr3 = vbVarArr2;
            iArr3 = iArr2;
            i = -1;
            i5 = 0;
            abaArr2 = abaArr;
        }
        int[] iArr5 = iArr3;
        C7354vb[] vbVarArr4 = vbVarArr3;
        aba[] abaArr3 = abaArr;
        int i14 = 0;
        while (i14 < abaArr3.length) {
            if (vbVarArr4[i14] != null || abaArr3[i14] == null) {
                long j4 = j;
                iArr = iArr5;
            } else {
                iArr = iArr5;
                C7388wi wiVar2 = this.f24166i[iArr[i14]];
                if (wiVar2.f24153c == 1) {
                    int r2 = m22263r(i14, iArr);
                    if (r2 == -1) {
                        vbVarArr4[i14] = new C7309tk();
                        long j5 = j;
                    } else {
                        vbVarArr4[i14] = ((C7376vx) vbVarArr4[r2]).mo16688g(j, wiVar2.f24152b);
                    }
                    i14++;
                    iArr5 = iArr;
                } else {
                    long j6 = j;
                }
            }
            i14++;
            iArr5 = iArr;
        }
        long j7 = j;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C7354vb vbVar7 : vbVarArr4) {
            if (vbVar7 instanceof C7376vx) {
                arrayList2.add((C7376vx) vbVar7);
            } else if (vbVar7 instanceof C7410xd) {
                arrayList3.add((C7410xd) vbVar7);
            }
        }
        C7376vx[] vxVarArr = new C7376vx[arrayList2.size()];
        this.f24172o = vxVarArr;
        arrayList2.toArray(vxVarArr);
        C7410xd[] xdVarArr = new C7410xd[arrayList3.size()];
        this.f24173p = xdVarArr;
        arrayList3.toArray(xdVarArr);
        this.f24174q = aqd.m19292t(this.f24172o);
        return j7;
    }

    /* renamed from: e */
    public final void mo16501e(long j, boolean z) {
        for (C7376vx a : this.f24172o) {
            a.mo16687a(j, false);
        }
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        this.f24174q.mo16502f(j);
    }

    /* renamed from: g */
    public final long mo16503g() {
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long mo16504h() {
        return this.f24174q.mo16504h();
    }

    /* renamed from: i */
    public final long mo16505i(long j) {
        for (C7376vx k : this.f24172o) {
            k.mo16691k(j);
        }
        for (C7410xd g : this.f24173p) {
            g.mo16752g(j);
        }
        return j;
    }

    /* renamed from: j */
    public final long mo16506j(long j, C6900eg egVar) {
        for (C7376vx vxVar : this.f24172o) {
            if (vxVar.f24104a == 2) {
                return vxVar.mo16690j(j, egVar);
            }
        }
        return j;
    }

    /* renamed from: k */
    public final synchronized void mo16686k(C7376vx vxVar) {
        C7413xg xgVar = (C7413xg) this.f24168k.remove(vxVar);
        if (xgVar != null) {
            xgVar.mo16753g();
        }
    }

    /* renamed from: l */
    public final long mo16507l() {
        return this.f24174q.mo16507l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo15598m(C7356vd vdVar) {
        this.f24171n.mo15598m(this);
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        return this.f24174q.mo16508n(j);
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        return this.f24174q.mo16509o();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.ads.interactivemedia.v3.internal.wg, com.google.ads.interactivemedia.v3.internal.vy] */
    /* renamed from: p */
    public final void mo16714p(C7416xj xjVar, int i) {
        this.f24175r = xjVar;
        this.f24176s = i;
        this.f24167j.mo16754a(xjVar);
        C7376vx[] vxVarArr = this.f24172o;
        if (vxVarArr != null) {
            for (C7376vx i2 : vxVarArr) {
                i2.mo16689i().mo16712i(xjVar, i);
            }
            this.f24171n.mo15598m(this);
        }
        this.f24177t = xjVar.mo16762c(i).f24330d;
        for (C7410xd xdVar : this.f24173p) {
            Iterator it = this.f24177t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7420xn xnVar = (C7420xn) it.next();
                if (xnVar.mo16773a().equals(xdVar.mo16750a())) {
                    xdVar.mo16751f(xnVar, xjVar.f24298d && i == xjVar.mo16761b() + -1);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo16715q() {
        this.f24167j.mo16759f();
        for (C7376vx p : this.f24172o) {
            p.mo16692p(this);
        }
        this.f24171n = null;
    }
}
