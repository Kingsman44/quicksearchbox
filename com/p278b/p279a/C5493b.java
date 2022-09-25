package com.p278b.p279a;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.b.a.b */
/* compiled from: PG */
public final class C5493b {
    /* renamed from: a */
    public static final void m14210a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
