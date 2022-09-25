package com.google.android.libraries.componentview.components.base;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.libraries.componentview.components.base.p1687a.C19902ac;

/* renamed from: com.google.android.libraries.componentview.components.base.cd */
/* compiled from: PG */
final class C20073cd extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ C19902ac f56295a;

    /* renamed from: b */
    final /* synthetic */ int[] f56296b;

    /* renamed from: c */
    final /* synthetic */ float[] f56297c;

    /* renamed from: d */
    final /* synthetic */ Shader.TileMode f56298d;

    public C20073cd(C19902ac acVar, int[] iArr, float[] fArr, Shader.TileMode tileMode) {
        this.f56295a = acVar;
        this.f56296b = iArr;
        this.f56297c = fArr;
        this.f56298d = tileMode;
    }

    public final Shader resize(int i, int i2) {
        C19902ac acVar = this.f56295a;
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = acVar.f55681e * f2;
        float[] fArr = {acVar.f55678b * f, acVar.f55679c * f2, acVar.f55680d * f, f3};
        return new LinearGradient(fArr[0], fArr[1], fArr[2], f3, this.f56296b, this.f56297c, this.f56298d);
    }
}
