package com.google.android.material.p3504a;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.a.d */
/* compiled from: PG */
public final class C44499d implements TypeEvaluator {
    /* renamed from: a */
    public static final Integer m78601a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & PrivateKeyType.INVALID)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        double pow4 = Math.pow((double) (((float) ((intValue2 >> 16) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        double pow5 = Math.pow((double) (((float) ((intValue2 >> 8) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        double pow6 = Math.pow((double) (((float) (intValue2 & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
        return Integer.valueOf((Math.round((f2 + (f * ((((float) ((intValue2 >> 24) & PrivateKeyType.INVALID)) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow + ((((float) pow4) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) pow5) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (pow3 + ((((float) pow6) - pow3) * f)), 0.45454545454545453d)) * 255.0f));
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m78601a(f, (Integer) obj, (Integer) obj2);
    }
}
