package com.google.p386ak.p388b;

import com.google.p386ak.C8399o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* renamed from: com.google.ak.b.u */
/* compiled from: PG */
final class C8376u implements C8338al {

    /* renamed from: a */
    final /* synthetic */ Type f29201a;

    public C8376u(Type type) {
        this.f29201a = type;
    }

    /* renamed from: a */
    public final Object mo17084a() {
        Type type = this.f29201a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new C8399o("Invalid EnumMap type: ".concat(String.valueOf(this.f29201a.toString())));
        }
        throw new C8399o("Invalid EnumMap type: ".concat(String.valueOf(type.toString())));
    }
}
