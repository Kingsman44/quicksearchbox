package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.cast.framework.C143405am;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class CastSeekBar extends View {

    /* renamed from: a */
    public C143538b f389226a;

    /* renamed from: b */
    public List f389227b;

    /* renamed from: c */
    private final float f389228c;

    /* renamed from: d */
    private final float f389229d;

    /* renamed from: e */
    private final float f389230e;

    /* renamed from: f */
    private final float f389231f;

    /* renamed from: g */
    private final Paint f389232g;

    /* renamed from: h */
    private final int f389233h;

    /* renamed from: i */
    private final int f389234i;

    /* renamed from: j */
    private final int f389235j;

    public CastSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m233102b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.f389232g.setColor(i5);
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = this.f389230e;
        canvas.drawRect((((float) i) / f) * f2, -f3, (((float) i2) / f) * f2, f3, this.f389232g);
    }

    /* renamed from: a */
    public final void mo118841a() {
        int i = this.f389226a.f389236a;
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.translate((float) getPaddingLeft(), (float) getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        mo118841a();
        int save2 = canvas.save();
        canvas2.translate(0.0f, (float) (((measuredHeight - paddingTop) - paddingBottom) / 2));
        C143538b bVar = this.f389226a;
        boolean z = bVar.f389241f;
        int i = bVar.f389238c;
        int max = Math.max(0, 0);
        if (max > 0) {
            m233102b(canvas, 0, max, this.f389226a.f389237b, measuredWidth, this.f389234i);
        }
        if (max < 0) {
            m233102b(canvas, max, 0, this.f389226a.f389237b, measuredWidth, this.f389233h);
        }
        if (this.f389226a.f389237b > 0) {
            m233102b(canvas, 0, 1, 1, measuredWidth, this.f389234i);
        }
        canvas2.restoreToCount(save2);
        List<C143537a> list = this.f389227b;
        if (list != null && !list.isEmpty()) {
            this.f389232g.setColor(this.f389235j);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop2 = getPaddingTop();
            int paddingBottom2 = getPaddingBottom();
            int save3 = canvas.save();
            canvas2.translate(0.0f, (float) (((measuredHeight2 - paddingTop2) - paddingBottom2) / 2));
            for (C143537a aVar : list) {
                if (aVar != null) {
                    int min = Math.min(0, this.f389226a.f389237b);
                    float f = (float) measuredWidth2;
                    float f2 = (float) this.f389226a.f389237b;
                    float f3 = (((float) min) * f) / f2;
                    float f4 = (((float) (min + 1)) * f) / f2;
                    float f5 = this.f389231f;
                    if (f4 - f3 < f5) {
                        f4 = f3 + f5;
                    }
                    float f6 = f4 > f ? f : f4;
                    float f7 = f6 - f3 < f5 ? f6 - f5 : f3;
                    float f8 = this.f389230e;
                    canvas.drawRect(f7, -f8, f6, f8, this.f389232g);
                }
            }
            canvas2.restoreToCount(save3);
        }
        if (isEnabled()) {
            boolean z2 = this.f389226a.f389241f;
        }
        canvas2.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSizeAndState((int) (this.f389228c + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i, 0), resolveSizeAndState((int) (this.f389229d + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i2, 0));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        boolean z = this.f389226a.f389241f;
        return false;
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f389227b = new ArrayList();
        setAccessibilityDelegate(new C143539c(this));
        Paint paint = new Paint(1);
        this.f389232g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f389228c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f389229d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f389230e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        this.f389231f = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        C143538b bVar = new C143538b();
        this.f389226a = bVar;
        bVar.f389237b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C143405am.f388899a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.f389233h = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.f389234i = context.getResources().getColor(resourceId3);
        this.f389235j = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
