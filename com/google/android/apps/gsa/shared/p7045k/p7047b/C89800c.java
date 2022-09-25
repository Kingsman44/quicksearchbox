package com.google.android.apps.gsa.shared.p7045k.p7047b;

import android.text.TextUtils;
import java.nio.charset.Charset;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.shared.k.b.c */
/* compiled from: PG */
public final class C89800c {

    /* renamed from: a */
    public static final Charset f243072a = StandardCharsets.UTF_8;

    /* renamed from: b */
    public byte[] f243073b;

    /* renamed from: c */
    public String f243074c;

    public C89800c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("mime type cannot be null or empty");
        } else if (str != null) {
            this.f243073b = str.getBytes(f243072a);
            this.f243074c = str2;
        } else {
            throw new IllegalArgumentException("data cannot be null");
        }
    }

    public final String toString() {
        String str = this.f243074c;
        byte[] bArr = this.f243073b;
        int length = bArr == null ? 0 : bArr.length;
        return "[MimeData; type: " + str + ", length: " + length + "]";
    }
}
