package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p388b.C8360e;
import com.google.p386ak.p388b.C8380y;
import com.google.p386ak.p393c.C8383a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.ak.b.a.d */
/* compiled from: PG */
public final class C8304d implements C8267ab {

    /* renamed from: a */
    private final C8380y f29093a;

    public C8304d(C8380y yVar) {
        this.f29093a = yVar;
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        Type type;
        Type type2 = aVar.f29214b;
        Class cls = aVar.f29213a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type d = C8360e.m23137d(type2, cls, Collection.class);
        if (d instanceof ParameterizedType) {
            type = ((ParameterizedType) d).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new C8303c(iVar, type, iVar.mo17143a(new C8383a(type)), this.f29093a.mo17104a(aVar));
    }
}
