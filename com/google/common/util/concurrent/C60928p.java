package com.google.common.util.concurrent;

import java.util.Set;

/* renamed from: com.google.common.util.concurrent.p */
/* compiled from: PG */
final class C60928p extends C60926n {
    /* renamed from: a */
    public final int mo57426a(C60929q qVar) {
        int i;
        synchronized (qVar) {
            i = qVar.remaining - 1;
            qVar.remaining = i;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo57427b(C60929q qVar, Set set) {
        synchronized (qVar) {
            if (qVar.seenExceptions == null) {
                qVar.seenExceptions = set;
            }
        }
    }
}
