package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115560ag;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.d */
/* compiled from: PG */
final class C115582d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f320642a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f320643b;

    /* renamed from: c */
    final /* synthetic */ C115583e f320644c;

    public C115582d(C115583e eVar, int i, C58833ax axVar) {
        this.f320644c = eVar;
        this.f320642a = i;
        this.f320643b = axVar;
    }

    public final void onClick(View view) {
        C115560ag agVar = this.f320644c.f320652h;
        int i = this.f320642a;
        if (i < agVar.f320542a.f320584w.f136914b.size()) {
            agVar.f320542a.f320565d.mo101882m(i);
        }
        C115142a.m190821e(view, this.f320643b, 1393);
    }
}
