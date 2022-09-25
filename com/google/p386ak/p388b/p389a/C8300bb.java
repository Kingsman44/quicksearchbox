package com.google.p386ak.p388b.p389a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* renamed from: com.google.ak.b.a.bb */
/* compiled from: PG */
final class C8300bb implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ Class f29039a;

    public C8300bb(Class cls) {
        this.f29039a = cls;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        ArrayList arrayList = new ArrayList(r2);
        for (Field field : this.f29039a.getDeclaredFields()) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
