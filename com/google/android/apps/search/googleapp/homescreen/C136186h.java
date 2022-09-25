package com.google.android.apps.search.googleapp.homescreen;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136150a;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136152c;
import com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.h */
/* compiled from: PG */
final class C136186h implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C136193o f370878a;

    /* renamed from: b */
    final /* synthetic */ RestrictedWidthLayout f370879b;

    public C136186h(C136193o oVar, RestrictedWidthLayout restrictedWidthLayout) {
        this.f370878a = oVar;
        this.f370879b = restrictedWidthLayout;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i;
        C69664n.m101061g(view, "<anonymous parameter 0>");
        C69664n.m101061g(windowInsets, "insets");
        if (this.f370878a.f370906S.f101930a) {
            i = 0;
        } else {
            i = windowInsets.getSystemWindowInsetTop();
        }
        if (!this.f370878a.f370906S.f101930a) {
            C136152c cVar = this.f370878a.f370902O;
            C136150a aVar = null;
            if (cVar == null) {
                C69664n.m101065k("searchBoxScrollAndQuickReturnBehavior");
                cVar = null;
            }
            cVar.f370808b = windowInsets.getSystemWindowInsetTop();
            if (cVar.f370807a.getTranslationY() == 0.0f) {
                cVar.f370807a.setTranslationY((float) windowInsets.getSystemWindowInsetTop());
            }
            C136150a aVar2 = this.f370878a.f370901N;
            if (aVar2 == null) {
                C69664n.m101065k("headerScrollBehavior");
            } else {
                aVar = aVar2;
            }
            aVar.f370799b = windowInsets.getSystemWindowInsetTop();
        }
        if (this.f370879b.getTranslationY() == 0.0f) {
            this.f370879b.setTranslationY((float) i);
        }
        C134744f a = this.f370878a.mo112824a();
        if (a != null) {
            this.f370878a.mo112827m(a, i);
        }
        return windowInsets;
    }
}
