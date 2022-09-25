package com.google.android.apps.search.podcasts.search;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.h */
/* compiled from: PG */
final class C141016h implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C141001b f382833a;

    /* renamed from: b */
    final /* synthetic */ EditText f382834b;

    public C141016h(C141001b bVar, EditText editText) {
        this.f382833a = bVar;
        this.f382834b = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        Object systemService = this.f382833a.f382804c.requireContext().getSystemService("input_method");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (!z) {
            inputMethodManager.hideSoftInputFromWindow(this.f382834b.getWindowToken(), 0);
        } else {
            inputMethodManager.showSoftInput(this.f382834b, 1);
        }
    }
}
