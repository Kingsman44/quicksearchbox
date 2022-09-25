package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class StickyHeaderListView extends ListView {

    /* renamed from: a */
    private View f118434a;

    /* renamed from: b */
    private View f118435b;

    /* renamed from: c */
    private int f118436c = 0;

    /* renamed from: d */
    private final RectF f118437d = new RectF();

    public StickyHeaderListView(Context context) {
        super(context);
        m80800a((AttributeSet) null, 16842868);
    }

    /* renamed from: a */
    private final void m80800a(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45318g.f118397p, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                addHeaderView(LayoutInflater.from(getContext()).inflate(resourceId, this, false), (Object) null, false);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f118437d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f118437d.left, -this.f118437d.top);
        return this.f118435b.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        View view;
        super.draw(canvas);
        if (this.f118434a != null) {
            int save = canvas.save();
            View view2 = this.f118435b;
            if (view2 != null) {
                view = view2;
            } else {
                view = this.f118434a;
            }
            int top = view2 != null ? this.f118434a.getTop() : 0;
            if (view.getTop() + top < this.f118436c || !view.isShown()) {
                this.f118437d.set(0.0f, (float) ((-top) + this.f118436c), (float) view.getWidth(), (float) ((view.getHeight() - top) + this.f118436c));
                canvas.translate(0.0f, this.f118437d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f118437d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f118436c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.f118434a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f118434a == null) {
            this.f118434a = findViewWithTag("sticky");
            this.f118435b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80800a(attributeSet, 16842868);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80800a(attributeSet, i);
    }
}
