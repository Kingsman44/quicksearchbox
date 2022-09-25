package com.google.android.libraries.home.p1940a.p1943c;

import com.google.android.libraries.home.p1962g.C23816a;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.home.a.c.aj */
/* compiled from: PG */
public final class C23407aj extends C23816a {
    public C23407aj() {
        super(C23406ai.f63968a, C23408ak.values());
    }

    public final boolean containsKey(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        return super.containsKey((String) obj);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C23408ak)) {
            return false;
        }
        return super.containsValue((C23408ak) obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return (C23408ak) super.get((String) obj);
    }

    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return obj2;
        }
        return (C23408ak) Map.CC.$default$getOrDefault(this, (String) obj, (C23408ak) obj2);
    }
}
