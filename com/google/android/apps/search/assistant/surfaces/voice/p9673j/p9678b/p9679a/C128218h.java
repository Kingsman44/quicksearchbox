package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.h */
/* compiled from: PG */
public final class C128218h extends C62934bn implements C63001dt {
    public C128218h() {
        super(C128220j.f352699e);
    }

    /* renamed from: a */
    public final C128150b mo108367a(String str, C128150b bVar) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C128220j) this.instance).f352703c);
        return unmodifiableMap.containsKey(str) ? (C128150b) unmodifiableMap.get(str) : bVar;
    }

    /* renamed from: b */
    public final void mo108368b(String str, C128194e eVar) {
        str.getClass();
        eVar.getClass();
        copyOnWrite();
        C128220j jVar = C128220j.f352699e;
        ((C128220j) this.instance).mo108371a().put(str, eVar);
    }

    /* renamed from: c */
    public final void mo108369c(String str, C128150b bVar) {
        str.getClass();
        bVar.getClass();
        copyOnWrite();
        C128220j jVar = (C128220j) this.instance;
        C128220j jVar2 = C128220j.f352699e;
        C62995dn dnVar = jVar.f352703c;
        if (!dnVar.f170058b) {
            jVar.f352703c = dnVar.mo58980a();
        }
        jVar.f352703c.put(str, bVar);
    }

    /* renamed from: d */
    public final void mo108370d(String str) {
        copyOnWrite();
        C128220j jVar = C128220j.f352699e;
        ((C128220j) this.instance).mo108371a().remove(str);
    }
}
