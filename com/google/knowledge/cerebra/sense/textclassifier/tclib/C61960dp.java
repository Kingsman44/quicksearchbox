package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4541l.C59341x;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.dp */
/* compiled from: PG */
public abstract class C61960dp implements Closeable {
    /* renamed from: a */
    public abstract ParcelFileDescriptor mo58431a();

    /* renamed from: b */
    public abstract ParcelFileDescriptor mo58432b();

    /* renamed from: c */
    public abstract ParcelFileDescriptor mo58433c();

    public final void close() {
        C59341x a = C59341x.m92227a();
        try {
            a.mo56859c(mo58433c());
            a.mo56859c(mo58431a());
            a.mo56859c(mo58432b());
            a.mo56859c(mo58435d());
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

    /* renamed from: d */
    public abstract ParcelFileDescriptor mo58435d();

    /* renamed from: e */
    public abstract String mo58436e();
}
