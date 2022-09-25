package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.google.android.libraries.home.p1962g.C23816a;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.home.a.c.a.f */
/* compiled from: PG */
public final class C23377f extends C23816a {
    public C23377f() {
        super(C23376e.f63929a, C23378g.values());
    }

    public final boolean containsKey(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        return super.containsKey((String) obj);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C23378g)) {
            return false;
        }
        return super.containsValue((C23378g) obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return (C23378g) super.get((String) obj);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return obj2;
        }
        return (C23378g) Map.CC.$default$getOrDefault(this, (String) obj, (C23378g) obj2);
    }
}
