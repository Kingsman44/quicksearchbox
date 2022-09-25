package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.C1773f;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ap */
/* compiled from: PG */
public final /* synthetic */ class C113941ap implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public static final /* synthetic */ C113941ap f315563a = new C113941ap();

    private /* synthetic */ C113941ap() {
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        C59071e eVar = C114071eg.f315790j;
        C1773f fVar = (C1773f) view.getLayoutParams();
        if (windowInsets.isVisible(8)) {
            i = 0;
        } else {
            i = windowInsets.getInsets(64).bottom;
        }
        fVar.bottomMargin = i;
        view.requestLayout();
        return windowInsets;
    }
}
