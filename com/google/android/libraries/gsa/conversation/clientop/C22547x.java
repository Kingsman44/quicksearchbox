package com.google.android.libraries.gsa.conversation.clientop;

import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.x */
/* compiled from: PG */
public final class C22547x implements C68220f {

    /* renamed from: a */
    private final C69464a f62153a;

    /* renamed from: b */
    private final C69464a f62154b;

    public C22547x(C69464a aVar, C69464a aVar2) {
        this.f62153a = aVar;
        this.f62154b = aVar2;
    }

    /* renamed from: a */
    public final Map mo17428b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll((Map) this.f62153a.mo17428b());
        for (Map.Entry entry : ((Map) ((C68221g) this.f62154b).f184583a).entrySet()) {
            hashMap.put((String) entry.getKey(), new C22540q((C69464a) entry.getValue()));
        }
        return hashMap;
    }
}
