package com.google.android.apps.search.assistant.libraries.p8966e.p8970d;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70888j;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.ttsapi.TtsApiPerformer$createStreamFromServerTtsSession$1", mo61344c = "TtsApiPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {128})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.d.d */
/* compiled from: PG */
final class C119361d extends C69572j implements C69630p {

    /* renamed from: a */
    int f332785a;

    /* renamed from: b */
    final /* synthetic */ C119363f f332786b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f332787c;

    /* renamed from: d */
    final /* synthetic */ C57987f f332788d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119361d(C119363f fVar, C51809dy dyVar, C57987f fVar2, C69577g gVar) {
        super(2, gVar);
        this.f332786b = fVar;
        this.f332787c = dyVar;
        this.f332788d = fVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119361d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f332785a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f332788d.f155056f.mo54590g(th);
            }
        } else {
            C69714l.m101134b(obj);
            C70888j a = this.f332786b.f332799e.mo104490a(this.f332787c);
            C69664n.m101060f(a, "ttsStreamClient.getChannel(clientOp)");
            C71587n a2 = C71598y.m104521a(C71590q.m104504a(new C119359b(a, (C69577g) null)), Integer.MAX_VALUE, C71387t.SUSPEND);
            C119360c cVar = new C119360c(this.f332788d);
            this.f332785a = 1;
            if (a2.mo38165mp(cVar, this) == aVar) {
                return aVar;
            }
        }
        this.f332788d.f155056f.mo54589f(true);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119361d(this.f332786b, this.f332787c, this.f332788d, gVar);
    }
}
