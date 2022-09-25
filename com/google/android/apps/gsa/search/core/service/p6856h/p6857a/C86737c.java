package com.google.android.apps.gsa.search.core.service.p6856h.p6857a;

import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.service.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C86737c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C86739e f234303a;

    /* renamed from: b */
    public final /* synthetic */ String f234304b;

    public /* synthetic */ C86737c(C86739e eVar, String str) {
        this.f234303a = eVar;
        this.f234304b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58833ax axVar;
        C86739e eVar = this.f234303a;
        String str = this.f234304b;
        C69464a aVar = (C69464a) eVar.f234308c.get(str);
        if (aVar != null) {
            axVar = C58833ax.m90834k((C86744b) aVar.mo17428b());
        } else {
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            return eVar.f234307b.mo28201a("Initialize worker ".concat(String.valueOf(str)), new C86738d(axVar));
        }
        String format = String.format("No worker found for Worker ID [%s].", new Object[]{str});
        C59104x c = C86739e.f234306a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WorkerLoader");
        ((C59052c) ((C59052c) c).mo56372aa(8536)).mo56389s("%s", format);
        return C60856cj.m92899h(new C86750a(format));
    }
}
