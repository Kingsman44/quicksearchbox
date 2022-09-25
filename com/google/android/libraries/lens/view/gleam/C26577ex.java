package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.libraries.lens.view.utils.C28134w;

/* renamed from: com.google.android.libraries.lens.view.gleam.ex */
/* compiled from: PG */
public final class C26577ex {

    /* renamed from: a */
    public final float f72437a;

    /* renamed from: b */
    public final float f72438b;

    /* renamed from: c */
    public final float f72439c;

    /* renamed from: d */
    public final float f72440d;

    /* renamed from: e */
    public final float f72441e;

    /* renamed from: f */
    public final float f72442f;

    /* renamed from: g */
    public final float f72443g;

    /* renamed from: h */
    public Paint f72444h;

    /* renamed from: i */
    private final Context f72445i;

    /* renamed from: j */
    private Paint f72446j;

    /* renamed from: k */
    private Paint f72447k;

    /* renamed from: l */
    private TextPaint f72448l;

    public C26577ex(Context context) {
        this.f72445i = context;
        this.f72437a = C28134w.m52424a(44.0f, context);
        this.f72438b = C28134w.m52424a(8.0f, context);
        this.f72439c = C28134w.m52424a(16.0f, context);
        this.f72440d = C28134w.m52424a(8.0f, context);
        this.f72441e = C28134w.m52424a(16.0f, context);
        this.f72442f = C28134w.m52424a(4.0f, context);
        this.f72443g = C28134w.m52424a(12.0f, context);
    }

    /* renamed from: a */
    public final Paint mo31834a(float f) {
        if (this.f72446j == null) {
            Paint paint = new Paint(1);
            this.f72446j = paint;
            paint.setColor(-402653185);
            this.f72446j.setStyle(Paint.Style.STROKE);
        }
        this.f72446j.setStrokeWidth(f);
        return this.f72446j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Paint mo31835b() {
        if (this.f72447k == null) {
            Paint paint = new Paint(1);
            this.f72447k = paint;
            paint.setColor(654311423);
            this.f72447k.setStyle(Paint.Style.FILL);
        }
        return this.f72447k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final TextPaint mo31836c() {
        if (this.f72448l == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f72448l = textPaint;
            textPaint.setColor(-12417548);
            this.f72448l.setTextSize(C28134w.m52424a(16.0f, this.f72445i));
        }
        return this.f72448l;
    }
}
