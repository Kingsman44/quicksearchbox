package com.google.android.libraries.search.p2904c.p2942m.p2949f;

import java.util.Random;

/* renamed from: com.google.android.libraries.search.c.m.f.a */
/* compiled from: PG */
public final class C37889a {

    /* renamed from: a */
    private Integer f100471a;

    /* renamed from: b */
    private final Random f100472b = new Random();

    /* renamed from: a */
    public final synchronized int mo41132a() {
        Integer valueOf;
        valueOf = Integer.valueOf(this.f100472b.nextInt(Integer.MAX_VALUE));
        this.f100471a = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: b */
    public final synchronized void mo41133b(int i) {
        if (mo41134c(i)) {
            this.f100471a = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41134c(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Integer r0 = r1.f100471a     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            int r0 = r0.intValue()     // Catch:{ all -> 0x0011 }
            if (r2 != r0) goto L_0x000e
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x000e:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0011:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a.mo41134c(int):boolean");
    }
}
