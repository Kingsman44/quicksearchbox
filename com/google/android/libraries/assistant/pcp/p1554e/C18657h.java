package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1551b.C18599a;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1551b.C18603e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.pcp.e.h */
/* compiled from: PG */
public final /* synthetic */ class C18657h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18650at f52688a;

    /* renamed from: b */
    public final /* synthetic */ C49099gk f52689b;

    public /* synthetic */ C18657h(C18650at atVar, C49099gk gkVar) {
        this.f52688a = atVar;
        this.f52689b = gkVar;
    }

    public final C60870cx apply(Object obj) {
        C18650at atVar = this.f52688a;
        C49099gk gkVar = this.f52689b;
        C18603e eVar = atVar.f52680d;
        C18634ad adVar = new C18634ad((C49099gk) obj, gkVar);
        C42876ab abVar = eVar.f52627b;
        Objects.requireNonNull(adVar);
        return abVar.mo46039a(new C18599a(adVar), C60826bg.f164896a);
    }
}
