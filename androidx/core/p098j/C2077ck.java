package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;

/* renamed from: androidx.core.j.ck */
/* compiled from: PG */
class C2077ck extends C2076cj {

    /* renamed from: c */
    private C1926c f5987c = null;

    /* renamed from: f */
    private C1926c f5988f = null;

    /* renamed from: g */
    private C1926c f5989g = null;

    public C2077ck(C2082cp cpVar, WindowInsets windowInsets) {
        super(cpVar, windowInsets);
    }

    /* renamed from: e */
    public C2082cp mo5220e(int i, int i2, int i3, int i4) {
        return C2082cp.m5717h(this.f5981a.inset(i, i2, i3, i4), (View) null);
    }

    /* renamed from: s */
    public C1926c mo5236s() {
        if (this.f5988f == null) {
            this.f5988f = C1926c.m5199e(this.f5981a.getMandatorySystemGestureInsets());
        }
        return this.f5988f;
    }

    /* renamed from: t */
    public C1926c mo5237t() {
        if (this.f5987c == null) {
            this.f5987c = C1926c.m5199e(this.f5981a.getSystemGestureInsets());
        }
        return this.f5987c;
    }

    /* renamed from: u */
    public C1926c mo5238u() {
        if (this.f5989g == null) {
            this.f5989g = C1926c.m5199e(this.f5981a.getTappableElementInsets());
        }
        return this.f5989g;
    }
}
