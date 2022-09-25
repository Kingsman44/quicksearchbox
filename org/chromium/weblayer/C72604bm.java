package org.chromium.weblayer;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: org.chromium.weblayer.bm */
/* compiled from: PG */
public final class C72604bm {
    /* renamed from: a */
    public static void m107399a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new AndroidRuntimeException("This method needs to be called on the main thread");
        }
    }
}
