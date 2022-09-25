package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
/* compiled from: PG */
public final class C144011k {
    /* renamed from: a */
    public static void m234190a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
