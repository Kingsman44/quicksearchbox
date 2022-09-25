package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126437f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.VoiceSearchRouter$doVoiceQuery$1$1$2", mo61344c = "VoiceSearchRouter.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.k.m */
/* compiled from: PG */
final class C122079m extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f338684a;

    /* renamed from: b */
    final /* synthetic */ C126437f f338685b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122079m(C126437f fVar, C69577g gVar) {
        super(3, gVar);
        this.f338685b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C122079m mVar = new C122079m(this.f338685b, (C69577g) obj3);
        mVar.f338684a = (Throwable) obj2;
        return mVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f338684a;
        if (obj2 == null) {
            C59052c cVar = (C59052c) C122082p.f338700a.mo56224b();
            cVar.mo56379ah(new C59094n(36103));
            cVar.mo56386p("vsr VoiceSearchRouter onCompleted: success");
            this.f338685b.mo107614a(C62722b.OK);
        } else if (obj2 instanceof CancellationException) {
            C59052c cVar2 = (C59052c) C122082p.f338700a.mo56224b();
            cVar2.mo56379ah(new C59094n(36102));
            cVar2.mo56386p("vsr VoiceSearchRouter onCompleted: cancellation");
            this.f338685b.mo107614a(C62722b.OK);
        } else {
            C59052c cVar3 = (C59052c) C122082p.f338700a.mo56224b();
            cVar3.mo56379ah(new C59094n(36101));
            cVar3.mo56386p("vsr VoiceSearchRouter onCompleted: failure");
            this.f338685b.mo107614a(C62722b.UNKNOWN);
        }
        return C69788q.f186170a;
    }
}
