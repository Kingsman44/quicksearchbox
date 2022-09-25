package com.google.android.libraries.p11002ag.p11004b.p11005a;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.libraries.ag.b.a.b */
/* compiled from: PG */
public final class C147559b {

    /* renamed from: a */
    private static final Logger f398259a = Logger.getLogger(C147559b.class.getName());

    /* renamed from: a */
    public static final void m240594a(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            f398259a.log(Level.WARNING, "Error closing input stream (ignored)", e);
        }
    }
}
