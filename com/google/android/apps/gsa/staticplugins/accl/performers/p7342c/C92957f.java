package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.f */
/* compiled from: PG */
public final /* synthetic */ class C92957f implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C92970s f259308a;

    public /* synthetic */ C92957f(C92970s sVar) {
        this.f259308a = sVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C92970s sVar = this.f259308a;
        C60870cx d = sVar.f259330b.mo17527d(C9318f.CONTEXTUAL);
        if (d != null) {
            ((C59052c) ((C59052c) C92970s.f259329a.mo56224b()).mo56372aa(13237)).mo56386p("Using CONTEXTUAL AssistDataType (probably OPA).");
            return C58833ax.m90834k(d);
        }
        C60870cx d2 = sVar.f259330b.mo17527d(C9318f.VOICE);
        if (d2 == null) {
            return C58836b.f156633a;
        }
        ((C59052c) ((C59052c) C92970s.f259329a.mo56224b()).mo56372aa(13236)).mo56386p("Using VOICE AssistDataType (probably NGA).");
        return C58833ax.m90834k(d2);
    }
}
