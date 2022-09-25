package com.android.launcher3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class BaseContainerView extends FrameLayout implements Insettable {
    private final int mContainerBoundsInset;
    public View mContent;
    protected final Rect mContentPadding;
    protected final int mHorizontalPadding;
    private final Rect mInsets;
    private final Drawable mRevealDrawable;
    public View mRevealView;

    public BaseContainerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mContent = findViewById(R.id.main_content);
        this.mRevealView = findViewById(R.id.reveal_view);
    }

    /* access modifiers changed from: protected */
    public abstract void onUpdateBgPadding(Rect rect, Rect rect2);

    public final void setInsets(Rect rect) {
        this.mInsets.set(rect);
        updateBackgroundAndPaddings();
    }

    /* access modifiers changed from: protected */
    public final void updateBackgroundAndPaddings() {
        Rect rect = new Rect(this.mHorizontalPadding, this.mInsets.top + this.mContainerBoundsInset, this.mHorizontalPadding, this.mInsets.bottom + this.mContainerBoundsInset);
        if (!rect.equals(this.mContentPadding)) {
            this.mContentPadding.set(rect);
            setPadding(0, rect.top, 0, rect.bottom);
            InsetDrawable insetDrawable = new InsetDrawable(this.mRevealDrawable, rect.left, 0, rect.right, 0);
            this.mRevealView.setBackground(insetDrawable.getConstantState().newDrawable());
            this.mContent.setBackground(insetDrawable);
            this.mContent.setPadding(0, 0, 0, 0);
            Rect rect2 = new Rect();
            insetDrawable.getPadding(rect2);
            onUpdateBgPadding(rect, rect2);
        }
    }

    public BaseContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInsets = new Rect();
        this.mContentPadding = new Rect();
        this.mContainerBoundsInset = getResources().getDimensionPixelSize(R.dimen.container_bounds_inset);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseContainerView, i, 0);
        this.mRevealDrawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.container_max_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.container_min_margin);
        int i2 = Launcher.getLauncher(context).mDeviceProfile.availableWidthPx;
        if (dimensionPixelSize > 0) {
            this.mHorizontalPadding = Math.max(dimensionPixelSize2, (i2 - dimensionPixelSize) / 2);
        } else {
            this.mHorizontalPadding = Math.max(dimensionPixelSize2, (int) getResources().getFraction(R.fraction.container_margin, i2, 1));
        }
    }
}
