package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.common.p4526f.p4527a.C58970a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getQueryFreeRequestData$2", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {94})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.ab */
/* compiled from: PG */
final class C138731ab extends C69572j implements C69630p {

    /* renamed from: a */
    int f377310a;

    /* renamed from: b */
    final /* synthetic */ C138736ag f377311b;

    /* renamed from: c */
    final /* synthetic */ boolean f377312c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138731ab(C138736ag agVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f377311b = agVar;
        this.f377312c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138731ab) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377310a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception unused) {
                ((C58970a) C138736ag.f377324a.mo56226d()).mo56386p("Failed to refresh request data");
            }
        } else {
            C69714l.m101134b(obj);
            C138736ag agVar = this.f377311b;
            boolean z = this.f377312c;
            this.f377310a = 1;
            if (agVar.mo114504a(z, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138731ab(this.f377311b, this.f377312c, gVar);
    }
}
