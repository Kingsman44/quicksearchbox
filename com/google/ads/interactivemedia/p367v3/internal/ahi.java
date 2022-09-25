package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahi */
/* compiled from: PG */
final class ahi implements aid {

    /* renamed from: a */
    final /* synthetic */ Constructor f20652a;

    public ahi(Constructor constructor) {
        this.f20652a = constructor;
    }

    /* renamed from: a */
    public final Object mo14768a() {
        try {
            return this.f20652a.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException("Failed to invoke " + this.f20652a + " with no args", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to invoke " + this.f20652a + " with no args", e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
