package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asm */
/* compiled from: PG */
final class asm {

    /* renamed from: a */
    private final Field f21500a;

    public /* synthetic */ asm(Field field) {
        this.f21500a = field;
        field.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15357a(Object obj, Object obj2) {
        try {
            this.f21500a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15358b(Object obj, int i) {
        try {
            this.f21500a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
