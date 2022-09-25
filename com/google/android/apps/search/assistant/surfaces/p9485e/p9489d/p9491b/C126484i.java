package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import android.util.Base64;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.SearchInfoProvider$cardsRequest$2$headersAsync$1", mo61344c = "SearchInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {39})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.i */
/* compiled from: PG */
final class C126484i extends C69572j implements C69630p {

    /* renamed from: a */
    int f348355a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348356b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126484i(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348356b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126484i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69685i iVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348355a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348356b;
            this.f348355a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq cqVar = ((C18496n) obj).f52441b;
        C69664n.m101060f(cqVar, "params\n        .await()\n        .headerList");
        ArrayList<C18505w> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            if (!C69664n.m101066l(((C18505w) next).f52460a, "X-Client-Data")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C18505w wVar : arrayList) {
            String str = wVar.f52461b;
            C69664n.m101060f(str, "it.value");
            if (str.length() == 0) {
                String str2 = wVar.f52460a;
                C63088z zVar = wVar.f52462c;
                C69664n.m101060f(zVar, "it.rawValue");
                String encodeToString = Base64.encodeToString(zVar.mo59174N(), 10);
                C69664n.m101060f(encodeToString, "encodeToString(toByteArray(), BASE64_URL_SAFE)");
                iVar = new C69685i(str2, encodeToString);
            } else {
                iVar = new C69685i(wVar.f52460a, wVar.f52461b);
            }
            arrayList2.add(iVar);
        }
        return C69505av.m100874p(arrayList2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126484i(this.f348356b, gVar);
    }
}
