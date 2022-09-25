package kotlinx.coroutines.p5584j;

import kotlinx.coroutines.p5579e.C71740v;

/* renamed from: kotlinx.coroutines.j.h */
/* compiled from: PG */
public final class C71794h extends C71740v {
    public volatile Object owner;

    public C71794h(Object obj) {
        this.owner = obj;
    }

    public final String toString() {
        Object obj = this.owner;
        return "LockedQueue[" + obj + "]";
    }
}
