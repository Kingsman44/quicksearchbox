package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bw */
/* compiled from: PG */
final class C81771bw extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f223633a;

    /* renamed from: b */
    final /* synthetic */ float[] f223634b;

    public C81771bw(int[] iArr, float[] fArr) {
        this.f223633a = iArr;
        this.f223634b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f223633a, this.f223634b, Shader.TileMode.REPEAT);
    }
}
