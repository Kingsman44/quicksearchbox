package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.search.core.service.aa */
/* compiled from: PG */
public final /* synthetic */ class C86605aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86610af f233957a;

    /* renamed from: b */
    public final /* synthetic */ String f233958b;

    public /* synthetic */ C86605aa(C86610af afVar, String str) {
        this.f233957a = afVar;
        this.f233958b = str;
    }

    public final void run() {
        C86610af afVar = this.f233957a;
        String str = this.f233958b;
        if (!afVar.f233976k) {
            C58800sl lA = ((C58512hu) afVar.f233978m.mo6453a()).mo55423a(str).iterator();
            while (lA.hasNext()) {
                ((C86898ct) lA.next()).mo80592hl(str);
            }
        }
    }
}
