package com.google.android.material.p3515l;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: com.google.android.material.l.w */
/* compiled from: PG */
public final class C44792w extends C44793x {

    /* renamed from: a */
    public float f116815a;

    /* renamed from: b */
    public float f116816b;

    /* renamed from: a */
    public final void mo48155a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f116817g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f116815a, this.f116816b);
        path.transform(matrix);
    }
}
