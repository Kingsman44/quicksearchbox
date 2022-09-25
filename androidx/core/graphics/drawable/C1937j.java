package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.j */
/* compiled from: PG */
public class C1937j extends Drawable {

    /* renamed from: a */
    final Bitmap f5836a;

    /* renamed from: b */
    public final Paint f5837b = new Paint(3);

    /* renamed from: c */
    public final BitmapShader f5838c;

    /* renamed from: d */
    public float f5839d;

    /* renamed from: e */
    final Rect f5840e = new Rect();

    /* renamed from: f */
    public boolean f5841f;

    /* renamed from: g */
    private int f5842g = 160;

    /* renamed from: h */
    private final int f5843h = 119;

    /* renamed from: i */
    private final Matrix f5844i = new Matrix();

    /* renamed from: j */
    private final RectF f5845j = new RectF();

    /* renamed from: k */
    private boolean f5846k = true;

    /* renamed from: l */
    private final int f5847l;

    /* renamed from: m */
    private final int f5848m;

    public C1937j(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        if (resources != null) {
            this.f5842g = resources.getDisplayMetrics().densityDpi;
        }
        this.f5836a = bitmap;
        if (bitmap != null) {
            this.f5847l = bitmap.getScaledWidth(this.f5842g);
            this.f5848m = bitmap.getScaledHeight(this.f5842g);
            bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        } else {
            this.f5848m = -1;
            this.f5847l = -1;
            bitmapShader = null;
        }
        this.f5838c = bitmapShader;
    }

    /* renamed from: c */
    public static boolean m5245c(float f) {
        return f > 0.05f;
    }

    /* renamed from: e */
    private final void m5246e() {
        this.f5839d = (float) (Math.min(this.f5848m, this.f5847l) / 2);
    }

    /* renamed from: a */
    public void mo5080a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5082b() {
        if (this.f5846k) {
            if (this.f5841f) {
                int min = Math.min(this.f5847l, this.f5848m);
                mo5080a(this.f5843h, min, min, getBounds(), this.f5840e);
                int min2 = Math.min(this.f5840e.width(), this.f5840e.height());
                this.f5840e.inset(Math.max(0, (this.f5840e.width() - min2) / 2), Math.max(0, (this.f5840e.height() - min2) / 2));
                this.f5839d = ((float) min2) * 0.5f;
            } else {
                mo5080a(this.f5843h, this.f5847l, this.f5848m, getBounds(), this.f5840e);
            }
            this.f5845j.set(this.f5840e);
            if (this.f5838c != null) {
                this.f5844i.setTranslate(this.f5845j.left, this.f5845j.top);
                this.f5844i.preScale(this.f5845j.width() / ((float) this.f5836a.getWidth()), this.f5845j.height() / ((float) this.f5836a.getHeight()));
                this.f5838c.setLocalMatrix(this.f5844i);
                this.f5837b.setShader(this.f5838c);
            }
            this.f5846k = false;
        }
    }

    /* renamed from: d */
    public final void mo5083d() {
        this.f5841f = true;
        this.f5846k = true;
        m5246e();
        this.f5837b.setShader(this.f5838c);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f5836a;
        if (bitmap != null) {
            mo5082b();
            if (this.f5837b.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f5840e, this.f5837b);
                return;
            }
            RectF rectF = this.f5845j;
            float f = this.f5839d;
            canvas.drawRoundRect(rectF, f, f, this.f5837b);
        }
    }

    public final int getAlpha() {
        return this.f5837b.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f5837b.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.f5848m;
    }

    public final int getIntrinsicWidth() {
        return this.f5847l;
    }

    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f5843h != 119 || this.f5841f || (bitmap = this.f5836a) == null || bitmap.hasAlpha() || this.f5837b.getAlpha() < 255 || m5245c(this.f5839d)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f5841f) {
            m5246e();
        }
        this.f5846k = true;
    }

    public final void setAlpha(int i) {
        if (i != this.f5837b.getAlpha()) {
            this.f5837b.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5837b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setDither(boolean z) {
        this.f5837b.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f5837b.setFilterBitmap(z);
        invalidateSelf();
    }
}
