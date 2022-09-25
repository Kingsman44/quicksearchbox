package com.google.common.util.concurrent;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.common.util.concurrent.u */
/* compiled from: PG */
public final class C60933u implements Serializable {

    /* renamed from: a */
    public final ConcurrentHashMap f165047a;

    private C60933u(ConcurrentHashMap concurrentHashMap) {
        this.f165047a = concurrentHashMap;
    }

    /* renamed from: c */
    public static C60933u m93072c() {
        return new C60933u(new ConcurrentHashMap());
    }

    /* renamed from: a */
    public final long mo57435a(Object obj, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.f165047a.get(obj);
            if (atomicLong == null && (atomicLong = (AtomicLong) this.f165047a.putIfAbsent(obj, new AtomicLong(j))) == null) {
                return j;
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    long j3 = j2 + j;
                    if (atomicLong.compareAndSet(j2, j3)) {
                        return j3;
                    }
                }
            }
        } while (!this.f165047a.replace(obj, atomicLong, new AtomicLong(j)));
        return j;
    }

    /* renamed from: b */
    public final long mo57436b(Object obj) {
        AtomicLong atomicLong = (AtomicLong) this.f165047a.get(obj);
        if (atomicLong == null) {
            return 0;
        }
        return atomicLong.get();
    }

    /* renamed from: d */
    public final void mo57437d(Object obj) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.f165047a.get(obj);
        if (atomicLong != null) {
            do {
                j = atomicLong.get();
                if (j == 0 || atomicLong.compareAndSet(j, 0)) {
                    this.f165047a.remove(obj, atomicLong);
                }
                j = atomicLong.get();
                break;
            } while (atomicLong.compareAndSet(j, 0));
            this.f165047a.remove(obj, atomicLong);
        }
    }

    public final String toString() {
        return this.f165047a.toString();
    }
}
