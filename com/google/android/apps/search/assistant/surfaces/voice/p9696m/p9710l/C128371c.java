package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.performers.tts.TtsPerformer$connect$1", mo61344c = "TtsPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {230})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.c */
/* compiled from: PG */
final class C128371c extends C69572j implements C69630p {

    /* renamed from: a */
    int f353050a;

    /* renamed from: b */
    final /* synthetic */ C70888j f353051b;

    /* renamed from: c */
    private /* synthetic */ Object f353052c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128371c(C70888j jVar, C69577g gVar) {
        super(2, gVar);
        this.f353051b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128371c) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353050a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f353052c;
            C59071e eVar = C128377i.f353069a;
            C119735i.m198650a(this.f353051b).mo104492b(C119728b.f333553a, new C128370b(aoVar));
            this.f353050a = 1;
            if (C71360an.m104022a(aoVar, C71358al.f190551a, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128371c cVar = new C128371c(this.f353051b, gVar);
        cVar.f353052c = obj;
        return cVar;
    }
}
