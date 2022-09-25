package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abf */
/* compiled from: PG */
public abstract class abf {

    /* renamed from: a */
    private abq f20183a;

    public abf() {
    }

    public abf(byte[] bArr) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Pair mo14369a(aay aay, int[][][] iArr, int[] iArr2);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final abq mo14379g() {
        abq abq = this.f20183a;
        ary.m19467t(abq);
        return abq;
    }

    /* renamed from: h */
    public final void mo14380h(abq abq) {
        this.f20183a = abq;
    }

    /* renamed from: i */
    public abg mo14381i(C6898ee[] eeVarArr, C7362vj vjVar) {
        int length;
        int[] iArr;
        C6898ee[] eeVarArr2 = eeVarArr;
        C7362vj vjVar2 = vjVar;
        int length2 = eeVarArr2.length + 1;
        int[] iArr2 = new int[length2];
        C7360vh[][] vhVarArr = new C7360vh[length2][];
        int[][][] iArr3 = new int[length2][][];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = vjVar2.f24052b;
            vhVarArr[i2] = new C7360vh[i3];
            iArr3[i2] = new int[i3][];
        }
        int length3 = eeVarArr2.length;
        int[] iArr4 = new int[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            iArr4[i4] = eeVarArr2[i4].mo15527s();
        }
        int i5 = 0;
        while (i5 < vjVar2.f24052b) {
            C7360vh a = vjVar2.mo16656a(i5);
            int j = adz.m18358j(a.mo16648a(i).f21812l);
            int length4 = eeVarArr2.length;
            int i6 = 0;
            int i7 = 0;
            boolean z = true;
            while (true) {
                length = eeVarArr2.length;
                if (i6 >= length) {
                    break;
                }
                C6898ee eeVar = eeVarArr2[i6];
                int i8 = 0;
                while (i < a.f24048a) {
                    i8 = Math.max(i8, asn.m19531r(eeVar.mo15784O(a.mo16648a(i))));
                    i++;
                }
                boolean z2 = iArr2[i6] == 0;
                if (i8 > i7) {
                    z = z2;
                    i7 = i8;
                    length4 = i6;
                } else if (i8 == i7 && j == 4 && !z && z2) {
                    i7 = i8;
                    length4 = i6;
                    z = true;
                }
                i6++;
                C7362vj vjVar3 = vjVar;
                i = 0;
            }
            if (length4 == length) {
                iArr = new int[a.f24048a];
            } else {
                C6898ee eeVar2 = eeVarArr2[length4];
                int[] iArr5 = new int[a.f24048a];
                for (int i9 = 0; i9 < a.f24048a; i9++) {
                    iArr5[i9] = eeVar2.mo15784O(a.mo16648a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length4];
            vhVarArr[length4][i10] = a;
            iArr3[length4][i10] = iArr;
            iArr2[length4] = i10 + 1;
            i5++;
            vjVar2 = vjVar;
            i = 0;
        }
        int length5 = eeVarArr2.length;
        C7362vj[] vjVarArr = new C7362vj[length5];
        String[] strArr = new String[length5];
        int[] iArr6 = new int[length5];
        int i11 = 0;
        while (true) {
            int length6 = eeVarArr2.length;
            if (i11 < length6) {
                int i12 = iArr2[i11];
                vjVarArr[i11] = new C7362vj((C7360vh[]) aeu.m18538h(vhVarArr[i11], i12));
                iArr3[i11] = (int[][]) aeu.m18538h(iArr3[i11], i12);
                strArr[i11] = eeVarArr2[i11].mo14620K();
                iArr6[i11] = eeVarArr2[i11].mo15509a();
                i11++;
            } else {
                new C7362vj((C7360vh[]) aeu.m18538h(vhVarArr[length6], iArr2[length6]));
                aay aay = new aay(iArr6, vjVarArr);
                Pair a2 = mo14369a(aay, iArr3, iArr4);
                return new abg((C6899ef[]) a2.first, (aba[]) a2.second, aay);
            }
        }
    }
}
