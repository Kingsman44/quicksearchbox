package com.google.android.apps.search.podcasts.language;

import android.view.View;
import com.google.android.material.bottomsheet.C44555f;

/* renamed from: com.google.android.apps.search.podcasts.language.g */
/* compiled from: PG */
public final class C140542g extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C140539e f381711a;

    /* renamed from: b */
    final /* synthetic */ View f381712b;

    public C140542g(C140539e eVar, View view) {
        this.f381711a = eVar;
        this.f381712b = view;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        View view2 = this.f381712b;
        view2.setTranslationY(f < -0.5f ? (-f) * ((float) view2.getHeight()) : 0.0f);
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        if (i == 1) {
            this.f381711a.mo115723c();
            i = 1;
        }
        this.f381711a.mo115724d(i == 3 ? 4 : 0);
    }
}
