package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fa */
/* compiled from: PG */
final class C115787fa extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f321063a;

    /* renamed from: b */
    final /* synthetic */ float[] f321064b;

    public C115787fa(int[] iArr, float[] fArr) {
        this.f321063a = iArr;
        this.f321064b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f321063a, this.f321064b, Shader.TileMode.REPEAT);
    }
}
