package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class WhiteChipView extends FrameLayout {

    /* renamed from: a */
    public float f70496a;

    /* renamed from: b */
    public float f70497b;

    /* renamed from: c */
    public int f70498c;

    /* renamed from: d */
    public ValueAnimator f70499d;

    /* renamed from: e */
    private final Paint f70500e = new Paint(1);

    /* renamed from: f */
    private final RectF f70501f = new RectF();

    /* renamed from: g */
    private int f70502g;

    /* renamed from: h */
    private int f70503h;

    /* renamed from: i */
    private Bitmap f70504i;

    /* renamed from: j */
    private Canvas f70505j;

    public WhiteChipView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31121a(float f) {
        if (f != this.f70497b) {
            this.f70497b = f;
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31122b(float f) {
        if (f != this.f70496a) {
            this.f70496a = f;
            invalidate();
        }
    }

    /* renamed from: c */
    public final void mo31123c(int i, int i2) {
        this.f70502g = i;
        this.f70503h = i2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Bitmap bitmap = this.f70504i;
        Canvas canvas2 = this.f70505j;
        if (bitmap != null && canvas2 != null) {
            int height = getHeight();
            int i = this.f70498c;
            float f = ((float) (height - i)) * 0.5f;
            float f2 = ((float) i) * 0.5f;
            float f3 = this.f70496a * 0.5f;
            this.f70501f.left = this.f70497b - f3;
            this.f70501f.right = this.f70497b + f3;
            this.f70501f.top = f;
            this.f70501f.bottom = ((float) getHeight()) - f;
            bitmap.eraseColor(this.f70503h);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.filter_carousel_recycler_view);
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C25951g gVar = (C25951g) recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
                gVar.f70530a.setTextColor(gVar.f70532c);
                gVar.f70530a.setBackgroundDrawable(gVar.f70534e);
            }
            super.dispatchDraw(canvas2);
            for (int i3 = 0; i3 < childCount; i3++) {
                C25951g gVar2 = (C25951g) recyclerView.getChildViewHolder(recyclerView.getChildAt(i3));
                int i4 = this.f70502g;
                gVar2.f70530a.setTextColor(gVar2.f70533d);
                gVar2.f70536g.setColor(i4);
                gVar2.f70530a.setBackgroundDrawable(gVar2.f70535f);
            }
            super.dispatchDraw(canvas);
            canvas.drawRoundRect(this.f70501f, f2, f2, this.f70500e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            this.f70504i = null;
            this.f70505j = null;
            this.f70500e.setShader((Shader) null);
            return;
        }
        Bitmap bitmap = this.f70504i;
        if (bitmap == null || bitmap.getWidth() != width || this.f70504i.getHeight() != height) {
            this.f70504i = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.f70505j = new Canvas(this.f70504i);
            this.f70500e.setShader(new BitmapShader(this.f70504i, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        }
    }

    public WhiteChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WhiteChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
