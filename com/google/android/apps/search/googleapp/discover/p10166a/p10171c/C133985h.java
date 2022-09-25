package com.google.android.apps.search.googleapp.discover.p10166a.p10171c;

import com.google.android.apps.search.googleapp.discover.p10166a.C133991e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57237as;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57239au;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57240av;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57243ay;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57244az;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57323f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.view.ViewActionsReporter$reportViewActions$2", mo61344c = "ViewActionsReporter.kt", mo61345d = "invokeSuspend", mo61346e = {25})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.c.h */
/* compiled from: PG */
final class C133985h extends C69572j implements C69630p {

    /* renamed from: a */
    int f364966a;

    /* renamed from: b */
    final /* synthetic */ List f364967b;

    /* renamed from: c */
    final /* synthetic */ C133986i f364968c;

    /* renamed from: d */
    final /* synthetic */ Instant f364969d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133985h(List list, C133986i iVar, Instant instant, C69577g gVar) {
        super(2, gVar);
        this.f364967b = list;
        this.f364968c = iVar;
        this.f364969d = instant;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133985h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364966a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            List<C133975a> list = this.f364967b;
            Instant instant = this.f364969d;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
            for (C133975a aVar2 : list) {
                C57240av avVar = (C57240av) C57246ba.f152819d.createBuilder();
                C69664n.m101060f(avVar, "newBuilder()");
                C57239au a = C69664n.m101061g(avVar, "builder");
                a.mo54452c(aVar2.f364923b);
                C57243ay ayVar = (C57243ay) C57244az.f152807g.createBuilder();
                C69664n.m101060f(ayVar, "newBuilder()");
                C57237as a2 = C69664n.m101061g(ayVar, "builder");
                long epochSecond = instant.getEpochSecond();
                C57243ay ayVar2 = a2.f152799a;
                ayVar2.copyOnWrite();
                C57244az azVar = (C57244az) ayVar2.instance;
                azVar.f152809a = 1 | azVar.f152809a;
                azVar.f152810b = epochSecond;
                long millis = aVar2.f364922a.toMillis();
                C57243ay ayVar3 = a2.f152799a;
                ayVar3.copyOnWrite();
                C57244az azVar2 = (C57244az) ayVar3.instance;
                azVar2.f152809a |= 4;
                azVar2.f152812d = millis;
                C57323f a3 = C57323f.m88314a(aVar2.f364924c.f153693B);
                if (a3 != null) {
                    a2.mo54449b(a3);
                } else {
                    C59052c cVar = (C59052c) C133986i.f364970a.mo56226d();
                    int i = aVar2.f364924c.f153693B;
                    cVar.mo56379ah(new C59094n(40233));
                    cVar.mo56387q("Could not convert actionData.surface.number %d to ActionSurface", i);
                }
                a.mo54453d(a2.mo54448a());
                arrayList.add(a.mo54451b());
            }
            C133991e eVar = this.f364968c.f364971b;
            this.f364966a = 1;
            if (eVar.mo111510a(arrayList, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133985h(this.f364967b, this.f364968c, this.f364969d, gVar);
    }
}
