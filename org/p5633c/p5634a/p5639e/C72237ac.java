package org.p5633c.p5634a.p5639e;

import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72146ad;
import org.p5633c.p5634a.C72152aj;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.e.ac */
/* compiled from: PG */
final class C72237ac implements C72244aj, C72243ai {

    /* renamed from: a */
    public final int f192215a;

    /* renamed from: b */
    private final C72237ac[] f192216b;

    /* renamed from: c */
    private final C72239ae f192217c;

    public C72237ac(int i, C72237ac[] acVarArr) {
        this.f192215a = i;
        this.f192216b = acVarArr;
        this.f192217c = null;
    }

    public C72237ac(C72237ac acVar, C72239ae aeVar) {
        this.f192215a = acVar.f192215a;
        this.f192216b = acVar.f192216b;
        C72239ae aeVar2 = acVar.f192217c;
        this.f192217c = aeVar2 != null ? new C72236ab(aeVar2, aeVar) : aeVar;
    }

    /* renamed from: g */
    private static final int m106530g(String str, int i, int i2) {
        if (i2 >= 10) {
            return Integer.parseInt(str.substring(i, i2 + i));
        }
        boolean z = false;
        if (i2 <= 0) {
            return 0;
        }
        int i3 = i + 1;
        char charAt = str.charAt(i);
        int i4 = i2 - 1;
        if (charAt == '-') {
            i4--;
            if (i4 < 0) {
                return 0;
            }
            char charAt2 = str.charAt(i3);
            i3++;
            charAt = charAt2;
            z = true;
        }
        int i5 = charAt - '0';
        while (true) {
            int i6 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            i5 = (((i5 << 3) + (i5 + i5)) + str.charAt(i3)) - 48;
            i3++;
            i4 = i6;
        }
        return z ? -i5 : i5;
    }

    /* renamed from: a */
    public final int mo63582a(C72152aj ajVar) {
        long e = mo63590e(ajVar);
        if (e == Long.MAX_VALUE) {
            return 0;
        }
        int max = Math.max(C72266w.m106673a(e), 1);
        if (this.f192215a >= 8) {
            max = Math.max(max, e < 0 ? 5 : 4) + 1;
            if (this.f192215a == 9 && Math.abs(e) % 1000 == 0) {
                max -= 4;
            }
            e /= 1000;
        }
        int i = (int) e;
        C72239ae aeVar = this.f192217c;
        return aeVar != null ? max + aeVar.mo63586a(i) : max;
    }

    /* renamed from: b */
    public final int mo63583b(C72152aj ajVar, int i) {
        return mo63590e(ajVar) != Long.MAX_VALUE ? 1 : 0;
    }

    /* renamed from: c */
    public final int mo63584c(C72144ab abVar, String str, int i) {
        boolean z;
        int i2;
        int i3;
        C72239ae aeVar;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt;
        C72144ab abVar2 = abVar;
        String str2 = str;
        int i8 = i;
        if (i8 >= str.length()) {
            return i8;
        }
        C72239ae aeVar2 = this.f192217c;
        int i9 = 1;
        if (aeVar2 != null) {
            i2 = aeVar2.mo63588c(str2, i8);
            if (i2 < 0) {
                return i2 ^ -1;
            }
            z = true;
        } else {
            i2 = -1;
            z = false;
        }
        if (!z && !m106529f(abVar2.f191965a, this.f192215a)) {
            return i8;
        }
        if (i2 > 0) {
            i3 = Math.min(10, i2 - i8);
        } else {
            i3 = Math.min(10, str.length() - i8);
        }
        int i10 = 0;
        int i11 = -1;
        boolean z2 = false;
        while (true) {
            if (i10 >= i3) {
                break;
            }
            char charAt2 = str2.charAt(i8 + i10);
            if (i10 == 0) {
                if (charAt2 != '-') {
                    if (charAt2 == '+') {
                        charAt2 = '+';
                    } else {
                        i10 = 0;
                    }
                }
                if (i3 <= i9 || (charAt = str2.charAt(i7)) < '0' || charAt > '9') {
                    i10 = 0;
                } else {
                    int i12 = charAt2 == '-' ? 1 : 0;
                    if (charAt2 != '-') {
                        i8++;
                    }
                    i3 = Math.min(i3 + 1, str.length() - i8);
                    i10 = i12;
                    i9 = 1;
                }
            }
            if (charAt2 < '0' || charAt2 > '9') {
                if ((charAt2 != '.' && charAt2 != ',') || (((i6 = this.f192215a) != 8 && i6 != 9) || i11 >= 0)) {
                    break;
                }
                i11 = i8 + i10 + 1;
                i3 = Math.min(i3 + 1, str.length() - i8);
            } else {
                z2 = true;
            }
            i10++;
            i9 = 1;
        }
        i10 = 0;
        if (!z2) {
            return i8 ^ -1;
        }
        if (i2 >= 0 && i8 + i10 != i2) {
            return i8;
        }
        int i13 = this.f192215a;
        if (i13 != 8 && i13 != 9) {
            int g = m106530g(str2, i8, i10);
            switch (i13) {
                case 0:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192439d, g);
                    break;
                case 1:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192440e, g);
                    break;
                case 2:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192441f, g);
                    break;
                case 3:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192442g, g);
                    break;
                case 4:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192444i, g);
                    break;
                case 5:
                    abVar2.mo63414f(abVar2.f191966b, C72293q.f192445j, g);
                    break;
                case 6:
                    abVar2.mo63427d(g);
                    break;
                case 7:
                    abVar2.mo63424b(g);
                    break;
            }
        } else if (i11 < 0) {
            abVar2.mo63427d(m106530g(str2, i8, i10));
            abVar2.mo63424b(0);
        } else {
            int g2 = m106530g(str2, i8, (i11 - i8) - 1);
            abVar2.mo63427d(g2);
            int i14 = (i8 + i10) - i11;
            if (i14 <= 0) {
                i4 = 0;
            } else {
                if (i14 >= 3) {
                    i5 = m106530g(str2, i11, 3);
                } else {
                    int g3 = m106530g(str2, i11, i14);
                    i5 = i14 == 1 ? g3 * 100 : g3 * 10;
                }
                i4 = i5;
                if (g2 < 0) {
                    i4 = -i4;
                }
            }
            abVar2.mo63424b(i4);
        }
        int i15 = i8 + i10;
        return (i15 < 0 || (aeVar = this.f192217c) == null) ? i15 : aeVar.mo63587b(str2, i15);
    }

    /* renamed from: d */
    public final void mo63585d(StringBuffer stringBuffer, C72152aj ajVar) {
        long e = mo63590e(ajVar);
        if (e != Long.MAX_VALUE) {
            int i = (int) e;
            if (this.f192215a >= 8) {
                i = (int) (e / 1000);
            }
            int length = stringBuffer.length();
            C72266w.m106677e(stringBuffer, i);
            if (this.f192215a >= 8) {
                int abs = (int) (Math.abs(e) % 1000);
                if (this.f192215a == 8 || abs > 0) {
                    if (e < 0 && e > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    C72266w.m106676d(stringBuffer, abs, 3);
                }
            }
            C72239ae aeVar = this.f192217c;
            if (aeVar != null) {
                aeVar.mo63589d(stringBuffer, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo63590e(C72152aj ajVar) {
        long j;
        int i;
        C72146ad e = ajVar.mo63413e();
        if (e != null && !m106529f(e, this.f192215a)) {
            return Long.MAX_VALUE;
        }
        switch (this.f192215a) {
            case 0:
                i = ajVar.mo63403g(C72293q.f192439d);
                break;
            case 1:
                i = ajVar.mo63403g(C72293q.f192440e);
                break;
            case 2:
                i = ajVar.mo63403g(C72293q.f192441f);
                break;
            case 3:
                i = ajVar.mo63403g(C72293q.f192442g);
                break;
            case 4:
                i = ajVar.mo63403g(C72293q.f192444i);
                break;
            case 5:
                i = ajVar.mo63403g(C72293q.f192445j);
                break;
            case 6:
                i = ajVar.mo63403g(C72293q.f192446k);
                break;
            case 7:
                i = ajVar.mo63403g(C72293q.f192447l);
                break;
            default:
                j = (((long) ajVar.mo63403g(C72293q.f192446k)) * 1000) + ((long) ajVar.mo63403g(C72293q.f192447l));
                break;
        }
        j = (long) i;
        if (j != 0) {
            return j;
        }
        int i2 = ajVar.mo63405i();
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                C72237ac[] acVarArr = this.f192216b;
                int i4 = this.f192215a;
                if (acVarArr[i4] == this) {
                    while (true) {
                        i4++;
                        if (i4 > 9) {
                            return 0;
                        }
                        if (m106529f(e, i4) && this.f192216b[i4] != null) {
                            return Long.MAX_VALUE;
                        }
                    }
                }
            } else if (ajVar.mo63415h(i3) == 0) {
                i3++;
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    static final boolean m106529f(C72146ad adVar, int i) {
        switch (i) {
            case 0:
                return adVar.mo63432f(C72293q.f192439d);
            case 1:
                return adVar.mo63432f(C72293q.f192440e);
            case 2:
                return adVar.mo63432f(C72293q.f192441f);
            case 3:
                return adVar.mo63432f(C72293q.f192442g);
            case 4:
                return adVar.mo63432f(C72293q.f192444i);
            case 5:
                return adVar.mo63432f(C72293q.f192445j);
            case 6:
                return adVar.mo63432f(C72293q.f192446k);
            case 7:
                return adVar.mo63432f(C72293q.f192447l);
            default:
                return adVar.mo63432f(C72293q.f192446k) || adVar.mo63432f(C72293q.f192447l);
        }
    }
}
