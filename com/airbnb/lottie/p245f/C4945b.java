package com.airbnb.lottie.p245f;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.airbnb.lottie.f.b */
/* compiled from: PG */
public final class C4945b {
    /* renamed from: a */
    public static int m13692a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & PrivateKeyType.INVALID)) / 255.0f;
        float b = m13693b(((float) ((i >> 16) & PrivateKeyType.INVALID)) / 255.0f);
        float b2 = m13693b(((float) ((i >> 8) & PrivateKeyType.INVALID)) / 255.0f);
        float b3 = m13693b(((float) (i & PrivateKeyType.INVALID)) / 255.0f);
        float b4 = m13693b(((float) ((i2 >> 16) & PrivateKeyType.INVALID)) / 255.0f);
        float b5 = m13693b(((float) ((i2 >> 8) & PrivateKeyType.INVALID)) / 255.0f);
        float b6 = m13693b(((float) (i2 & PrivateKeyType.INVALID)) / 255.0f);
        return (Math.round((f2 + (f * ((((float) ((i2 >> 24) & PrivateKeyType.INVALID)) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(m13694c(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round(m13694c(b2 + ((b5 - b2) * f)) * 255.0f) << 8) | Math.round(m13694c(b3 + ((b6 - b3) * f)) * 255.0f);
    }

    /* renamed from: b */
    private static float m13693b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: c */
    private static float m13694c(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 79.36000061035156d);
    }
}
