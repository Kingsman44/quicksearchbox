package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.core.widget.C2132s;

/* renamed from: android.support.v7.widget.al */
/* compiled from: PG */
final class C0514al extends PopupWindow {
    public C0514al(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C0735ip f = C0735ip.m2473f(context, attributeSet, C0338a.f1084t, i, 0);
        if (f.f2596b.hasValue(2)) {
            C2132s.m5903b(this, f.f2596b.getBoolean(2, false));
        }
        setBackgroundDrawable(f.mo3246b(0));
        f.f2596b.recycle();
    }
}
