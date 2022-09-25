package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.d */
/* compiled from: PG */
public final class C115732d extends Drawable {

    /* renamed from: a */
    public final Paint f320994a;

    /* renamed from: b */
    public final int f320995b;

    /* renamed from: c */
    public final C115705c f320996c;

    /* renamed from: d */
    public ValueAnimator f320997d;

    /* renamed from: e */
    public Path f320998e;

    public C115732d(Context context) {
        Resources resources = context.getResources();
        this.f320996c = new C115705c(resources.getDimensionPixelSize(R.dimen.highlight_horizontal_padding), resources.getDimensionPixelSize(R.dimen.highlight_rounded_corners_radius), resources.getDimensionPixelSize(R.dimen.highlight_vertical_padding));
        Paint paint = new Paint(1);
        this.f320994a = paint;
        paint.setStyle(Paint.Style.FILL);
        int a = C1878d.m5128a(context, R.color.highlight_fill_color);
        paint.setColor(a);
        this.f320995b = Color.alpha(a);
    }

    public final void draw(Canvas canvas) {
        Path path = this.f320998e;
        if (path != null) {
            canvas.drawPath(path, this.f320994a);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
