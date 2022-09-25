package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;
import androidx.customview.p103b.C2149g;

/* renamed from: com.google.android.apps.gsa.shared.ui.aq */
/* compiled from: PG */
final class C90641aq extends C2149g {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissableFrameLayout f253495a;

    public C90641aq(SwipeDismissableFrameLayout swipeDismissableFrameLayout) {
        this.f253495a = swipeDismissableFrameLayout;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        return Math.max(-view.getHeight(), Math.min(0, i));
    }

    /* renamed from: d */
    public final int mo5395d(View view) {
        return view.getHeight();
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
        View view;
        SwipeDismissableFrameLayout swipeDismissableFrameLayout = this.f253495a;
        C90643as asVar = swipeDismissableFrameLayout.f253387b;
        if (asVar != null && i == 0 && (view = swipeDismissableFrameLayout.f253386a) != null && view.getTop() != 0) {
            asVar.mo84936c();
        }
    }

    /* renamed from: h */
    public final void mo5399h(View view, float f, float f2) {
        int top = view.getTop();
        int height = view.getHeight();
        int i = height / 3;
        int i2 = 0;
        if (f2 >= 0.0f ? !(f2 != 0.0f || top >= (-i)) : !(Math.abs(f2) <= this.f253495a.f253391f && top >= (-i))) {
            i2 = -height;
        }
        this.f253495a.f253389d.mo5411h(view.getLeft(), i2);
        this.f253495a.invalidate();
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        return true;
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        this.f253495a.f253390e.setAlpha((int) ((1.0f - (((float) Math.abs(i2)) / ((float) this.f253495a.getHeight()))) * 0.8f * 255.0f));
        this.f253495a.invalidate();
    }
}
