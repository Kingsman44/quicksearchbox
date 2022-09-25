package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p092d.C1886a;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2101p;
import java.util.List;

/* renamed from: com.google.android.material.appbar.w */
/* compiled from: PG */
abstract class C44527w extends C44529y {

    /* renamed from: a */
    final Rect f115768a = new Rect();

    /* renamed from: b */
    final Rect f115769b = new Rect();

    /* renamed from: c */
    public int f115770c = 0;

    /* renamed from: d */
    public int f115771d;

    public C44527w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo47463W(CoordinatorLayout coordinatorLayout, View view, int i) {
        View v = mo47430v(coordinatorLayout.mo4914b(view));
        if (v != null) {
            C1773f fVar = (C1773f) view.getLayoutParams();
            Rect rect = this.f115768a;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, v.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + v.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C2082cp cpVar = coordinatorLayout.f5503f;
            if (cpVar != null && C2043bi.m5564ar(coordinatorLayout) && !C2043bi.m5564ar(view)) {
                rect.left += cpVar.mo5240b();
                rect.right -= cpVar.mo5241c();
            }
            Rect rect2 = this.f115769b;
            int i2 = fVar.f5525c;
            C2101p.m5783a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int x = mo47464x(v);
            view.layout(rect2.left, rect2.top - x, rect2.right, rect2.bottom - x);
            this.f115770c = rect2.top - v.getBottom();
            return;
        }
        coordinatorLayout.mo4927k(view, i);
        this.f115770c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo34098s() {
        return false;
    }

    /* renamed from: t */
    public float mo47428t(View view) {
        throw null;
    }

    /* renamed from: u */
    public int mo47429u(View view) {
        throw null;
    }

    /* renamed from: v */
    public abstract View mo47430v(List list);

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final int mo47464x(View view) {
        if (this.f115771d == 0) {
            return 0;
        }
        float t = mo47428t(view);
        int i = this.f115771d;
        return C1886a.m5145c((int) (t * ((float) i)), 0, i);
    }

    public C44527w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
