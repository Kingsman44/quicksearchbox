package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.w */
/* compiled from: PG */
final class C87649w implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C87651y f236908a;

    public C87649w(C87651y yVar) {
        this.f236908a = yVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((view instanceof ScrollView) && TextUtils.isEmpty(this.f236908a.f236911a.f236844au.mo84352bk()) && view.getHeight() > 0) {
            ScrollView scrollView = (ScrollView) view;
            boolean z = false;
            if (scrollView.getHeight() < scrollView.getChildAt(0).getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom()) {
                z = true;
            }
            this.f236908a.f236911a.f236786P.mo82421c(z);
            this.f236908a.f236911a.f236786P.mo82420a(scrollView.getHeight());
        }
    }
}
