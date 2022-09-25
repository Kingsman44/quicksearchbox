package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {

    /* renamed from: b */
    private View f118438b;

    /* renamed from: c */
    private int f118439c = 0;

    /* renamed from: d */
    private final RectF f118440d = new RectF();

    public StickyHeaderRecyclerView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f118440d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f118440d.left, -this.f118440d.top);
        return this.f118409a.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        super.draw(canvas);
        if (this.f118438b != null) {
            View view2 = this.f118409a;
            int save = canvas.save();
            if (view2 != null) {
                view = view2;
            } else {
                view = this.f118438b;
            }
            int top = view2 != null ? this.f118438b.getTop() : 0;
            if (view.getTop() + top < this.f118439c || !view.isShown()) {
                this.f118440d.set(0.0f, (float) ((-top) + this.f118439c), (float) view.getWidth(), (float) ((view.getHeight() - top) + this.f118439c));
                canvas.translate(0.0f, this.f118440d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f118440d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f118439c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f118438b == null && (view2 = this.f118409a) != null) {
            this.f118438b = view2.findViewWithTag("sticky");
        }
        if (this.f118438b != null && (view = this.f118409a) != null && view.getHeight() == 0) {
            view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f118438b != null) {
            measureChild(this.f118409a, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
