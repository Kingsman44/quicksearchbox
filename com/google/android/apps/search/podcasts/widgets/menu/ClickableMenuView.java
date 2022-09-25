package com.google.android.apps.search.podcasts.widgets.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p033v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.podcasts.widgets.p10626h.C141262a;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class ClickableMenuView extends AppCompatButton {

    /* renamed from: b */
    private final int f383507b;

    /* renamed from: c */
    private final float f383508c;

    /* renamed from: d */
    private final float f383509d;

    /* renamed from: e */
    private final float f383510e;

    /* renamed from: f */
    private final int f383511f;

    /* renamed from: g */
    private final int f383512g;

    /* renamed from: h */
    private final Paint f383513h;

    /* renamed from: i */
    private final Paint f383514i;

    /* renamed from: j */
    private final Rect f383515j;

    public ClickableMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m229300a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 0) ? i2 : View.MeasureSpec.getSize(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        float paddingLeft2 = ((float) getPaddingLeft()) + (((float) (getWidth() - (paddingLeft + paddingRight))) / 2.0f);
        float paddingTop2 = ((float) getPaddingTop()) + (((float) (getHeight() - (paddingTop + paddingBottom))) / 2.0f);
        float f = (this.f383508c - this.f383509d) / 2.0f;
        float f2 = (float) this.f383512g;
        float f3 = paddingTop2 - f;
        canvas.drawCircle(paddingLeft2 + f2, f2 + f3, this.f383510e / 2.0f, this.f383514i);
        float f4 = (float) this.f383512g;
        canvas.drawCircle(paddingLeft2 + f4, f4 + paddingTop2, this.f383510e / 2.0f, this.f383514i);
        float f5 = (float) this.f383512g;
        float f6 = f + paddingTop2;
        canvas.drawCircle(paddingLeft2 + f5, f5 + f6, this.f383510e / 2.0f, this.f383514i);
        canvas.drawCircle(paddingLeft2, f3, this.f383509d / 2.0f, this.f383513h);
        canvas.drawCircle(paddingLeft2, paddingTop2, this.f383509d / 2.0f, this.f383513h);
        canvas.drawCircle(paddingLeft2, f6, this.f383509d / 2.0f, this.f383513h);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!isInEditMode()) {
            int i5 = this.f383507b;
            Rect rect = this.f383515j;
            int i6 = C141262a.f383502a;
            if (i5 != 0) {
                int i7 = 0;
                int min = Math.min(0, (getWidth() - i5) / 2);
                int min2 = Math.min(0, (getHeight() - i5) / 2);
                if (min != 0) {
                    i7 = min;
                } else if (min2 == 0) {
                    return;
                }
                View view = (View) getParent();
                getHitRect(rect);
                rect.inset(i7, min2);
                if ((view.getWidth() < i5 || view.getHeight() < i5) && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    viewGroup.offsetDescendantRectToMyCoords(view, rect);
                    C141262a.m229293c(rect, viewGroup);
                    C141262a.m229292a(viewGroup, this, new TouchDelegate(rect, this));
                    return;
                }
                C141262a.m229293c(rect, view);
                C141262a.m229292a(view, this, new TouchDelegate(rect, this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m229300a(i, Math.max(getSuggestedMinimumWidth(), ((int) this.f383509d) + getPaddingLeft() + getPaddingRight())), m229300a(i2, Math.max(getSuggestedMinimumHeight(), ((int) this.f383508c) + getPaddingTop() + getPaddingBottom())));
    }

    public ClickableMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClickableMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f383513h = paint;
        Paint paint2 = new Paint(0);
        this.f383514i = paint2;
        this.f383515j = new Rect();
        this.f383507b = context.getResources().getDimensionPixelSize(R.dimen.google_min_touch_target_size);
        this.f383512g = context.getResources().getDimensionPixelSize(R.dimen.podcasts_clickable_menu_shadow_offset);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C141266a.f383516a);
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.podcasts_clickable_menu_icon_size));
        this.f383508c = dimensionPixelSize;
        float f = dimensionPixelSize / 4.5f;
        this.f383509d = f;
        this.f383510e = f * 1.33f;
        int i2 = obtainStyledAttributes.getInt(0, 0);
        this.f383511f = i2;
        obtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getContext().getColor(i2 == 1 ? R.color.podcasts_clickable_menu_view_light : R.color.podcasts_clickable_menu_view_dark));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i2 == 1 ? -16777216 : -1);
        paint2.setAlpha(75);
        paint2.setMaskFilter(new BlurMaskFilter(12.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
