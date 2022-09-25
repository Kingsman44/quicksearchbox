package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bl */
/* compiled from: PG */
final class C126801bl extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f349192a;

    /* renamed from: b */
    final /* synthetic */ float[] f349193b;

    public C126801bl(int[] iArr, float[] fArr) {
        this.f349192a = iArr;
        this.f349193b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f349192a, this.f349193b, Shader.TileMode.REPEAT);
    }
}
