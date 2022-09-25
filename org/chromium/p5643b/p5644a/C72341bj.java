package org.chromium.p5643b.p5644a;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: org.chromium.b.a.bj */
/* compiled from: PG */
public final class C72341bj extends C72316al {

    /* renamed from: a */
    private final Object f192469a;

    public C72341bj(Object obj) {
        this.f192469a = obj;
    }

    /* renamed from: a */
    public static Object m106988a(C72317am amVar, Class cls) {
        if (amVar == null) {
            return null;
        }
        if (amVar instanceof C72341bj) {
            return ((C72341bj) amVar).f192469a;
        }
        IBinder asBinder = amVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i++;
        }
        if (field == null || field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared *private* field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            Object obj = field.get(asBinder);
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            throw new IllegalArgumentException("remoteBinder is the wrong class.");
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Binder object is null.", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
        }
    }
}
