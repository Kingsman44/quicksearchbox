package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$runPolicy$2$1$1", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {38, 58})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ag */
/* compiled from: PG */
final class C120429ag extends C69572j implements C69630p {

    /* renamed from: a */
    int f334965a;

    /* renamed from: b */
    /* synthetic */ Object f334966b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f334967c;

    /* renamed from: d */
    final /* synthetic */ C120432aj f334968d;

    /* renamed from: e */
    final /* synthetic */ C71422aw f334969e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120429ag(C69648ae aeVar, C120432aj ajVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f334967c = aeVar;
        this.f334968d = ajVar;
        this.f334969e = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120429ag) mo5194c((C120435am) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334965a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120435am amVar = (C120435am) this.f334966b;
            if (amVar instanceof C120453bc) {
                C71816z zVar = ((C120453bc) amVar).f335014a;
                C120427ae aeVar = new C120427ae(this.f334967c, this.f334968d, this.f334969e, (C69577g) null);
                this.f334965a = 1;
                if (C120434al.m199474a(zVar, aeVar, this) == aVar) {
                    return aVar;
                }
            } else if (C69664n.m101066l(amVar, C120422a.f334942a)) {
                C69648ae aeVar2 = this.f334967c;
                C120478z zVar2 = (C120478z) aeVar2.f186027a;
                if (zVar2 != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    zVar2.f335067b.close();
                    aeVar2.f186027a = null;
                }
            } else if (amVar instanceof C120477y) {
                C71816z zVar3 = ((C120477y) amVar).f335065a;
                C120428af afVar = new C120428af(this.f334967c, (C69577g) null);
                this.f334965a = 2;
                if (C120434al.m199474a(zVar3, afVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120429ag agVar = new C120429ag(this.f334967c, this.f334968d, this.f334969e, gVar);
        agVar.f334966b = obj;
        return agVar;
    }
}
