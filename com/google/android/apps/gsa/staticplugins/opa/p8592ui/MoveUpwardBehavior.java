package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.MoveUpwardBehavior */
/* compiled from: PG */
public class MoveUpwardBehavior extends C1770c {
    /* renamed from: b */
    public final void mo4954b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() + ((float) view2.getHeight())));
    }

    /* renamed from: e */
    public final boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - ((float) view2.getHeight())));
        return true;
    }

    /* renamed from: l */
    public final boolean mo4964l(View view, View view2) {
        return view2 instanceof Snackbar.SnackbarLayout;
    }
}
