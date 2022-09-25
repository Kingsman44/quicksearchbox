package com.google.android.apps.search.podcasts.language;

import android.view.View;

/* renamed from: com.google.android.apps.search.podcasts.language.k */
/* compiled from: PG */
final class C140546k implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C140539e f381716a;

    public C140546k(C140539e eVar) {
        this.f381716a = eVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C140539e eVar = this.f381716a;
        if (z) {
            eVar.mo115722b();
        } else {
            eVar.mo115723c();
        }
    }
}
