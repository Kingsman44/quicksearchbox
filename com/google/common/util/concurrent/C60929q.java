package com.google.common.util.concurrent;

import com.google.common.util.concurrent.C60873d;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.q */
/* compiled from: PG */
abstract class C60929q extends C60873d.C60883i {

    /* renamed from: a */
    private static final Logger f165045a;

    /* renamed from: b */
    public static final C60926n f165046b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        C60926n nVar;
        Class<C60929q> cls = C60929q.class;
        f165045a = Logger.getLogger(cls.getName());
        try {
            nVar = new C60927o(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            nVar = new C60928p();
        }
        Throwable th = e;
        f165046b = nVar;
        if (th != null) {
            f165045a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public C60929q(int i) {
        this.remaining = i;
    }

    /* renamed from: e */
    public abstract void mo57422e(Set set);
}
