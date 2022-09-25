package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.material.internal.bh */
/* compiled from: PG */
final class C44736bh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f116599a;

    public C44736bh(View view) {
        this.f116599a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f116599a.getContext().getSystemService("input_method")).showSoftInput(this.f116599a, 1);
    }
}
