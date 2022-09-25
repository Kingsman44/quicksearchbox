package com.google.android.gms.car.p10750a.p10751a.p10752a;

import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.car.a.a.a.a */
/* compiled from: PG */
public final class C142976a {
    /* renamed from: a */
    public static boolean m231924a(Future future) {
        if (!future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            C60856cj.m92909r(future);
            return true;
        } catch (CancellationException | ExecutionException unused) {
            return false;
        }
    }
}
