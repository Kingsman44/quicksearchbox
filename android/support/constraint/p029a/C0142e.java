package android.support.constraint.p029a;

import android.support.constraint.p029a.p030a.C0132b;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.e */
/* compiled from: PG */
public final class C0142e {

    /* renamed from: f */
    private static int f511f = 1000;

    /* renamed from: a */
    int f512a;

    /* renamed from: b */
    public final C0141d f513b;

    /* renamed from: c */
    public C0139b[] f514c;

    /* renamed from: d */
    int f515d;

    /* renamed from: e */
    public final C0140c f516e;

    /* renamed from: g */
    private int f517g;

    /* renamed from: h */
    private int f518h;

    /* renamed from: i */
    private boolean[] f519i;

    /* renamed from: j */
    private int f520j;

    /* renamed from: k */
    private int f521k;

    /* renamed from: l */
    private C0144g[] f522l;

    /* renamed from: m */
    private int f523m;

    /* renamed from: n */
    private C0139b[] f524n;

    public C0142e() {
        this.f512a = 0;
        this.f513b = new C0141d();
        this.f517g = 32;
        this.f518h = 32;
        this.f514c = null;
        this.f519i = new boolean[32];
        this.f515d = 1;
        this.f520j = 0;
        this.f521k = 32;
        this.f522l = new C0144g[f511f];
        this.f523m = 0;
        this.f524n = new C0139b[32];
        this.f514c = new C0139b[32];
        m214q();
        this.f516e = new C0140c();
    }

    /* renamed from: b */
    public static C0139b m210b(C0142e eVar, C0144g gVar, C0144g gVar2, int i, float f, C0144g gVar3, C0144g gVar4, int i2, boolean z) {
        C0139b a = eVar.mo170a();
        a.mo160c(gVar, gVar2, i, f, gVar3, gVar4, i2);
        if (z) {
            C0144g d = eVar.mo171d();
            C0144g d2 = eVar.mo171d();
            d.f529c = 4;
            d2.f529c = 4;
            a.mo159b(d, d2);
        }
        return a;
    }

    /* renamed from: c */
    public static C0139b m211c(C0142e eVar, C0144g gVar, C0144g gVar2, int i, boolean z) {
        C0139b a = eVar.mo170a();
        a.mo164g(gVar, gVar2, i);
        if (z) {
            a.f505d.mo119f(eVar.mo171d(), 1.0f);
        }
        return a;
    }

    /* renamed from: o */
    public static final int m212o(Object obj) {
        C0144g gVar = ((C0132b) obj).f409f;
        if (gVar != null) {
            return (int) (gVar.f530d + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    private final void m213p() {
        int i = this.f517g;
        int i2 = i + i;
        this.f517g = i2;
        this.f514c = (C0139b[]) Arrays.copyOf(this.f514c, i2);
        C0140c cVar = this.f516e;
        cVar.f507a = (C0144g[]) Arrays.copyOf(cVar.f507a, this.f517g);
        int i3 = this.f517g;
        this.f519i = new boolean[i3];
        this.f518h = i3;
        this.f521k = i3;
        this.f513b.f510a.clear();
    }

    /* renamed from: q */
    private final void m214q() {
        int i = 0;
        while (true) {
            C0139b[] bVarArr = this.f514c;
            if (i < bVarArr.length) {
                C0139b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f516e.f508b.mo183b(bVar);
                }
                this.f514c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    private final C0144g m215r(int i) {
        C0144g gVar = (C0144g) this.f516e.f509c.mo182a();
        if (gVar == null) {
            gVar = new C0144g(i);
        } else {
            gVar.mo185b();
            gVar.f534h = i;
        }
        int i2 = this.f523m;
        int i3 = f511f;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            f511f = i4;
            this.f522l = (C0144g[]) Arrays.copyOf(this.f522l, i4);
        }
        C0144g[] gVarArr = this.f522l;
        int i5 = this.f523m;
        this.f523m = i5 + 1;
        gVarArr[i5] = gVar;
        return gVar;
    }

    /* renamed from: s */
    private final void m216s(C0141d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f520j) {
                break;
            }
            C0139b bVar = this.f514c[i];
            if (bVar.f502a.f534h != 1 && bVar.f503b < 0.0f) {
                while (true) {
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    float f = Float.MAX_VALUE;
                    for (int i5 = 0; i5 < this.f520j; i5++) {
                        C0139b bVar2 = this.f514c[i5];
                        if (bVar2.f502a.f534h != 1 && bVar2.f503b < 0.0f) {
                            for (int i6 = 1; i6 < this.f515d; i6++) {
                                C0144g gVar = this.f516e.f507a[i6];
                                float a = bVar2.f505d.mo114a(gVar);
                                if (a > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = gVar.f531e[i7] / a;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    C0139b bVar3 = this.f514c[i2];
                    bVar3.f502a.f528b = -1;
                    bVar3.mo158a(this.f516e.f507a[i3]);
                    bVar3.f502a.f528b = i2;
                    for (int i8 = 0; i8 < this.f520j; i8++) {
                        C0139b bVar4 = this.f514c[i8];
                        bVar4.f505d.mo121h(bVar4, bVar3);
                    }
                    dVar.mo168a(this);
                }
            } else {
                C0141d dVar2 = dVar;
                i++;
            }
        }
        int i9 = 0;
        while (i9 < this.f520j) {
            C0139b bVar5 = this.f514c[i9];
            if (bVar5.f502a.f534h == 1 || bVar5.f503b >= 0.0f) {
                i9++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final C0139b mo170a() {
        C0139b bVar = (C0139b) this.f516e.f508b.mo182a();
        if (bVar == null) {
            return new C0139b(this.f516e);
        }
        bVar.f502a = null;
        C0130a aVar = bVar.f505d;
        aVar.f399f = -1;
        aVar.f400g = -1;
        aVar.f401h = false;
        aVar.f394a = 0;
        bVar.f503b = 0.0f;
        bVar.f506e = false;
        return bVar;
    }

    /* renamed from: d */
    public final C0144g mo171d() {
        if (this.f515d + 1 >= this.f518h) {
            m213p();
        }
        C0144g r = m215r(4);
        int i = this.f512a + 1;
        this.f512a = i;
        this.f515d++;
        r.f527a = i;
        this.f516e.f507a[i] = r;
        return r;
    }

    /* renamed from: e */
    public final C0144g mo172e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f515d + 1 >= this.f518h) {
            m213p();
        }
        C0132b bVar = (C0132b) obj;
        C0144g gVar = bVar.f409f;
        if (gVar == null) {
            bVar.mo127e();
            gVar = bVar.f409f;
        }
        int i = gVar.f527a;
        if (i != -1) {
            if (i > this.f512a || this.f516e.f507a[i] == null) {
                if (i != -1) {
                    gVar.mo185b();
                }
            }
            return gVar;
        }
        int i2 = this.f512a + 1;
        this.f512a = i2;
        this.f515d++;
        gVar.f527a = i2;
        gVar.f534h = 1;
        this.f516e.f507a[i2] = gVar;
        return gVar;
    }

    /* renamed from: f */
    public final C0144g mo173f() {
        if (this.f515d + 1 >= this.f518h) {
            m213p();
        }
        C0144g r = m215r(3);
        int i = this.f512a + 1;
        this.f512a = i;
        this.f515d++;
        r.f527a = i;
        this.f516e.f507a[i] = r;
        return r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0100 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo174g(android.support.constraint.p029a.C0139b r13) {
        /*
            r12 = this;
            int r0 = r12.f520j
            r1 = 1
            int r0 = r0 + r1
            int r2 = r12.f521k
            if (r0 >= r2) goto L_0x000f
            int r0 = r12.f515d
            int r0 = r0 + r1
            int r2 = r12.f518h
            if (r0 < r2) goto L_0x0012
        L_0x000f:
            r12.m213p()
        L_0x0012:
            boolean r0 = r13.f506e
            r2 = 0
            if (r0 != 0) goto L_0x0128
            int r0 = r12.f520j
            r3 = -1
            if (r0 <= 0) goto L_0x008b
            android.support.constraint.a.a r0 = r13.f505d
            android.support.constraint.a.b[] r4 = r12.f514c
            int r5 = r0.f399f
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r5 == r3) goto L_0x0083
            int r7 = r0.f394a
            if (r6 >= r7) goto L_0x0083
            android.support.constraint.a.c r7 = r0.f395b
            android.support.constraint.a.g[] r7 = r7.f507a
            int[] r8 = r0.f396c
            r8 = r8[r5]
            r7 = r7[r8]
            int r8 = r7.f528b
            if (r8 == r3) goto L_0x007c
            float[] r6 = r0.f398e
            r5 = r6[r5]
            r0.mo116c(r7)
            int r6 = r7.f528b
            r6 = r4[r6]
            boolean r7 = r6.f506e
            if (r7 != 0) goto L_0x006b
            android.support.constraint.a.a r7 = r6.f505d
            int r8 = r7.f399f
            r9 = 0
        L_0x004b:
            if (r8 == r3) goto L_0x006b
            int r10 = r7.f394a
            if (r9 >= r10) goto L_0x006b
            android.support.constraint.a.c r10 = r0.f395b
            android.support.constraint.a.g[] r10 = r10.f507a
            int[] r11 = r7.f396c
            r11 = r11[r8]
            r10 = r10[r11]
            float[] r11 = r7.f398e
            r11 = r11[r8]
            float r11 = r11 * r5
            r0.mo118e(r10, r11)
            int[] r10 = r7.f397d
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x004b
        L_0x006b:
            float r7 = r13.f503b
            float r8 = r6.f503b
            float r8 = r8 * r5
            float r7 = r7 + r8
            r13.f503b = r7
            android.support.constraint.a.g r5 = r6.f502a
            r5.mo184a(r13)
            int r5 = r0.f399f
            goto L_0x0022
        L_0x007c:
            int[] r7 = r0.f397d
            r5 = r7[r5]
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0083:
            android.support.constraint.a.a r0 = r13.f505d
            int r0 = r0.f394a
            if (r0 != 0) goto L_0x008b
            r13.f506e = r1
        L_0x008b:
            float r0 = r13.f503b
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ae
            float r0 = -r0
            r13.f503b = r0
            android.support.constraint.a.a r0 = r13.f505d
            int r5 = r0.f399f
            r6 = 0
        L_0x009a:
            if (r5 == r3) goto L_0x00ae
            int r7 = r0.f394a
            if (r6 >= r7) goto L_0x00ae
            float[] r7 = r0.f398e
            r8 = r7[r5]
            float r8 = -r8
            r7[r5] = r8
            int[] r7 = r0.f397d
            r5 = r7[r5]
            int r6 = r6 + 1
            goto L_0x009a
        L_0x00ae:
            android.support.constraint.a.a r0 = r13.f505d
            int r5 = r0.f399f
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x00b5:
            if (r5 == r3) goto L_0x0107
            int r9 = r0.f394a
            if (r8 >= r9) goto L_0x0107
            float[] r9 = r0.f398e
            r10 = r9[r5]
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x00cd
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d7
            r9[r5] = r4
            goto L_0x00d6
        L_0x00cd:
            r11 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00d7
            r9[r5] = r4
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0100
            android.support.constraint.a.c r9 = r0.f395b
            android.support.constraint.a.g[] r9 = r9.f507a
            int[] r11 = r0.f396c
            r11 = r11[r5]
            r9 = r9[r11]
            int r11 = r9.f534h
            if (r11 != r1) goto L_0x00f3
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ef
            r6 = r9
            goto L_0x010b
        L_0x00ef:
            if (r6 != 0) goto L_0x0100
            r6 = r9
            goto L_0x0100
        L_0x00f3:
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0100
            if (r7 == 0) goto L_0x00ff
            int r10 = r9.f529c
            int r11 = r7.f529c
            if (r10 >= r11) goto L_0x0100
        L_0x00ff:
            r7 = r9
        L_0x0100:
            int[] r9 = r0.f397d
            r5 = r9[r5]
            int r8 = r8 + 1
            goto L_0x00b5
        L_0x0107:
            if (r6 == 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r6 = r7
        L_0x010b:
            if (r6 == 0) goto L_0x0110
            r13.mo158a(r6)
        L_0x0110:
            android.support.constraint.a.a r0 = r13.f505d
            int r0 = r0.f394a
            if (r0 != 0) goto L_0x0118
            r13.f506e = r1
        L_0x0118:
            android.support.constraint.a.g r0 = r13.f502a
            if (r0 == 0) goto L_0x0127
            int r0 = r0.f534h
            if (r0 == r1) goto L_0x0128
            float r0 = r13.f503b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            return
        L_0x0128:
            android.support.constraint.a.b[] r0 = r12.f514c
            int r3 = r12.f520j
            r0 = r0[r3]
            if (r0 == 0) goto L_0x0137
            android.support.constraint.a.c r3 = r12.f516e
            android.support.constraint.a.f r3 = r3.f508b
            r3.mo183b(r0)
        L_0x0137:
            boolean r0 = r13.f506e
            if (r0 != 0) goto L_0x0140
            android.support.constraint.a.a r0 = r13.f505d
            r0.mo120g(r13)
        L_0x0140:
            android.support.constraint.a.b[] r0 = r12.f514c
            int r3 = r12.f520j
            r0[r3] = r13
            android.support.constraint.a.g r0 = r13.f502a
            r0.f528b = r3
            int r3 = r3 + r1
            r12.f520j = r3
            int r0 = r0.f533g
            if (r0 <= 0) goto L_0x017d
        L_0x0151:
            android.support.constraint.a.b[] r1 = r12.f524n
            int r3 = r1.length
            if (r3 >= r0) goto L_0x015c
            int r3 = r3 + r3
            android.support.constraint.a.b[] r1 = new android.support.constraint.p029a.C0139b[r3]
            r12.f524n = r1
            goto L_0x0151
        L_0x015c:
            r3 = 0
        L_0x015d:
            if (r3 >= r0) goto L_0x016a
            android.support.constraint.a.g r4 = r13.f502a
            android.support.constraint.a.b[] r4 = r4.f532f
            r4 = r4[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x015d
        L_0x016a:
            if (r2 >= r0) goto L_0x017d
            r3 = r1[r2]
            if (r3 == r13) goto L_0x017a
            android.support.constraint.a.a r4 = r3.f505d
            r4.mo121h(r3, r13)
            android.support.constraint.a.a r4 = r3.f505d
            r4.mo120g(r3)
        L_0x017a:
            int r2 = r2 + 1
            goto L_0x016a
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.C0142e.mo174g(android.support.constraint.a.b):void");
    }

    /* renamed from: h */
    public final void mo175h(C0144g gVar, int i) {
        int i2 = gVar.f528b;
        if (i2 != -1) {
            C0139b bVar = this.f514c[i2];
            if (bVar.f506e) {
                bVar.f503b = (float) i;
                return;
            }
            C0139b a = mo170a();
            a.mo163f(gVar, i);
            mo174g(a);
            return;
        }
        C0139b a2 = mo170a();
        a2.f502a = gVar;
        float f = (float) i;
        gVar.f530d = f;
        a2.f503b = f;
        a2.f506e = true;
        mo174g(a2);
    }

    /* renamed from: i */
    public final void mo176i(C0144g gVar, C0144g gVar2, int i, int i2) {
        C0139b a = mo170a();
        C0144g f = mo173f();
        f.f529c = i2;
        a.mo165h(gVar, gVar2, f, i);
        mo174g(a);
    }

    /* renamed from: j */
    public final void mo177j(C0144g gVar, C0144g gVar2, int i, int i2) {
        C0139b a = mo170a();
        C0144g f = mo173f();
        f.f529c = i2;
        a.mo166i(gVar, gVar2, f, i);
        mo174g(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo178k(android.support.constraint.p029a.C0141d r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r2.mo168a(r1)
            r16.m216s(r17)
            r3 = 0
            r0 = 0
        L_0x000c:
            int r4 = r1.f515d
            if (r0 >= r4) goto L_0x0017
            boolean[] r4 = r1.f519i
            r4[r0] = r3
            int r0 = r0 + 1
            goto L_0x000c
        L_0x0017:
            r0 = 0
            r4 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x00ec
            java.util.ArrayList r0 = r2.f510a
            int r0 = r0.size()
            r5 = 0
            r7 = r5
            r6 = 0
            r8 = 0
        L_0x0025:
            r9 = 0
            if (r6 >= r0) goto L_0x004f
            java.util.ArrayList r10 = r2.f510a
            java.lang.Object r10 = r10.get(r6)
            android.support.constraint.a.g r10 = (android.support.constraint.p029a.C0144g) r10
            r11 = 5
        L_0x0031:
            if (r11 < 0) goto L_0x004c
            float[] r12 = r10.f531e
            r12 = r12[r11]
            if (r7 != 0) goto L_0x0041
            int r13 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0041
            if (r11 < r8) goto L_0x0041
            r7 = r10
            r8 = r11
        L_0x0041:
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0049
            if (r11 <= r8) goto L_0x0049
            r7 = r5
            r8 = r11
        L_0x0049:
            int r11 = r11 + -1
            goto L_0x0031
        L_0x004c:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x004f:
            r0 = 1
            if (r7 == 0) goto L_0x0066
            boolean[] r6 = r1.f519i
            int r8 = r7.f527a
            boolean r10 = r6[r8]
            if (r10 == 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            r6[r8] = r0
            int r4 = r4 + 1
            int r5 = r1.f515d
            if (r4 < r5) goto L_0x0066
            r5 = r7
            r6 = 1
            goto L_0x0068
        L_0x0066:
            r5 = r7
        L_0x0067:
            r6 = 0
        L_0x0068:
            if (r5 == 0) goto L_0x00e8
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r10 = 0
            r11 = -1
        L_0x0070:
            int r12 = r1.f520j
            if (r10 >= r12) goto L_0x00b8
            android.support.constraint.a.b[] r12 = r1.f514c
            r12 = r12[r10]
            android.support.constraint.a.g r13 = r12.f502a
            int r13 = r13.f534h
            if (r13 != r0) goto L_0x007f
            goto L_0x00b3
        L_0x007f:
            android.support.constraint.a.a r13 = r12.f505d
            int r14 = r13.f399f
            if (r14 != r7) goto L_0x0086
            goto L_0x00b3
        L_0x0086:
            r15 = 0
        L_0x0087:
            if (r14 == r7) goto L_0x00b3
            int r0 = r13.f394a
            if (r15 >= r0) goto L_0x00b3
            int[] r0 = r13.f396c
            r0 = r0[r14]
            int r3 = r5.f527a
            if (r0 != r3) goto L_0x00aa
            android.support.constraint.a.a r0 = r12.f505d
            float r0 = r0.mo114a(r5)
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b3
            float r3 = r12.f503b
            float r3 = -r3
            float r3 = r3 / r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b3
            r8 = r3
            r11 = r10
            goto L_0x00b3
        L_0x00aa:
            int[] r0 = r13.f397d
            r14 = r0[r14]
            int r15 = r15 + 1
            r0 = 1
            r3 = 0
            goto L_0x0087
        L_0x00b3:
            int r10 = r10 + 1
            r0 = 1
            r3 = 0
            goto L_0x0070
        L_0x00b8:
            if (r11 < 0) goto L_0x00e8
            android.support.constraint.a.b[] r0 = r1.f514c
            r0 = r0[r11]
            android.support.constraint.a.g r3 = r0.f502a
            r3.f528b = r7
            r0.mo158a(r5)
            android.support.constraint.a.g r3 = r0.f502a
            r3.f528b = r11
            r3 = 0
        L_0x00ca:
            int r5 = r1.f520j
            if (r3 >= r5) goto L_0x00da
            android.support.constraint.a.b[] r5 = r1.f514c
            r5 = r5[r3]
            android.support.constraint.a.a r7 = r5.f505d
            r7.mo121h(r5, r0)
            int r3 = r3 + 1
            goto L_0x00ca
        L_0x00da:
            r2.mo168a(r1)
            r16.m216s(r17)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x00e6:
            r0 = r6
            goto L_0x00e9
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            r3 = 0
            goto L_0x0019
        L_0x00ec:
            r3 = 0
        L_0x00ed:
            int r0 = r1.f520j
            if (r3 >= r0) goto L_0x00fe
            android.support.constraint.a.b[] r0 = r1.f514c
            r0 = r0[r3]
            android.support.constraint.a.g r2 = r0.f502a
            float r0 = r0.f503b
            r2.f530d = r0
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.C0142e.mo178k(android.support.constraint.a.d):void");
    }

    /* renamed from: l */
    public final void mo179l() {
        C0140c cVar;
        int i = 0;
        while (true) {
            cVar = this.f516e;
            C0144g[] gVarArr = cVar.f507a;
            if (i >= gVarArr.length) {
                break;
            }
            C0144g gVar = gVarArr[i];
            if (gVar != null) {
                gVar.mo185b();
            }
            i++;
        }
        C0143f fVar = cVar.f509c;
        C0144g[] gVarArr2 = this.f522l;
        int i2 = this.f523m;
        int length = gVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0144g gVar2 = gVarArr2[i3];
            int i4 = fVar.f526b;
            if (i4 < 256) {
                fVar.f525a[i4] = gVar2;
                fVar.f526b = i4 + 1;
            }
        }
        this.f523m = 0;
        Arrays.fill(this.f516e.f507a, (Object) null);
        this.f512a = 0;
        this.f513b.f510a.clear();
        this.f515d = 1;
        for (int i5 = 0; i5 < this.f520j; i5++) {
            this.f514c[i5].f504c = false;
        }
        m214q();
        this.f520j = 0;
    }

    /* renamed from: m */
    public final void mo180m(C0144g gVar, C0144g gVar2, int i, float f, C0144g gVar3, C0144g gVar4, int i2) {
        C0139b a = mo170a();
        a.mo160c(gVar, gVar2, i, f, gVar3, gVar4, i2);
        C0144g d = mo171d();
        C0144g d2 = mo171d();
        d.f529c = 4;
        d2.f529c = 4;
        a.mo159b(d, d2);
        mo174g(a);
    }

    /* renamed from: n */
    public final void mo181n(C0144g gVar, C0144g gVar2, int i, int i2) {
        C0139b a = mo170a();
        a.mo164g(gVar, gVar2, i);
        C0144g d = mo171d();
        C0144g d2 = mo171d();
        d.f529c = i2;
        d2.f529c = i2;
        a.mo159b(d, d2);
        mo174g(a);
    }
}
