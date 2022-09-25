package com.android.launcher3;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public class LauncherRootView extends InsettableFrameLayout {
    private View mAlignedView;
    private boolean mDrawRightInsetBar;
    private final Paint mOpaquePaint;
    private int mRightInsetBarWidth;

    public LauncherRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.mOpaquePaint = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mDrawRightInsetBar) {
            int width = getWidth();
            canvas.drawRect((float) (width - this.mRightInsetBarWidth), 0.0f, (float) width, (float) getHeight(), this.mOpaquePaint);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        this.mDrawRightInsetBar = rect.right > 0 && (!Utilities.ATLEAST_MARSHMALLOW || ((ActivityManager) getContext().getSystemService(ActivityManager.class)).isLowRamDevice());
        this.mRightInsetBarWidth = rect.right;
        setInsets(this.mDrawRightInsetBar ? new Rect(0, rect.top, 0, rect.bottom) : rect);
        View view = this.mAlignedView;
        if (view != null && this.mDrawRightInsetBar) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (!(marginLayoutParams.leftMargin == rect.left && marginLayoutParams.rightMargin == rect.right)) {
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.rightMargin = rect.right;
                this.mAlignedView.setLayoutParams(marginLayoutParams);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        if (getChildCount() > 0) {
            this.mAlignedView = getChildAt(0);
        }
        super.onFinishInflate();
    }
}
