package com.google.common.p4576s;

import com.google.common.base.C58838bb;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.common.s.a */
/* compiled from: PG */
class C60764a {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Type mo57211a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C58838bb.m90873h(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
