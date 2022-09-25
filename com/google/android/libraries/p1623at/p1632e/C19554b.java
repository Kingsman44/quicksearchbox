package com.google.android.libraries.p1623at.p1632e;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.libraries.at.e.b */
/* compiled from: PG */
public final class C19554b {
    @Deprecated
    /* renamed from: a */
    public static void m37295a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
