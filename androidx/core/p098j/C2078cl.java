package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;

/* renamed from: androidx.core.j.cl */
/* compiled from: PG */
final class C2078cl extends C2077ck {

    /* renamed from: c */
    static final C2082cp f5990c = C2082cp.m5717h(WindowInsets.CONSUMED, (View) null);

    public C2078cl(C2082cp cpVar, WindowInsets windowInsets) {
        super(cpVar, windowInsets);
    }

    /* renamed from: a */
    public C1926c mo5216a(int i) {
        return C1926c.m5199e(this.f5981a.getInsets(C2081co.m5715a(i)));
    }

    /* renamed from: c */
    public C1926c mo5218c(int i) {
        return C1926c.m5199e(this.f5981a.getInsetsIgnoringVisibility(C2081co.m5715a(7)));
    }

    /* renamed from: f */
    public final void mo5222f(View view) {
    }

    /* renamed from: l */
    public boolean mo5228l(int i) {
        return this.f5981a.isVisible(C2081co.m5715a(8));
    }
}
