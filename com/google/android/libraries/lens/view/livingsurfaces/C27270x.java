package com.google.android.libraries.lens.view.livingsurfaces;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.material.progress.C28582h;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.common.p4575r.C60752i;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62491dn;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.x */
/* compiled from: PG */
public final class C27270x extends FrameLayout {

    /* renamed from: a */
    public View f74580a = null;

    /* renamed from: b */
    C27243b f74581b;

    /* renamed from: c */
    public boolean f74582c = false;

    /* renamed from: d */
    public C25459e f74583d;

    /* renamed from: e */
    private final Matrix f74584e = new Matrix();

    /* renamed from: f */
    private C28582h f74585f;

    /* renamed from: g */
    private int f74586g;

    /* renamed from: h */
    private int f74587h;

    public C27270x(Context context) {
        super(context, (AttributeSet) null, 0);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public static void m50775b(View view, float f, float f2) {
        view.animate().cancel();
        view.setAlpha(f);
        view.setVisibility(0);
        view.animate().alpha(f2).setStartDelay(0).setDuration(266).setListener(f2 == 0.0f ? new C27269w(view) : null);
    }

    /* renamed from: a */
    public final void mo32800a(Canvas canvas, C62491dn dnVar) {
        C62491dn dnVar2 = dnVar;
        this.f74584e.reset();
        if (this.f74580a != null && dnVar2.f168713b.size() >= 4) {
            float f = (float) this.f74587h;
            float f2 = (float) this.f74586g;
            float[] fArr = {((C62488dk) dnVar2.f168713b.get(0)).f168702b, ((C62488dk) dnVar2.f168713b.get(0)).f168703c, ((C62488dk) dnVar2.f168713b.get(1)).f168702b, ((C62488dk) dnVar2.f168713b.get(1)).f168703c, ((C62488dk) dnVar2.f168713b.get(2)).f168702b, ((C62488dk) dnVar2.f168713b.get(2)).f168703c, ((C62488dk) dnVar2.f168713b.get(3)).f168702b, ((C62488dk) dnVar2.f168713b.get(3)).f168703c};
            float[] fArr2 = fArr;
            this.f74584e.setPolyToPoly(new float[]{0.0f, 0.0f, 0.0f, f, f2, f, f2, 0.0f}, 0, fArr, 0, 4);
            C25459e eVar = this.f74583d;
            if (!(eVar == null || eVar.f69394i == 1 || this.f74580a == null)) {
                float max = 1.0f / ((float) Math.max(1, canvas.getWidth()));
                float max2 = 1.0f / ((float) Math.max(1, canvas.getHeight()));
                float c = C60752i.m92729c(fArr2[0], fArr2[2], fArr2[4], fArr2[6]) * max;
                float b = max * C60752i.m92728b(fArr2[0], fArr2[2], fArr2[4], fArr2[6]);
                float c2 = C60752i.m92729c(fArr2[1], fArr2[3], fArr2[5], fArr2[7]) * max2;
                float b2 = max2 * C60752i.m92728b(fArr2[1], fArr2[3], fArr2[5], fArr2[7]);
                float f3 = (c + b) * 0.5f * 0.5f;
                float max3 = Math.max(0.0f, (c * 0.5f) + f3);
                float min = Math.min(1.0f, (b * 0.5f) + f3);
                float f4 = (c2 + b2) * 0.5f * 0.5f;
                this.f74583d.mo30496b(this.f74580a, max3, min, Math.max(0.0f, (c2 * 0.5f) + f4), Math.min(1.0f, (b2 * 0.5f) + f4));
                float[] fArr3 = this.f74583d.mo30495a(this.f74580a).f69381c;
                if (this.f74580a != null) {
                    int min2 = Math.min(PrivateKeyType.INVALID, (int) (fArr3[0] * 256.0f));
                    int min3 = Math.min(PrivateKeyType.INVALID, (int) (fArr3[1] * 256.0f));
                    int min4 = Math.min(PrivateKeyType.INVALID, (int) (fArr3[2] * 256.0f));
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(min4 + (min3 << 8) + (min2 << 16), 0));
                    this.f74580a.setLayerPaint(paint);
                }
            }
            invalidate();
        }
    }

    /* renamed from: c */
    public final void mo32801c(View view, FrameLayout.LayoutParams layoutParams) {
        if (view != null) {
            removeView(view);
        }
        this.f74580a = view;
        addView(view, layoutParams);
        this.f74582c = false;
        view.setVisibility(8);
        this.f74586g = layoutParams.width;
        this.f74587h = layoutParams.height;
        C27243b bVar = this.f74581b;
        if (bVar != null) {
            removeView(bVar);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.loading_circle_diameter);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.loading_spinner_stroke_width);
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        C27243b bVar2 = new C27243b(getContext());
        this.f74581b = bVar2;
        bVar2.setBackgroundColor(getResources().getColor(R.color.quantum_grey50));
        C28582h hVar = (C28582h) MaterialProgressBar.m53446i(getContext(), 1).getIndeterminateDrawable();
        this.f74585f = hVar;
        hVar.setStrokeWidth(dimensionPixelSize2);
        this.f74581b.setImageDrawable(this.f74585f);
        this.f74581b.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        float f = (float) (dimensionPixelSize / 2);
        this.f74581b.setTranslationX((((float) i) / 2.0f) - f);
        this.f74581b.setTranslationY((((float) i2) / 2.0f) - f);
        addView(this.f74581b);
        C27243b bVar3 = this.f74581b;
        if (bVar3 != null) {
            m50775b(bVar3, 0.0f, 1.0f);
        }
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.f74584e);
        super.draw(canvas);
        canvas.restore();
    }
}
