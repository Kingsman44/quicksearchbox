package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.ProgressBarContainer */
/* compiled from: PG */
public class ProgressBarContainer extends FrameLayout {

    /* renamed from: a */
    private final Drawable f253655a;

    /* renamed from: b */
    private final Paint f253656b;

    /* renamed from: c */
    private Bitmap f253657c;

    /* renamed from: d */
    private int f253658d;

    /* renamed from: e */
    private int f253659e;

    public ProgressBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Drawable drawable = getResources().getDrawable(R.drawable.progress_bar_mask);
        drawable.getClass();
        this.f253655a = drawable;
        Paint paint = new Paint(1);
        this.f253656b = paint;
        paint.setAntiAlias(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f253657c == null) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.saveLayer((RectF) null, (Paint) null, 31);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(this.f253657c, 0.0f, 0.0f, this.f253656b);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            if (getMeasuredWidth() != this.f253659e || getMeasuredHeight() != this.f253658d) {
                this.f253658d = getMeasuredHeight();
                this.f253659e = getMeasuredWidth();
                Bitmap bitmap = this.f253657c;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f253657c.recycle();
                }
                this.f253657c = Bitmap.createBitmap(this.f253659e, this.f253658d, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(this.f253657c);
                this.f253655a.setBounds(0, 0, this.f253659e, this.f253658d);
                this.f253655a.draw(canvas);
            }
        }
    }
}
