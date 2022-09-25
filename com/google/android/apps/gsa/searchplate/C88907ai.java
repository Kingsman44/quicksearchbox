package com.google.android.apps.gsa.searchplate;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.searchplate.ai */
/* compiled from: PG */
public final class C88907ai extends Drawable {

    /* renamed from: a */
    public int f240841a = 0;

    /* renamed from: b */
    public float f240842b = 1.0f;

    /* renamed from: c */
    public boolean f240843c = false;

    /* renamed from: d */
    private final Drawable f240844d;

    /* renamed from: e */
    private final int f240845e;

    /* renamed from: f */
    private final int f240846f;

    /* renamed from: g */
    private final int f240847g;

    /* renamed from: h */
    private final Paint f240848h;

    /* renamed from: i */
    private final Paint f240849i;

    /* renamed from: j */
    private final Paint f240850j;

    /* renamed from: k */
    private final int f240851k;

    /* renamed from: l */
    private final int f240852l;

    /* renamed from: m */
    private final RectF f240853m = new RectF();

    /* renamed from: n */
    private int f240854n = PrivateKeyType.INVALID;

    /* renamed from: o */
    private boolean f240855o = true;

    /* renamed from: p */
    private boolean f240856p;

    public C88907ai(Resources resources, boolean z) {
        Paint paint = new Paint();
        this.f240848h = paint;
        Paint paint2 = new Paint();
        this.f240849i = paint2;
        Paint paint3 = new Paint();
        this.f240850j = paint3;
        this.f240845e = Math.abs(resources.getDimensionPixelSize(R.dimen.search_bg_9_baked_margin));
        this.f240846f = Math.abs(resources.getDimensionPixelSize(R.dimen.search_bg_content_inset));
        int color = resources.getColor(R.color.agsa_color_surface);
        this.f240851k = color;
        if (z) {
            this.f240844d = resources.getDrawable(R.drawable.search_bg_rr_shadow);
            this.f240847g = resources.getDimensionPixelSize(R.dimen.search_plate_rounded_corner_radius);
        } else {
            this.f240844d = resources.getDrawable(R.drawable.search_bg_round_shadow);
            this.f240847g = resources.getDimensionPixelSize(R.dimen.text_search_plate_height);
        }
        paint.setColor(resources.getColor(R.color.search_plate_suggestion_divider_background));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.search_bg_shadow_thickness);
        this.f240852l = dimensionPixelSize;
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        this.f240844d.mutate();
        m144512e(getBounds());
        paint3.setColor(color);
        paint3.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) dimensionPixelSize);
    }

    /* renamed from: d */
    private final void m144511d(Canvas canvas, float f, Paint paint) {
        Rect bounds = getBounds();
        if (this.f240842b > 0.0f) {
            this.f240853m.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
            RectF rectF = this.f240853m;
            float f2 = (float) ((int) (this.f240842b * ((float) this.f240845e)));
            rectF.inset(f2, f2);
            this.f240853m.bottom = (float) (bounds.bottom - this.f240845e);
            this.f240853m.offset(0.0f, f);
            RectF rectF2 = this.f240853m;
            float f3 = (float) this.f240847g;
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        } else if (this.f240843c) {
            canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, ((float) bounds.bottom) + f, paint);
        } else {
            canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (((float) bounds.bottom) + f) - ((float) this.f240845e), paint);
        }
    }

    /* renamed from: e */
    private final void m144512e(Rect rect) {
        int i = rect.top;
        int i2 = rect.bottom;
        if (this.f240841a == 1) {
            i2 += this.f240847g;
        }
        this.f240844d.setBounds(rect.left, i, rect.right, i2);
    }

    /* renamed from: a */
    public final void mo82776a(boolean z) {
        if (z != this.f240855o) {
            this.f240855o = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo82777b(boolean z) {
        if (z != this.f240856p) {
            this.f240856p = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo82778c(int i) {
        if (this.f240841a != i) {
            this.f240841a = i;
            m144512e(getBounds());
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f240841a == 2) {
            canvas.drawColor(this.f240851k);
            return;
        }
        if (this.f240856p) {
            canvas.save();
            Rect bounds = getBounds();
            if (this.f240841a == 1) {
                canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom - this.f240845e);
            }
            this.f240844d.draw(canvas);
            canvas.restore();
            if (this.f240841a == 1 && this.f240855o) {
                Rect bounds2 = getBounds();
                canvas.drawLine((float) (bounds2.left + this.f240846f), (float) (bounds2.bottom - this.f240845e), (float) (bounds2.right - this.f240846f), (float) (bounds2.bottom - this.f240845e), this.f240848h);
            }
        }
        if (this.f240842b < 1.0f) {
            this.f240849i.setAlpha(17);
            int i = this.f240852l;
            m144511d(canvas, (float) (i + i), this.f240849i);
            this.f240849i.setAlpha(20);
            m144511d(canvas, (float) this.f240852l, this.f240849i);
            m144511d(canvas, 0.0f, this.f240850j);
        }
    }

    public final int getAlpha() {
        return this.f240854n;
    }

    public final int getOpacity() {
        return this.f240844d.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f240844d.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m144512e(rect);
    }

    public final void setAlpha(int i) {
        this.f240854n = i;
        this.f240844d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f240844d.setColorFilter(colorFilter);
    }
}
