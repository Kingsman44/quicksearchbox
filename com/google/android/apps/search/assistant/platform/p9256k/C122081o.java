package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126437f;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.VoiceSearchRouter$doVoiceQuery$1", mo61344c = "VoiceSearchRouter.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.assistant.platform.k.o */
/* compiled from: PG */
final class C122081o extends C69572j implements C69630p {

    /* renamed from: a */
    int f338696a;

    /* renamed from: b */
    final /* synthetic */ C122082p f338697b;

    /* renamed from: c */
    final /* synthetic */ C71587n f338698c;

    /* renamed from: d */
    private /* synthetic */ Object f338699d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122081o(C122082p pVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f338697b = pVar;
        this.f338698c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122081o) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338696a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C122082p.f338700a.mo56224b();
            cVar.mo56379ah(new C59094n(36104));
            cVar.mo56386p("vsr VoiceSearchRouter#doVoiceQuery");
            String b = C39191a.m68623b(C58851bo.f156649a.nextLong());
            C37215b bVar = (C37215b) this.f338697b.f338701b.f348217a.mo17428b();
            bVar.getClass();
            b.getClass();
            C126437f fVar = new C126437f(bVar, b);
            fVar.mo107615b(C37176a.f96972ck.mo40779c());
            C122080n nVar = new C122080n(this.f338698c, this.f338697b, fVar, (C71588o) this.f338699d, (C69577g) null);
            this.f338696a = 1;
            if (C71423ax.m104196a(nVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122081o oVar = new C122081o(this.f338697b, this.f338698c, gVar);
        oVar.f338699d = obj;
        return oVar;
    }
}
