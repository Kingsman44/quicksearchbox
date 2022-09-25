package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.CircleCutoutView */
/* compiled from: PG */
public class CircleCutoutView extends View {

    /* renamed from: a */
    Bitmap f253330a;

    /* renamed from: b */
    private int f253331b;

    /* renamed from: c */
    private int f253332c;

    /* renamed from: d */
    private int f253333d;

    /* renamed from: e */
    private int f253334e;

    /* renamed from: f */
    private Paint f253335f;

    /* renamed from: g */
    private Paint f253336g;

    public CircleCutoutView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m147880a() {
        if (getWidth() > 0 && getHeight() > 0) {
            m147881b(getWidth(), getHeight());
        }
    }

    /* renamed from: b */
    private final void m147881b(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(this.f253331b);
        shapeDrawable.setBounds(0, 0, i, i2);
        Bitmap bitmap = this.f253330a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f253330a = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f253330a);
        shapeDrawable.draw(canvas);
        int i3 = this.f253332c;
        if (i3 > 0) {
            canvas.drawCircle((float) this.f253333d, (float) this.f253334e, (float) i3, this.f253336g);
        }
    }

    public int getOffsetX() {
        return this.f253333d;
    }

    public int getOffsetY() {
        return this.f253334e;
    }

    public int getOuterCircleColor() {
        return this.f253331b;
    }

    public int getRadius() {
        return this.f253332c;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f253330a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f253335f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m147881b(i, i2);
    }

    public void setCutoutDimensions(int i, int i2, int i3) {
        this.f253333d = i;
        this.f253334e = i2;
        this.f253332c = i3;
        m147880a();
    }

    public void setOuterCircleColor(int i) {
        this.f253331b = i;
        m147880a();
    }

    public CircleCutoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleCutoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f253336g = paint;
        paint.setColor(getResources().getColor(17170445));
        this.f253336g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f253335f = new Paint();
        this.f253331b = -570490752;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C90629ae.f253423a, i, 0);
            try {
                this.f253331b = obtainStyledAttributes.getColor(0, -570490752);
                this.f253332c = obtainStyledAttributes.getDimensionPixelSize(1, -1);
                this.f253333d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.f253334e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
