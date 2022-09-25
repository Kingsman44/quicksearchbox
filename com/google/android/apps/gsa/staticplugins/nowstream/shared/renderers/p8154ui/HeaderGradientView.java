package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ui.HeaderGradientView */
/* compiled from: PG */
public class HeaderGradientView extends View {

    /* renamed from: a */
    private int f294754a;

    /* renamed from: b */
    private int f294755b;

    /* renamed from: c */
    private final RectF f294756c;

    /* renamed from: d */
    private final Paint f294757d;

    public HeaderGradientView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(this.f294756c, this.f294757d);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f294754a = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f294755b = measuredHeight;
        this.f294756c.set(0.0f, 0.0f, (float) this.f294754a, (float) measuredHeight);
        if (this.f294754a + this.f294755b > 0) {
            Resources resources = getContext().getResources();
            float f = (float) this.f294754a;
            float f2 = (float) this.f294755b;
            float f3 = f * 0.5f;
            float f4 = f2 + f2;
            RadialGradient radialGradient = new RadialGradient(f3, f4, Math.max(0.1f, 0.4f * f), new int[]{resources.getColor(R.color.minus_one_light_scrim_gradient_start), resources.getColor(R.color.minus_one_light_scrim_gradient_end)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, 0.3f, 0.0f, 0.0f);
            radialGradient.setLocalMatrix(matrix);
            this.f294757d.setShader(radialGradient);
            this.f294757d.setAlpha(PrivateKeyType.INVALID);
        }
    }

    public HeaderGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294756c = new RectF();
        this.f294757d = new Paint();
    }
}
