package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public class WidgetImageView extends View {
    public Bitmap mBitmap;
    public final RectF mDstRectF = new RectF();
    private final Paint mPaint = new Paint(3);

    public WidgetImageView(Context context) {
        super(context);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.mBitmap != null) {
            updateDstRectF();
            canvas.drawBitmap(this.mBitmap, (Rect) null, this.mDstRectF, this.mPaint);
        }
    }

    public final void updateDstRectF() {
        if (this.mBitmap.getWidth() > getWidth()) {
            this.mDstRectF.set(0.0f, 0.0f, (float) getWidth(), (((float) getWidth()) / ((float) this.mBitmap.getWidth())) * ((float) this.mBitmap.getHeight()));
            return;
        }
        this.mDstRectF.set(((float) (getWidth() - this.mBitmap.getWidth())) * 0.5f, 0.0f, ((float) (getWidth() + this.mBitmap.getWidth())) * 0.5f, (float) this.mBitmap.getHeight());
    }

    public WidgetImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WidgetImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
