package com.google.common.p4541l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.l.t */
/* compiled from: PG */
public final class C59337t {

    /* renamed from: a */
    static final Logger f157523a = Logger.getLogger(C59337t.class.getName());

    private C59337t() {
    }

    /* renamed from: a */
    public static void m92221a(InputStream inputStream) {
        try {
            m92223c(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static void m92222b(Reader reader) {
        try {
            m92223c(reader);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public static void m92223c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f157523a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
            }
        }
    }
}
