package com.google.android.libraries.p10923ac.p10925b.p10945l;

import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.libraries.ac.b.l.i */
/* compiled from: PG */
public final class C147175i {
    /* renamed from: a */
    public static C70761fa m239999a(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (th != null) {
            if (th instanceof C70761fa) {
                return (C70761fa) th;
            }
            th = th.getCause();
            if (th == th2) {
                return null;
            }
            if (z) {
                th2 = th2.getCause();
            }
            z = !z;
        }
        return null;
    }
}
