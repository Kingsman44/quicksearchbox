package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45244a;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class IntrinsicSizeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f118428a = 0;

    /* renamed from: b */
    private int f118429b = 0;

    /* renamed from: c */
    private Object f118430c;

    /* renamed from: d */
    private final Rect f118431d = new Rect();

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        m80793b(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    private final int m80792a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(this.f118428a, 1073741824);
        }
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f118428a), 1073741824) : i;
    }

    /* renamed from: b */
    private final void m80793b(Context context, AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118393l, i, 0);
            this.f118428a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f118429b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            if (C45244a.m80595a()) {
                if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT)) {
                    this.f118428a = (int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_CARD_VIEW_INTRINSIC_HEIGHT, 0.0f);
                }
                if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_CARD_VIEW_INTRINSIC_WIDTH)) {
                    this.f118429b = (int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_CARD_VIEW_INTRINSIC_WIDTH, 0.0f);
                }
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f118430c = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f118430c == null) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f118431d.set(((WindowManager) getContext().getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds());
            Display display = getDisplay();
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                if (this.f118431d.width() > 0 && this.f118431d.width() < displayMetrics.widthPixels) {
                    getWindowVisibleDisplayFrame(this.f118431d);
                    i3 = View.MeasureSpec.makeMeasureSpec(this.f118431d.width(), 1073741824);
                    super.onMeasure(i3, m80792a(i2, this.f118428a));
                }
            }
        }
        i3 = m80792a(i, this.f118429b);
        super.onMeasure(i3, m80792a(i2, this.f118428a));
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (C45244a.m80595a() && this.f118428a == 0 && this.f118429b == 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        super.setLayoutParams(layoutParams);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80793b(context, attributeSet, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80793b(context, attributeSet, i);
    }
}
