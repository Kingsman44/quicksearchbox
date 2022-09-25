package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.web.base.C43257h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.LoadUrlParamsCreator$create$2", mo61344c = "LoadUrlParamsCreator.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.p */
/* compiled from: PG */
final class C138755p extends C69572j implements C69630p {

    /* renamed from: a */
    int f377403a;

    /* renamed from: b */
    final /* synthetic */ C138758s f377404b;

    /* renamed from: c */
    final /* synthetic */ C137542d f377405c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138755p(C138758s sVar, C137542d dVar, C69577g gVar) {
        super(2, gVar);
        this.f377404b = sVar;
        this.f377405c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138755p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377403a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
                C59052c cVar = (C59052c) ((C59052c) C138758s.f377414a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(41302));
                cVar.mo56386p("Fail to create LoadUrlParams");
                throw e;
            }
        } else {
            C69714l.m101134b(obj);
            C138758s sVar = this.f377404b;
            C137542d dVar = this.f377405c;
            this.f377403a = 1;
            obj = sVar.mo114514a(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (C43257h) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138755p(this.f377404b, this.f377405c, gVar);
    }
}
