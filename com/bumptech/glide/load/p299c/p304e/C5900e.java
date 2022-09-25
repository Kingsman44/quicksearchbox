package com.bumptech.glide.load.p299c.p304e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.p281b.C5521e;
import com.bumptech.glide.p291h.C5630q;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.e.e */
/* compiled from: PG */
public final class C5900e extends Drawable implements Animatable, C5905j {

    /* renamed from: a */
    public final C5899d f17517a;

    /* renamed from: b */
    public boolean f17518b;

    /* renamed from: c */
    private boolean f17519c;

    /* renamed from: d */
    private boolean f17520d;

    /* renamed from: e */
    private boolean f17521e = true;

    /* renamed from: f */
    private int f17522f;

    /* renamed from: g */
    private final int f17523g = -1;

    /* renamed from: h */
    private boolean f17524h;

    /* renamed from: i */
    private Paint f17525i;

    /* renamed from: j */
    private Rect f17526j;

    public C5900e(C5899d dVar) {
        this.f17517a = dVar;
    }

    /* renamed from: d */
    private final Paint m15244d() {
        if (this.f17525i == null) {
            this.f17525i = new Paint(2);
        }
        return this.f17525i;
    }

    /* renamed from: e */
    private final Rect m15245e() {
        if (this.f17526j == null) {
            this.f17526j = new Rect();
        }
        return this.f17526j;
    }

    /* renamed from: f */
    private final void m15246f() {
        C5630q.m14604a(!this.f17518b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f17517a.f17516a.mo12366a() == 1) {
            invalidateSelf();
        } else if (!this.f17519c) {
            this.f17519c = true;
            C5907l lVar = this.f17517a.f17516a;
            if (lVar.f17538f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!lVar.f17534b.contains(this)) {
                boolean isEmpty = lVar.f17534b.isEmpty();
                lVar.f17534b.add(this);
                if (isEmpty && !lVar.f17536d) {
                    lVar.f17536d = true;
                    lVar.f17538f = false;
                    lVar.mo12367b();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    /* renamed from: g */
    private final void m15247g() {
        this.f17519c = false;
        C5907l lVar = this.f17517a.f17516a;
        lVar.f17534b.remove(this);
        if (lVar.f17534b.isEmpty()) {
            lVar.f17536d = false;
        }
    }

    /* renamed from: a */
    public final Bitmap mo12350a() {
        return this.f17517a.f17516a.f17540h;
    }

    /* renamed from: b */
    public final ByteBuffer mo12351b() {
        return ((C5521e) this.f17517a.f17516a.f17533a).f16729a.asReadOnlyBuffer();
    }

    /* renamed from: c */
    public final void mo12352c() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C5907l lVar = this.f17517a.f17516a;
        C5904i iVar = lVar.f17537e;
        if ((iVar != null ? iVar.f17528a : -1) == lVar.mo12366a() - 1) {
            this.f17522f++;
        }
        if (this.f17523g != -1 && this.f17522f >= 0) {
            stop();
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f17518b) {
            if (this.f17524h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m15245e());
                this.f17524h = false;
            }
            C5907l lVar = this.f17517a.f17516a;
            C5904i iVar = lVar.f17537e;
            if (iVar != null) {
                bitmap = iVar.f17529b;
            } else {
                bitmap = lVar.f17540h;
            }
            canvas.drawBitmap(bitmap, (Rect) null, m15245e(), m15244d());
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f17517a;
    }

    public final int getIntrinsicHeight() {
        return this.f17517a.f17516a.f17544l;
    }

    public final int getIntrinsicWidth() {
        return this.f17517a.f17516a.f17543k;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f17519c;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17524h = true;
    }

    public final void setAlpha(int i) {
        m15244d().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m15244d().setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        C5630q.m14604a(!this.f17518b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f17521e = z;
        if (!z) {
            m15247g();
        } else if (this.f17520d) {
            m15246f();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        this.f17520d = true;
        this.f17522f = 0;
        if (this.f17521e) {
            m15246f();
        }
    }

    public final void stop() {
        this.f17520d = false;
        m15247g();
    }
}
