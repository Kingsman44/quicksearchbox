package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a;

import android.content.res.TypedArray;
import android.text.TextUtils;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.b */
/* compiled from: PG */
final class C33240b {
    /* renamed from: a */
    public static final int m61662a(TypedArray typedArray, int i, int i2, String str) {
        if (!TextUtils.isEmpty(str) && i != 0) {
            int hashCode = (str != null ? str.hashCode() : 0) % i;
            if (hashCode < 0) {
                hashCode += i;
            }
            try {
                return typedArray.getColor(hashCode, i2);
            } catch (UnsupportedOperationException unused) {
            }
        }
        return i2;
    }
}
