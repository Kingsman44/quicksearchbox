package com.google.android.apps.gsa.shared.util;

import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84441h;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* renamed from: com.google.android.apps.gsa.shared.util.l */
/* compiled from: PG */
public final class C91052l implements C91043j {

    /* renamed from: a */
    final /* synthetic */ C90932cb f254318a;

    /* renamed from: b */
    final /* synthetic */ C91043j f254319b;

    public C91052l(C90932cb cbVar, C91043j jVar) {
        this.f254318a = cbVar;
        this.f254319b = jVar;
    }

    /* renamed from: a */
    public final void mo17709a(Object obj) {
        C90932cb cbVar = this.f254318a;
        C91043j jVar = this.f254319b;
        if (cbVar == null) {
            ((C84441h) jVar).mo17709a((GetGlobalSearchSourcesCall$GlobalSearchSource[]) obj);
            return;
        }
        cbVar.mo85151p(new C91045k(jVar, obj));
    }
}
