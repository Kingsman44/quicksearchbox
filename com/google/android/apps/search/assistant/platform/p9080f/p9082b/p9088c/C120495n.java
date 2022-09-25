package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120392a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32538am;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioInputProcessingTasks$2$2", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {129, 129})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.n */
/* compiled from: PG */
final class C120495n extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335107a;

    /* renamed from: b */
    int f335108b;

    /* renamed from: c */
    final /* synthetic */ C120498q f335109c;

    /* renamed from: d */
    final /* synthetic */ C71604be f335110d;

    /* renamed from: e */
    final /* synthetic */ C32534ai f335111e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120495n(C120498q qVar, C71604be beVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335109c = qVar;
        this.f335110d = beVar;
        this.f335111e = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120495n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335108b;
        if (i == 0) {
            C69714l.m101134b(obj);
            obj2 = this.f335109c.f335121c;
            C71604be beVar = this.f335110d;
            this.f335107a = obj2;
            this.f335108b = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            obj2 = this.f335107a;
            C69714l.m101134b(obj);
        }
        C120507d a = ((C120392a) obj).mo104739a();
        C69664n.m101060f(a, "backendSessionAsync.await().config()");
        C71587n a2 = C32538am.m60349a(new C120494m(this.f335111e));
        this.f335107a = null;
        this.f335108b = 2;
        if (((C120506y) obj2).mo104779b(a, a2, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120495n(this.f335109c, this.f335110d, this.f335111e, gVar);
    }
}
