package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.assistant.p3886c.p3889c.C50766d;
import com.google.assistant.p3886c.p3889c.C50767e;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.n */
/* compiled from: PG */
public final class C131593n {
    /* renamed from: a */
    public static C50767e m214002a(int i, C9027a aVar) {
        int a = C131251t.m213740a(aVar.name() + "-" + i);
        C50766d dVar = (C50766d) C50767e.f132109d.createBuilder();
        dVar.copyOnWrite();
        C50767e eVar = (C50767e) dVar.instance;
        eVar.f132111a = eVar.f132111a | 1;
        eVar.f132112b = a;
        int i2 = aVar.f31227ag;
        dVar.copyOnWrite();
        C50767e eVar2 = (C50767e) dVar.instance;
        eVar2.f132111a |= 2;
        eVar2.f132113c = i2;
        return (C50767e) dVar.build();
    }
}
