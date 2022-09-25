package androidx.p060c;

import androidx.p060c.p061a.C0969a;

/* renamed from: androidx.c.o */
/* compiled from: PG */
public final class C0985o implements Cloneable {
    @Deprecated

    /* renamed from: a */
    public static final Object f3123a = new Object();

    /* renamed from: b */
    public boolean f3124b;

    /* renamed from: c */
    public int[] f3125c;

    /* renamed from: d */
    public Object[] f3126d;

    /* renamed from: e */
    public int f3127e;

    public C0985o() {
        this(10);
    }

    /* renamed from: a */
    public final int mo3721a(int i) {
        if (this.f3124b) {
            mo3729h();
        }
        return C0969a.m2915a(this.f3125c, this.f3127e, i);
    }

    /* renamed from: b */
    public final int mo3722b(Object obj) {
        if (this.f3124b) {
            mo3729h();
        }
        int i = this.f3127e;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3126d[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo3723c(int i) {
        if (this.f3124b) {
            mo3729h();
        }
        return this.f3125c[i];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C0985o oVar = (C0985o) super.clone();
        oVar.f3125c = (int[]) this.f3125c.clone();
        oVar.f3126d = (Object[]) this.f3126d.clone();
        return oVar;
    }

    /* renamed from: d */
    public final int mo3725d() {
        if (this.f3124b) {
            mo3729h();
        }
        return this.f3127e;
    }

    /* renamed from: e */
    public final Object mo3726e(int i) {
        Object obj;
        int a = C0969a.m2915a(this.f3125c, this.f3127e, i);
        if (a < 0 || (obj = this.f3126d[a]) == f3123a) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public final Object mo3727f(int i) {
        if (this.f3124b) {
            mo3729h();
        }
        return this.f3126d[i];
    }

    /* renamed from: g */
    public final void mo3728g() {
        int i = this.f3127e;
        Object[] objArr = this.f3126d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3127e = 0;
        this.f3124b = false;
    }

    /* renamed from: h */
    public final void mo3729h() {
        int i = this.f3127e;
        int[] iArr = this.f3125c;
        Object[] objArr = this.f3126d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3123a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3124b = false;
        this.f3127e = i2;
    }

    /* renamed from: i */
    public final void mo3730i(int i, Object obj) {
        int a = C0969a.m2915a(this.f3125c, this.f3127e, i);
        if (a >= 0) {
            this.f3126d[a] = obj;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f3127e;
        if (i2 < i3) {
            Object[] objArr = this.f3126d;
            if (objArr[i2] == f3123a) {
                this.f3125c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3124b && i3 >= this.f3125c.length) {
            mo3729h();
            i2 = C0969a.m2915a(this.f3125c, this.f3127e, i) ^ -1;
        }
        int i4 = this.f3127e;
        int[] iArr = this.f3125c;
        int length = iArr.length;
        if (i4 >= length) {
            int d = C0969a.m2918d(i4 + 1);
            int[] iArr2 = new int[d];
            Object[] objArr2 = new Object[d];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.f3126d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3125c = iArr2;
            this.f3126d = objArr2;
        }
        int i5 = this.f3127e - i2;
        if (i5 != 0) {
            int[] iArr3 = this.f3125c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5);
            Object[] objArr4 = this.f3126d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f3127e - i2);
        }
        this.f3125c[i2] = i;
        this.f3126d[i2] = obj;
        this.f3127e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f3126d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3731j(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f3125c
            int r1 = r3.f3127e
            int r4 = androidx.p060c.p061a.C0969a.m2915a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f3126d
            r1 = r0[r4]
            java.lang.Object r2 = f3123a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f3124b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060c.C0985o.mo3731j(int):void");
    }

    /* renamed from: k */
    public final boolean mo3732k(Object obj) {
        return mo3722b(obj) >= 0;
    }

    public final String toString() {
        if (mo3725d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3127e * 28);
        sb.append('{');
        int i = this.f3127e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(mo3723c(i2));
            sb.append('=');
            Object f = mo3727f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0985o(int i) {
        int d = C0969a.m2918d(i);
        this.f3125c = new int[d];
        this.f3126d = new Object[d];
    }
}
