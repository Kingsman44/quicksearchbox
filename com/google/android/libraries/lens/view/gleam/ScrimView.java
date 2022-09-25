package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class ScrimView extends FrameLayout {

    /* renamed from: a */
    public C26588fh f71947a;

    /* renamed from: b */
    public boolean f71948b;

    /* renamed from: c */
    public C26457ap f71949c;

    /* renamed from: d */
    private final Paint f71950d;

    /* renamed from: e */
    private final Paint f71951e = new Paint();

    /* renamed from: f */
    private final List f71952f = new ArrayList();

    /* renamed from: g */
    private ColorMatrixColorFilter f71953g;

    /* renamed from: h */
    private final int f71954h;

    /* renamed from: i */
    private final int f71955i;

    /* renamed from: j */
    private final ValueAnimator f71956j;

    /* renamed from: k */
    private int f71957k;

    /* renamed from: l */
    private int f71958l;

    /* renamed from: m */
    private int f71959m;

    /* renamed from: n */
    private int f71960n;

    public ScrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f71950d = paint;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f71956j = valueAnimator;
        this.f71947a = C26588fh.DEFAULT_SCRIM;
        paint.setStyle(Paint.Style.FILL);
        int color = context.getColor(R.color.lens_gleam_default_scrim_color);
        this.f71954h = color;
        this.f71955i = context.getColor(R.color.lens_gleam_dark_scrim_color);
        this.f71960n = color;
        this.f71957k = color;
        this.f71959m = color;
        this.f71958l = color;
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
    }

    /* renamed from: b */
    private static int m48740b(int i, int i2, C58817ah ahVar, float f) {
        float intValue = (float) ((Integer) ahVar.apply(Integer.valueOf(i))).intValue();
        return (int) (intValue + (f * (((float) ((Integer) ahVar.apply(Integer.valueOf(i2))).intValue()) - intValue)));
    }

    /* renamed from: c */
    private final int m48741c() {
        C26588fh fhVar = C26588fh.DEFAULT_SCRIM;
        int ordinal = this.f71947a.ordinal();
        if (ordinal == 0) {
            return this.f71954h;
        }
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal != 2) {
            return this.f71954h;
        }
        return this.f71948b ? this.f71955i : this.f71954h;
    }

    /* renamed from: a */
    public final void mo31648a() {
        this.f71957k = this.f71958l;
        int c = m48741c();
        this.f71959m = c;
        if (this.f71957k != c) {
            this.f71956j.setFloatValues(new float[]{0.0f, 1.0f});
            this.f71956j.addUpdateListener(new C26589fi(this));
            this.f71956j.start();
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        if (this.f71948b && this.f71949c != null) {
            this.f71952f.clear();
            C26457ap apVar = this.f71949c;
            apVar.getClass();
            C58485gu guVar = apVar.f72053b;
            int i2 = ((C58724pq) guVar).f156474d;
            for (int i3 = 0; i3 < i2; i3++) {
                C26464aw V = ((C26447af) guVar.get(i3)).mo31664V();
                if (V != null) {
                    this.f71952f.add(V);
                }
            }
        }
        List<C26464aw> list = this.f71952f;
        Trace.beginSection("ScrimView.draw");
        if (this.f71956j.isRunning()) {
            Object animatedValue = this.f71956j.getAnimatedValue();
            if (animatedValue instanceof Number) {
                int i4 = this.f71957k;
                int i5 = this.f71959m;
                float floatValue = ((Float) animatedValue).floatValue();
                this.f71958l = Color.argb(m48740b(i4, i5, C26590fj.f72492a, floatValue), m48740b(i4, i5, C26591fk.f72493a, floatValue), m48740b(i4, i5, C26592fl.f72494a, floatValue), m48740b(i4, i5, C26593fm.f72495a, floatValue));
            }
        } else {
            this.f71958l = m48741c();
        }
        this.f71960n = this.f71958l;
        this.f71953g = null;
        if (this.f71948b) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C26464aw) it.next()).mo31717a() > 0.0f) {
                    if (this.f71948b) {
                        i = 1;
                    }
                }
            }
        }
        i = 2;
        C26588fh fhVar = C26588fh.DEFAULT_SCRIM;
        if (i - 1 != 0) {
            setLayerType(0, (Paint) null);
            canvas.drawColor(this.f71960n);
        } else {
            if (this.f71953g == null) {
                ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(this.f71960n), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.green(this.f71960n), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.blue(this.f71960n), ((float) Color.alpha(this.f71960n)) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                this.f71953g = colorMatrixColorFilter;
                this.f71951e.setColorFilter(colorMatrixColorFilter);
            }
            setLayerType(2, this.f71951e);
            canvas.drawColor(-1);
            Paint paint = this.f71950d;
            if (this.f71948b) {
                for (C26464aw awVar : list) {
                    if (awVar.mo31717a() > 0.0f) {
                        int a = (int) ((1.0f - (awVar.mo31717a() + 0.0f)) * 255.0f);
                        paint.setColor(Color.rgb(a, a, a));
                        canvas.drawPath(awVar.mo31718b(), paint);
                    }
                }
            }
        }
        Trace.endSection();
    }
}
