package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131705c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131712j f359817a;

    public /* synthetic */ C131705c(C131712j jVar) {
        this.f359817a = jVar;
    }

    public final C60870cx apply(Object obj) {
        C131712j jVar = this.f359817a;
        Boolean bool = (Boolean) obj;
        ((C58970a) ((C58970a) jVar.f359825a.mo56224b()).mo56372aa(39330)).mo56389s("isEnabled: %b", bool);
        if (!bool.booleanValue()) {
            return C60866ct.f164955a;
        }
        return C47638k.m84753d(jVar.f359826b.mo110273a(jVar.f359830f), jVar.f359827c.mo110273a(jVar.f359831g)).mo51520a(C131706d.f359818a, jVar.f359828d);
    }
}
