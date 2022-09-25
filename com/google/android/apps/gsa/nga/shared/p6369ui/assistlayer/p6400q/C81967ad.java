package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ad */
/* compiled from: PG */
final class C81967ad extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ String f224101a;

    /* renamed from: b */
    final /* synthetic */ String f224102b;

    public C81967ad(String str, String str2) {
        this.f224101a = str;
        this.f224102b = str2;
    }

    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, Color.parseColor(this.f224101a), Color.parseColor(this.f224102b), Shader.TileMode.REPEAT);
    }
}
