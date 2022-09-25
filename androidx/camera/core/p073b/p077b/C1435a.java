package androidx.camera.core.p073b.p077b;

import java.util.ArrayDeque;

/* renamed from: androidx.camera.core.b.b.a */
/* compiled from: PG */
public class C1435a {

    /* renamed from: a */
    public final ArrayDeque f3992a = new ArrayDeque(3);

    /* renamed from: b */
    public final Object f3993b = new Object();

    /* renamed from: a */
    public final Object mo4328a() {
        Object removeLast;
        synchronized (this.f3993b) {
            removeLast = this.f3992a.removeLast();
        }
        return removeLast;
    }
}
