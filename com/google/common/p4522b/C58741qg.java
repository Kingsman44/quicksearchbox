package com.google.common.p4522b;

import java.lang.reflect.Field;

/* renamed from: com.google.common.b.qg */
/* compiled from: PG */
final class C58741qg {

    /* renamed from: a */
    private final Field f156512a;

    public C58741qg(Field field) {
        this.f156512a = field;
        field.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo55856a(Object obj, int i) {
        try {
            this.f156512a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55857b(Object obj, Object obj2) {
        try {
            this.f156512a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
