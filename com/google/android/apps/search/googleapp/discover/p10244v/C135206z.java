package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStore$getDebuggableFeatureSuspend$2", mo61344c = "FeedStore.kt", mo61345d = "invokeSuspend", mo61346e = {346})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.z */
/* compiled from: PG */
final class C135206z extends C69572j implements C69630p {

    /* renamed from: a */
    int f368298a;

    /* renamed from: b */
    final /* synthetic */ C135130ab f368299b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135206z(C135130ab abVar, C69577g gVar) {
        super(2, gVar);
        this.f368299b = abVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135206z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368298a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f368299b.f368053e.mo46042d();
            C69664n.m101060f(d, "dataStore.data");
            this.f368298a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C134284d dVar = new C134284d();
        C62971cq cqVar = ((C135133ae) obj).f368061a;
        C69664n.m101060f(cqVar, "data.garbageCollectionEventsList");
        List list = dVar.f365788a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (Object next : cqVar) {
            C134284d dVar2 = new C134284d();
            C135135ag agVar = (C135135ag) next;
            List list2 = dVar2.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList2 = new ArrayList();
            C63042fg fgVar = agVar.f368065b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C69664n.m101060f(fgVar, "it.timestamp");
            C134297q.m217878b("Time", C62949a.m95469d(fgVar), pVar, arrayList2);
            String str = agVar.f368066c;
            C69664n.m101060f(str, "it.committedSessionKeyType");
            C134297q.m217880d("Key type", str, pVar, arrayList2);
            C134297q.m217877a("Sessions collected for staleness", agVar.f368067d, pVar, arrayList2);
            C134297q.m217877a("Sessions collected for capacity", agVar.f368068e, pVar, arrayList2);
            C134297q.m217877a("Sessions remaining", agVar.f368069f, pVar, arrayList2);
            C69540x.m100811r(list2, arrayList2);
            arrayList.add(dVar2.mo111674a());
        }
        list.add(new C134291k("Recent Garbage Collection Events", arrayList));
        return C134268c.m217846a("FeedStore", dVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135206z(this.f368299b, gVar);
    }
}
