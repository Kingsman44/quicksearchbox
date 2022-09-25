package com.facebook.p313c;

import android.util.Log;

/* renamed from: com.facebook.c.b */
/* compiled from: PG */
public final class C6024b extends C6020a {
    /* renamed from: d */
    public final void mo12585d(int i, String str, String str2, Throwable th) {
        int i2 = i - 1;
        if (i2 == 0) {
            Log.w("RenderCore:".concat(str), str2, th);
        } else if (i2 == 1) {
            Log.e("RenderCore:".concat(str), str2, th);
        } else {
            Log.e("RenderCore:".concat(str), str2, th);
            throw new RuntimeException(str2);
        }
    }
}
