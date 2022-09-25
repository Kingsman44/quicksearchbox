package com.google.android.libraries.abuse.reporting;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: PG */
public class ReportAbuseHorizontalScrollView extends HorizontalScrollView {
    public ReportAbuseHorizontalScrollView(Context context) {
        super(context);
        mo123532a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo123532a() {
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
    }

    public final boolean arrowScroll(int i) {
        return false;
    }

    public final void fling(int i) {
    }

    public final boolean fullScroll(int i) {
        return false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean pageScroll(int i) {
        return false;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 8192 || i == 4096) {
            return false;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public ReportAbuseHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo123532a();
    }

    public ReportAbuseHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo123532a();
    }
}
