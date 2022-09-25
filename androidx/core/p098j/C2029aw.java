package androidx.core.p098j;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.j.aw */
/* compiled from: PG */
final class C2029aw implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    C2082cp f5939a = null;

    /* renamed from: b */
    final /* synthetic */ View f5940b;

    /* renamed from: c */
    final /* synthetic */ C2010ad f5941c;

    public C2029aw(View view, C2010ad adVar) {
        this.f5940b = view;
        this.f5941c = adVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2082cp h = C2082cp.m5717h(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            C2030ax.m5439i(windowInsets, this.f5940b);
            if (h.equals(this.f5939a)) {
                return this.f5941c.mo1337a(view, h).mo5243e();
            }
        }
        this.f5939a = h;
        C2082cp a = this.f5941c.mo1337a(view, h);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.mo5243e();
        }
        C2043bi.m5524R(view);
        return a.mo5243e();
    }
}
