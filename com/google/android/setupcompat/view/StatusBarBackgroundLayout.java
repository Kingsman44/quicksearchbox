package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: PG */
public class StatusBarBackgroundLayout extends FrameLayout {

    /* renamed from: a */
    public Drawable f118306a;

    /* renamed from: b */
    private Object f118307b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f118307b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f118307b == null) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        Object obj = this.f118307b;
        if (obj != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.f118306a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f118306a.draw(canvas);
        }
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
