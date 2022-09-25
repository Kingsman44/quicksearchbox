package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.view.ViewTreeObserver;
import android.widget.EditText;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.l */
/* compiled from: PG */
public final class C138610l implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f376968a;

    /* renamed from: b */
    final /* synthetic */ C138611m f376969b;

    public C138610l(EditText editText, C138611m mVar) {
        this.f376968a = editText;
        this.f376969b = mVar;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            EditText editText = this.f376968a;
            editText.post(new C138609k(this.f376969b, editText));
            this.f376968a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
