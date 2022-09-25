package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8227n.C106590b;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131687a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.j */
/* compiled from: PG */
public final /* synthetic */ class C131568j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131701c f359473a;

    public /* synthetic */ C131568j(C131701c cVar) {
        this.f359473a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C131701c cVar = this.f359473a;
        C131101a aVar = (C131101a) obj;
        aVar.getClass();
        C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
        C131687a aVar2 = (C131687a) cVar;
        bkVar.copyOnWrite();
        C53715bm bmVar = (C53715bm) bkVar.instance;
        bmVar.f141024b = (C106590b) aVar2.f359794a;
        bmVar.f141023a = 15;
        return aVar.mo110074b((C53715bm) bkVar.build(), aVar2.f359795b);
    }
}
