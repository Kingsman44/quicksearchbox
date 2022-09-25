package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioInputProcessingTasks$2$1$1", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {124})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.k */
/* compiled from: PG */
final class C120492k extends C69572j implements C69630p {

    /* renamed from: a */
    int f335100a;

    /* renamed from: b */
    final /* synthetic */ C120392a f335101b;

    /* renamed from: c */
    final /* synthetic */ C32534ai f335102c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120492k(C120392a aVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335101b = aVar;
        this.f335102c = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120492k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335100a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f335101b.mo104740b();
            C69664n.m101060f(b, "session.finishedFuture()");
            this.f335100a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        }
        this.f335102c.mo38135c((Throwable) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120492k(this.f335101b, this.f335102c, gVar);
    }
}
