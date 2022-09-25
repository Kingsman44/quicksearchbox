package com.google.android.gms.p10793f;

import android.os.IBinder;
import com.google.android.gms.common.internal.C143919bh;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.f.k */
/* compiled from: PG */
public final class C144166k extends C144164i {

    /* renamed from: a */
    private final Object f390477a;

    public C144166k(Object obj) {
        this.f390477a = obj;
    }

    /* renamed from: a */
    public static Object m234388a(C144165j jVar) {
        if (jVar instanceof C144166k) {
            return ((C144166k) jVar).f390477a;
        }
        IBinder asBinder = jVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C143919bh.m233958a(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }
}
