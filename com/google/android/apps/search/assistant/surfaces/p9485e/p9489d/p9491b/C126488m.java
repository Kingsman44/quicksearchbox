package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.SearchInfoProvider$pinholeParams$2$headersAsync$1", mo61344c = "SearchInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.m */
/* compiled from: PG */
final class C126488m extends C69572j implements C69630p {

    /* renamed from: a */
    int f348369a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348370b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126488m(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348370b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126488m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348369a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348370b;
            this.f348369a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq<C18505w> cqVar = ((C18496n) obj).f52441b;
        C69664n.m101060f(cqVar, "params.await().headerList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C18505w wVar : cqVar) {
            C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
            String str = wVar.f52460a;
            arVar.copyOnWrite();
            C66563at atVar = (C66563at) arVar.instance;
            str.getClass();
            atVar.f181056a |= 1;
            atVar.f181057b = str;
            String str2 = wVar.f52461b;
            C69664n.m101060f(str2, "it.value");
            if (str2.length() == 0) {
                C63088z zVar = wVar.f52462c;
                arVar.copyOnWrite();
                C66563at atVar2 = (C66563at) arVar.instance;
                zVar.getClass();
                atVar2.f181056a |= 4;
                atVar2.f181059d = zVar;
            } else {
                String str3 = wVar.f52461b;
                arVar.copyOnWrite();
                C66563at atVar3 = (C66563at) arVar.instance;
                str3.getClass();
                atVar3.f181056a |= 2;
                atVar3.f181058c = str3;
            }
            arrayList.add((C66563at) arVar.build());
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126488m(this.f348370b, gVar);
    }
}
