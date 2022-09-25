package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.GrpcRequestDebuggable$getDebuggableFeatureSuspend$2", mo61344c = "GrpcRequestDebuggable.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.cl */
/* compiled from: PG */
final class C135010cl extends C69572j implements C69630p {

    /* renamed from: a */
    int f367639a;

    /* renamed from: b */
    final /* synthetic */ C135011cm f367640b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135010cl(C135011cm cmVar, C69577g gVar) {
        super(2, gVar);
        this.f367640b = cmVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135010cl) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367639a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f367640b.f367642b.mo46042d();
            C69664n.m101060f(d, "dataStore.data");
            this.f367639a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq cqVar = ((C135001cc) obj).f367595a;
        C69664n.m101060f(cqVar, "data.grpcClientDataList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (Object next : cqVar) {
            C134284d dVar = new C134284d();
            C134999ca caVar = (C134999ca) next;
            List list = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList2 = new ArrayList();
            C63042fg fgVar = caVar.f367592f;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C69664n.m101060f(fgVar, "it.timestamp");
            C134297q.m217878b("Time", C62949a.m95469d(fgVar), pVar, arrayList2);
            C57259bn a = C57259bn.m88289a(caVar.f367590d);
            if (a == null) {
                a = C57259bn.UNKNOWN_REQUEST_REASON;
            }
            C134297q.m217880d("Request Reason", a.name(), pVar, arrayList2);
            String str = caVar.f367588b;
            C69664n.m101060f(str, "it.serviceName");
            C134297q.m217880d("Service Name", str, pVar, arrayList2);
            String str2 = caVar.f367589c;
            C69664n.m101060f(str2, "it.methodName");
            C134297q.m217880d("Method Name", str2, pVar, arrayList2);
            String str3 = caVar.f367591e;
            C69664n.m101060f(str3, "it.status");
            C134297q.m217880d("Status", str3, pVar, arrayList2);
            C69540x.m100811r(list, arrayList2);
            arrayList.add(dVar.mo111674a());
        }
        return new C134291k("Recent gRPC Requests", arrayList);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135010cl(this.f367640b, gVar);
    }
}
