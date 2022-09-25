package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.ModularCard */
/* compiled from: PG */
public class ModularCard extends C91946v {

    /* renamed from: l */
    private Paint f256361l;

    /* renamed from: m */
    private View f256362m;

    public ModularCard(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo86602g(View view) {
        this.f256362m = view;
        if (this.f256361l == null) {
            this.f256361l = new Paint();
        }
        invalidate();
    }

    /* renamed from: h */
    public final boolean mo86603h(View view) {
        return Boolean.TRUE.equals(view.getTag(R.id.is_swipeable));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo86604i() {
        this.f256362m = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f256362m;
        if (view != null) {
            float translationX = view.getTranslationX();
            if (translationX != 0.0f) {
                canvas.save();
                if (translationX > 0.0f) {
                    canvas.clipRect(0.0f, (float) view.getTop(), translationX, (float) view.getBottom());
                } else {
                    canvas.clipRect(((float) getWidth()) - Math.abs(translationX), (float) view.getTop(), (float) getWidth(), (float) view.getBottom());
                }
                this.f256361l.setColor(getResources().getColor(R.color.activity_background));
                canvas.drawPaint(this.f256361l);
                canvas.restore();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8 || childAt.getId() == R.id.tooltip_overlay) {
                childAt.layout(paddingLeft, getPaddingTop(), measuredWidth - paddingRight, paddingTop);
            } else {
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, paddingTop, measuredWidth - paddingRight, paddingTop + measuredHeight);
                Object tag = childAt.getTag(R.id.module_overlap_px);
                paddingTop += measuredHeight - (tag instanceof Integer ? ((Integer) tag).intValue() : 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight()), View.MeasureSpec.getMode(i));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.measure(i, layoutParams.height != -2 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : makeMeasureSpec);
                i4 += childAt.getMeasuredHeight();
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
        }
        setMeasuredDimension(i3 + getPaddingLeft() + getPaddingRight(), i4 + getPaddingTop() + getPaddingBottom());
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (getLayoutParams() instanceof C90638an) {
            this.f256427k = ((C90638an) getLayoutParams()).f253474c;
        }
    }

    public ModularCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ModularCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setStartDelay(1, 0);
        setLayoutTransition(layoutTransition);
        layoutTransition.setAnimateParentHierarchy(false);
    }
}
