package com.google.android.apps.gsa.search.gel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.launcher3.Insettable;
import com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class GelSearchOverlayLayout extends SearchOverlayLayout implements Insettable {

    /* renamed from: a */
    Drawable f235979a;

    /* renamed from: d */
    private int f235980d;

    public GelSearchOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m141390a() {
        if (this.f235979a != null) {
            int measuredWidth = getMeasuredWidth();
            this.f235979a.setBounds(0, 0, (int) (((float) measuredWidth) * 0.0f), this.f235980d);
            invalidate(0, 0, measuredWidth, this.f235980d);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f235979a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m141390a();
    }

    public final void setInsets(Rect rect) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Insettable) {
                ((Insettable) childAt).setInsets(rect);
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.topMargin = rect.top;
                layoutParams.bottomMargin = rect.bottom;
                layoutParams.leftMargin = rect.left;
                layoutParams.rightMargin = rect.right;
                if ((layoutParams.gravity & 7) == 1) {
                    layoutParams.leftMargin /= 2;
                    layoutParams.rightMargin /= 2;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
        int i2 = rect.top;
        if (this.f235979a != null || i2 <= 0) {
            this.f235979a = null;
        } else {
            Drawable drawable = getContext().getDrawable(R.drawable.upper_grey_gradient_l);
            this.f235979a = drawable;
            drawable.mutate();
        }
        this.f235980d = i2;
        m141390a();
    }
}
