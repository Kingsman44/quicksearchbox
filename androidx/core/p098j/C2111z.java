package androidx.core.p098j;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.j.z */
/* compiled from: PG */
public final class C2111z {

    /* renamed from: a */
    public boolean f6017a;

    /* renamed from: b */
    private ViewParent f6018b;

    /* renamed from: c */
    private ViewParent f6019c;

    /* renamed from: d */
    private final View f6020d;

    /* renamed from: e */
    private int[] f6021e;

    public C2111z(View view) {
        this.f6020d = view;
    }

    /* renamed from: i */
    private final ViewParent m5817i(int i) {
        return i != 0 ? this.f6019c : this.f6018b;
    }

    /* renamed from: j */
    private final void m5818j(int i, ViewParent viewParent) {
        if (i != 0) {
            this.f6019c = viewParent;
        } else {
            this.f6018b = viewParent;
        }
    }

    /* renamed from: k */
    private final int[] m5819k() {
        if (this.f6021e == null) {
            this.f6021e = new int[2];
        }
        return this.f6021e;
    }

    /* renamed from: a */
    public final void mo5279a(boolean z) {
        if (this.f6017a) {
            C2043bi.m5563aq(this.f6020d);
        }
        this.f6017a = z;
    }

    /* renamed from: b */
    public final void mo5280b(int i) {
        ViewParent i2 = m5817i(i);
        if (i2 != null) {
            C2053bs.m5624d(i2, this.f6020d, i);
            m5818j(i, (ViewParent) null);
        }
    }

    /* renamed from: c */
    public final boolean mo5281c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.f6017a || (viewParent = this.f6018b) == null) {
            return false;
        }
        return C2053bs.m5625e(viewParent, this.f6020d, f, f2, z);
    }

    /* renamed from: d */
    public final boolean mo5282d(float f, float f2) {
        ViewParent viewParent;
        if (!this.f6017a || (viewParent = this.f6018b) == null) {
            return false;
        }
        return C2053bs.m5626f(viewParent, this.f6020d, f, f2);
    }

    /* renamed from: e */
    public final boolean mo5283e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        int i7;
        if (!this.f6017a || (i4 = m5817i(i3)) == null) {
            return false;
        }
        if (i != 0) {
            i5 = i;
        } else if (i2 != 0) {
            i5 = 0;
        } else {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f6020d.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            iArr = m5819k();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C2053bs.m5621a(i4, this.f6020d, i5, i2, iArr, i3);
        if (iArr2 != null) {
            this.f6020d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: f */
    public final boolean mo5284f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.f6017a || (i6 = m5817i(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i9 = i;
            i8 = i2;
            i7 = i3;
        } else if (i2 != 0) {
            i8 = i2;
            i7 = i3;
            i9 = 0;
        } else if (i3 != 0) {
            i7 = i3;
            i9 = 0;
            i8 = 0;
        } else if (i4 != 0) {
            i9 = 0;
            i8 = 0;
            i7 = 0;
        } else {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f6020d.getLocationInWindow(iArr4);
            i11 = iArr4[0];
            i10 = iArr4[1];
        } else {
            i11 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] k = m5819k();
            k[0] = 0;
            k[1] = 0;
            iArr3 = k;
        } else {
            iArr3 = iArr2;
        }
        C2053bs.m5622b(i6, this.f6020d, i9, i8, i7, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f6020d.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i11;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo5285g(int i) {
        return m5817i(i) != null;
    }

    /* renamed from: h */
    public final boolean mo5286h(int i, int i2) {
        if (mo5285g(i2)) {
            return true;
        }
        if (!this.f6017a) {
            return false;
        }
        View view = this.f6020d;
        for (ViewParent parent = this.f6020d.getParent(); parent != null; parent = parent.getParent()) {
            if (C2053bs.m5627g(parent, view, this.f6020d, i, i2)) {
                m5818j(i2, parent);
                C2053bs.m5623c(parent, view, this.f6020d, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }
}
