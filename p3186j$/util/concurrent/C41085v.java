package p3186j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.v */
final class C41085v implements PrivilegedAction {
    C41085v() {
    }

    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
