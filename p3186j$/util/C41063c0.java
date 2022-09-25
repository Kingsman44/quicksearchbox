package p3186j$.util;

import java.security.AccessController;

/* renamed from: j$.util.c0 */
abstract class C41063c0 {

    /* renamed from: a */
    static final boolean f107569a = ((Boolean) AccessController.doPrivileged(new C41061b0())).booleanValue();

    /* renamed from: a */
    static void m71673a(Class cls, String str) {
        String valueOf = String.valueOf(cls);
        throw new UnsupportedOperationException(valueOf + " tripwire tripped but logging not supported: " + str);
    }
}
