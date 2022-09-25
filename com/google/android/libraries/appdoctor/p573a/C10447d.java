package com.google.android.libraries.appdoctor.p573a;

import android.util.Log;
import com.google.common.p4552o.p4566l.C60223w;

/* renamed from: com.google.android.libraries.appdoctor.a.d */
/* compiled from: PG */
final class C10447d {
    /* renamed from: a */
    public static void m25415a(RuntimeException runtimeException, C60223w wVar, String str) {
        if (wVar == C60223w.STARTUP || wVar == C60223w.TELEDOCTOR) {
            try {
                Log.e("ExceptionUtil", "RuntimeException while safely performing function: " + str, runtimeException);
            } catch (RuntimeException unused) {
            }
        } else {
            throw runtimeException;
        }
    }
}
