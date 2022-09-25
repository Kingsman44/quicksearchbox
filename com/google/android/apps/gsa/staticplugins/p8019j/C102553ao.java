package com.google.android.apps.gsa.staticplugins.p8019j;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51421hb;
import com.google.assistant.p3897e.p3917i.p3918a.C51422hc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ao */
/* compiled from: PG */
public final /* synthetic */ class C102553ao implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C102560av f286231a;

    /* renamed from: b */
    public final /* synthetic */ Query f286232b;

    public /* synthetic */ C102553ao(C102560av avVar, Query query) {
        this.f286231a = avVar;
        this.f286232b = query;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C102560av avVar = this.f286231a;
        Query query = this.f286232b;
        if (!((C86124t) avVar.f286246b.mo27525b()).mo79746e(C90014bt.f247677lf) || !((C86124t) avVar.f286246b.mo27525b()).mo79746e(C90014bt.f247760nI)) {
            cVar.mo5437b(C58836b.f156633a);
            return "LockhartGwsRequestParams";
        }
        C51421hb hbVar = (C51421hb) C51422hc.f133938f.createBuilder();
        hbVar.copyOnWrite();
        C51422hc hcVar = (C51422hc) hbVar.instance;
        hcVar.f133940a |= 16;
        hcVar.f133944e = true;
        if (query.mo84363bw("com.google.opa.gwsrequestparams.IS_WEBVIEW_REFINEMENT")) {
            hbVar.copyOnWrite();
            C51422hc hcVar2 = (C51422hc) hbVar.instance;
            hcVar2.f133940a |= 4;
            hcVar2.f133943d = true;
        }
        cVar.mo5437b(C58833ax.m90834k((C51422hc) hbVar.build()));
        return "LockhartGwsRequestParams";
    }
}
