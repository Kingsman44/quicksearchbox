package com.google.android.libraries.gsa.imageviewer.reviewstars;

import android.view.View;

/* renamed from: com.google.android.libraries.gsa.imageviewer.reviewstars.a */
/* compiled from: PG */
public final /* synthetic */ class C22829a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReviewStarsView f62859a;

    public /* synthetic */ C22829a(ReviewStarsView reviewStarsView) {
        this.f62859a = reviewStarsView;
    }

    public final void run() {
        ReviewStarsView reviewStarsView = this.f62859a;
        reviewStarsView.setMinimumWidth(reviewStarsView.getHeight() * 5);
        for (int i = 0; i < reviewStarsView.getChildCount(); i++) {
            View childAt = reviewStarsView.getChildAt(i);
            childAt.getLayoutParams().width = childAt.getHeight();
            childAt.requestLayout();
        }
    }
}
