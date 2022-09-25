package com.google.android.play.core.p3534f.p3537c;

import java.lang.reflect.Field;

/* renamed from: com.google.android.play.core.f.c.b */
/* compiled from: PG */
public class C45093b {

    /* renamed from: a */
    public final Field f117754a;

    /* renamed from: b */
    private final Object f117755b;

    /* renamed from: c */
    private final Class f117756c;

    public C45093b(Object obj, Field field, Class cls) {
        this.f117755b = obj;
        this.f117754a = field;
        this.f117756c = cls;
    }

    /* renamed from: c */
    public final Object mo48927c() {
        try {
            return this.f117756c.cast(this.f117754a.get(this.f117755b));
        } catch (Exception e) {
            throw new C45095d(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f117754a.getName(), this.f117755b.getClass().getName(), this.f117756c.getName()}), e);
        }
    }

    /* renamed from: d */
    public final void mo48928d(Object obj) {
        try {
            this.f117754a.set(this.f117755b, obj);
        } catch (Exception e) {
            throw new C45095d(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f117754a.getName(), this.f117755b.getClass().getName(), this.f117756c.getName()}), e);
        }
    }
}
