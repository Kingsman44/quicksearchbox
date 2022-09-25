package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2705n.C34835c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioInputProcessingTasks$2$1", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {119, 120})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.l */
/* compiled from: PG */
final class C120493l extends C69572j implements C69630p {

    /* renamed from: a */
    int f335103a;

    /* renamed from: b */
    final /* synthetic */ C71604be f335104b;

    /* renamed from: c */
    final /* synthetic */ C120498q f335105c;

    /* renamed from: d */
    final /* synthetic */ C32534ai f335106d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120493l(C71604be beVar, C120498q qVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335104b = beVar;
        this.f335105c = qVar;
        this.f335106d = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120493l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335103a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71604be beVar = this.f335104b;
            this.f335103a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C37215b bVar = this.f335105c.f335122d;
        C37258g gVar = C37176a.f96884bB;
        C69664n.m101060f(gVar, "CONVERSATION_AUDIO_SESSION_OPEN");
        C37258g gVar2 = C37176a.f96885bC;
        C69664n.m101060f(gVar2, "CONVERSATION_AUDIO_SESSION_CLOSED");
        C120492k kVar = new C120492k((C120392a) obj, this.f335106d, (C69577g) null);
        this.f335103a = 2;
        if (C34835c.m63602a(bVar, gVar, gVar2, kVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120493l(this.f335104b, this.f335105c, this.f335106d, gVar);
    }
}
