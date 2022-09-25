package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioInputProcessingTasks$2$3", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {132})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.o */
/* compiled from: PG */
final class C120496o extends C69572j implements C69630p {

    /* renamed from: a */
    int f335112a;

    /* renamed from: b */
    final /* synthetic */ C120498q f335113b;

    /* renamed from: c */
    final /* synthetic */ C32534ai f335114c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120496o(C120498q qVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335113b = qVar;
        this.f335114c = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120496o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335112a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120498q qVar = this.f335113b;
            C32534ai aiVar = this.f335114c;
            C119906y yVar = qVar.f335126h.f333645b;
            if (yVar == null) {
                yVar = C119906y.f333913e;
            }
            C69664n.m101060f(yVar, "audioConfiguration.manageAudioFocus");
            this.f335112a = 1;
            Object a = C71423ax.m104196a(new C120491j(qVar, yVar, aiVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120496o(this.f335113b, this.f335114c, gVar);
    }
}
