package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;

/* renamed from: androidx.core.j.ci */
/* compiled from: PG */
class C2075ci extends C2074ch {

    /* renamed from: c */
    private C1926c f5986c = null;

    public C2075ci(C2082cp cpVar, WindowInsets windowInsets) {
        super(cpVar, windowInsets);
    }

    /* renamed from: m */
    public final C1926c mo5229m() {
        if (this.f5986c == null) {
            this.f5986c = C1926c.m5198d(this.f5981a.getStableInsetLeft(), this.f5981a.getStableInsetTop(), this.f5981a.getStableInsetRight(), this.f5981a.getStableInsetBottom());
        }
        return this.f5986c;
    }

    /* renamed from: n */
    public C2082cp mo5230n() {
        return C2082cp.m5717h(this.f5981a.consumeStableInsets(), (View) null);
    }

    /* renamed from: o */
    public C2082cp mo5231o() {
        return C2082cp.m5717h(this.f5981a.consumeSystemWindowInsets(), (View) null);
    }

    /* renamed from: p */
    public boolean mo5232p() {
        return this.f5981a.isConsumed();
    }
}
