package com.google.p386ak.p388b;

import com.google.p386ak.p388b.p391b.C8350a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ak.b.x */
/* compiled from: PG */
final class C8379x implements C8338al {

    /* renamed from: a */
    final /* synthetic */ Constructor f29204a;

    public C8379x(Constructor constructor) {
        this.f29204a = constructor;
    }

    /* renamed from: a */
    public final Object mo17084a() {
        try {
            return this.f29204a.newInstance(new Object[0]);
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(this.f29204a);
            throw new RuntimeException("Failed to invoke " + valueOf + " with no args", e);
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(this.f29204a);
            throw new RuntimeException("Failed to invoke " + valueOf2 + " with no args", e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw C8350a.m23122a(e3);
        }
    }
}
