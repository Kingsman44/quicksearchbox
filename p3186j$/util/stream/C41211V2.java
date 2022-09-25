package p3186j$.util.stream;

import java.security.AccessController;

/* renamed from: j$.util.stream.V2 */
abstract class C41211V2 {

    /* renamed from: a */
    static final boolean f107820a = ((Boolean) AccessController.doPrivileged(new C41207U2())).booleanValue();

    /* renamed from: a */
    static void m71971a(Class cls, String str) {
        String valueOf = String.valueOf(cls);
        throw new UnsupportedOperationException(valueOf + " tripwire tripped but logging not supported: " + str);
    }
}
