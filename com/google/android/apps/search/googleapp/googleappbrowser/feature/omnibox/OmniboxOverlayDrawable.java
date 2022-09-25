package com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import org.xmlpull.v1.XmlPullParser;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class OmniboxOverlayDrawable extends Drawable {

    /* renamed from: a */
    private final Path f370125a = new Path();

    /* renamed from: b */
    private Paint f370126b = new Paint(1);

    /* renamed from: c */
    private Paint f370127c;

    /* renamed from: d */
    private float f370128d;

    public OmniboxOverlayDrawable() {
        Paint paint = new Paint(1);
        paint.setColor(0);
        this.f370127c = paint;
    }

    public final void draw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        this.f370125a.reset();
        Path path = this.f370125a;
        RectF rectF = new RectF(getBounds());
        float f = this.f370128d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        this.f370125a.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.clipPath(this.f370125a);
        canvas.drawPaint(this.f370126b);
        canvas.restoreToCount(save);
        this.f370125a.setFillType(Path.FillType.EVEN_ODD);
        canvas.clipPath(this.f370125a);
        canvas.drawPaint(this.f370127c);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C69664n.m101061g(resources, "resources");
        C69664n.m101061g(xmlPullParser, "parser");
        C69664n.m101061g(attributeSet, "attrs");
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        this.f370128d = (float) resources.getDimensionPixelSize(R.dimen.googleapp_browser_cornerradius_omnibox);
        this.f370126b.setColor(resources.getColor(R.color.agsa_color_surface_elevation_2, (Resources.Theme) null));
    }

    public final void setAlpha(int i) {
        this.f370126b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f370126b.setColorFilter(colorFilter);
    }
}
