package com.google.android.libraries.elements.p1714d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.libraries.elements.d.bj */
/* compiled from: PG */
public final /* synthetic */ class C20826bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f58346a;

    public /* synthetic */ C20826bj(View view) {
        this.f58346a = view;
    }

    public final void run() {
        View view = this.f58346a;
        String str = C20829bm.f58355a;
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}
