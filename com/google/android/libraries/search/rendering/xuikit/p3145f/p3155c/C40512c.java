package com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c;

import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.xblend.dataservice.XBlendDataService$getDataSource$2", mo61344c = "XBlendDataService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.c.c */
/* compiled from: PG */
public final class C40512c extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C40514e f106302a;

    /* renamed from: b */
    final /* synthetic */ C40510a f106303b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40512c(C40514e eVar, C40510a aVar, C69577g gVar) {
        super(1, gVar);
        this.f106302a = eVar;
        this.f106303b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C40512c(this.f106302a, this.f106303b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C40514e eVar = this.f106302a;
        C46682c cVar = eVar.f106307c;
        C46370ah a = eVar.mo42482a(this.f106303b);
        C46788de deVar = C46788de.HALF_HOUR;
        if (a == null) {
            return C46688af.f121976a;
        }
        if (deVar.mo50797a(a.f121385b, cVar.f121960a.mo26870b())) {
            return C46688af.m83206c(a.f121384a);
        }
        return C46688af.m83205b(a.f121384a, a.f121385b);
    }
}
