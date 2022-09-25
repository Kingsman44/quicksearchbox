package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;
import com.google.common.p4541l.C59341x;
import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bt */
/* compiled from: PG */
public abstract class C61910bt implements Closeable {
    /* renamed from: a */
    public abstract ParcelFileDescriptor mo58346a();

    /* renamed from: b */
    public abstract C61960dp mo58347b();

    public final void close() {
        C59341x a = C59341x.m92227a();
        a.mo56859c(mo58347b());
        a.mo56859c(mo58346a());
        a.close();
    }
}
