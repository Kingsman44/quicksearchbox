package com.google.android.libraries.kids.platform.kidonboarding;

import android.net.Uri;
import com.google.android.libraries.kids.p1982a.p1985c.p1986a.C24033a;
import com.google.android.libraries.kids.p1982a.p1985c.p1986a.C24034b;
import com.google.android.libraries.kids.p1982a.p1985c.p1986a.C24036d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.kids.platform.kidonboarding.KidOnboardingViewModel$authenticatedUriFlow$1", mo61344c = "KidOnboardingViewModel.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.q */
/* compiled from: PG */
final class C24060q extends C69572j implements C69630p {

    /* renamed from: a */
    int f65733a;

    /* renamed from: b */
    /* synthetic */ Object f65734b;

    /* renamed from: c */
    final /* synthetic */ KidOnboardingViewModel f65735c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24060q(KidOnboardingViewModel kidOnboardingViewModel, C69577g gVar) {
        super(2, gVar);
        this.f65735c = kidOnboardingViewModel;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C24060q) mo5194c((C54618k) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f65733a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C54618k kVar = (C54618k) this.f65734b;
            String uri = this.f65735c.mo29432a(kVar).mo29437a(kVar).toString();
            C69664n.m101060f(uri, "getFlow(params).makeUri(params).toString()");
            C24036d dVar = this.f65735c.f65693a;
            C47633f i = C47633f.m84733g(dVar.f65684b.mo50214a(dVar.f65683a)).mo51516i(new C24033a(dVar, uri), dVar.f65685c).mo51516i(new C24034b(dVar), dVar.f65685c);
            this.f65733a = 1;
            obj = C71663i.m104690c(i, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Uri.parse((String) obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C24060q qVar = new C24060q(this.f65735c, gVar);
        qVar.f65734b = obj;
        return qVar;
    }
}
