package com.google.p4272br;

import java.util.Arrays;

/* renamed from: com.google.br.d */
/* compiled from: PG */
final class C56435d {

    /* renamed from: a */
    public static final /* synthetic */ int f150730a = 0;

    /* renamed from: b */
    private static final int[] f150731b = {0, 9, 11, 1114111};

    /* renamed from: c */
    private static final int[] f150732c = {0, 1114111};

    /* renamed from: a */
    public static final C56434c m88123a(C56455x xVar, C56451t tVar) {
        int i;
        int i2 = xVar.f150800j;
        int i3 = i2 - 1;
        C56434c cVar = null;
        if (i2 != 0) {
            boolean z = true;
            int i4 = 0;
            switch (i3) {
                case 0:
                    return new C56434c(0, 0);
                case 1:
                    return m88128f(tVar);
                case 2:
                    if (r1 == 0) {
                        return m88128f(tVar);
                    }
                    for (int i5 : xVar.f150794d) {
                        C56434c g = m88129g(new int[]{i5}, xVar.f150792b, tVar);
                        if (cVar == null) {
                            cVar = g;
                        } else {
                            cVar = m88126d(cVar, g, tVar);
                        }
                    }
                    return cVar;
                case 3:
                    return m88129g(xVar.f150794d, xVar.f150792b, tVar);
                case 4:
                    return m88129g(f150731b, 0, tVar);
                case 5:
                    return m88129g(f150732c, 0, tVar);
                case 6:
                    return m88127e(1, tVar);
                case 7:
                    return m88127e(2, tVar);
                case 8:
                    return m88127e(4, tVar);
                case 9:
                    return m88127e(8, tVar);
                case 10:
                    return m88127e(16, tVar);
                case 11:
                    return m88127e(32, tVar);
                case 12:
                    int i6 = xVar.f150797g;
                    C56434c c = m88125c(i6 + i6, tVar);
                    C56434c a = m88123a(xVar.f150793c[0], tVar);
                    int i7 = xVar.f150797g;
                    return m88126d(m88126d(c, a, tVar), m88125c((i7 + i7) | 1, tVar), tVar);
                case 13:
                    C56434c a2 = m88123a(xVar.f150793c[0], tVar);
                    if ((xVar.f150792b & 32) == 0) {
                        z = false;
                    }
                    return m88130h(a2, z, tVar);
                case 14:
                    C56434c a3 = m88123a(xVar.f150793c[0], tVar);
                    if ((xVar.f150792b & 32) == 0) {
                        z = false;
                    }
                    return new C56434c(a3.f150728a, m88130h(a3, z, tVar).f150729b);
                case 15:
                    C56434c a4 = m88123a(xVar.f150793c[0], tVar);
                    int i8 = xVar.f150792b;
                    C56434c b = m88124b(1, tVar);
                    int i9 = b.f150728a;
                    C56436e eVar = tVar.f150779a[i9];
                    if ((i8 & 32) != 0) {
                        eVar.f150735c = a4.f150728a;
                        i = i9 + i9;
                        b.f150729b = i;
                    } else {
                        eVar.f150734b = a4.f150728a;
                        i = (i9 + i9) | 1;
                        b.f150729b = i;
                    }
                    b.f150729b = tVar.mo54414a(i, a4.f150729b);
                    return b;
                case 17:
                    C56455x[] xVarArr = xVar.f150793c;
                    int length = xVarArr.length;
                    if (length == 0) {
                        return m88128f(tVar);
                    }
                    while (i4 < length) {
                        C56434c a5 = m88123a(xVarArr[i4], tVar);
                        if (cVar != null) {
                            a5 = m88126d(cVar, a5, tVar);
                        }
                        cVar = a5;
                        i4++;
                    }
                    return cVar;
                case 18:
                    C56455x[] xVarArr2 = xVar.f150793c;
                    int length2 = xVarArr2.length;
                    if (length2 == 0) {
                        return m88128f(tVar);
                    }
                    while (i4 < length2) {
                        C56434c a6 = m88123a(xVarArr2[i4], tVar);
                        if (cVar == null || cVar.f150728a == 0) {
                            cVar = a6;
                        } else if (a6.f150728a != 0) {
                            C56434c b2 = m88124b(1, tVar);
                            C56436e eVar2 = tVar.f150779a[b2.f150728a];
                            eVar2.f150734b = cVar.f150728a;
                            eVar2.f150735c = a6.f150728a;
                            b2.f150729b = tVar.mo54414a(cVar.f150729b, a6.f150729b);
                            cVar = b2;
                        }
                        i4++;
                    }
                    return cVar;
                default:
                    throw new IllegalStateException("regexp: unhandled case in compile");
            }
        } else {
            throw null;
        }
    }

    /* renamed from: b */
    public static final C56434c m88124b(int i, C56451t tVar) {
        int i2 = tVar.f150780b;
        C56436e[] eVarArr = tVar.f150779a;
        int length = eVarArr.length;
        if (i2 >= length) {
            tVar.f150779a = (C56436e[]) Arrays.copyOf(eVarArr, length + length);
        }
        C56436e[] eVarArr2 = tVar.f150779a;
        int i3 = tVar.f150780b;
        eVarArr2[i3] = new C56436e(i);
        int i4 = i3 + 1;
        tVar.f150780b = i4;
        return new C56434c(i4 - 1, 0);
    }

    /* renamed from: c */
    private static final C56434c m88125c(int i, C56451t tVar) {
        C56434c b = m88124b(3, tVar);
        int i2 = b.f150728a;
        b.f150729b = i2 + i2;
        tVar.f150779a[i2].f150735c = i;
        int i3 = i + 1;
        if (tVar.f150782d < i3) {
            tVar.f150782d = i3;
        }
        return b;
    }

    /* renamed from: d */
    private static final C56434c m88126d(C56434c cVar, C56434c cVar2, C56451t tVar) {
        int i;
        if (cVar.f150728a == 0 || (i = cVar2.f150728a) == 0) {
            return new C56434c(0, 0);
        }
        tVar.mo54416c(cVar.f150729b, i);
        return new C56434c(cVar.f150728a, cVar2.f150729b);
    }

    /* renamed from: e */
    private static final C56434c m88127e(int i, C56451t tVar) {
        C56434c b = m88124b(4, tVar);
        int i2 = b.f150728a;
        tVar.f150779a[i2].f150735c = i;
        b.f150729b = i2 + i2;
        return b;
    }

    /* renamed from: f */
    private static final C56434c m88128f(C56451t tVar) {
        C56434c b = m88124b(7, tVar);
        int i = b.f150728a;
        b.f150729b = i + i;
        return b;
    }

    /* renamed from: g */
    private static final C56434c m88129g(int[] iArr, int i, C56451t tVar) {
        C56434c b = m88124b(8, tVar);
        C56436e eVar = tVar.f150779a[b.f150728a];
        eVar.f150736d = iArr;
        int i2 = i & 1;
        int length = iArr.length;
        if (length == 1) {
            if (C56457z.m88193a(iArr[0]) == iArr[0]) {
                i2 = 0;
            }
            length = 1;
        } else {
            i2 = 0;
        }
        eVar.f150735c = i2;
        int i3 = b.f150728a;
        b.f150729b = i3 + i3;
        if ((i2 == 0 && length == 1) || (length == 2 && iArr[0] == iArr[1])) {
            eVar.f150733a = 9;
        } else if (length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            eVar.f150733a = 10;
        } else if (length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            eVar.f150733a = 11;
        }
        return b;
    }

    /* renamed from: h */
    private static final C56434c m88130h(C56434c cVar, boolean z, C56451t tVar) {
        C56434c b = m88124b(1, tVar);
        int i = b.f150728a;
        C56436e eVar = tVar.f150779a[i];
        if (z) {
            eVar.f150735c = cVar.f150728a;
            b.f150729b = i + i;
        } else {
            eVar.f150734b = cVar.f150728a;
            b.f150729b = (i + i) | 1;
        }
        tVar.mo54416c(cVar.f150729b, i);
        return b;
    }
}
