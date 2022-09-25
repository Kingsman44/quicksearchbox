package com.google.android.apps.gsa.shared.p7148ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;

/* renamed from: com.google.android.apps.gsa.shared.ui.bd */
/* compiled from: PG */
public abstract class C90659bd implements View.OnFocusChangeListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo84953a(boolean z);

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            if (C89941l.m146510a(view) == -1 && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            C89932c.f246391b.mo83778h(view, 5);
        }
        mo84953a(z);
    }
}
