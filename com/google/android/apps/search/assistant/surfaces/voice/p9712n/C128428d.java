package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.libraries.p8979j.p8980a.C119410a;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.voicesearch.ApaConversationClient$getAssistantHandoverConfiguration$1", mo61344c = "ApaConversationClient.kt", mo61345d = "invokeSuspend", mo61346e = {229})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.d */
/* compiled from: PG */
final class C128428d extends C69572j implements C69630p {

    /* renamed from: a */
    int f353198a;

    /* renamed from: b */
    final /* synthetic */ C128426a f353199b;

    /* renamed from: c */
    final /* synthetic */ C128436f f353200c;

    /* renamed from: d */
    final /* synthetic */ C18460aw f353201d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128428d(C128426a aVar, C128436f fVar, C18460aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f353199b = aVar;
        this.f353200c = fVar;
        this.f353201d = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128428d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353198a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128426a aVar2 = this.f353199b;
            C37258g gVar = C37176a.f96964cc;
            C69664n.m101060f(gVar, "MAIN_ASSISTANT_HANDOVER_ELIGIBILITY_CHECK_STARTED");
            aVar2.mo108429g(gVar);
            C60870cx a = this.f353200c.f353236l.mo104333a(this.f353201d);
            this.f353198a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C119410a aVar3 = (C119410a) obj;
        C128426a aVar4 = this.f353199b;
        C62722b bVar = aVar3.mo104331c() ? C62722b.OK : C62722b.UNAVAILABLE;
        C69664n.m101061g(bVar, "statusCode");
        aVar4.mo108428f(C37176a.f96965cd.mo40815i(bVar));
        C69664n.m101060f(aVar3, "handoverConfiguration");
        return aVar3;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128428d(this.f353199b, this.f353200c, this.f353201d, gVar);
    }
}
