package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60904dr;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyRunner$runTasks$2$1", mo61344c = "PolicyRunner.kt", mo61345d = "invokeSuspend", mo61346e = {72})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ba */
/* compiled from: PG */
final class C120451ba extends C69572j implements C69630p {

    /* renamed from: a */
    int f335008a;

    /* renamed from: b */
    final /* synthetic */ C120441as f335009b;

    /* renamed from: c */
    final /* synthetic */ C71389v f335010c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120451ba(C120441as asVar, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f335009b = asVar;
        this.f335010c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120451ba) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335008a == 0) {
            C69714l.m101134b(obj);
            C120441as asVar = this.f335009b;
            C60904dr drVar = new C60904dr(C60826bg.f164896a);
            C71548cy b = C71574dx.m104480b((Object) null);
            C120447ax axVar = new C120447ax(drVar, b, asVar);
            asVar.f334988b.mo104877b().mo104264b(new C120445av(axVar));
            axVar.mo104755b();
            C120449az azVar = new C120449az(this.f335010c);
            this.f335008a = 1;
            if (b.mo38165mp(azVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120451ba(this.f335009b, this.f335010c, gVar);
    }
}
