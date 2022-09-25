package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.topcontactparams.impl.contact.AccountEligibilityCheckerImpl$isEligible$2", mo61344c = "AccountEligibilityCheckerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.b */
/* compiled from: PG */
final class C37098b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C37099c f96628a;

    /* renamed from: b */
    final /* synthetic */ String f96629b;

    /* renamed from: c */
    final /* synthetic */ String f96630c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37098b(C37099c cVar, String str, String str2, C69577g gVar) {
        super(2, gVar);
        this.f96628a = cVar;
        this.f96629b = str;
        this.f96630c = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37098b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Set a;
        Set a2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C37099c cVar = this.f96628a;
        String str = this.f96629b;
        String str2 = this.f96630c;
        boolean z = true;
        if (C69664n.m101066l(str, "com.google") && ((a = cVar.mo40627a("service_HOSTED")) == null || a.contains(str2) || (a2 = cVar.mo40627a("usm")) == null || a2.contains(str2))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C37098b(this.f96628a, this.f96629b, this.f96630c, gVar);
    }
}
