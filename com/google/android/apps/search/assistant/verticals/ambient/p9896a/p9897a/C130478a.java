package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9897a;

import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c.C130582h;
import com.google.assistant.p3886c.C50664a;
import com.google.assistant.p3886c.C50715b;
import com.google.assistant.p3886c.C50830e;
import com.google.assistant.p3886c.C50838j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130478a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130480c f357449a;

    public /* synthetic */ C130478a(C130480c cVar) {
        this.f357449a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C130480c cVar = this.f357449a;
        C58485gu guVar = (C58485gu) obj;
        if (!cVar.f357452b.mo109731a()) {
            return C60856cj.m92899h(new IllegalStateException("AiAi not available"));
        }
        C50830e eVar = (C50830e) C50838j.f132370b.createBuilder();
        C50664a aVar = (C50664a) C50715b.f131973d.createBuilder();
        aVar.copyOnWrite();
        C50715b bVar = (C50715b) aVar.instance;
        bVar.f131976b = 2;
        bVar.f131975a |= 1;
        aVar.mo53417a(guVar);
        C50715b bVar2 = (C50715b) aVar.build();
        eVar.copyOnWrite();
        C50838j jVar = (C50838j) eVar.instance;
        bVar2.getClass();
        jVar.mo53484a();
        jVar.f132372a.add(bVar2);
        return ((C130582h) cVar.f357452b).mo109732b((C50838j) eVar.build(), "app_suggestions_tng_update");
    }
}
