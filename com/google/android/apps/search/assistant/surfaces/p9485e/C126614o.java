package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126404t;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$consumeAndCloseMicrophone$2$2", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.o */
/* compiled from: PG */
final class C126614o extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C126621v f348672a;

    /* renamed from: b */
    final /* synthetic */ C126404t f348673b;

    /* renamed from: c */
    final /* synthetic */ C71389v f348674c;

    /* renamed from: d */
    private /* synthetic */ Object f348675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126614o(C126621v vVar, C126404t tVar, C71389v vVar2, C69577g gVar) {
        super(2, gVar);
        this.f348672a = vVar;
        this.f348673b = tVar;
        this.f348674c = vVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126614o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f348675d;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126605f(this.f348672a, this.f348673b, this.f348674c, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126608i(this.f348673b, this.f348672a, (C69577g) null), 3);
        return C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126613n(this.f348672a, this.f348674c, this.f348673b, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126614o oVar = new C126614o(this.f348672a, this.f348673b, this.f348674c, gVar);
        oVar.f348675d = obj;
        return oVar;
    }
}
