package com.google.android.libraries.onegoogle.accountmenu.features.education;

import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.tooltip.C31066b;
import com.google.android.libraries.onegoogle.tooltip.C31067c;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.p */
/* compiled from: PG */
final class C30598p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C31067c f82659a;

    /* renamed from: b */
    final /* synthetic */ View f82660b;

    /* renamed from: c */
    final /* synthetic */ C2391v f82661c;

    /* renamed from: d */
    final /* synthetic */ FragmentManager f82662d;

    /* renamed from: e */
    final /* synthetic */ C30601s f82663e;

    public C30598p(C30601s sVar, C31067c cVar, View view, C2391v vVar, FragmentManager fragmentManager) {
        this.f82663e = sVar;
        this.f82659a = cVar;
        this.f82660b = view;
        this.f82661c = vVar;
        this.f82662d = fragmentManager;
    }

    public final void onGlobalLayout() {
        if (C31066b.m57973a(this.f82659a)) {
            this.f82660b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f82663e.mo36290f(this.f82661c, this.f82662d, this.f82659a);
        }
    }
}
