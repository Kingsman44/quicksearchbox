package android.support.p033v7.p040e;

/* renamed from: android.support.v7.e.b */
/* compiled from: PG */
public final class C0420b implements C0430l {

    /* renamed from: a */
    final C0430l f1410a;

    /* renamed from: b */
    int f1411b = 0;

    /* renamed from: c */
    int f1412c = -1;

    /* renamed from: d */
    int f1413d = -1;

    /* renamed from: e */
    Object f1414e = null;

    public C0420b(C0430l lVar) {
        this.f1410a = lVar;
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        mo1396e();
        this.f1410a.mo1394c(i, i2);
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        int i3;
        if (this.f1411b != 2 || (i3 = this.f1412c) < i || i3 > i + i2) {
            mo1396e();
            this.f1412c = i;
            this.f1413d = i2;
            this.f1411b = 2;
            return;
        }
        this.f1413d += i2;
        this.f1412c = i;
    }

    /* renamed from: e */
    public final void mo1396e() {
        int i = this.f1411b;
        if (i != 0) {
            if (i == 1) {
                this.f1410a.mo1393b(this.f1412c, this.f1413d);
            } else if (i != 2) {
                this.f1410a.mo1392a(this.f1412c, this.f1413d, this.f1414e);
            } else {
                this.f1410a.mo1395d(this.f1412c, this.f1413d);
            }
            this.f1414e = null;
            this.f1411b = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r5.f1412c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1392a(int r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            int r0 = r5.f1411b
            r1 = 3
            if (r0 != r1) goto L_0x0024
            int r0 = r5.f1412c
            int r2 = r5.f1413d
            int r2 = r2 + r0
            if (r6 > r2) goto L_0x0024
            int r3 = r6 + r7
            if (r3 < r0) goto L_0x0024
            java.lang.Object r4 = r5.f1414e
            if (r4 != r8) goto L_0x0024
            int r6 = java.lang.Math.min(r6, r0)
            r5.f1412c = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.f1412c
            int r6 = r6 - r7
            r5.f1413d = r6
            return
        L_0x0024:
            r5.mo1396e()
            r5.f1412c = r6
            r5.f1413d = r7
            r5.f1414e = r8
            r5.f1411b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.p040e.C0420b.mo1392a(int, int, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        int i3;
        if (this.f1411b == 1 && i >= (i3 = this.f1412c)) {
            int i4 = this.f1413d;
            if (i <= i3 + i4) {
                this.f1413d = i4 + i2;
                this.f1412c = Math.min(i, i3);
                return;
            }
        }
        mo1396e();
        this.f1412c = i;
        this.f1413d = i2;
        this.f1411b = 1;
    }
}
