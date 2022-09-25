package com.google.android.libraries.elements.p1714d.p1719e.p1723b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;
import com.google.android.libraries.elements.p1705a.p1706a.C20691o;
import com.google.p370af.C7490c;

/* renamed from: com.google.android.libraries.elements.d.e.b.d */
/* compiled from: PG */
public final class C21025d extends Drawable {

    /* renamed from: g */
    private static final int[] f58921g = {16842919};

    /* renamed from: h */
    private static final int[] f58922h = {16843518};

    /* renamed from: a */
    public int f58923a = 0;

    /* renamed from: b */
    public int f58924b = 0;

    /* renamed from: c */
    public int f58925c = 0;

    /* renamed from: d */
    public float f58926d = 0.0f;

    /* renamed from: e */
    public RectCornersProxy f58927e;

    /* renamed from: f */
    public boolean f58928f = false;

    /* renamed from: i */
    private final Paint f58929i;

    /* renamed from: j */
    private final RectF f58930j = new RectF();

    /* renamed from: k */
    private Path f58931k = null;

    public C21025d() {
        Paint paint = new Paint(1);
        this.f58929i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
    }

    /* renamed from: a */
    private final boolean m39513a() {
        RectCornersProxy rectCornersProxy = this.f58927e;
        if (rectCornersProxy == null) {
            return true;
        }
        if (!C7490c.m22726p(((C20691o) rectCornersProxy).f57976a, 18) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 16) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 14) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 12) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 10) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 8) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 6) && !C7490c.m22726p(((C20691o) this.f58927e).f57976a, 4)) {
            return true;
        }
        if (((C20691o) this.f58927e).f57976a.mo60158l() && ((C20691o) this.f58927e).f57976a.mo60159m() && ((C20691o) this.f58927e).f57976a.mo60155i() && ((C20691o) this.f58927e).f57976a.mo60154h()) {
            return true;
        }
        if (!((C20691o) this.f58927e).f57976a.mo60160n() || !((C20691o) this.f58927e).f57976a.mo60157k() || !((C20691o) this.f58927e).f57976a.mo60156j() || !((C20691o) this.f58927e).f57976a.mo60153g()) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        if (this.f58926d <= 0.5f) {
            canvas.drawRect(this.f58930j, this.f58929i);
        } else if (m39513a()) {
            RectF rectF = this.f58930j;
            float f = this.f58926d;
            canvas.drawRoundRect(rectF, f, f, this.f58929i);
        } else {
            Path path = this.f58931k;
            path.getClass();
            canvas.drawPath(path, this.f58929i);
        }
    }

    public final int getAlpha() {
        return this.f58929i.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f58929i.getColorFilter();
    }

    public final int getOpacity() {
        int alpha = this.f58929i.getAlpha();
        return alpha == 255 ? this.f58926d < 0.5f ? -1 : -3 : alpha == 0 ? -2 : -3;
    }

    public final boolean isStateful() {
        return (this.f58923a == 0 && this.f58924b == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Path path;
        this.f58930j.set(rect);
        if (!m39513a() && this.f58931k == null) {
            RectCornersProxy rectCornersProxy = this.f58927e;
            if (rectCornersProxy == null) {
                path = new Path();
            } else {
                float[] fArr = new float[8];
                if (((C20691o) rectCornersProxy).f57976a.mo60158l() || ((!this.f58928f && ((C20691o) this.f58927e).f57976a.mo60160n()) || (this.f58928f && ((C20691o) this.f58927e).f57976a.mo60157k()))) {
                    float f = this.f58926d;
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if (((C20691o) this.f58927e).f57976a.mo60159m() || ((!this.f58928f && ((C20691o) this.f58927e).f57976a.mo60157k()) || (this.f58928f && ((C20691o) this.f58927e).f57976a.mo60160n()))) {
                    float f2 = this.f58926d;
                    fArr[2] = f2;
                    fArr[3] = f2;
                }
                if (((C20691o) this.f58927e).f57976a.mo60155i() || ((!this.f58928f && ((C20691o) this.f58927e).f57976a.mo60153g()) || (this.f58928f && ((C20691o) this.f58927e).f57976a.mo60156j()))) {
                    float f3 = this.f58926d;
                    fArr[4] = f3;
                    fArr[5] = f3;
                }
                if (((C20691o) this.f58927e).f57976a.mo60154h() || ((!this.f58928f && ((C20691o) this.f58927e).f57976a.mo60156j()) || (this.f58928f && ((C20691o) this.f58927e).f57976a.mo60153g()))) {
                    float f4 = this.f58926d;
                    fArr[6] = f4;
                    fArr[7] = f4;
                }
                path = new Path();
                path.addRoundRect(this.f58930j, fArr, Path.Direction.CW);
            }
            this.f58931k = path;
        }
        int i = this.f58925c;
        if (i != 0 && !isStateful()) {
            this.f58929i.setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int color = this.f58929i.getColor();
        if (StateSet.stateSetMatches(f58921g, iArr)) {
            int i = this.f58923a;
            if (color == i) {
                return false;
            }
            this.f58929i.setColor(i);
            invalidateSelf();
            return true;
        } else if (StateSet.stateSetMatches(f58922h, iArr)) {
            int i2 = this.f58924b;
            if (color == i2) {
                return false;
            }
            this.f58929i.setColor(i2);
            invalidateSelf();
            return true;
        } else {
            int i3 = this.f58925c;
            if (i3 != 0) {
                if (color == i3) {
                    return false;
                }
                this.f58929i.setColor(i3);
                invalidateSelf();
                return true;
            } else if (color == 0) {
                return super.onStateChange(iArr);
            } else {
                this.f58929i.setColor(0);
                invalidateSelf();
                return true;
            }
        }
    }

    public final void setAlpha(int i) {
        this.f58929i.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f58929i.setColorFilter(colorFilter);
    }
}
