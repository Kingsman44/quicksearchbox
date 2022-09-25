package android.support.constraint.p029a;

/* renamed from: android.support.constraint.a.b */
/* compiled from: PG */
public final class C0139b {

    /* renamed from: a */
    C0144g f502a = null;

    /* renamed from: b */
    float f503b = 0.0f;

    /* renamed from: c */
    boolean f504c = false;

    /* renamed from: d */
    public final C0130a f505d;

    /* renamed from: e */
    boolean f506e = false;

    public C0139b(C0140c cVar) {
        this.f505d = new C0130a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo158a(C0144g gVar) {
        C0144g gVar2 = this.f502a;
        if (gVar2 != null) {
            this.f505d.mo119f(gVar2, -1.0f);
            this.f502a = null;
        }
        float f = -this.f505d.mo116c(gVar);
        this.f502a = gVar;
        if (f != 1.0f) {
            this.f503b /= f;
            C0130a aVar = this.f505d;
            int i = aVar.f399f;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f394a) {
                float[] fArr = aVar.f398e;
                fArr[i] = fArr[i] / f;
                i = aVar.f397d[i];
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final void mo159b(C0144g gVar, C0144g gVar2) {
        this.f505d.mo119f(gVar, 1.0f);
        this.f505d.mo119f(gVar2, -1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo160c(C0144g gVar, C0144g gVar2, int i, float f, C0144g gVar3, C0144g gVar4, int i2) {
        if (gVar2 == gVar3) {
            this.f505d.mo119f(gVar, 1.0f);
            this.f505d.mo119f(gVar4, 1.0f);
            this.f505d.mo119f(gVar2, -2.0f);
        } else if (f == 0.5f) {
            this.f505d.mo119f(gVar, 1.0f);
            this.f505d.mo119f(gVar2, -1.0f);
            this.f505d.mo119f(gVar3, -1.0f);
            this.f505d.mo119f(gVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f503b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f505d.mo119f(gVar, -1.0f);
            this.f505d.mo119f(gVar2, 1.0f);
            this.f503b = (float) i;
        } else if (f >= 1.0f) {
            this.f505d.mo119f(gVar3, -1.0f);
            this.f505d.mo119f(gVar4, 1.0f);
            this.f503b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f505d.mo119f(gVar, f2);
            this.f505d.mo119f(gVar2, -f2);
            this.f505d.mo119f(gVar3, -f);
            this.f505d.mo119f(gVar4, f);
            if (i > 0 || i2 > 0) {
                this.f503b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
    }

    /* renamed from: d */
    public final void mo161d(C0144g gVar, C0144g gVar2, C0144g gVar3, C0144g gVar4, float f) {
        this.f505d.mo119f(gVar, -1.0f);
        this.f505d.mo119f(gVar2, 1.0f);
        this.f505d.mo119f(gVar3, f);
        this.f505d.mo119f(gVar4, -f);
    }

    /* renamed from: f */
    public final void mo163f(C0144g gVar, int i) {
        if (i < 0) {
            this.f503b = (float) (-i);
            this.f505d.mo119f(gVar, 1.0f);
            return;
        }
        this.f503b = (float) i;
        this.f505d.mo119f(gVar, -1.0f);
    }

    /* renamed from: g */
    public final void mo164g(C0144g gVar, C0144g gVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f503b = (float) i;
            if (z) {
                this.f505d.mo119f(gVar, 1.0f);
                this.f505d.mo119f(gVar2, -1.0f);
                return;
            }
        }
        this.f505d.mo119f(gVar, -1.0f);
        this.f505d.mo119f(gVar2, 1.0f);
    }

    /* renamed from: h */
    public final void mo165h(C0144g gVar, C0144g gVar2, C0144g gVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f503b = (float) i;
            if (z) {
                this.f505d.mo119f(gVar, 1.0f);
                this.f505d.mo119f(gVar2, -1.0f);
                this.f505d.mo119f(gVar3, -1.0f);
                return;
            }
        }
        this.f505d.mo119f(gVar, -1.0f);
        this.f505d.mo119f(gVar2, 1.0f);
        this.f505d.mo119f(gVar3, 1.0f);
    }

    /* renamed from: i */
    public final void mo166i(C0144g gVar, C0144g gVar2, C0144g gVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f503b = (float) i;
            if (z) {
                this.f505d.mo119f(gVar, 1.0f);
                this.f505d.mo119f(gVar2, -1.0f);
                this.f505d.mo119f(gVar3, 1.0f);
                return;
            }
        }
        this.f505d.mo119f(gVar, -1.0f);
        this.f505d.mo119f(gVar2, 1.0f);
        this.f505d.mo119f(gVar3, -1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            android.support.constraint.a.g r0 = r7.f502a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x001b
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            android.support.constraint.a.g r2 = r7.f502a
            r0.append(r2)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r1.concat(r0)
        L_0x001b:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r7.f503b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r7.f503b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            android.support.constraint.a.a r5 = r7.f505d
            int r5 = r5.f394a
        L_0x0042:
            if (r2 >= r5) goto L_0x0097
            android.support.constraint.a.a r6 = r7.f505d
            android.support.constraint.a.g r6 = r6.mo117d(r2)
            if (r6 != 0) goto L_0x004d
            goto L_0x0094
        L_0x004d:
            android.support.constraint.a.a r6 = r7.f505d
            float r6 = r6.mo115b(r2)
            if (r1 != 0) goto L_0x0060
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0072
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0071
        L_0x0060:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x006b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0072
        L_0x006b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
        L_0x0071:
            float r6 = -r6
        L_0x0072:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "null"
            java.lang.String r0 = r0.concat(r1)
            goto L_0x0093
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " null"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0093:
            r1 = 1
        L_0x0094:
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0097:
            if (r1 != 0) goto L_0x009f
            java.lang.String r1 = "0.0"
            java.lang.String r0 = r0.concat(r1)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.C0139b.toString():java.lang.String");
    }

    /* renamed from: e */
    public final void mo162e(float f, float f2, float f3, C0144g gVar, int i, C0144g gVar2, int i2, C0144g gVar3, int i3, C0144g gVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f503b = (float) (((-i) - i2) + i3 + i4);
            this.f505d.mo119f(gVar, 1.0f);
            this.f505d.mo119f(gVar2, -1.0f);
            this.f505d.mo119f(gVar4, 1.0f);
            this.f505d.mo119f(gVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.f503b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
        this.f505d.mo119f(gVar, 1.0f);
        this.f505d.mo119f(gVar2, -1.0f);
        this.f505d.mo119f(gVar4, f4);
        this.f505d.mo119f(gVar3, -f4);
    }
}
