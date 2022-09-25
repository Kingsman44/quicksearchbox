package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.api.internal.a */
/* compiled from: PG */
public final class C145179a extends C145197f {

    /* renamed from: a */
    private final AtomicReference f392419a = new AtomicReference();

    /* renamed from: b */
    private boolean f392420b;

    /* renamed from: d */
    public static final Object m235833d(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(C33259r.f88929b)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo120687a(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f392419a
            monitor-enter(r0)
            boolean r1 = r2.f392420b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f392419a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f392419a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.api.internal.C145179a.mo120687a(long):android.os.Bundle");
    }

    /* renamed from: b */
    public final String mo120688b(long j) {
        return (String) m235833d(mo120687a(j), String.class);
    }

    /* renamed from: c */
    public final void mo120689c(Bundle bundle) {
        synchronized (this.f392419a) {
            try {
                this.f392419a.set(bundle);
                this.f392420b = true;
                this.f392419a.notify();
            } catch (Throwable th) {
                this.f392419a.notify();
                throw th;
            }
        }
    }
}
