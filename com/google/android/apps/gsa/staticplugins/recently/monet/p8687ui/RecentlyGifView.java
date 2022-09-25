package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.RecentlyGifView */
/* compiled from: PG */
public class RecentlyGifView extends ImageView {

    /* renamed from: a */
    public Movie f322043a;

    /* renamed from: b */
    long f322044b;

    /* renamed from: c */
    float f322045c;

    /* renamed from: d */
    float f322046d;

    /* renamed from: e */
    float f322047e;

    public RecentlyGifView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo102520a(Movie movie) {
        setLayerType(1, (Paint) null);
        setImageDrawable((Drawable) null);
        this.f322043a = movie;
        invalidate();
        if (movie != null) {
            this.f322044b = 0;
            this.f322045c = 0.0f;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Movie movie = this.f322043a;
        if (movie == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f322045c == 0.0f) {
            this.f322045c = Math.min(((float) getWidth()) / ((float) movie.width()), ((float) getHeight()) / ((float) movie.height()));
            this.f322046d = ((((float) getWidth()) / this.f322045c) - ((float) movie.width())) / 2.0f;
            this.f322047e = ((((float) getHeight()) / this.f322045c) - ((float) movie.height())) / 2.0f;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f322044b == 0) {
            this.f322044b = uptimeMillis;
        }
        movie.setTime(movie.duration() != 0 ? (int) ((uptimeMillis - this.f322044b) % ((long) movie.duration())) : 0);
        float f = this.f322045c;
        canvas.scale(f, f);
        canvas.translate(this.f322046d, this.f322047e);
        movie.draw(canvas, 0.0f, 0.0f);
        invalidate();
    }

    public RecentlyGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecentlyGifView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
