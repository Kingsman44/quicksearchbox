package org.chromium.base;

import android.os.StrictMode;
import java.io.Closeable;

/* renamed from: org.chromium.base.u */
/* compiled from: PG */
public final class C72408u implements Closeable {

    /* renamed from: a */
    private final StrictMode.ThreadPolicy f192582a;

    /* renamed from: b */
    private final StrictMode.VmPolicy f192583b;

    public C72408u(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.f192582a = threadPolicy;
        this.f192583b = vmPolicy;
    }

    /* renamed from: a */
    public static C72408u m107065a() {
        return new C72408u(StrictMode.allowThreadDiskReads(), (StrictMode.VmPolicy) null);
    }

    /* renamed from: b */
    public static C72408u m107066b() {
        return new C72408u(StrictMode.allowThreadDiskWrites(), (StrictMode.VmPolicy) null);
    }

    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f192582a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f192583b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
