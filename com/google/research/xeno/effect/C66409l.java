package com.google.research.xeno.effect;

import android.util.Log;
import com.google.research.xeno.effect.ProcessorBase;

/* renamed from: com.google.research.xeno.effect.l */
/* compiled from: PG */
public final /* synthetic */ class C66409l implements ProcessorBase.Callback {

    /* renamed from: a */
    public static final /* synthetic */ C66409l f180588a = new C66409l();

    private /* synthetic */ C66409l() {
    }

    public final void onCompletion(boolean z, String str) {
        String str2 = C66412o.f180592a;
        if (!z) {
            Log.e(C66412o.f180592a, "Error sending video processor audio packet.\n".concat(String.valueOf(str)));
        }
    }
}
