package com.google.android.libraries.search.assistant.p2700k.p2701a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.aoi;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.libraries.search.assistant.p2700k.C34757a;
import com.google.android.libraries.search.assistant.p2700k.C34772j;
import com.google.android.libraries.search.assistant.p2700k.C34773k;
import com.google.android.libraries.search.assistant.p2700k.C34778p;
import com.google.android.libraries.search.assistant.p2700k.C34779q;
import com.google.android.libraries.search.assistant.p2700k.C34780r;
import com.google.android.libraries.search.assistant.p2700k.C34785w;
import com.google.android.libraries.search.assistant.p2700k.C34786x;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.assistant.p4003x.p4004a.C53527d;
import com.google.assistant.p4003x.p4004a.C53528e;
import com.google.assistant.p4003x.p4004a.C53534k;
import com.google.assistant.p4003x.p4004a.C53535l;
import com.google.assistant.p4003x.p4004a.C53537n;
import com.google.assistant.p4003x.p4004a.C53538o;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import com.google.protos.p4985f.p5006h.C64856a;
import com.google.protos.p4985f.p5006h.C64857b;
import com.google.protos.p4985f.p5006h.C64859d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.credential.asid.ContainerAuthInterceptor$startRequestHeaderProcessing$future$1", mo61344c = "ContainerAuthInterceptor.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.search.assistant.k.a.a */
/* compiled from: PG */
final class C34758a extends C69572j implements C69630p {

    /* renamed from: a */
    int f92235a;

    /* renamed from: b */
    final /* synthetic */ C34759b f92236b;

    /* renamed from: c */
    final /* synthetic */ C61481b f92237c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34758a(C34759b bVar, C61481b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f92236b = bVar;
        this.f92237c = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34758a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C53534k kVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92235a != 0) {
            C69714l.m101134b(obj);
            obj2 = obj;
        } else {
            C69714l.m101134b(obj);
            C34759b bVar = this.f92236b;
            C34779q qVar = bVar.f92241b;
            C34786x xVar = bVar.f92240a;
            this.f92235a = 1;
            aoi aoi = qVar.f92297a;
            aqe aqe = aoi.f199109a.b.f198027a;
            C61343d dVar = (C61343d) aqe.f199175a.lz.mo17428b();
            C71422aw awVar = (C71422aw) aqe.f199175a.H.mo17428b();
            Executor executor = (Executor) aqe.f199175a.q.mo17428b();
            C69664n.m101061g(dVar, "authContextManager");
            C69664n.m101061g(awVar, "lightweightScope");
            C69664n.m101061g(executor, "blockingExecutor");
            obj2 = new C34778p(xVar, (AccountId) aoi.f199109a.b.f198239e.mo17428b(), (C46175b) aoi.f199109a.b.f198398h.mo17428b(), new C34785w(awVar, executor, dVar), new C34772j((Context) aoi.f199109a.b.f198027a.f199175a.g.mo17428b())).mo39502c(this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        C34780r rVar = (C34780r) obj2;
        C64856a aVar2 = (C64856a) C64857b.f175755c.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C64859d a = C69664n.m101061g(aVar2, "builder");
        C53527d dVar2 = (C53527d) C53528e.f140476d.createBuilder();
        C69664n.m101060f(dVar2, "newBuilder()");
        C69664n.m101061g(dVar2, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C53528e) dVar2.instance).f140479b);
        C69664n.m101060f(unmodifiableList, "_builder.getCredentialsList()");
        new C62883b(unmodifiableList);
        List<C34773k> list = rVar.f92298a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C34773k kVar2 : list) {
            C53535l lVar = (C53535l) C53538o.f140502f.createBuilder();
            C69664n.m101060f(lVar, "newBuilder()");
            C69664n.m101061g(lVar, "builder");
            C53537n nVar = C53537n.GAIA;
            C69664n.m101061g(nVar, "value");
            lVar.copyOnWrite();
            C53538o oVar = (C53538o) lVar.instance;
            oVar.f140505b = nVar.f140501e;
            oVar.f140504a |= 1;
            String str = kVar2.f92264a.f165904a;
            C69664n.m101060f(str, "this@asCredential.token.tokenString");
            C69664n.m101061g(str, "value");
            lVar.copyOnWrite();
            C53538o oVar2 = (C53538o) lVar.instance;
            str.getClass();
            oVar2.f140504a |= 2;
            oVar2.f140506c = str;
            String ag = C69540x.m100851ag(kVar2.f92265b, " ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
            C69664n.m101061g(ag, "value");
            lVar.copyOnWrite();
            C53538o oVar3 = (C53538o) lVar.instance;
            ag.getClass();
            oVar3.f140504a |= 4;
            oVar3.f140507d = ag;
            C34757a aVar3 = kVar2.f92266c;
            C34757a aVar4 = C34757a.PERSONAL;
            int ordinal = aVar3.ordinal();
            if (ordinal == 0) {
                kVar = C53534k.ACTIVE;
            } else if (ordinal == 1) {
                kVar = C53534k.WORK_PROFILE;
            } else {
                throw new C69677g();
            }
            C69664n.m101061g(kVar, "value");
            lVar.copyOnWrite();
            C53538o oVar4 = (C53538o) lVar.instance;
            oVar4.f140508e = kVar.f140494d;
            oVar4.f140504a |= 8;
            C62942bv build = lVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C53538o) build);
        }
        dVar2.copyOnWrite();
        C53528e eVar = (C53528e) dVar2.instance;
        C62971cq cqVar = eVar.f140479b;
        if (!cqVar.mo58948c()) {
            eVar.f140479b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) eVar.f140479b);
        int i = rVar.f92299b;
        dVar2.copyOnWrite();
        C53528e eVar2 = (C53528e) dVar2.instance;
        eVar2.f140478a |= 1;
        eVar2.f140480c = i;
        C62942bv build2 = dVar2.build();
        C69664n.m101060f(build2, "_builder.build()");
        C53528e eVar3 = (C53528e) build2;
        C69664n.m101061g(eVar3, "value");
        C64856a aVar5 = a.f175759a;
        aVar5.copyOnWrite();
        C64857b bVar2 = (C64857b) aVar5.instance;
        eVar3.getClass();
        bVar2.f175758b = eVar3;
        bVar2.f175757a |= 1;
        return a.mo59317a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34758a(this.f92236b, this.f92237c, gVar);
    }
}
