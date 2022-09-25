package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.e */
/* compiled from: PG */
public final class C15479e {
    /* renamed from: a */
    public static C62722b m32211a(Throwable th) {
        if (th instanceof CancellationException) {
            return C62722b.CANCELLED;
        }
        if (th instanceof IllegalArgumentException) {
            return C62722b.INVALID_ARGUMENT;
        }
        if (th instanceof TimeoutException) {
            return C62722b.DEADLINE_EXCEEDED;
        }
        return C62722b.INTERNAL;
    }
}
