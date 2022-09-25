package com.google.android.play.core.p3534f.p3537c;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* renamed from: com.google.android.play.core.f.c.a */
/* compiled from: PG */
public final class C45092a extends C45093b {
    public C45092a(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: a */
    public final Class mo48925a() {
        return this.f117754a.getType().getComponentType();
    }

    /* renamed from: b */
    public final void mo48926b(Collection collection) {
        int i;
        Object[] objArr = (Object[]) mo48927c();
        if (objArr == null) {
            i = 0;
        } else {
            i = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(mo48925a(), collection.size() + i);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo48928d(objArr2);
    }
}
