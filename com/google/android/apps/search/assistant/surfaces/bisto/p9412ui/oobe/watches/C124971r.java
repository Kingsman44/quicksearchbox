package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.r */
/* compiled from: PG */
public final /* synthetic */ class C124971r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124977x f344818a;

    /* renamed from: b */
    public final /* synthetic */ String f344819b;

    public /* synthetic */ C124971r(C124977x xVar, String str) {
        this.f344818a = xVar;
        this.f344819b = str;
    }

    public final C60870cx apply(Object obj) {
        C124977x xVar = this.f344818a;
        String str = this.f344819b;
        C124979z zVar = (C124979z) obj;
        C59104x b = C124977x.f344835a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DataLayerInitHelper");
        ((C59052c) ((C59052c) b).mo56372aa(36377)).mo56386p("Update gacs activation info");
        if (!zVar.f344852d) {
            return C60856cj.m92900i(zVar);
        }
        C60870cx i = xVar.f344841e.mo106603i(str, zVar);
        C124969p pVar = new C124969p(zVar);
        return C60922j.m93044g(i, C47810es.m84963c(pVar), C60826bg.f164896a);
    }
}
