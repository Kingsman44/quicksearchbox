package com.google.android.libraries.search.video.thirdparty.p3197ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.thirdparty.ui.EqualizerView */
/* compiled from: PG */
public final class EqualizerView extends View {

    /* renamed from: c */
    private static final RectF[] f108781c = new RectF[3];

    /* renamed from: d */
    private static final Duration f108782d = Duration.ofMillis(1500);

    /* renamed from: e */
    private static final float[][] f108783e = {new float[]{0.65818447f, 0.082252204f, 0.78804797f, 0.43116587f, 0.37627524f, 0.65818447f}, new float[]{0.73925245f, 0.832141f, 0.45162535f, 0.20424879f, 0.45205885f, 0.73925245f}, new float[]{0.44814694f, 0.83808714f, 0.88152313f, 0.462507f, 0.8350299f, 0.44814694f}};

    /* renamed from: a */
    public final float[] f108784a;

    /* renamed from: b */
    public final ValueAnimator[] f108785b;

    /* renamed from: f */
    private final float f108786f;

    /* renamed from: g */
    private final float f108787g;

    /* renamed from: h */
    private final Paint f108788h;

    public EqualizerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo44191a() {
        ValueAnimator[] valueAnimatorArr = this.f108785b;
        int length = valueAnimatorArr.length;
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = valueAnimatorArr[i];
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }

    public final void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        float f = this.f108786f;
        float paddingLeft = (((((float) width) - (f + f)) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) / 3.0f;
        float height = (float) ((canvas.getHeight() - getPaddingBottom()) - getPaddingTop());
        int paddingLeft2 = getPaddingLeft();
        for (int i = 0; i < 3; i++) {
            RectF rectF = f108781c[i];
            float height2 = (float) (canvas.getHeight() - getPaddingBottom());
            float f2 = (float) paddingLeft2;
            float f3 = f2 + paddingLeft;
            rectF.set(f2, ((float) getPaddingTop()) + ((1.0f - this.f108784a[i]) * height), f3, height2);
            float f4 = this.f108787g;
            canvas.drawRoundRect(rectF, f4, f4, this.f108788h);
            rectF.set(f2, -2.0f + height2, f3, height2);
            canvas.drawRect(rectF, this.f108788h);
            paddingLeft2 += Math.round(this.f108786f + paddingLeft);
        }
    }

    public EqualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.equalizer_fill_color);
        Paint paint = new Paint(1);
        this.f108788h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        this.f108786f = (float) resources.getDimensionPixelSize(R.dimen.default_equalizer_spacing);
        this.f108787g = 2.13116723E9f;
        this.f108784a = new float[3];
        this.f108785b = new ValueAnimator[3];
        for (int i2 = 0; i2 < 3; i2++) {
            this.f108785b[i2] = ValueAnimator.ofFloat(f108783e[i2]);
            this.f108785b[i2].setRepeatCount(-1);
            this.f108785b[i2].setDuration(f108782d.toMillis());
            f108781c[i2] = new RectF();
        }
    }
}
