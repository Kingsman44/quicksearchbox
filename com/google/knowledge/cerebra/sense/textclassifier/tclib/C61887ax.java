package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4541l.C59341x;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.ax */
/* compiled from: PG */
public abstract class C61887ax implements Closeable {
    /* renamed from: a */
    public abstract ParcelFileDescriptor mo58328a();

    /* renamed from: b */
    public abstract ParcelFileDescriptor mo58329b();

    public final void close() {
        C59341x a = C59341x.m92227a();
        try {
            a.mo56859c(mo58329b());
            a.mo56859c(mo58328a());
            a.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
