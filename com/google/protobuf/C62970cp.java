package com.google.protobuf;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.cp */
/* compiled from: PG */
public final class C62970cp extends AbstractMap {

    /* renamed from: a */
    public final C62965cl f170007a;

    /* renamed from: b */
    private final Map f170008b;

    public C62970cp(Map map, C62965cl clVar) {
        this.f170008b = map;
        this.f170007a = clVar;
    }

    public final Set entrySet() {
        return new C62968co(this, this.f170008b.entrySet());
    }

    public final Object get(Object obj) {
        Object obj2 = this.f170008b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.f170007a.mo58930a((Integer) obj2);
    }

    public final Object put(Object obj, Object obj2) {
        Object put = this.f170008b.put(obj, C62965cl.m95516b((C62957cd) obj2));
        if (put == null) {
            return null;
        }
        return this.f170007a.mo58930a((Integer) put);
    }
}
