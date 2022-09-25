package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bs */
/* compiled from: PG */
public class C27065bs extends FrameLayout {

    /* renamed from: a */
    public final int f73786a;

    /* renamed from: b */
    public int f73787b;

    /* renamed from: c */
    private final int f73788c;

    /* renamed from: d */
    private final int f73789d;

    /* renamed from: e */
    private final Paint f73790e;

    /* renamed from: f */
    private Bitmap f73791f;

    public C27065bs(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            int i = this.f73786a + this.f73789d;
            Bitmap bitmap = this.f73791f;
            if (bitmap == null || bitmap.getWidth() != width) {
                Bitmap createBitmap = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
                this.f73791f = createBitmap;
                createBitmap.eraseColor(0);
                this.f73790e.setShadowLayer((float) this.f73789d, 0.0f, 0.0f, this.f73788c);
                Canvas canvas2 = new Canvas(this.f73791f);
                int i2 = this.f73789d;
                int i3 = this.f73786a;
                float f = (float) i3;
                canvas2.drawRoundRect(0.0f, (float) i2, (float) width, (float) (i2 + i3 + i3), f, f, this.f73790e);
                this.f73790e.clearShadowLayer();
            }
            canvas.drawBitmap(this.f73791f, 0.0f, (float) (-this.f73789d), (Paint) null);
            canvas.drawRect(0.0f, (float) this.f73787b, (float) width, (float) height, this.f73790e);
            super.dispatchDraw(canvas);
        }
    }

    public C27065bs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f73786a = resources.getDimensionPixelSize(R.dimen.lens_info_panel_corner_radius);
        this.f73787b = resources.getDimensionPixelSize(R.dimen.lens_info_panel_corner_radius);
        this.f73789d = resources.getDimensionPixelSize(R.dimen.lens_info_panel_shadow_blur_size);
        this.f73788c = C1878d.m5128a(context, R.color.lens_info_panel_shadow_color);
        int i = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C27064br.f73785a, 0, 0);
            i = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f73790e = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }
}
