package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.e */
/* compiled from: PG */
public final class C83532e extends View {

    /* renamed from: a */
    private int f227753a = -1;

    /* renamed from: b */
    private int f227754b = -1;

    /* renamed from: c */
    private int f227755c;

    /* renamed from: d */
    private int f227756d;

    /* renamed from: e */
    private final RectF f227757e = new RectF();

    /* renamed from: f */
    private final Paint f227758f = new Paint();

    public C83532e(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m133010b() {
        int i = this.f227755c;
        int i2 = this.f227756d;
        if (i + i2 > 0) {
            float max = ((float) Math.max(i2, i)) * 1.05f;
            float f = (float) this.f227756d;
            int i3 = this.f227755c;
            int i4 = this.f227753a;
            this.f227758f.setShader(new RadialGradient(0.5f * ((float) i3), f * 1.05f, max, new int[]{i4, i4, this.f227754b}, new float[]{0.0f, (max - f) / max, 1.0f}, Shader.TileMode.CLAMP));
            this.f227758f.setAlpha(PrivateKeyType.INVALID);
            this.f227757e.set(0.0f, 0.0f, (float) this.f227755c, (float) this.f227756d);
        }
    }

    /* renamed from: a */
    public final void mo76854a(int i, int i2) {
        if (this.f227753a != i || this.f227754b != i2) {
            this.f227753a = i;
            this.f227754b = i2;
            m133010b();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(this.f227757e, this.f227758f);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f227755c = i;
        this.f227756d = i2;
        m133010b();
    }
}
