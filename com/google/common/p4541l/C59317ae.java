package com.google.common.p4541l;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.l.ae */
/* compiled from: PG */
public final class C59317ae {

    /* renamed from: a */
    private static final Logger f157488a = Logger.getLogger(C59317ae.class.getName());

    private C59317ae() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m92163a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f157488a.logp(Level.WARNING, "com.google.common.io.LegacyCloseables", "closeQuietly", "IOException thrown while closing Closeable.", e);
            }
        }
    }
}
