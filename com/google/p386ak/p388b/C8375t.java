package com.google.p386ak.p388b;

import com.google.p386ak.C8399o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: com.google.ak.b.t */
/* compiled from: PG */
final class C8375t implements C8338al {

    /* renamed from: a */
    final /* synthetic */ Type f29200a;

    public C8375t(Type type) {
        this.f29200a = type;
    }

    /* renamed from: a */
    public final Object mo17084a() {
        Type type = this.f29200a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new C8399o("Invalid EnumSet type: ".concat(String.valueOf(this.f29200a.toString())));
        }
        throw new C8399o("Invalid EnumSet type: ".concat(String.valueOf(type.toString())));
    }
}
