package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.PlayingIndicatorView */
/* compiled from: PG */
public final class PlayingIndicatorView extends View {

    /* renamed from: d */
    private static final int[][] f361524d = {new int[]{5, 3, 5, 7, 9, 10, 11, 12, 11, 12, 10, 8, 7, 4, 2, 4, 6, 7, 9, 11, 9, 7, 5, 3, 5, 8, 5, 3, 4}, new int[]{12, 11, 10, 11, 12, 11, 9, 7, 9, 11, 12, 10, 8, 10, 12, 11, 9, 5, 3, 5, 8, 10, 12, 10, 9, 8}, new int[]{8, 9, 10, 12, 11, 9, 7, 5, 7, 8, 9, 12, 11, 12, 9, 7, 9, 11, 12, 10, 8, 9, 7, 5, 3}};

    /* renamed from: a */
    public float f361525a;

    /* renamed from: b */
    public boolean f361526b;

    /* renamed from: c */
    public boolean f361527c;

    /* renamed from: e */
    private final int f361528e;

    /* renamed from: f */
    private int f361529f;

    /* renamed from: g */
    private int f361530g;

    /* renamed from: h */
    private final int f361531h;

    /* renamed from: i */
    private final int f361532i;

    /* renamed from: j */
    private final int f361533j;

    /* renamed from: k */
    private final ValueAnimator f361534k;

    /* renamed from: l */
    private final Rect f361535l = new Rect();

    /* renamed from: m */
    private final Paint f361536m;

    /* renamed from: n */
    private final boolean f361537n;

    public PlayingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f361528e = resources.getDimensionPixelSize(R.dimen.assistant_news_player_playing_indicator_bar_height);
        this.f361529f = resources.getDimensionPixelSize(R.dimen.assistant_news_player_playing_indicator_bar_width);
        this.f361530g = resources.getDimensionPixelSize(R.dimen.assistant_news_player_playing_indicator_bar_seperation);
        this.f361531h = resources.getDimensionPixelSize(R.dimen.assistant_news_player_playing_indicator_shadow_radius);
        if ((super.getContext().getResources().getConfiguration().uiMode & 48) == 32) {
            this.f361533j = resources.getColor(R.color.gm3_default_color_on_surface_inverse);
            this.f361532i = resources.getColor(R.color.gm3_default_color_outline);
        } else {
            this.f361533j = resources.getColor(R.color.gm3_dark_default_color_on_surface_inverse);
            this.f361532i = resources.getColor(R.color.gm3_dark_default_color_outline);
        }
        this.f361537n = true;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f361534k = valueAnimator;
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(100000000);
        valueAnimator.setFloatValues(new float[]{0.0f, ((float) valueAnimator.getDuration()) / 150.0f});
        valueAnimator.addUpdateListener(new C132482bb(this));
        Paint paint = new Paint();
        this.f361536m = paint;
        paint.setColor(this.f361533j);
        setLayerType(1, (Paint) null);
    }

    /* renamed from: a */
    private final void m215365a(Canvas canvas) {
        float f;
        for (int i = 0; i < 3; i++) {
            this.f361535l.left = ((this.f361529f + this.f361530g) * i) + this.f361531h;
            Rect rect = this.f361535l;
            rect.right = rect.left + this.f361529f;
            this.f361535l.bottom = getHeight() - this.f361531h;
            if (this.f361526b) {
                float f2 = this.f361525a;
                int[] iArr = f361524d[i];
                int i2 = (int) f2;
                int length = iArr.length;
                int i3 = i2 % length;
                float f3 = f2 - ((float) i2);
                f = (((float) iArr[i3]) * (1.0f - f3)) + (((float) iArr[(i3 + 1) % length]) * f3);
            } else {
                f = 0.5f;
            }
            Rect rect2 = this.f361535l;
            int i4 = this.f361531h;
            int height = getHeight();
            int i5 = this.f361531h;
            rect2.top = i4 + ((int) ((((float) (height - (i5 + i5))) * (15.0f - f)) / 15.0f));
            canvas.drawRect(this.f361535l, this.f361536m);
        }
    }

    /* renamed from: b */
    private final void m215366b() {
        if (getVisibility() == 0) {
            this.f361534k.start();
            postInvalidate();
        }
    }

    /* renamed from: c */
    private final void m215367c() {
        this.f361534k.cancel();
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f361527c) {
            m215366b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f361527c) {
            m215367c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        this.f361536m.setShadowLayer((float) this.f361531h, 0.0f, 0.0f, this.f361532i);
        m215365a(canvas);
        this.f361536m.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        m215365a(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f361527c) {
            if (i == 0) {
                m215366b();
            } else {
                m215367c();
            }
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m215366b();
        } else {
            m215367c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f361537n) {
            int i5 = this.f361529f;
            int i6 = this.f361530g;
            int i7 = this.f361531h;
            int i8 = i7 + i7;
            i4 = (i5 * 3) + i6 + i6 + i8;
            i3 = this.f361528e + i8;
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i9 = this.f361531h;
            int i10 = i9 + i9;
            int i11 = (size - i10) / 5;
            this.f361529f = i11;
            this.f361530g = i11;
            i4 = (i11 * 3) + i11 + i11 + i10;
            i3 = i4;
        }
        setMeasuredDimension(i4, i3);
    }
}
