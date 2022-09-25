package com.google.android.libraries.lens.view.p2133i.p2137d;

import com.google.android.libraries.lens.common.p2000c.C24104a;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.lens.view.i.d.b */
/* compiled from: PG */
public final class C26919b {
    /* renamed from: a */
    public static C26898c m49870a(Throwable th) {
        if (th instanceof C70761fa) {
            Status.Code code = Status.Code.OK;
            int ordinal = ((C70761fa) th).f188571a.getCode().ordinal();
            if (ordinal == 4) {
                return C26898c.TIMEOUT;
            }
            if (ordinal == 14) {
                return C26898c.UNAVAILABLE;
            }
        } else if (th instanceof TimeoutException) {
            return C26898c.TIMEOUT;
        } else {
            if (th instanceof C24104a) {
                return C26898c.THROTTLE;
            }
        }
        return C26898c.INTERNAL;
    }
}
