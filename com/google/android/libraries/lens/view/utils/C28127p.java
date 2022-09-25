package com.google.android.libraries.lens.view.utils;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.libraries.lens.view.feedback.FeedbackBannerView;

/* renamed from: com.google.android.libraries.lens.view.utils.p */
/* compiled from: PG */
final class C28127p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ TextView f76536a;

    /* renamed from: b */
    final /* synthetic */ FeedbackBannerView f76537b;

    public C28127p(TextView textView, FeedbackBannerView feedbackBannerView) {
        this.f76536a = textView;
        this.f76537b = feedbackBannerView;
    }

    public final void onGlobalLayout() {
        this.f76536a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f76536a.setMaxWidth(this.f76537b.getWidth() / 2);
    }
}
