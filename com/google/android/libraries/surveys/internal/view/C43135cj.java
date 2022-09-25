package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import androidx.viewpager.widget.C4281n;

/* renamed from: com.google.android.libraries.surveys.internal.view.cj */
/* compiled from: PG */
final class C43135cj extends C4281n {

    /* renamed from: a */
    final /* synthetic */ SurveyViewPager f112816a;

    public C43135cj(SurveyViewPager surveyViewPager) {
        this.f112816a = surveyViewPager;
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        this.f112816a.invalidate();
        C43071a y = this.f112816a.mo46117y();
        if (y != null) {
            y.mo46122e();
            y.mo46121d();
            View view = y.getView();
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        this.f112816a.requestLayout();
    }
}
