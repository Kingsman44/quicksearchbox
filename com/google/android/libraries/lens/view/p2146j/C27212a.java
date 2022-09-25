package com.google.android.libraries.lens.view.p2146j;

import android.graphics.Color;
import com.google.common.p4575r.C60752i;

/* renamed from: com.google.android.libraries.lens.view.j.a */
/* compiled from: PG */
public final class C27212a {
    /* renamed from: a */
    public static float m50465a(int i) {
        return C60752i.m92727a(((float) i) / 255.0f, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static int m50466b(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: c */
    public static int m50467c(float f) {
        return (int) (C60752i.m92727a(f, 0.0f, 1.0f) * 255.0f);
    }
}
