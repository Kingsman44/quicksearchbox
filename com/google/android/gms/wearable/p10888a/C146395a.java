package com.google.android.gms.wearable.p10888a;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.gms.wearable.a.a */
/* compiled from: PG */
public final class C146395a {
    /* renamed from: a */
    public static void m238332a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
