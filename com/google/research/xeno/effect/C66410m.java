package com.google.research.xeno.effect;

import android.util.Log;
import com.google.research.xeno.effect.ProcessorBase;

/* renamed from: com.google.research.xeno.effect.m */
/* compiled from: PG */
public final /* synthetic */ class C66410m implements ProcessorBase.Callback {

    /* renamed from: a */
    public static final /* synthetic */ C66410m f180589a = new C66410m();

    private /* synthetic */ C66410m() {
    }

    public final void onCompletion(boolean z, String str) {
        String str2 = C66412o.f180592a;
        if (!z) {
            Log.e(C66412o.f180592a, "Error sending video processor frame packet.\n".concat(String.valueOf(str)));
        }
    }
}
