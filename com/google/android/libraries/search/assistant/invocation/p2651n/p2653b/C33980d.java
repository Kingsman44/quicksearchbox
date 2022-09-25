package com.google.android.libraries.search.assistant.invocation.p2651n.p2653b;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33974a;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2652a.C33976c;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33989f;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33995l;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33996m;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33999p;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34000q;
import com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34002s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.systemui.client.RestrictedSystemUiApiImpl$setUiHints$1", mo61344c = "RestrictedSystemUiApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {32})
/* renamed from: com.google.android.libraries.search.assistant.invocation.n.b.d */
/* compiled from: PG */
public final class C33980d extends C69572j implements C69630p {

    /* renamed from: a */
    int f90596a;

    /* renamed from: b */
    final /* synthetic */ C33981e f90597b;

    /* renamed from: c */
    final /* synthetic */ Bundle f90598c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33980d(C33981e eVar, Bundle bundle, C69577g gVar) {
        super(2, gVar);
        this.f90597b = eVar;
        this.f90598c = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33980d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33996m mVar;
        C33996m mVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90596a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33989f fVar = this.f90597b.f90600b;
            C61541e eVar = C33487a.f89616a;
            C69664n.m101060f(eVar, "BUNDLE_KEYS");
            C33999p pVar = (C33999p) C34000q.f90628b.createBuilder();
            C69664n.m101060f(pVar, "newBuilder()");
            C69664n.m101061g(pVar, "builder");
            pVar.copyOnWrite();
            ((C34000q) pVar.instance).f90630a = false;
            C62942bv build = pVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f90596a = 1;
            obj = ((C33989f) C61539c.m94271a(fVar, eVar, this.f90598c)).mo39180b((C34000q) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C34002s sVar = (C34002s) obj;
        if (sVar.f90633a == 2) {
            C59052c cVar = (C59052c) C33981e.f90599a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.SystemUI");
            if (sVar.f90633a == 2) {
                mVar = (C33996m) sVar.f90634b;
            } else {
                mVar = C33996m.f90622c;
            }
            cVar.mo56379ah(new C59094n(51318));
            cVar.mo56389s("setUiHints: failed with %s", mVar);
            if (sVar.f90633a == 2) {
                mVar2 = (C33996m) sVar.f90634b;
            } else {
                mVar2 = C33996m.f90622c;
            }
            C69664n.m101060f(mVar2, "response.error");
            C69664n.m101061g(mVar2, "<this>");
            C33995l a = C33995l.m62665a(mVar2.f90625b);
            if (a == null) {
                a = C33995l.UNRECOGNIZED;
            }
            C69664n.m101060f(a, "errorType");
            C33974a aVar2 = (C33974a) C33978b.f90595a.mo56070hd(a);
            if (aVar2 == null) {
                aVar2 = C33974a.UNKNOWN;
            }
            throw new C33976c(aVar2, mVar2.f90624a);
        }
        C59052c cVar2 = (C59052c) C33981e.f90599a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.SystemUI");
        cVar2.mo56379ah(new C59094n(51317));
        cVar2.mo56386p("setUiHints: finished successfully");
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33980d(this.f90597b, this.f90598c, gVar);
    }
}
