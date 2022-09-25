package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import com.google.android.libraries.assistant.p1533o.C18490h;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66559ap;
import com.google.speech.p5208h.C66560aq;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.SearchInfoProvider$pinholeParams$2$cgiParamsAsync$1", mo61344c = "SearchInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.l */
/* compiled from: PG */
final class C126487l extends C69572j implements C69630p {

    /* renamed from: a */
    int f348367a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348368b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126487l(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348368b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126487l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348367a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348368b;
            this.f348367a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq<C18490h> cqVar = ((C18496n) obj).f52440a;
        C69664n.m101060f(cqVar, "params.await().cgiParamList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C18490h hVar : cqVar) {
            C66559ap apVar = (C66559ap) C66560aq.f181048d.createBuilder();
            String str = hVar.f52431a;
            apVar.copyOnWrite();
            C66560aq aqVar = (C66560aq) apVar.instance;
            str.getClass();
            aqVar.f181050a |= 1;
            aqVar.f181051b = str;
            String str2 = hVar.f52432b;
            apVar.copyOnWrite();
            C66560aq aqVar2 = (C66560aq) apVar.instance;
            str2.getClass();
            aqVar2.f181050a |= 2;
            aqVar2.f181052c = str2;
            arrayList.add((C66560aq) apVar.build());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126487l(this.f348368b, gVar);
    }
}
