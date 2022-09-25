package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.libraries.search.assistant.p2511d.C32538am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71597x;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.FulfillmentSession$deferredResults$1", mo61344c = "FulfillmentSession.kt", mo61345d = "invokeSuspend", mo61346e = {221})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.x */
/* compiled from: PG */
final class C120573x extends C69572j implements C69630p {

    /* renamed from: a */
    int f335356a;

    /* renamed from: b */
    final /* synthetic */ C120546ac f335357b;

    /* renamed from: c */
    final /* synthetic */ C120691f f335358c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120573x(C120546ac acVar, C120691f fVar, C69577g gVar) {
        super(2, gVar);
        this.f335357b = acVar;
        this.f335358c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120573x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335356a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C120546ac.f335229a.mo56224b();
            C119942a aVar2 = this.f335357b.f335232d;
            cVar.mo56379ah(new C59094n(35492));
            cVar.mo56389s("init %s", aVar2);
            C71552db dbVar = new C71552db(new C120572w(new C71552db(new C120569t(C32538am.m60349a(new C120566q(this.f335357b.f335230b)), (C69577g) null, this.f335357b, this.f335358c)), (C69577g) null, this.f335357b));
            ArrayList arrayList = new ArrayList();
            this.f335356a = 1;
            obj = C71597x.m104520a(dbVar, arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120573x(this.f335357b, this.f335358c, gVar);
    }
}
