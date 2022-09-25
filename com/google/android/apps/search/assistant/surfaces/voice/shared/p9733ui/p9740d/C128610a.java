package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9740d;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.d.a */
/* compiled from: PG */
public final class C128610a extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int[] f353601a;

    /* renamed from: b */
    final /* synthetic */ float[] f353602b;

    public C128610a(int[] iArr, float[] fArr) {
        this.f353601a = iArr;
        this.f353602b = fArr;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.f353601a, this.f353602b, Shader.TileMode.REPEAT);
    }
}
