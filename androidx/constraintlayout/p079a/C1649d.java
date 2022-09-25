package androidx.constraintlayout.p079a;

import androidx.constraintlayout.p079a.p082b.C1636d;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.d */
/* compiled from: PG */
public final class C1649d {

    /* renamed from: a */
    public static boolean f4760a = false;

    /* renamed from: b */
    public static long f4761b = 0;

    /* renamed from: k */
    private static int f4762k = 1000;

    /* renamed from: c */
    public boolean f4763c;

    /* renamed from: d */
    int f4764d;

    /* renamed from: e */
    C1614b[] f4765e;

    /* renamed from: f */
    public boolean f4766f;

    /* renamed from: g */
    public boolean f4767g;

    /* renamed from: h */
    int f4768h;

    /* renamed from: i */
    int f4769i;

    /* renamed from: j */
    public final C1648c f4770j;

    /* renamed from: l */
    private int f4771l;

    /* renamed from: m */
    private int f4772m;

    /* renamed from: n */
    private boolean[] f4773n;

    /* renamed from: o */
    private int f4774o;

    /* renamed from: p */
    private C1654i[] f4775p;

    /* renamed from: q */
    private int f4776q;

    /* renamed from: r */
    private final C1614b f4777r;

    /* renamed from: s */
    private C1614b f4778s;

    public C1649d() {
        this.f4763c = false;
        this.f4764d = 0;
        this.f4771l = 32;
        this.f4772m = 32;
        this.f4765e = null;
        this.f4766f = false;
        this.f4767g = false;
        this.f4773n = new boolean[32];
        this.f4768h = 1;
        this.f4769i = 0;
        this.f4774o = 32;
        this.f4775p = new C1654i[f4762k];
        this.f4776q = 0;
        this.f4765e = new C1614b[32];
        m4498s();
        C1648c cVar = new C1648c();
        this.f4770j = cVar;
        this.f4777r = new C1653h(cVar);
        this.f4778s = new C1614b(cVar);
    }

    /* renamed from: n */
    public static final int m4494n(Object obj) {
        C1654i iVar = ((C1636d) obj).f4574h;
        if (iVar != null) {
            return (int) (iVar.f4792f + 0.5f);
        }
        return 0;
    }

    /* renamed from: q */
    private final void m4496q() {
        for (int i = 0; i < this.f4769i; i++) {
            C1614b bVar = this.f4765e[i];
            bVar.f4477a.f4792f = bVar.f4478b;
        }
    }

    /* renamed from: r */
    private final void m4497r() {
        int i = this.f4771l;
        int i2 = i + i;
        this.f4771l = i2;
        this.f4765e = (C1614b[]) Arrays.copyOf(this.f4765e, i2);
        C1648c cVar = this.f4770j;
        cVar.f4757a = (C1654i[]) Arrays.copyOf(cVar.f4757a, this.f4771l);
        int i3 = this.f4771l;
        this.f4773n = new boolean[i3];
        this.f4772m = i3;
        this.f4774o = i3;
    }

    /* renamed from: s */
    private final void m4498s() {
        for (int i = 0; i < this.f4769i; i++) {
            C1614b bVar = this.f4765e[i];
            if (bVar != null) {
                this.f4770j.f4758b.mo4688b(bVar);
            }
            this.f4765e[i] = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r12 = r11.f4481e;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4499t(androidx.constraintlayout.p079a.C1614b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 0
        L_0x0006:
            int r4 = r0.f4768h
            if (r3 >= r4) goto L_0x0011
            boolean[] r4 = r0.f4773n
            r4[r3] = r2
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0011:
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x00a6
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f4768h
            int r6 = r6 + r6
            if (r4 >= r6) goto L_0x00a6
            androidx.constraintlayout.a.i r6 = r1.f4477a
            if (r6 == 0) goto L_0x0026
            boolean[] r7 = r0.f4773n
            int r6 = r6.f4789c
            r7[r6] = r5
        L_0x0026:
            boolean[] r6 = r0.f4773n
            androidx.constraintlayout.a.i r6 = r1.mo4557k(r6)
            if (r6 == 0) goto L_0x0039
            boolean[] r7 = r0.f4773n
            int r8 = r6.f4789c
            boolean r9 = r7[r8]
            if (r9 == 0) goto L_0x0037
            return
        L_0x0037:
            r7[r8] = r5
        L_0x0039:
            if (r6 == 0) goto L_0x00a2
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
            r10 = -1
        L_0x0041:
            int r11 = r0.f4769i
            if (r9 >= r11) goto L_0x008d
            androidx.constraintlayout.a.b[] r11 = r0.f4765e
            r11 = r11[r9]
            androidx.constraintlayout.a.i r12 = r11.f4477a
            int r12 = r12.f4800n
            if (r12 != r5) goto L_0x0050
            goto L_0x0089
        L_0x0050:
            boolean r12 = r11.f4480d
            if (r12 == 0) goto L_0x0055
            goto L_0x0089
        L_0x0055:
            androidx.constraintlayout.a.a r12 = r11.f4481e
            int r13 = r12.f4365f
            if (r13 != r7) goto L_0x005c
            goto L_0x0089
        L_0x005c:
            r14 = 0
        L_0x005d:
            if (r13 == r7) goto L_0x0089
            int r15 = r12.f4360a
            if (r14 >= r15) goto L_0x0089
            int[] r15 = r12.f4362c
            r15 = r15[r13]
            int r2 = r6.f4789c
            if (r15 != r2) goto L_0x0081
            androidx.constraintlayout.a.a r2 = r11.f4481e
            float r2 = r2.mo4501a(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            float r11 = r11.f4478b
            float r11 = -r11
            float r11 = r11 / r2
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0089
            r10 = r9
            r8 = r11
            goto L_0x0089
        L_0x0081:
            int[] r2 = r12.f4363d
            r13 = r2[r13]
            int r14 = r14 + 1
            r2 = 0
            goto L_0x005d
        L_0x0089:
            int r9 = r9 + 1
            r2 = 0
            goto L_0x0041
        L_0x008d:
            if (r10 < 0) goto L_0x00a3
            androidx.constraintlayout.a.b[] r2 = r0.f4765e
            r2 = r2[r10]
            androidx.constraintlayout.a.i r5 = r2.f4477a
            r5.f4790d = r7
            r2.mo4548b(r6)
            androidx.constraintlayout.a.i r5 = r2.f4477a
            r5.f4790d = r10
            r5.mo4698e(r0, r2)
            goto L_0x00a3
        L_0x00a2:
            r3 = 1
        L_0x00a3:
            r2 = 0
            goto L_0x0013
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.C1649d.m4499t(androidx.constraintlayout.a.b):void");
    }

    /* renamed from: u */
    private final C1654i m4500u(int i) {
        C1654i iVar = (C1654i) this.f4770j.f4759c.mo4687a();
        if (iVar == null) {
            iVar = new C1654i(i);
            iVar.f4800n = i;
        } else {
            iVar.mo4695c();
            iVar.f4800n = i;
        }
        int i2 = this.f4776q;
        int i3 = f4762k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            f4762k = i4;
            this.f4775p = (C1654i[]) Arrays.copyOf(this.f4775p, i4);
        }
        C1654i[] iVarArr = this.f4775p;
        int i5 = this.f4776q;
        this.f4776q = i5 + 1;
        iVarArr[i5] = iVar;
        return iVar;
    }

    /* renamed from: a */
    public final C1614b mo4673a() {
        C1614b bVar = (C1614b) this.f4770j.f4758b.mo4687a();
        if (bVar == null) {
            bVar = new C1614b(this.f4770j);
            f4761b++;
        } else {
            bVar.f4477a = null;
            bVar.f4481e.mo4506f();
            bVar.f4478b = 0.0f;
            bVar.f4480d = false;
        }
        C1654i.f4787a++;
        return bVar;
    }

    /* renamed from: b */
    public final C1654i mo4674b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f4768h + 1 >= this.f4772m) {
            m4497r();
        }
        C1636d dVar = (C1636d) obj;
        C1654i iVar = dVar.f4574h;
        if (iVar == null) {
            dVar.mo4612m();
            iVar = dVar.f4574h;
        }
        int i = iVar.f4789c;
        if (i != -1) {
            if (i > this.f4764d || this.f4770j.f4757a[i] == null) {
                if (i != -1) {
                    iVar.mo4695c();
                }
            }
            return iVar;
        }
        int i2 = this.f4764d + 1;
        this.f4764d = i2;
        this.f4768h++;
        iVar.f4789c = i2;
        iVar.f4800n = 1;
        this.f4770j.f4757a[i2] = iVar;
        return iVar;
    }

    /* renamed from: c */
    public final C1654i mo4675c() {
        if (this.f4768h + 1 >= this.f4772m) {
            m4497r();
        }
        C1654i u = m4500u(3);
        int i = this.f4764d + 1;
        this.f4764d = i;
        this.f4768h++;
        u.f4789c = i;
        this.f4770j.f4757a[i] = u;
        return u;
    }

    /* renamed from: d */
    public final void mo4676d(C1654i iVar, C1654i iVar2, int i, float f, C1654i iVar3, C1654i iVar4, int i2, int i3) {
        C1614b a = mo4673a();
        if (iVar2 == iVar3) {
            a.f4481e.mo4507g(iVar, 1.0f);
            a.f4481e.mo4507g(iVar4, 1.0f);
            a.f4481e.mo4507g(iVar2, -2.0f);
        } else if (f == 0.5f) {
            a.f4481e.mo4507g(iVar, 1.0f);
            a.f4481e.mo4507g(iVar2, -1.0f);
            a.f4481e.mo4507g(iVar3, -1.0f);
            a.f4481e.mo4507g(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a.f4478b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            a.f4481e.mo4507g(iVar, -1.0f);
            a.f4481e.mo4507g(iVar2, 1.0f);
            a.f4478b = (float) i;
        } else if (f >= 1.0f) {
            a.f4481e.mo4507g(iVar4, -1.0f);
            a.f4481e.mo4507g(iVar3, 1.0f);
            a.f4478b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            a.f4481e.mo4507g(iVar, f2);
            a.f4481e.mo4507g(iVar2, -f2);
            a.f4481e.mo4507g(iVar3, -f);
            a.f4481e.mo4507g(iVar4, f);
            if (i > 0 || i2 > 0) {
                a.f4478b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 8) {
            a.mo4552f(this, i3);
        }
        mo4677e(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4677e(androidx.constraintlayout.p079a.C1614b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f4769i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f4774o
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f4768h
            int r2 = r2 + r3
            int r4 = r0.f4772m
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.m4497r()
        L_0x0016:
            boolean r2 = r1.f4480d
            if (r2 != 0) goto L_0x01b6
            androidx.constraintlayout.a.b[] r2 = r0.f4765e
            int r2 = r2.length
            r4 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0075
            androidx.constraintlayout.a.a r6 = r1.f4481e
            int r6 = r6.f4360a
            r7 = 0
        L_0x0029:
            if (r7 >= r6) goto L_0x0044
            androidx.constraintlayout.a.a r8 = r1.f4481e
            androidx.constraintlayout.a.i r8 = r8.mo4504d(r7)
            int r9 = r8.f4790d
            if (r9 != r4) goto L_0x003c
            boolean r9 = r8.f4793g
            if (r9 != 0) goto L_0x003c
            boolean r8 = r8.f4799m
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList r9 = r1.f4479c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0044:
            java.util.ArrayList r6 = r1.f4479c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0073
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006d
            java.util.ArrayList r8 = r1.f4479c
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.a.i r8 = (androidx.constraintlayout.p079a.C1654i) r8
            boolean r9 = r8.f4793g
            if (r9 == 0) goto L_0x005f
            r1.mo4549c(r0, r8, r3)
            goto L_0x006a
        L_0x005f:
            boolean r9 = r8.f4799m
            androidx.constraintlayout.a.b[] r9 = r0.f4765e
            int r8 = r8.f4790d
            r8 = r9[r8]
            r1.mo4550d(r0, r8, r3)
        L_0x006a:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006d:
            java.util.ArrayList r6 = r1.f4479c
            r6.clear()
            goto L_0x0022
        L_0x0073:
            r2 = 1
            goto L_0x0022
        L_0x0075:
            androidx.constraintlayout.a.i r2 = r1.f4477a
            if (r2 == 0) goto L_0x0083
            androidx.constraintlayout.a.a r2 = r1.f4481e
            int r2 = r2.f4360a
            if (r2 != 0) goto L_0x0083
            r1.f4480d = r3
            r0.f4763c = r3
        L_0x0083:
            boolean r2 = r17.mo4551e()
            if (r2 != 0) goto L_0x01b5
            float r2 = r1.f4478b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ac
            float r2 = -r2
            r1.f4478b = r2
            androidx.constraintlayout.a.a r2 = r1.f4481e
            int r7 = r2.f4365f
            r8 = 0
        L_0x0098:
            if (r7 == r4) goto L_0x00ac
            int r9 = r2.f4360a
            if (r8 >= r9) goto L_0x00ac
            float[] r9 = r2.f4364e
            r10 = r9[r7]
            float r10 = -r10
            r9[r7] = r10
            int[] r9 = r2.f4363d
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L_0x0098
        L_0x00ac:
            androidx.constraintlayout.a.a r2 = r1.f4481e
            int r2 = r2.f4360a
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00b8:
            if (r8 >= r2) goto L_0x010f
            androidx.constraintlayout.a.a r15 = r1.f4481e
            float r15 = r15.mo4502b(r8)
            androidx.constraintlayout.a.a r5 = r1.f4481e
            androidx.constraintlayout.a.i r5 = r5.mo4504d(r8)
            int r4 = r5.f4800n
            if (r4 != r3) goto L_0x00e8
            if (r9 != 0) goto L_0x00d3
            boolean r14 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
        L_0x00d0:
            r9 = r5
            r11 = r15
            goto L_0x010b
        L_0x00d3:
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            boolean r14 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
            goto L_0x00d0
        L_0x00dc:
            if (r14 != 0) goto L_0x010b
            boolean r4 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
            if (r4 == 0) goto L_0x010b
            r9 = r5
            r11 = r15
            r14 = 1
            goto L_0x010b
        L_0x00e8:
            if (r9 != 0) goto L_0x010b
            int r4 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x010b
            if (r10 != 0) goto L_0x00f7
            boolean r13 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
        L_0x00f4:
            r10 = r5
            r12 = r15
            goto L_0x010b
        L_0x00f7:
            int r4 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x0100
            boolean r13 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
            goto L_0x00f4
        L_0x0100:
            if (r13 != 0) goto L_0x010b
            boolean r4 = androidx.constraintlayout.p079a.C1614b.m4291l(r5)
            if (r4 == 0) goto L_0x010b
            r10 = r5
            r12 = r15
            r13 = 1
        L_0x010b:
            int r8 = r8 + 1
            r4 = -1
            goto L_0x00b8
        L_0x010f:
            if (r9 == 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r9 = r10
        L_0x0113:
            if (r9 != 0) goto L_0x0117
            r2 = 1
            goto L_0x011b
        L_0x0117:
            r1.mo4548b(r9)
            r2 = 0
        L_0x011b:
            androidx.constraintlayout.a.a r4 = r1.f4481e
            int r4 = r4.f4360a
            if (r4 != 0) goto L_0x0123
            r1.f4480d = r3
        L_0x0123:
            if (r2 == 0) goto L_0x01a3
            int r2 = r0.f4768h
            int r2 = r2 + r3
            int r4 = r0.f4772m
            if (r2 < r4) goto L_0x012f
            r16.m4497r()
        L_0x012f:
            r2 = 3
            androidx.constraintlayout.a.i r2 = r0.m4500u(r2)
            int r4 = r0.f4764d
            int r4 = r4 + r3
            r0.f4764d = r4
            int r5 = r0.f4768h
            int r5 = r5 + r3
            r0.f4768h = r5
            r2.f4789c = r4
            androidx.constraintlayout.a.c r5 = r0.f4770j
            androidx.constraintlayout.a.i[] r5 = r5.f4757a
            r5[r4] = r2
            r1.f4477a = r2
            int r4 = r0.f4769i
            r16.m4495p(r17)
            int r5 = r0.f4769i
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01a3
            androidx.constraintlayout.a.b r4 = r0.f4778s
            r4.f4477a = r7
            androidx.constraintlayout.a.a r5 = r4.f4481e
            r5.mo4506f()
            r5 = 0
        L_0x015c:
            androidx.constraintlayout.a.a r8 = r1.f4481e
            int r9 = r8.f4360a
            if (r5 >= r9) goto L_0x0174
            androidx.constraintlayout.a.i r8 = r8.mo4504d(r5)
            androidx.constraintlayout.a.a r9 = r1.f4481e
            float r9 = r9.mo4502b(r5)
            androidx.constraintlayout.a.a r10 = r4.f4481e
            r10.mo4505e(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x015c
        L_0x0174:
            androidx.constraintlayout.a.b r4 = r0.f4778s
            r0.m4499t(r4)
            int r4 = r2.f4790d
            r5 = -1
            if (r4 != r5) goto L_0x01a1
            androidx.constraintlayout.a.i r4 = r1.f4477a
            if (r4 != r2) goto L_0x018b
            androidx.constraintlayout.a.i r2 = r1.mo4547a(r7, r2)
            if (r2 == 0) goto L_0x018b
            r1.mo4548b(r2)
        L_0x018b:
            boolean r2 = r1.f4480d
            if (r2 != 0) goto L_0x0194
            androidx.constraintlayout.a.i r2 = r1.f4477a
            r2.mo4698e(r0, r1)
        L_0x0194:
            androidx.constraintlayout.a.c r2 = r0.f4770j
            androidx.constraintlayout.a.e r2 = r2.f4758b
            r2.mo4688b(r1)
            int r2 = r0.f4769i
            r4 = -1
            int r2 = r2 + r4
            r0.f4769i = r2
        L_0x01a1:
            r5 = 1
            goto L_0x01a4
        L_0x01a3:
            r5 = 0
        L_0x01a4:
            androidx.constraintlayout.a.i r2 = r1.f4477a
            if (r2 == 0) goto L_0x01b5
            int r2 = r2.f4800n
            if (r2 == r3) goto L_0x01b2
            float r2 = r1.f4478b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01b5
        L_0x01b2:
            if (r5 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return
        L_0x01b6:
            r16.m4495p(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.C1649d.mo4677e(androidx.constraintlayout.a.b):void");
    }

    /* renamed from: f */
    public final void mo4678f(C1654i iVar, int i) {
        int i2 = iVar.f4790d;
        if (i2 == -1) {
            iVar.mo4697d(this, (float) i);
            for (int i3 = 0; i3 < this.f4764d + 1; i3++) {
                C1654i iVar2 = this.f4770j.f4757a[i3];
            }
        } else if (i2 != -1) {
            C1614b bVar = this.f4765e[i2];
            if (bVar.f4480d) {
                bVar.f4478b = (float) i;
            } else if (bVar.f4481e.f4360a == 0) {
                bVar.f4480d = true;
                bVar.f4478b = (float) i;
            } else {
                C1614b a = mo4673a();
                if (i < 0) {
                    a.f4478b = (float) (-i);
                    a.f4481e.mo4507g(iVar, 1.0f);
                } else {
                    a.f4478b = (float) i;
                    a.f4481e.mo4507g(iVar, -1.0f);
                }
                mo4677e(a);
            }
        } else {
            C1614b a2 = mo4673a();
            a2.f4477a = iVar;
            float f = (float) i;
            iVar.f4792f = f;
            a2.f4478b = f;
            a2.f4480d = true;
            mo4677e(a2);
        }
    }

    /* renamed from: g */
    public final void mo4679g(C1654i iVar, C1654i iVar2, int i, int i2) {
        C1614b a = mo4673a();
        C1654i c = mo4675c();
        c.f4791e = 0;
        a.mo4554h(iVar, iVar2, c, i);
        if (i2 != 8) {
            float a2 = a.f4481e.mo4501a(c);
            a.f4481e.mo4507g(mo4686o(i2), (float) ((int) (-a2)));
        }
        mo4677e(a);
    }

    /* renamed from: h */
    public final void mo4680h(C1654i iVar, C1654i iVar2, int i, int i2) {
        C1614b a = mo4673a();
        C1654i c = mo4675c();
        c.f4791e = 0;
        a.mo4555i(iVar, iVar2, c, i);
        if (i2 != 8) {
            float a2 = a.f4481e.mo4501a(c);
            a.f4481e.mo4507g(mo4686o(i2), (float) ((int) (-a2)));
        }
        mo4677e(a);
    }

    /* renamed from: i */
    public final void mo4681i() {
        C1614b bVar = this.f4777r;
        if (bVar.mo4551e()) {
            m4496q();
        } else if (this.f4767g) {
            for (int i = 0; i < this.f4769i; i++) {
                if (!this.f4765e[i].f4480d) {
                    mo4683k(this.f4777r);
                    return;
                }
            }
            m4496q();
        } else {
            mo4683k(bVar);
        }
    }

    /* renamed from: j */
    public final void mo4682j() {
        C1648c cVar;
        int i = 0;
        while (true) {
            cVar = this.f4770j;
            C1654i[] iVarArr = cVar.f4757a;
            if (i >= iVarArr.length) {
                break;
            }
            C1654i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo4695c();
            }
            i++;
        }
        C1650e eVar = cVar.f4759c;
        C1654i[] iVarArr2 = this.f4775p;
        int i2 = this.f4776q;
        int length = iVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1654i iVar2 = iVarArr2[i3];
            int i4 = eVar.f4780b;
            if (i4 < 256) {
                eVar.f4779a[i4] = iVar2;
                eVar.f4780b = i4 + 1;
            }
        }
        this.f4776q = 0;
        Arrays.fill(this.f4770j.f4757a, (Object) null);
        this.f4764d = 0;
        C1653h hVar = (C1653h) this.f4777r;
        hVar.f4783f = 0;
        hVar.f4478b = 0.0f;
        this.f4768h = 1;
        for (int i5 = 0; i5 < this.f4769i; i5++) {
            C1614b bVar = this.f4765e[i5];
        }
        m4498s();
        this.f4769i = 0;
        this.f4778s = new C1614b(this.f4770j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo4683k(C1614b bVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f4769i) {
                break;
            }
            C1614b bVar2 = this.f4765e[i];
            if (bVar2.f4477a.f4800n != 1) {
                float f = 0.0f;
                if (bVar2.f4478b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f4769i) {
                            C1614b bVar3 = this.f4765e[i3];
                            if (bVar3.f4477a.f4800n != 1 && !bVar3.f4480d && bVar3.f4478b < f) {
                                int i7 = bVar3.f4481e.f4360a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    C1654i d = bVar3.f4481e.mo4504d(i8);
                                    float a = bVar3.f4481e.mo4501a(d);
                                    if (a > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.f4794h[i9] / a;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i5 = d.f4789c;
                                                i6 = i9;
                                                f2 = f3;
                                                i4 = i3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            C1614b bVar4 = this.f4765e[i4];
                            bVar4.f4477a.f4790d = -1;
                            bVar4.mo4548b(this.f4770j.f4757a[i5]);
                            C1654i iVar = bVar4.f4477a;
                            iVar.f4790d = i4;
                            iVar.mo4698e(this, bVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.f4768h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        m4499t(bVar);
        m4496q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4684l(androidx.constraintlayout.p079a.C1654i r6, androidx.constraintlayout.p079a.C1654i r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L_0x0018
            boolean r9 = r7.f4793g
            if (r9 == 0) goto L_0x0016
            int r9 = r6.f4790d
            r1 = -1
            if (r9 == r1) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            float r7 = r7.f4792f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.mo4697d(r5, r7)
            return
        L_0x0016:
            r9 = 8
        L_0x0018:
            androidx.constraintlayout.a.b r1 = r5.mo4673a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L_0x0039
            if (r8 >= 0) goto L_0x0027
            int r8 = -r8
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            float r8 = (float) r8
            r1.f4478b = r8
            if (r4 != 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            androidx.constraintlayout.a.a r8 = r1.f4481e
            r8.mo4507g(r6, r2)
            androidx.constraintlayout.a.a r6 = r1.f4481e
            r6.mo4507g(r7, r3)
            goto L_0x0043
        L_0x0039:
            androidx.constraintlayout.a.a r8 = r1.f4481e
            r8.mo4507g(r6, r3)
            androidx.constraintlayout.a.a r6 = r1.f4481e
            r6.mo4507g(r7, r2)
        L_0x0043:
            if (r9 == r0) goto L_0x0048
            r1.mo4552f(r5, r9)
        L_0x0048:
            r5.mo4677e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.C1649d.mo4684l(androidx.constraintlayout.a.i, androidx.constraintlayout.a.i, int, int):void");
    }

    /* renamed from: m */
    public final void mo4685m(C1654i iVar, C1654i iVar2, C1654i iVar3, C1654i iVar4, float f) {
        C1614b a = mo4673a();
        a.mo4553g(iVar, iVar2, iVar3, iVar4, f);
        mo4677e(a);
    }

    /* renamed from: o */
    public final C1654i mo4686o(int i) {
        if (this.f4768h + 1 >= this.f4772m) {
            m4497r();
        }
        C1654i u = m4500u(4);
        int i2 = this.f4764d + 1;
        this.f4764d = i2;
        this.f4768h++;
        u.f4789c = i2;
        u.f4791e = i;
        this.f4770j.f4757a[i2] = u;
        C1653h hVar = (C1653h) this.f4777r;
        C1652g gVar = hVar.f4784g;
        gVar.f4781a = u;
        Arrays.fill(gVar.f4781a.f4795i, 0.0f);
        u.f4795i[u.f4791e] = 1.0f;
        hVar.mo4691m(u);
        return u;
    }

    /* renamed from: p */
    private final void m4495p(C1614b bVar) {
        int i;
        if (bVar.f4480d) {
            bVar.f4477a.mo4697d(this, bVar.f4478b);
        } else {
            C1614b[] bVarArr = this.f4765e;
            int i2 = this.f4769i;
            bVarArr[i2] = bVar;
            C1654i iVar = bVar.f4477a;
            iVar.f4790d = i2;
            this.f4769i = i2 + 1;
            iVar.mo4698e(this, bVar);
        }
        if (this.f4763c) {
            int i3 = 0;
            while (i3 < this.f4769i) {
                if (this.f4765e[i3] == null) {
                    System.out.println("WTF");
                }
                C1614b bVar2 = this.f4765e[i3];
                if (bVar2 != null && bVar2.f4480d) {
                    bVar2.f4477a.mo4697d(this, bVar2.f4478b);
                    this.f4770j.f4758b.mo4688b(bVar2);
                    this.f4765e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f4769i;
                        if (i4 >= i) {
                            break;
                        }
                        C1614b[] bVarArr2 = this.f4765e;
                        int i6 = i4 - 1;
                        C1614b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        C1654i iVar2 = bVar3.f4477a;
                        if (iVar2.f4790d == i4) {
                            iVar2.f4790d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f4765e[i5] = null;
                    }
                    this.f4769i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4763c = false;
        }
    }
}
