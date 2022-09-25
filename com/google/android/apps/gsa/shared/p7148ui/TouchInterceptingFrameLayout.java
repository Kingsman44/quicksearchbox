package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window.C82189w;

/* renamed from: com.google.android.apps.gsa.shared.ui.TouchInterceptingFrameLayout */
/* compiled from: PG */
public class TouchInterceptingFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C90656ba f253398a;

    /* renamed from: b */
    public ViewTreeObserver.OnWindowFocusChangeListener f253399b;

    public TouchInterceptingFrameLayout(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C90656ba baVar = this.f253398a;
        if (baVar == null || !baVar.mo73061a(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.f253399b;
        if (onWindowFocusChangeListener != null) {
            ((C82189w) onWindowFocusChangeListener).f224621a.mo75534m(z);
        }
    }

    public TouchInterceptingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
