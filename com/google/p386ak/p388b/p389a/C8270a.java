package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p388b.C8360e;
import com.google.p386ak.p393c.C8383a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: com.google.ak.b.a.a */
/* compiled from: PG */
final class C8270a implements C8267ab {
    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Type type;
        Type type2 = aVar.f29214b;
        boolean z = type2 instanceof GenericArrayType;
        if (!z && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
            return null;
        }
        if (z) {
            type = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            type = ((Class) type2).getComponentType();
        }
        return new C8298b(iVar, iVar.mo17143a(new C8383a(type)), C8360e.m23134a(type));
    }
}
