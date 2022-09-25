package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ae */
/* compiled from: PG */
final class C81968ae extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f224103a;

    /* renamed from: b */
    final /* synthetic */ float[] f224104b;

    public C81968ae(int[] iArr, float[] fArr) {
        this.f224103a = iArr;
        this.f224104b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f224103a, this.f224104b, Shader.TileMode.REPEAT);
    }
}
