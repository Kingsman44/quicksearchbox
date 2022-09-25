package androidx.constraintlayout.p079a;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.h */
/* compiled from: PG */
public final class C1653h extends C1614b {

    /* renamed from: f */
    public int f4783f = 0;

    /* renamed from: g */
    final C1652g f4784g = new C1652g(this);

    /* renamed from: h */
    private C1654i[] f4785h = new C1654i[128];

    /* renamed from: i */
    private C1654i[] f4786i = new C1654i[128];

    public C1653h(C1648c cVar) {
        super(cVar);
    }

    /* renamed from: d */
    public final void mo4550d(C1649d dVar, C1614b bVar, boolean z) {
        C1614b bVar2 = bVar;
        C1654i iVar = bVar2.f4477a;
        if (iVar != null) {
            C1590a aVar = bVar2.f4481e;
            int i = aVar.f4360a;
            for (int i2 = 0; i2 < i; i2++) {
                C1654i d = aVar.mo4504d(i2);
                float b = aVar.mo4502b(i2);
                C1652g gVar = this.f4784g;
                gVar.f4781a = d;
                if (gVar.f4781a.f4788b) {
                    boolean z2 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = gVar.f4781a.f4795i;
                        float f = fArr[i3] + (iVar.f4795i[i3] * b);
                        fArr[i3] = f;
                        if (Math.abs(f) < 1.0E-4f) {
                            gVar.f4781a.f4795i[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        gVar.f4782b.mo4692n(gVar.f4781a);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = iVar.f4795i[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * b;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            gVar.f4781a.f4795i[i4] = f3;
                        } else {
                            gVar.f4781a.f4795i[i4] = 0.0f;
                        }
                    }
                    mo4691m(d);
                }
                this.f4478b += bVar2.f4478b * b;
            }
            mo4692n(iVar);
        }
    }

    /* renamed from: e */
    public final boolean mo4551e() {
        return this.f4783f == 0;
    }

    /* renamed from: k */
    public final C1654i mo4557k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4783f; i2++) {
            C1654i[] iVarArr = this.f4785h;
            C1654i iVar = iVarArr[i2];
            if (!zArr[iVar.f4789c]) {
                C1652g gVar = this.f4784g;
                gVar.f4781a = iVar;
                int i3 = 8;
                if (i != -1) {
                    C1654i iVar2 = iVarArr[i];
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        float f = iVar2.f4795i[i3];
                        float f2 = gVar.f4781a.f4795i[i3];
                        if (f2 == f) {
                            i3--;
                        } else if (f2 >= f) {
                        }
                    }
                } else {
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        float f3 = gVar.f4781a.f4795i[i3];
                        if (f3 > 0.0f) {
                            break;
                        } else if (f3 < 0.0f) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f4785h[i];
    }

    /* renamed from: m */
    public final void mo4691m(C1654i iVar) {
        int i;
        int i2 = this.f4783f;
        C1654i[] iVarArr = this.f4785h;
        int length = iVarArr.length;
        if (i2 + 1 > length) {
            C1654i[] iVarArr2 = (C1654i[]) Arrays.copyOf(iVarArr, length + length);
            this.f4785h = iVarArr2;
            int length2 = iVarArr2.length;
            this.f4786i = (C1654i[]) Arrays.copyOf(iVarArr2, length2 + length2);
        }
        C1654i[] iVarArr3 = this.f4785h;
        int i3 = this.f4783f;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f4783f = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f4789c > iVar.f4789c) {
            int i5 = 0;
            while (true) {
                i = this.f4783f;
                if (i5 >= i) {
                    break;
                }
                this.f4786i[i5] = this.f4785h[i5];
                i5++;
            }
            Arrays.sort(this.f4786i, 0, i, new C1651f());
            for (int i6 = 0; i6 < this.f4783f; i6++) {
                this.f4785h[i6] = this.f4786i[i6];
            }
        }
        iVar.f4788b = true;
        iVar.mo4693a(this);
    }

    /* renamed from: n */
    public final void mo4692n(C1654i iVar) {
        int i = 0;
        while (i < this.f4783f) {
            if (this.f4785h[i] == iVar) {
                while (true) {
                    int i2 = this.f4783f - 1;
                    if (i < i2) {
                        C1654i[] iVarArr = this.f4785h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f4783f = i2;
                        iVar.f4788b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f4478b + ") : ";
        for (int i = 0; i < this.f4783f; i++) {
            C1654i iVar = this.f4785h[i];
            C1652g gVar = this.f4784g;
            gVar.f4781a = iVar;
            str = str + String.valueOf(gVar) + " ";
        }
        return str;
    }
}
