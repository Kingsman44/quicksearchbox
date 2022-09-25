package com.google.android.gms.car;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.LinearLayout;

/* renamed from: com.google.android.gms.car.cz */
/* compiled from: PG */
final class C143170cz extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ C143179df f388216a;

    /* renamed from: b */
    private final View f388217b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143170cz(C143179df dfVar, Context context, View view) {
        super(context);
        this.f388216a = dfVar;
        setOrientation(1);
        View view2 = new View(context);
        this.f388217b = view2;
        view2.setBackgroundColor(-16777216);
        addView(view2, new LinearLayout.LayoutParams(-1, 0));
        addView(view, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private final boolean m232265a() {
        int i = 0;
        if (!this.f388216a.f388228C) {
            return false;
        }
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 4) == 0 && (windowSystemUiVisibility & 1024) == 0;
        View view = this.f388217b;
        if (z) {
            i = this.f388216a.f388227B.top;
        }
        int i2 = -1;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        View view2 = this.f388217b;
        if ((windowSystemUiVisibility & 8192) == 0) {
            i2 = -16777216;
        }
        view2.setBackgroundColor(i2);
        return z;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return super.onApplyWindowInsets(windowInsets).consumeStableInsets().consumeDisplayCutout().replaceSystemWindowInsets(this.f388216a.f388227B.left, m232265a() ? 0 : this.f388216a.f388227B.top, this.f388216a.f388227B.right, this.f388216a.f388227B.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m232265a();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f388216a.f388254b) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                ((View) parent).setPadding(0, 0, 0, 0);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m232265a();
    }
}
