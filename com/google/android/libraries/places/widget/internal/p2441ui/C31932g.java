package com.google.android.libraries.places.widget.internal.p2441ui;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.g */
/* compiled from: PG */
final class C31932g extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ AutocompleteImplFragment f85893a;

    public C31932g(AutocompleteImplFragment autocompleteImplFragment) {
        this.f85893a = autocompleteImplFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                AutocompleteImplFragment autocompleteImplFragment = this.f85893a;
                autocompleteImplFragment.f85867a.f85806b.f85861o = true;
                autocompleteImplFragment.f85869c.clearFocus();
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
    }
}
