package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71608bi;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$controlCoroutine$4", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {94, 96})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.au */
/* compiled from: PG */
final class C34545au extends C69572j implements C69630p {

    /* renamed from: a */
    int f91786a;

    /* renamed from: b */
    /* synthetic */ Object f91787b;

    /* renamed from: c */
    final /* synthetic */ C34563bg f91788c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34545au(C34563bg bgVar, C69577g gVar) {
        super(2, gVar);
        this.f91788c = bgVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34545au) mo5194c((Throwable) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91786a;
        if (i == 0) {
            C69714l.m101134b(obj);
            Throwable th = (Throwable) this.f91787b;
            C34563bg bgVar = this.f91788c;
            this.f91786a = 1;
            bgVar.f91830f.mo39440a(new C34535ak(th));
            C59052c cVar = (C59052c) C34563bg.f91824a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordFrontend");
            C59052c cVar2 = (C59052c) cVar.mo56382g(th);
            cVar2.mo56379ah(new C59094n(51375));
            cVar2.mo56386p("Configuration update failed, shutting down frontend and retrying.");
            Object c = bgVar.mo39415c(this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            this.f91788c.f91830f.mo39440a(C34541aq.f91778a);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        long millis = C34563bg.f91825b.toMillis();
        this.f91786a = 2;
        if (C71608bi.m104551c(millis, this) == aVar) {
            return aVar;
        }
        this.f91788c.f91830f.mo39440a(C34541aq.f91778a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34545au auVar = new C34545au(this.f91788c, gVar);
        auVar.f91787b = obj;
        return auVar;
    }
}
