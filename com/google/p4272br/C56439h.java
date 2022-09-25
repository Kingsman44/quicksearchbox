package com.google.p4272br;

import java.util.Arrays;

/* renamed from: com.google.br.h */
/* compiled from: PG */
final class C56439h {

    /* renamed from: a */
    public final C56453v f150743a;

    /* renamed from: b */
    public final C56451t f150744b;

    /* renamed from: c */
    public final C56437f f150745c;

    /* renamed from: d */
    public final C56437f f150746d;

    /* renamed from: e */
    public C56438g[] f150747e = new C56438g[10];

    /* renamed from: f */
    public int f150748f;

    /* renamed from: g */
    public boolean f150749g;

    /* renamed from: h */
    public int[] f150750h;

    /* renamed from: i */
    public int f150751i;

    /* renamed from: j */
    C56439h f150752j;

    public C56439h(C56439h hVar) {
        this.f150743a = hVar.f150743a;
        this.f150744b = hVar.f150744b;
        this.f150745c = hVar.f150745c;
        this.f150746d = hVar.f150746d;
        this.f150747e = hVar.f150747e;
        this.f150748f = hVar.f150748f;
        this.f150749g = hVar.f150749g;
        this.f150750h = hVar.f150750h;
        this.f150751i = hVar.f150751i;
    }

    public C56439h(C56453v vVar) {
        C56451t tVar = vVar.f150784b;
        this.f150744b = tVar;
        this.f150743a = vVar;
        this.f150745c = new C56437f(tVar.f150780b);
        this.f150746d = new C56437f(tVar.f150780b);
        int i = tVar.f150782d;
        this.f150750h = new int[(i < 2 ? 2 : i)];
    }

    /* renamed from: a */
    public final C56438g mo54376a(C56437f fVar, int i, int i2, int[] iArr, int i3, C56438g gVar) {
        int[] iArr2;
        C56438g gVar2;
        C56437f fVar2 = fVar;
        int i4 = i;
        int[] iArr3 = iArr;
        C56438g gVar3 = gVar;
        if (i4 == 0) {
            return gVar3;
        }
        int[] iArr4 = fVar2.f150739c;
        int i5 = iArr4[i4];
        int i6 = fVar2.f150740d;
        if (i5 < i6 && fVar2.f150738b[i5] == i4) {
            return gVar3;
        }
        fVar2.f150740d = i6 + 1;
        iArr4[i4] = i6;
        fVar2.f150737a[i6] = null;
        fVar2.f150738b[i6] = i4;
        C56436e eVar = this.f150744b.f150779a[i4];
        switch (eVar.f150733a) {
            case 1:
            case 2:
                try {
                    return mo54376a(fVar, eVar.f150735c, i2, iArr, i3, mo54376a(fVar, eVar.f150734b, i2, iArr, i3, gVar));
                } catch (Throwable th) {
                    throw th;
                }
            case 3:
                int i7 = eVar.f150735c;
                if (i7 < this.f150751i) {
                    int i8 = iArr3[i7];
                    iArr3[i7] = i2;
                    mo54376a(fVar, eVar.f150734b, i2, iArr, i3, (C56438g) null);
                    iArr3[eVar.f150735c] = i8;
                    return gVar3;
                }
                return mo54376a(fVar, eVar.f150734b, i2, iArr, i3, gVar);
            case 4:
                if ((eVar.f150735c & (i3 ^ -1)) != 0) {
                    return gVar3;
                }
                return mo54376a(fVar, eVar.f150734b, i2, iArr, i3, gVar);
            case 5:
                return gVar3;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                if (gVar3 == null) {
                    int i9 = this.f150748f;
                    if (i9 > 0) {
                        int i10 = i9 - 1;
                        this.f150748f = i10;
                        gVar2 = this.f150747e[i10];
                    } else {
                        gVar2 = new C56438g(this.f150750h.length);
                    }
                    gVar2.f150742b = eVar;
                    gVar3 = gVar2;
                } else {
                    gVar3.f150742b = eVar;
                }
                int i11 = this.f150751i;
                if (i11 > 0 && (iArr2 = gVar3.f150741a) != iArr3) {
                    System.arraycopy(iArr3, 0, iArr2, 0, i11);
                }
                fVar2.f150737a[i6] = gVar3;
                return null;
            case 7:
                return mo54376a(fVar, eVar.f150734b, i2, iArr, i3, gVar);
            default:
                throw new IllegalStateException("unhandled");
        }
    }

    /* renamed from: b */
    public final void mo54377b(C56437f fVar, int i) {
        int i2 = this.f150748f + (fVar.f150740d - i);
        C56438g[] gVarArr = this.f150747e;
        int length = gVarArr.length;
        if (length < i2) {
            this.f150747e = (C56438g[]) Arrays.copyOf(gVarArr, Math.max(length + length, i2));
        }
        while (i < fVar.f150740d) {
            C56438g gVar = fVar.f150737a[i];
            if (gVar != null) {
                C56438g[] gVarArr2 = this.f150747e;
                int i3 = this.f150748f;
                gVarArr2[i3] = gVar;
                this.f150748f = i3 + 1;
            }
            i++;
        }
        fVar.f150740d = 0;
    }
}
