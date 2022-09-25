package com.google.android.libraries.elements.p1714d.p1717c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.p1707b.C20696c;
import com.google.p370af.C7490c;
import com.youtube.p5283a.p5284a.C68067bc;

/* renamed from: com.google.android.libraries.elements.d.c.c */
/* compiled from: PG */
public final class C20846c extends C20696c {

    /* renamed from: h */
    C20847d f58409h;

    /* renamed from: i */
    C68067bc f58410i;

    /* renamed from: j */
    public Paint f58411j;

    /* renamed from: k */
    private final Paint f58412k;

    /* renamed from: l */
    private final float f58413l;

    /* renamed from: m */
    private final float f58414m;

    /* renamed from: n */
    private final boolean f58415n;

    /* renamed from: o */
    private final int f58416o;

    /* renamed from: p */
    private final BitmapShader f58417p;

    /* renamed from: q */
    private final Path f58418q = new Path();

    public C20846c(Bitmap bitmap, ImageView.ScaleType scaleType, float f, int i, float f2, boolean z, C21259bb bbVar) {
        super(bitmap, scaleType, bbVar);
        this.f58415n = z;
        this.f58413l = f;
        this.f58414m = f2;
        Paint paint = new Paint();
        this.f58412k = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        this.f58416o = (int) (f * 0.5f);
        this.f58417p = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25783a(Rect rect) {
        Rect rect2 = new Rect(rect);
        int i = this.f58416o;
        rect2.inset(i, i);
        super.mo25783a(rect2);
        C20847d dVar = this.f58409h;
        if (dVar != null) {
            dVar.mo25965d(this.f57986c, mo25963c(), this.f57989f);
        }
        if (!mo25964d()) {
            mo25962b();
        }
    }

    /* renamed from: b */
    public final void mo25962b() {
        if (this.f58410i != null) {
            float[] fArr = new float[8];
            boolean c = mo25963c();
            this.f58418q.reset();
            if (this.f58410i.mo60158l() || ((!c && this.f58410i.mo60160n()) || (c && this.f58410i.mo60157k()))) {
                float f = this.f58414m;
                fArr[0] = f;
                fArr[1] = f;
            }
            if (this.f58410i.mo60159m() || ((!c && this.f58410i.mo60157k()) || (c && this.f58410i.mo60160n()))) {
                float f2 = this.f58414m;
                fArr[2] = f2;
                fArr[3] = f2;
            }
            if (this.f58410i.mo60155i() || ((!c && this.f58410i.mo60153g()) || (c && this.f58410i.mo60156j()))) {
                float f3 = this.f58414m;
                fArr[4] = f3;
                fArr[5] = f3;
            }
            if (this.f58410i.mo60154h() || ((!c && this.f58410i.mo60156j()) || (c && this.f58410i.mo60153g()))) {
                float f4 = this.f58414m;
                fArr[6] = f4;
                fArr[7] = f4;
            }
            this.f58418q.addRoundRect(this.f57986c, fArr, Path.Direction.CW);
        }
    }

    /* renamed from: c */
    public final boolean mo25963c() {
        return getLayoutDirection() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo25964d() {
        C68067bc bcVar = this.f58410i;
        if (bcVar == null) {
            return true;
        }
        if (!C7490c.m22726p(bcVar, 4) && !C7490c.m22726p(this.f58410i, 6) && !C7490c.m22726p(this.f58410i, 10) && !C7490c.m22726p(this.f58410i, 8) && !C7490c.m22726p(this.f58410i, 12) && !C7490c.m22726p(this.f58410i, 14) && !C7490c.m22726p(this.f58410i, 16) && !C7490c.m22726p(this.f58410i, 18)) {
            return true;
        }
        if (this.f58410i.mo60158l() && this.f58410i.mo60159m() && this.f58410i.mo60155i() && this.f58410i.mo60154h()) {
            return true;
        }
        if (!this.f58410i.mo60160n() || !this.f58410i.mo60157k() || !this.f58410i.mo60156j() || !this.f58410i.mo60153g()) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        LinearGradient linearGradient3;
        LinearGradient linearGradient4;
        this.f58417p.setLocalMatrix(this.f57984a);
        this.f57985b.setShader(this.f58417p);
        if (this.f58415n) {
            float min = Math.min(this.f57986c.width() * 0.5f, this.f57986c.height() * 0.5f);
            Paint paint = this.f58411j;
            if (paint != null) {
                canvas.drawCircle(this.f57986c.centerX(), this.f57986c.centerY(), min, paint);
            }
            canvas.drawCircle(this.f57986c.centerX(), this.f57986c.centerY(), min, this.f57985b);
            C20847d dVar = this.f58409h;
            if (!(dVar == null || (linearGradient4 = dVar.f58419a) == null)) {
                this.f57985b.setShader(linearGradient4);
                canvas.drawCircle(this.f57986c.centerX(), this.f57986c.centerY(), min, this.f57985b);
            }
            canvas.drawCircle(this.f57986c.centerX(), this.f57986c.centerY(), min, this.f58412k);
        } else if (this.f58414m <= 0.5f) {
            Paint paint2 = this.f58411j;
            if (paint2 != null) {
                canvas.drawRect(this.f57986c, paint2);
            }
            canvas.drawRect(this.f57986c, this.f57985b);
            C20847d dVar2 = this.f58409h;
            if (!(dVar2 == null || (linearGradient = dVar2.f58419a) == null)) {
                this.f57985b.setShader(linearGradient);
                canvas.drawRect(this.f57986c, this.f57985b);
            }
            if (this.f58413l > 0.5f) {
                canvas.drawRect(this.f57986c, this.f58412k);
            }
        } else if (mo25964d()) {
            Paint paint3 = this.f58411j;
            if (paint3 != null) {
                RectF rectF = this.f57986c;
                float f = this.f58414m;
                canvas.drawRoundRect(rectF, f, f, paint3);
            }
            RectF rectF2 = this.f57986c;
            float f2 = this.f58414m;
            canvas.drawRoundRect(rectF2, f2, f2, this.f57985b);
            C20847d dVar3 = this.f58409h;
            if (!(dVar3 == null || (linearGradient3 = dVar3.f58419a) == null)) {
                this.f57985b.setShader(linearGradient3);
                RectF rectF3 = this.f57986c;
                float f3 = this.f58414m;
                canvas.drawRoundRect(rectF3, f3, f3, this.f57985b);
            }
            if (this.f58413l > 0.5f) {
                RectF rectF4 = this.f57986c;
                float f4 = this.f58414m;
                canvas.drawRoundRect(rectF4, f4, f4, this.f58412k);
            }
        } else {
            Paint paint4 = this.f58411j;
            if (paint4 != null) {
                canvas.drawPath(this.f58418q, paint4);
            }
            canvas.drawPath(this.f58418q, this.f57985b);
            C20847d dVar4 = this.f58409h;
            if (!(dVar4 == null || (linearGradient2 = dVar4.f58419a) == null)) {
                this.f57985b.setShader(linearGradient2);
                canvas.drawPath(this.f58418q, this.f57985b);
            }
            if (this.f58413l > 0.5f) {
                canvas.drawPath(this.f58418q, this.f58412k);
            }
        }
    }

    public final int getOpacity() {
        if (this.f58414m > 0.0f) {
            return -3;
        }
        return super.getOpacity();
    }
}
