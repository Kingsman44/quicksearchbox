package androidx.constraintlayout.p079a;

import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b */
/* compiled from: PG */
public class C1614b {

    /* renamed from: a */
    C1654i f4477a = null;

    /* renamed from: b */
    public float f4478b = 0.0f;

    /* renamed from: c */
    final ArrayList f4479c = new ArrayList();

    /* renamed from: d */
    boolean f4480d = false;

    /* renamed from: e */
    public C1590a f4481e;

    public C1614b() {
    }

    /* renamed from: l */
    public static final boolean m4291l(C1654i iVar) {
        return iVar.f4798l <= 1;
    }

    /* renamed from: a */
    public final C1654i mo4547a(boolean[] zArr, C1654i iVar) {
        int i;
        int i2 = this.f4481e.f4360a;
        C1654i iVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.f4481e.mo4502b(i3);
            if (b < 0.0f) {
                C1654i d = this.f4481e.mo4504d(i3);
                if ((zArr == null || !zArr[d.f4789c]) && d != iVar && (((i = d.f4800n) == 3 || i == 4) && b < f)) {
                    f = b;
                    iVar2 = d;
                }
            }
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4548b(C1654i iVar) {
        C1654i iVar2 = this.f4477a;
        if (iVar2 != null) {
            this.f4481e.mo4507g(iVar2, -1.0f);
            this.f4477a.f4790d = -1;
            this.f4477a = null;
        }
        float f = -this.f4481e.mo4503c(iVar, true);
        this.f4477a = iVar;
        if (f != 1.0f) {
            this.f4478b /= f;
            C1590a aVar = this.f4481e;
            int i = aVar.f4365f;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f4360a) {
                float[] fArr = aVar.f4364e;
                fArr[i] = fArr[i] / f;
                i = aVar.f4363d[i];
                i2++;
            }
        }
    }

    /* renamed from: c */
    public final void mo4549c(C1649d dVar, C1654i iVar, boolean z) {
        if (iVar != null && iVar.f4793g) {
            this.f4478b += iVar.f4792f * this.f4481e.mo4501a(iVar);
            this.f4481e.mo4503c(iVar, z);
            if (z) {
                iVar.mo4694b(this);
            }
            if (this.f4481e.f4360a == 0) {
                this.f4480d = true;
                dVar.f4763c = true;
            }
        }
    }

    /* renamed from: d */
    public void mo4550d(C1649d dVar, C1614b bVar, boolean z) {
        C1590a aVar = this.f4481e;
        float a = aVar.mo4501a(bVar.f4477a);
        aVar.mo4503c(bVar.f4477a, z);
        C1590a aVar2 = bVar.f4481e;
        int i = aVar2.f4360a;
        for (int i2 = 0; i2 < i; i2++) {
            C1654i d = aVar2.mo4504d(i2);
            aVar.mo4505e(d, aVar2.mo4501a(d) * a, z);
        }
        this.f4478b += bVar.f4478b * a;
        if (z) {
            bVar.f4477a.mo4694b(this);
        }
        if (this.f4477a != null && this.f4481e.f4360a == 0) {
            this.f4480d = true;
            dVar.f4763c = true;
        }
    }

    /* renamed from: e */
    public boolean mo4551e() {
        return this.f4477a == null && this.f4478b == 0.0f && this.f4481e.f4360a == 0;
    }

    /* renamed from: f */
    public final void mo4552f(C1649d dVar, int i) {
        this.f4481e.mo4507g(dVar.mo4686o(i), 1.0f);
        this.f4481e.mo4507g(dVar.mo4686o(i), -1.0f);
    }

    /* renamed from: g */
    public final void mo4553g(C1654i iVar, C1654i iVar2, C1654i iVar3, C1654i iVar4, float f) {
        this.f4481e.mo4507g(iVar, -1.0f);
        this.f4481e.mo4507g(iVar2, 1.0f);
        this.f4481e.mo4507g(iVar3, f);
        this.f4481e.mo4507g(iVar4, -f);
    }

    /* renamed from: h */
    public final void mo4554h(C1654i iVar, C1654i iVar2, C1654i iVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f4478b = (float) i;
            if (z) {
                this.f4481e.mo4507g(iVar, 1.0f);
                this.f4481e.mo4507g(iVar2, -1.0f);
                this.f4481e.mo4507g(iVar3, -1.0f);
                return;
            }
        }
        this.f4481e.mo4507g(iVar, -1.0f);
        this.f4481e.mo4507g(iVar2, 1.0f);
        this.f4481e.mo4507g(iVar3, 1.0f);
    }

    /* renamed from: i */
    public final void mo4555i(C1654i iVar, C1654i iVar2, C1654i iVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f4478b = (float) i;
            if (z) {
                this.f4481e.mo4507g(iVar, 1.0f);
                this.f4481e.mo4507g(iVar2, -1.0f);
                this.f4481e.mo4507g(iVar3, 1.0f);
                return;
            }
        }
        this.f4481e.mo4507g(iVar, -1.0f);
        this.f4481e.mo4507g(iVar2, 1.0f);
        this.f4481e.mo4507g(iVar3, -1.0f);
    }

    /* renamed from: j */
    public final void mo4556j(C1654i iVar, C1654i iVar2, C1654i iVar3, C1654i iVar4, float f) {
        this.f4481e.mo4507g(iVar3, 0.5f);
        this.f4481e.mo4507g(iVar4, 0.5f);
        this.f4481e.mo4507g(iVar, -0.5f);
        this.f4481e.mo4507g(iVar2, -0.5f);
        this.f4478b = -f;
    }

    /* renamed from: k */
    public C1654i mo4557k(boolean[] zArr) {
        return mo4547a(zArr, (C1654i) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.a.i r0 = r9.f4477a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0011
        L_0x0007:
            java.lang.String r1 = ""
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.concat(r0)
        L_0x0011:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r9.f4478b
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0031
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            androidx.constraintlayout.a.a r5 = r9.f4481e
            int r5 = r5.f4360a
        L_0x0036:
            if (r2 >= r5) goto L_0x0095
            androidx.constraintlayout.a.a r6 = r9.f4481e
            androidx.constraintlayout.a.i r6 = r6.mo4504d(r2)
            if (r6 != 0) goto L_0x0041
            goto L_0x0092
        L_0x0041:
            androidx.constraintlayout.a.a r7 = r9.f4481e
            float r7 = r7.mo4502b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x004c
            goto L_0x0092
        L_0x004c:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x005d
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x006f
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
            goto L_0x006e
        L_0x005d:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0068
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L_0x006f
        L_0x0068:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
        L_0x006e:
            float r7 = -r7
        L_0x006f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007a
            java.lang.String r0 = r0.concat(r6)
            goto L_0x0091
        L_0x007a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0091:
            r1 = 1
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0095:
            if (r1 != 0) goto L_0x009d
            java.lang.String r1 = "0.0"
            java.lang.String r0 = r0.concat(r1)
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.C1614b.toString():java.lang.String");
    }

    public C1614b(C1648c cVar) {
        this.f4481e = new C1590a(this, cVar);
    }
}
