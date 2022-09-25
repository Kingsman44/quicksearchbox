package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.b */
/* compiled from: PG */
public final class C136499b {

    /* renamed from: a */
    public final C136492a f371610a;

    /* renamed from: b */
    public boolean f371611b = false;

    /* renamed from: c */
    public final RectF f371612c = new RectF();

    /* renamed from: d */
    public final Paint f371613d = new Paint();

    /* renamed from: e */
    public float f371614e = 0.0f;

    /* renamed from: f */
    private final boolean f371615f;

    /* renamed from: g */
    private int f371616g;

    public C136499b(C136492a aVar) {
        boolean z = false;
        this.f371610a = aVar;
        Context context = aVar.getContext();
        this.f371615f = (context.getResources().getConfiguration().uiMode & 48) == 32 ? true : z;
        this.f371616g = C1878d.m5128a(context, R.color.agsa_color_background);
    }

    /* renamed from: a */
    public final void mo113097a(int i) {
        if (!this.f371611b && this.f371616g != i) {
            this.f371616g = i;
            mo113098b();
            this.f371610a.invalidate();
        }
    }

    /* renamed from: b */
    public final void mo113098b() {
        if (this.f371610a.getWidth() + this.f371610a.getHeight() > 0) {
            int width = this.f371610a.getWidth();
            int height = this.f371610a.getHeight();
            float max = ((float) Math.max(height, width)) * 1.05f;
            float f = (float) height;
            float f2 = (max - f) / max;
            int i = this.f371616g;
            boolean z = this.f371615f;
            if (!this.f371611b && Build.VERSION.SDK_INT < 31) {
                float[] fArr = new float[3];
                Color.colorToHSV(i, fArr);
                int i2 = ((int) (this.f371614e * 12.0f)) + 243;
                float f3 = true != z ? 0.995f : 0.12f;
                if (!z) {
                    fArr[1] = 0.005f;
                }
                fArr[2] = f3;
                i = C1924a.m5189h(Color.HSVToColor(fArr), i2);
            }
            float f4 = (float) width;
            this.f371613d.setShader(new RadialGradient(f4 * 0.5f, f * 1.05f, max, new int[]{i, i, i}, new float[]{0.0f, f2, 1.0f}, Shader.TileMode.CLAMP));
            this.f371613d.setAlpha(PrivateKeyType.INVALID);
            this.f371612c.set(0.0f, 0.0f, f4, f);
        }
    }
}
