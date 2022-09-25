package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119861db;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.x */
/* compiled from: PG */
public final /* synthetic */ class C126863x implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C126780ar f349338a;

    public /* synthetic */ C126863x(C126780ar arVar) {
        this.f349338a = arVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C119748c cVar = this.f349338a.f349128g;
        if (cVar == null) {
            return C60856cj.m92899h(new IllegalStateException("Connection was not available."));
        }
        C119861db dbVar = (C119861db) C119863dd.f333821c.createBuilder();
        C62912at atVar = C62912at.f169862a;
        dbVar.copyOnWrite();
        C119863dd ddVar = (C119863dd) dbVar.instance;
        atVar.getClass();
        ddVar.f333824b = atVar;
        ddVar.f333823a = 1;
        return cVar.mo104499b((C119863dd) dbVar.build());
    }
}
