package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.AsyncWebCoordinatorInstanceState$refreshCache$1", mo61344c = "AsyncWebCoordinatorInstanceState.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.g */
/* compiled from: PG */
final class C137782g extends C69572j implements C69630p {

    /* renamed from: a */
    int f374822a;

    /* renamed from: b */
    final /* synthetic */ C137783h f374823b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137782g(C137783h hVar, C69577g gVar) {
        super(2, gVar);
        this.f374823b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137782g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374822a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception unused) {
                C59052c cVar = (C59052c) C137783h.f374824a.mo56226d();
                cVar.mo56379ah(new C59094n(41054));
                cVar.mo56386p("Fail to fetch data");
            }
        } else {
            C69714l.m101134b(obj);
            C137783h hVar = this.f374823b;
            this.f374822a = 1;
            if (hVar.mo113955c(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137782g(this.f374823b, gVar);
    }
}
