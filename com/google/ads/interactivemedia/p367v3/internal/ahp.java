package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahp */
/* compiled from: PG */
public final class ahp {

    /* renamed from: a */
    private final Map f20654a;

    /* renamed from: b */
    private final akx f20655b = akx.m18863b();

    public ahp(Map map) {
        this.f20654a = map;
    }

    /* renamed from: a */
    public final aid mo14769a(akz akz) {
        ahi ahi;
        Type b = akz.mo14888b();
        Class a = akz.mo14887a();
        agg agg = (agg) this.f20654a.get(b);
        if (agg != null) {
            return new ahg(agg, b);
        }
        agg agg2 = (agg) this.f20654a.get(a);
        if (agg2 != null) {
            return new ahh(agg2, b);
        }
        aid aid = null;
        try {
            Constructor declaredConstructor = a.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f20655b.mo14886a(declaredConstructor);
            }
            ahi = new ahi(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            ahi = null;
        }
        if (ahi != null) {
            return ahi;
        }
        if (Collection.class.isAssignableFrom(a)) {
            aid = SortedSet.class.isAssignableFrom(a) ? new ahj() : EnumSet.class.isAssignableFrom(a) ? new ahk(b) : Set.class.isAssignableFrom(a) ? new ahl() : Queue.class.isAssignableFrom(a) ? new ahm() : new ahn();
        } else if (Map.class.isAssignableFrom(a)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(a)) {
                aid = new aho();
            } else if (ConcurrentMap.class.isAssignableFrom(a)) {
                aid = new ahb();
            } else if (SortedMap.class.isAssignableFrom(a)) {
                aid = new ahc();
            } else {
                aid = (!(b instanceof ParameterizedType) || String.class.isAssignableFrom(akz.m18867c(((ParameterizedType) b).getActualTypeArguments()[0]).mo14887a())) ? new ahe() : new ahd();
            }
        }
        if (aid != null) {
            return aid;
        }
        return new ahf(a, b);
    }

    public final String toString() {
        return this.f20654a.toString();
    }
}
