package com.bumptech.glide.load.p297b;

import com.bumptech.glide.p291h.C5632s;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.b.am */
/* compiled from: PG */
final class C5761am {

    /* renamed from: a */
    private static final Queue f17341a = C5632s.m14615h(0);

    /* renamed from: b */
    private int f17342b;

    /* renamed from: c */
    private int f17343c;

    /* renamed from: d */
    private Object f17344d;

    private C5761am() {
    }

    /* renamed from: a */
    static C5761am m14903a(Object obj, int i, int i2) {
        C5761am amVar;
        Queue queue = f17341a;
        synchronized (queue) {
            amVar = (C5761am) queue.poll();
        }
        if (amVar == null) {
            amVar = new C5761am();
        }
        amVar.f17344d = obj;
        amVar.f17343c = i;
        amVar.f17342b = i2;
        return amVar;
    }

    /* renamed from: b */
    public final void mo12265b() {
        Queue queue = f17341a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5761am) {
            C5761am amVar = (C5761am) obj;
            if (this.f17343c == amVar.f17343c && this.f17342b == amVar.f17342b && this.f17344d.equals(amVar.f17344d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f17342b * 31) + this.f17343c) * 31) + this.f17344d.hashCode();
    }
}
