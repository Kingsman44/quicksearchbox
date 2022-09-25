package org.p5623b.p5629b;

import java.security.AccessControlException;
import java.security.AccessController;

/* renamed from: org.b.b.d */
/* compiled from: PG */
public final class C72129d {

    /* renamed from: a */
    public static final ThreadLocal f191960a = new ThreadLocal();

    /* renamed from: a */
    public static boolean m105662a() {
        try {
            String str = (String) AccessController.doPrivileged(new C72128c());
            if (str != null) {
                return "true".equals(C72131f.m105665c(str));
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
