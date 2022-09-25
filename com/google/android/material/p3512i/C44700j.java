package com.google.android.material.p3512i;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.p092d.C1886a;

/* renamed from: com.google.android.material.i.j */
/* compiled from: PG */
public final class C44700j {
    /* renamed from: a */
    public static Typeface m79248a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C1886a.m5145c(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
