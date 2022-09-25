package p3186j$.sun.misc;

import sun.misc.Unsafe;

/* renamed from: j$.sun.misc.b */
public abstract /* synthetic */ class C40952b {
    /* renamed from: a */
    public static /* synthetic */ boolean m71113a(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }
}
