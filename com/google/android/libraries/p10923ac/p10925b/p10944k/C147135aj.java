package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.common.base.C58887cx;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.ac.b.k.aj */
/* compiled from: PG */
public final class C147135aj {
    /* renamed from: a */
    public static Exception m239929a(Exception exc) {
        HashMap hashMap = new HashMap();
        for (Throwable th : C58887cx.m90978e(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (hashMap.containsKey(C70761fa.class)) {
            Status.Code code = ((C70761fa) hashMap.get(C70761fa.class)).f188571a.getCode();
            if (code.equals(Status.f186910h.getCode())) {
                return new C147134ai((Throwable) exc, 5);
            }
            if (code.equals(Status.f186916n.getCode())) {
                return new C147134ai((Throwable) exc, 6);
            }
            if (code.equals(Status.f186907e.getCode())) {
                return new C147134ai((Throwable) exc, 7);
            }
        }
        if (hashMap.containsKey(UnknownHostException.class)) {
            return new C147134ai((Throwable) exc, 2);
        }
        return hashMap.containsKey(ConnectException.class) ? new C147134ai((Throwable) exc, 4) : exc;
    }
}
