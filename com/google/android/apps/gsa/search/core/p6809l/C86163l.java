package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.apps.gsa.search.core.C87231v;
import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.l.l */
/* compiled from: PG */
final class C86163l extends C90878al {

    /* renamed from: a */
    final /* synthetic */ C86164m f232853a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86163l(C86164m mVar) {
        super("Handle GetRecentContextCall.Response", 1, 0);
        this.f232853a = mVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C58485gu guVar;
        GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) obj;
        this.f232853a.f232858e = getRecentContextCall$Response;
        if (getRecentContextCall$Response.f387453a.mo119097c()) {
            List list = getRecentContextCall$Response.f387454b;
            if (list == null) {
                ((C59052c) ((C59052c) C86164m.f232854a.mo56225c()).mo56372aa(7701)).mo56386p("Call succeeded but null context");
                guVar = C58485gu.m89845m();
            } else {
                list.size();
                guVar = C58485gu.m89842j(getRecentContextCall$Response.f387454b);
            }
            return C60856cj.m92900i(guVar);
        }
        Status status = getRecentContextCall$Response.f387453a;
        ((C59052c) ((C59052c) C86164m.f232854a.mo56225c()).mo56372aa(7702)).mo56395y("Failed to get response: %d %s", status.f389621g, status.f389622h);
        throw new C87231v(getRecentContextCall$Response.f387453a);
    }
}
