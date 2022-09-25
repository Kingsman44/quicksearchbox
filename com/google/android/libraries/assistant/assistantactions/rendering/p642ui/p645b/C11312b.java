package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p645b;

import android.content.res.TypedArray;
import android.text.TextUtils;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.b.b */
/* compiled from: PG */
public final class C11312b {
    /* renamed from: a */
    public static final int m26923a(TypedArray typedArray, int i, int i2, String str) {
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
