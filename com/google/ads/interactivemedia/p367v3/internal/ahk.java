package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahk */
/* compiled from: PG */
final class ahk implements aid {

    /* renamed from: a */
    final /* synthetic */ Type f20653a;

    public ahk(Type type) {
        this.f20653a = type;
    }

    /* renamed from: a */
    public final Object mo14768a() {
        Type type = this.f20653a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new agk("Invalid EnumSet type: ".concat(String.valueOf(this.f20653a.toString())));
        }
        throw new agk("Invalid EnumSet type: ".concat(String.valueOf(type.toString())));
    }
}
