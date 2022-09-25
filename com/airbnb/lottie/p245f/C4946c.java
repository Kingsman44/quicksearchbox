package com.airbnb.lottie.p245f;

import android.util.Log;
import com.airbnb.lottie.C4828af;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.f.c */
/* compiled from: PG */
public final class C4946c implements C4828af {

    /* renamed from: a */
    private static final Set f15710a = new HashSet();

    /* renamed from: a */
    public final void mo9784a(String str, Throwable th) {
        Set set = f15710a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
