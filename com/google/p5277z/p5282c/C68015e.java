package com.google.p5277z.p5282c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.z.c.e */
/* compiled from: PG */
public final class C68015e extends C62934bn implements C63001dt {
    public C68015e() {
        super(C68022l.f184294b);
    }

    /* renamed from: a */
    public final C68018h mo60076a(String str, C68018h hVar) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C68022l) this.instance).f184296a);
        return unmodifiableMap.containsKey(str) ? (C68018h) unmodifiableMap.get(str) : hVar;
    }

    /* renamed from: b */
    public final void mo60077b(String str, C68018h hVar) {
        str.getClass();
        hVar.getClass();
        copyOnWrite();
        C68022l lVar = C68022l.f184294b;
        ((C68022l) this.instance).mo60078a().put(str, hVar);
    }
}
