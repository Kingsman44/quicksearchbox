package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.p1246b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13041c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.C16222a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.a */
/* compiled from: PG */
public final class C16226a {
    /* renamed from: a */
    public static C12991i m33267a(C53306j jVar) {
        C12987e eVar = (C12987e) C12991i.f40380k.createBuilder();
        C12989g a = C16222a.m33264a(jVar);
        eVar.copyOnWrite();
        C12991i iVar = (C12991i) eVar.instance;
        iVar.f40385d = a.f40378e;
        iVar.f40382a |= 4;
        if (jVar.equals(C53306j.AUTO_PROJECTED)) {
            C62940bt btVar = C13042d.f40481n;
            C13041c cVar = (C13041c) C13042d.f40480m.createBuilder();
            cVar.copyOnWrite();
            C13042d dVar = (C13042d) cVar.instance;
            dVar.mo20876a();
            dVar.f40490h.add(BuildConfig.FLAVOR);
            eVar.mo58885m(btVar, (C13042d) cVar.build());
        }
        return (C12991i) eVar.build();
    }
}
