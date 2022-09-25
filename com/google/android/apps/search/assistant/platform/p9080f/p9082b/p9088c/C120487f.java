package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$openNewSession$1$3", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.f */
/* compiled from: PG */
final class C120487f extends C69572j implements C69630p {

    /* renamed from: a */
    int f335084a;

    /* renamed from: b */
    final /* synthetic */ C120498q f335085b;

    /* renamed from: c */
    final /* synthetic */ C120483b f335086c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120487f(C120498q qVar, C120483b bVar, C69577g gVar) {
        super(2, gVar);
        this.f335085b = qVar;
        this.f335086c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120487f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335084a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f335085b.f335129k;
            this.f335084a = 1;
            if (zVar.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        this.f335086c.mo104773e(C120510g.CLIENT_REQUESTED);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120487f(this.f335085b, this.f335086c, gVar);
    }
}
