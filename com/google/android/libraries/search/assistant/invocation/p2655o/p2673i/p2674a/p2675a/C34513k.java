package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.p2908b.p2910b.C37376c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.HotwordUriConverter$HotwordAudioBytesReceiver$close$1", mo61344c = "HotwordUriConverter.kt", mo61345d = "invokeSuspend", mo61346e = {105})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.k */
/* compiled from: PG */
final class C34513k extends C69572j implements C69630p {

    /* renamed from: a */
    int f91727a;

    /* renamed from: b */
    final /* synthetic */ C34514l f91728b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34513k(C34514l lVar, C69577g gVar) {
        super(2, gVar);
        this.f91728b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34513k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91727a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C37376c cVar = this.f91728b.f91730b;
            this.f91727a = 1;
            obj = cVar.mo40915a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C59052c cVar2 = (C59052c) C34517o.f91740a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "TRG.HotwordLegacyUri");
        cVar2.mo56379ah(new C59094n(51387));
        cVar2.mo56389s("Soda audio read session has been closed(%s).", (C37514du) obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34513k(this.f91728b, gVar);
    }
}
