package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public final class AvatarView extends AppCompatImageView {

    /* renamed from: a */
    public final Paint f81571a;

    /* renamed from: b */
    public int f81572b;

    /* renamed from: c */
    public FrameLayout f81573c;

    /* renamed from: d */
    public int f81574d;

    /* renamed from: e */
    private final Paint f81575e;

    /* renamed from: f */
    private final RectF f81576f;

    /* renamed from: g */
    private final Path f81577g;

    /* renamed from: h */
    private final Path f81578h;

    /* renamed from: i */
    private final int f81579i;

    /* renamed from: j */
    private int f81580j;

    /* renamed from: k */
    private int f81581k;

    /* renamed from: l */
    private float f81582l;

    public AvatarView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private final float m56087e() {
        boolean z = false;
        if (this.f81574d != -1 && !this.f81576f.isEmpty()) {
            z = true;
        }
        C58838bb.m90883r(z);
        int f = C2043bi.m5577f(this);
        float strokeWidth = this.f81576f.left - (this.f81571a.getStrokeWidth() / 2.0f);
        float strokeWidth2 = this.f81576f.right + (this.f81571a.getStrokeWidth() / 2.0f);
        float f2 = (((float) this.f81574d) / 2.0f) - ((float) this.f81579i);
        return f == 1 ? strokeWidth + f2 : strokeWidth2 - f2;
    }

    /* renamed from: f */
    private final float m56088f() {
        boolean z = false;
        if (this.f81574d != -1 && !this.f81576f.isEmpty()) {
            z = true;
        }
        C58838bb.m90883r(z);
        return this.f81576f.bottom + (this.f81571a.getStrokeWidth() / 2.0f) + (((float) (-this.f81574d)) / 2.0f);
    }

    /* renamed from: g */
    private final void m56089g(Canvas canvas) {
        if (!this.f81578h.isEmpty()) {
            canvas.drawPath(this.f81578h, this.f81575e);
        }
    }

    /* renamed from: h */
    private final void m56090h() {
        if (!this.f81577g.isEmpty()) {
            this.f81577g.rewind();
        }
        if (!this.f81578h.isEmpty() && !this.f81576f.isEmpty()) {
            this.f81577g.addOval(this.f81576f, Path.Direction.CW);
            Path path = this.f81577g;
            path.op(path, this.f81578h, Path.Op.DIFFERENCE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35601a() {
        this.f81572b = -1;
        mo35604d();
    }

    /* renamed from: b */
    public final void mo35602b() {
        float f;
        if (this.f81580j != -1 && this.f81581k != -1 && this.f81574d != -1 && this.f81573c != null && !this.f81576f.isEmpty()) {
            this.f81573c.setTranslationY(m56088f() - (((float) this.f81574d) / 2.0f));
            int f2 = C2043bi.m5577f(this);
            float e = m56087e();
            FrameLayout frameLayout = this.f81573c;
            if (f2 == 1) {
                f = ((float) (-this.f81580j)) + e + (((float) this.f81574d) / 2.0f);
            } else {
                f = e - (((float) this.f81574d) / 2.0f);
            }
            frameLayout.setTranslationX(f);
        }
    }

    /* renamed from: c */
    public final void mo35603c() {
        this.f81578h.rewind();
        if (!(this.f81580j == -1 || this.f81581k == -1 || this.f81574d == -1 || this.f81576f.isEmpty())) {
            int i = this.f81574d;
            int i2 = this.f81579i;
            this.f81578h.addCircle(m56087e(), m56088f(), (((float) (i + (i2 + i2))) * this.f81582l) / 2.0f, Path.Direction.CW);
        }
        m56090h();
        invalidate();
    }

    /* renamed from: d */
    public final void mo35604d() {
        int i;
        int i2;
        int i3 = this.f81580j;
        if (i3 == -1 || (i = this.f81581k) == -1 || (i2 = this.f81572b) == -1) {
            this.f81576f.setEmpty();
        } else {
            this.f81576f.set(((float) (i3 - i2)) / 2.0f, ((float) (i - i2)) / 2.0f, ((float) (i3 + i2)) / 2.0f, ((float) (i + i2)) / 2.0f);
        }
        m56090h();
        mo35602b();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f81577g.isEmpty()) {
            m56089g(canvas);
            canvas.drawPath(this.f81577g, this.f81571a);
        } else if (!this.f81576f.isEmpty()) {
            canvas.drawArc(this.f81576f, 0.0f, 360.0f, false, this.f81571a);
            m56089g(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f81580j = i;
        this.f81581k = i2;
        mo35604d();
        mo35603c();
    }

    public void setBadgeScale(float f) {
        this.f81582l = f;
        if (!(f == 0.0f || getLayerType() == 2)) {
            setLayerType(2, (Paint) null);
        }
        mo35603c();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f81571a = paint;
        Paint paint2 = new Paint();
        this.f81575e = paint2;
        this.f81576f = new RectF();
        this.f81577g = new Path();
        this.f81578h = new Path();
        this.f81579i = getResources().getDimensionPixelSize(R.dimen.og_apd_badge_wrapper_padding);
        this.f81572b = -1;
        this.f81580j = -1;
        this.f81581k = -1;
        this.f81574d = -1;
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(Paint.Style.FILL);
    }
}
