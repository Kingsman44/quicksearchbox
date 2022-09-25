package com.google.android.material.p3504a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: com.google.android.material.a.e */
/* compiled from: PG */
public final class C44500e extends Property {

    /* renamed from: a */
    private final Matrix f115655a = new Matrix();

    public C44500e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        this.f115655a.set(((ImageView) obj).getImageMatrix());
        return this.f115655a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
