package com.google.android.apps.search.assistant.libraries.p8966e.p8970d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119728b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119735i;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.p5573a.C71358al;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70888j;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.ttsapi.TtsApiPerformer$connect$1", mo61344c = "TtsApiPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {176})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.d.b */
/* compiled from: PG */
final class C119359b extends C69572j implements C69630p {

    /* renamed from: a */
    int f332781a;

    /* renamed from: b */
    final /* synthetic */ C70888j f332782b;

    /* renamed from: c */
    private /* synthetic */ Object f332783c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119359b(C70888j jVar, C69577g gVar) {
        super(2, gVar);
        this.f332782b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119359b) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332781a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f332783c;
            C59071e eVar = C119363f.f332795a;
            C119735i.m198650a(this.f332782b).mo104492b(C119728b.f333553a, new C119356a(aoVar));
            this.f332781a = 1;
            if (C71360an.m104022a(aoVar, C71358al.f190551a, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119359b bVar = new C119359b(this.f332782b, gVar);
        bVar.f332783c = obj;
        return bVar;
    }
}
