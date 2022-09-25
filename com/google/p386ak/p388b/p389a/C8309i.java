package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p388b.C8360e;
import com.google.p386ak.p388b.C8380y;
import com.google.p386ak.p393c.C8383a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.ak.b.a.i */
/* compiled from: PG */
public final class C8309i implements C8267ab {

    /* renamed from: a */
    private final C8380y f29100a;

    public C8309i(C8380y yVar) {
        this.f29100a = yVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Type[] typeArr;
        C8266aa aaVar;
        Type type = aVar.f29214b;
        Class cls = aVar.f29213a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type d = C8360e.m23137d(type, cls, Map.class);
            typeArr = d instanceof ParameterizedType ? ((ParameterizedType) d).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            aaVar = C8302bd.f29070f;
        } else {
            aaVar = iVar.mo17143a(new C8383a(type2));
        }
        return new C8308h(iVar, typeArr[0], aaVar, typeArr[1], iVar.mo17143a(new C8383a(typeArr[1])), this.f29100a.mo17104a(aVar));
    }
}
