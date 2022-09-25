package p3186j$.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.concurrent.m */
public abstract /* synthetic */ class C41076m {
    /* renamed from: a */
    public static /* synthetic */ boolean m71700a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static String m71701b(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = str2;
        }
        int length = str.length();
        if (!(obj2 == null || (obj3 = obj2.toString()) == null)) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[(length + length2 + 1)];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
