package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c.a.d */
/* compiled from: PG */
public final class C42743d {
    /* renamed from: a */
    public static IOException m75522a(String str, List list) {
        IOException iOException = new IOException(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IOException iOException2 = (IOException) it.next();
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(iOException, new Object[]{iOException2});
            } catch (Exception unused) {
            }
        }
        return iOException;
    }
}
