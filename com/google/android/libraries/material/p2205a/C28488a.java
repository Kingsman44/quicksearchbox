package com.google.android.libraries.material.p2205a;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.material.a.a */
/* compiled from: PG */
public final class C28488a implements TypeEvaluator {

    /* renamed from: a */
    public static final C28488a f77317a = new C28488a();

    private C28488a() {
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i = (intValue >> 24) & PrivateKeyType.INVALID;
        int i2 = (intValue >> 16) & PrivateKeyType.INVALID;
        int i3 = (intValue >> 8) & PrivateKeyType.INVALID;
        int i4 = intValue & PrivateKeyType.INVALID;
        int intValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf(((i + ((int) (((float) (((intValue2 >> 24) & PrivateKeyType.INVALID) - i)) * f))) << 24) | ((i2 + ((int) (((float) (((intValue2 >> 16) & PrivateKeyType.INVALID) - i2)) * f))) << 16) | ((i3 + ((int) (((float) (((intValue2 >> 8) & PrivateKeyType.INVALID) - i3)) * f))) << 8) | (i4 + ((int) (f * ((float) ((intValue2 & PrivateKeyType.INVALID) - i4))))));
    }
}
