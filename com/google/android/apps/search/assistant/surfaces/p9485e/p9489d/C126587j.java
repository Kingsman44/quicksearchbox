package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.libraries.p8979j.p8983c.C119436b;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import java.util.Iterator;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$createNew$2$1$clientDataHeader$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.j */
/* compiled from: PG */
final class C126587j extends C69572j implements C69630p {

    /* renamed from: a */
    int f348597a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348598b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126587j(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348598b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126587j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C58131b bVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348597a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348598b;
            this.f348597a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Iterator it = ((C18496n) obj).f52441b.iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            C18505w wVar = (C18505w) it.next();
            if ("X-Client-Data".equals(wVar.f52460a)) {
                if (!wVar.f52461b.isEmpty()) {
                    bVar = C119436b.m198169a(wVar.f52461b);
                } else if (!wVar.f52462c.mo59173M()) {
                    bVar = C119436b.m198170b(wVar.f52462c.mo59174N());
                }
            }
        }
        return bVar == null ? C58131b.f155403h : bVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126587j(this.f348598b, gVar);
    }
}
