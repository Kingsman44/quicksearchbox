package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.performers.tts.TtsPerformer$createStreamFromServerTtsSession$1", mo61344c = "TtsPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {179})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.e */
/* compiled from: PG */
final class C128373e extends C69572j implements C69630p {

    /* renamed from: a */
    int f353055a;

    /* renamed from: b */
    final /* synthetic */ C128377i f353056b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f353057c;

    /* renamed from: d */
    final /* synthetic */ C57987f f353058d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128373e(C128377i iVar, C51809dy dyVar, C57987f fVar, C69577g gVar) {
        super(2, gVar);
        this.f353056b = iVar;
        this.f353057c = dyVar;
        this.f353058d = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128373e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353055a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f353058d.f155056f.mo54590g(th);
            }
        } else {
            C69714l.m101134b(obj);
            C70888j a = this.f353056b.f353075f.mo104490a(this.f353057c);
            C69664n.m101060f(a, "ttsStreamClient.getChannel(clientOp)");
            C71587n a2 = C71598y.m104521a(C71590q.m104504a(new C128371c(a, (C69577g) null)), Integer.MAX_VALUE, C71387t.SUSPEND);
            C128372d dVar = new C128372d(this.f353056b, this.f353058d);
            this.f353055a = 1;
            if (a2.mo38165mp(dVar, this) == aVar) {
                return aVar;
            }
        }
        this.f353058d.f155056f.mo54589f(true);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128373e(this.f353056b, this.f353057c, this.f353058d, gVar);
    }
}
