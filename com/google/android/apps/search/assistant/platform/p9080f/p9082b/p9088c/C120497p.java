package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioInputProcessingTasks$2", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.p */
/* compiled from: PG */
final class C120497p extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C120498q f335115a;

    /* renamed from: b */
    final /* synthetic */ C71604be f335116b;

    /* renamed from: c */
    final /* synthetic */ C32534ai f335117c;

    /* renamed from: d */
    private /* synthetic */ Object f335118d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120497p(C120498q qVar, C71604be beVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335115a = qVar;
        this.f335116b = beVar;
        this.f335117c = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120497p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f335118d;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120493l(this.f335116b, this.f335115a, this.f335117c, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120495n(this.f335115a, this.f335116b, this.f335117c, (C69577g) null), 3);
        C120498q qVar = this.f335115a;
        if ((qVar.f335126h.f333644a & 1) != 0) {
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120496o(qVar, this.f335117c, (C69577g) null), 3);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120497p pVar = new C120497p(this.f335115a, this.f335116b, this.f335117c, gVar);
        pVar.f335118d = obj;
        return pVar;
    }
}
