package com.google.android.material.p3515l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.material.l.v */
/* compiled from: PG */
public final class C44791v extends C44793x {

    /* renamed from: h */
    private static final RectF f116808h = new RectF();
    @Deprecated

    /* renamed from: a */
    public final float f116809a;
    @Deprecated

    /* renamed from: b */
    public final float f116810b;
    @Deprecated

    /* renamed from: c */
    public final float f116811c;
    @Deprecated

    /* renamed from: d */
    public final float f116812d;
    @Deprecated

    /* renamed from: e */
    public float f116813e;
    @Deprecated

    /* renamed from: f */
    public float f116814f;

    public C44791v(float f, float f2, float f3, float f4) {
        this.f116809a = f;
        this.f116810b = f2;
        this.f116811c = f3;
        this.f116812d = f4;
    }

    /* renamed from: a */
    public final void mo48155a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f116817g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f116808h;
        rectF.set(this.f116809a, this.f116810b, this.f116811c, this.f116812d);
        path.arcTo(rectF, this.f116813e, this.f116814f, false);
        path.transform(matrix);
    }
}
