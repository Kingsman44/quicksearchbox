package com.google.android.libraries.social.populous.p3289c.p3293d;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.social.populous.c.d.m */
/* compiled from: PG */
public final class C42245m extends Exception {

    /* renamed from: a */
    public final int f110596a;

    public C42245m(int i, Throwable th) {
        super(th);
        this.f110596a = i;
    }

    /* renamed from: a */
    public static int m74207a(Throwable th) {
        if (th instanceof TimeoutException) {
            return 1;
        }
        if (th instanceof InterruptedException) {
            return 2;
        }
        if (th instanceof CancellationException) {
            return 3;
        }
        if (!(th instanceof ExecutionException)) {
            Status d = Status.m102100d(th);
            Status.Code code = Status.Code.OK;
            int ordinal = d.getCode().ordinal();
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal == 7 || ordinal == 16) {
                return 6;
            }
            if (ordinal != 13) {
                return ordinal != 14 ? 4 : 8;
            }
            return 7;
        } else if (th.getCause() != null) {
            return m74207a(th.getCause());
        } else {
            return 9;
        }
    }

    /* renamed from: b */
    public final int mo44927b() {
        Status.Code code = Status.Code.OK;
        int i = this.f110596a;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    return 12;
                case 1:
                    return 14;
                case 2:
                    return 13;
                case 3:
                    return 20;
                case 4:
                    return 16;
                case 5:
                    return 4;
                case 6:
                    return 19;
                case 7:
                    return 7;
                default:
                    return 3;
            }
        } else {
            throw null;
        }
    }
}
