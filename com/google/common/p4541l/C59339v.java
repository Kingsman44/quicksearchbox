package com.google.common.p4541l;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: com.google.common.l.v */
/* compiled from: PG */
final class C59339v implements C59340w {

    /* renamed from: a */
    private final Method f157525a;

    public C59339v(Method method) {
        this.f157525a = method;
    }

    /* renamed from: a */
    public final void mo56857a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                this.f157525a.invoke(th, new Object[]{th2});
            } catch (Throwable unused) {
                C59338u.f157524a.mo56857a(closeable, th, th2);
            }
        }
    }
}
