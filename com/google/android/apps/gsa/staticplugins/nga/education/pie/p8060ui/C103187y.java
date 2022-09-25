package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.y */
/* compiled from: PG */
final class C103187y extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f287925a;

    /* renamed from: b */
    final /* synthetic */ float[] f287926b;

    public C103187y(int[] iArr, float[] fArr) {
        this.f287925a = iArr;
        this.f287926b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f287925a, this.f287926b, Shader.TileMode.REPEAT);
    }
}
