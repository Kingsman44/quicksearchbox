package com.google.android.gms.droidguard.p10791b;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.droidguard.b.a */
/* compiled from: PG */
public final class C144113a {

    /* renamed from: a */
    private final ArrayBlockingQueue f390391a = new ArrayBlockingQueue(1);

    /* renamed from: b */
    private boolean f390392b = false;

    /* renamed from: c */
    private boolean f390393c = false;

    /* renamed from: a */
    public final Object mo119661a(long j) {
        if (!this.f390393c) {
            this.f390393c = true;
            return this.f390391a.poll(j, TimeUnit.MILLISECONDS);
        }
        throw new RuntimeException("BlockingChannel can be read only once.");
    }

    /* renamed from: b */
    public final void mo119662b(Object obj) {
        if (!this.f390392b) {
            this.f390392b = true;
            this.f390391a.offer(obj);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
