package com.google.android.libraries.assistant.p1518i.p1519a;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.google.android.libraries.assistant.i.a.f */
/* compiled from: PG */
public final class C18395f extends C18393d {

    /* renamed from: a */
    private final Object f52224a;

    public C18395f(Object obj) {
        this.f52224a = obj;
    }

    /* renamed from: a */
    public static Object m35842a(C18394e eVar) {
        if (eVar instanceof C18395f) {
            return ((C18395f) eVar).f52224a;
        }
        IBinder asBinder = eVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
