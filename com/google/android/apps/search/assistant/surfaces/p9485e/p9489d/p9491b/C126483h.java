package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import android.net.Uri;
import com.google.android.libraries.assistant.p1533o.C18490h;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.protobuf.C62971cq;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.SearchInfoProvider$cardsRequest$2$cgiParamsAsync$1", mo61344c = "SearchInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.h */
/* compiled from: PG */
final class C126483h extends C69572j implements C69630p {

    /* renamed from: a */
    int f348353a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348354b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126483h(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348354b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126483h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348353a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348354b;
            this.f348353a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq<C18490h> cqVar = ((C18496n) obj).f52440a;
        C69664n.m101060f(cqVar, "params.await().cgiParamList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C18490h hVar : cqVar) {
            arrayList.add(new C69685i(Uri.decode(hVar.f52431a), Uri.decode(hVar.f52432b)));
        }
        return C69505av.m100874p(arrayList);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126483h(this.f348354b, gVar);
    }
}
