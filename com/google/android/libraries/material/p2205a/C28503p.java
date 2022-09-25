package com.google.android.libraries.material.p2205a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: com.google.android.libraries.material.a.p */
/* compiled from: PG */
public final class C28503p {
    /* renamed from: a */
    public static boolean m53282a(Context context) {
        if (!ValueAnimator.areAnimatorsEnabled()) {
            return true;
        }
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }
}
