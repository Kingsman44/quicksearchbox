package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.protobuf.C62971cq;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.ClientInfoProvider$clientInfo$2$1$userAgentAsync$1", mo61344c = "ClientInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.c */
/* compiled from: PG */
final class C126478c extends C69572j implements C69630p {

    /* renamed from: a */
    int f348333a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348334b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126478c(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348334b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126478c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        String str;
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348333a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348334b;
            this.f348333a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq cqVar = ((C18496n) obj).f52441b;
        C69664n.m101060f(cqVar, "headerList");
        Iterator it = cqVar.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C69664n.m101066l("User-Agent", ((C18505w) obj2).f52460a)) {
                break;
            }
        }
        C18505w wVar = (C18505w) obj2;
        if (wVar != null) {
            str = wVar.f52461b;
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126478c(this.f348334b, gVar);
    }
}
