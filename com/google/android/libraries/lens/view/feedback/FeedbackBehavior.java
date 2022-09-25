package com.google.android.libraries.lens.view.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.C1770c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.lens.view.utils.C28122k;

/* compiled from: PG */
public final class FeedbackBehavior extends C1770c {

    /* renamed from: a */
    public boolean f70113a = false;

    /* renamed from: b */
    private final int f70114b;

    /* renamed from: c */
    private int f70115c = -1;

    /* renamed from: d */
    private int f70116d = -1;

    /* renamed from: e */
    private boolean f70117e = false;

    public FeedbackBehavior(Context context, int i) {
        super(context, (AttributeSet) null);
        this.f70114b = i;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FeedbackFooterView feedbackFooterView = (FeedbackFooterView) view;
        if (this.f70115c == -1) {
            this.f70115c = feedbackFooterView.getHeight();
        }
        if (this.f70116d == -1) {
            this.f70116d = C28122k.m52402b(view2);
        }
        float height = (-((float) ((view2.getTop() - coordinatorLayout.getTop()) - coordinatorLayout.getHeight()))) / ((float) coordinatorLayout.getHeight());
        this.f70117e = ((double) height) >= 0.8d;
        double d = (double) (1.0f - height);
        Double.isNaN(d);
        double d2 = 1.0d - (1.0d - (d / 0.19999999999999996d));
        double d3 = (double) this.f70115c;
        Double.isNaN(d3);
        feedbackFooterView.setTranslationY((float) (d2 * d3));
        mo30947s(feedbackFooterView);
        return true;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ boolean mo4964l(View view, View view2) {
        FeedbackFooterView feedbackFooterView = (FeedbackFooterView) view;
        return view2.getId() == this.f70114b;
    }

    /* renamed from: s */
    public final void mo30947s(FeedbackFooterView feedbackFooterView) {
        if (!this.f70113a || !this.f70117e) {
            feedbackFooterView.setVisibility(4);
        } else {
            feedbackFooterView.setVisibility(0);
        }
    }
}
