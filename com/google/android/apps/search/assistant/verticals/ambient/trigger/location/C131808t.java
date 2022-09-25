package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106587a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53704bb;
import com.google.assistant.p4016z.C53708bf;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.t */
/* compiled from: PG */
public final /* synthetic */ class C131808t implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C131808t f360002a = new C131808t();

    private /* synthetic */ C131808t() {
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
            C106588b bVar = C106588b.f297185b;
            bkVar.copyOnWrite();
            C53715bm bmVar = (C53715bm) bkVar.instance;
            bVar.getClass();
            bmVar.f141024b = bVar;
            bmVar.f141023a = 12;
            return Optional.m71637of((C53715bm) bkVar.build());
        }
        C106587a aVar = (C106587a) C106588b.f297185b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C53692aq aqVar = (C53692aq) guVar.get(i);
            C53704bb bbVar = (C53704bb) C53708bf.f140992g.createBuilder();
            bbVar.copyOnWrite();
            C53708bf bfVar = (C53708bf) bbVar.instance;
            aqVar.getClass();
            bfVar.f140996c = aqVar;
            bfVar.f140994a |= 2;
            aVar.mo95583a((C53708bf) bbVar.build());
        }
        C53713bk bkVar2 = (C53713bk) C53715bm.f141021c.createBuilder();
        bkVar2.copyOnWrite();
        C53715bm bmVar2 = (C53715bm) bkVar2.instance;
        C106588b bVar2 = (C106588b) aVar.build();
        bVar2.getClass();
        bmVar2.f141024b = bVar2;
        bmVar2.f141023a = 12;
        return Optional.m71637of((C53715bm) bkVar2.build());
    }
}
