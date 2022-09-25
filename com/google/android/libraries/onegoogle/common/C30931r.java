package com.google.android.libraries.onegoogle.common;

import android.os.Looper;
import androidx.lifecycle.C2332ag;

/* renamed from: com.google.android.libraries.onegoogle.common.r */
/* compiled from: PG */
public final class C30931r {
    /* renamed from: a */
    public static void m57728a(C2332ag agVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            agVar.mo5708l(obj);
        } else {
            agVar.mo5706i(obj);
        }
    }
}
