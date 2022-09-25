package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4541l.C59341x;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.dq */
/* compiled from: PG */
public abstract class C61961dq implements Closeable {
    /* renamed from: a */
    public abstract ParcelFileDescriptor mo58437a();

    /* renamed from: b */
    public abstract ParcelFileDescriptor mo58438b();

    /* renamed from: c */
    public abstract ParcelFileDescriptor mo58439c();

    public final void close() {
        C59341x a = C59341x.m92227a();
        try {
            C58801sm G = mo58442e().listIterator(0);
            while (G.hasNext()) {
                a.mo56859c((C61960dp) G.next());
            }
            a.mo56859c(mo58437a());
            a.mo56859c(mo58441d());
            a.mo56859c(mo58438b());
            a.mo56859c(mo58439c());
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
    public abstract ParcelFileDescriptor mo58441d();

    /* renamed from: e */
    public abstract C58485gu mo58442e();

    /* renamed from: f */
    public abstract C61958dn mo58443f();
}
