package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.C1773f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ao */
/* compiled from: PG */
public final /* synthetic */ class C113940ao implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315562a;

    public /* synthetic */ C113940ao(C114071eg egVar) {
        this.f315562a = egVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C114071eg egVar = this.f315562a;
        int i = 0;
        view.setPaddingRelative(view.getPaddingStart(), (!egVar.mo101039dm() || windowInsets.isVisible(8)) ? 0 : windowInsets.getInsets(1).top, view.getPaddingEnd(), (windowInsets.isVisible(8) || !egVar.mo101041du()) ? 0 : egVar.f315800J.mo75535a());
        C1773f fVar = (C1773f) view.getLayoutParams();
        if (!windowInsets.isVisible(8)) {
            i = windowInsets.getInsets(64).bottom;
        }
        fVar.bottomMargin = i;
        view.requestLayout();
        return windowInsets;
    }
}
