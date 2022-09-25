package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.C33575a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5583i.C71780f;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioApiAudioFocusPolicyImpl$acquireMicFocus$1$sessionLost$1", mo61344c = "AudioApiAudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {160})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.i */
/* compiled from: PG */
final class C120461i extends C69572j implements C69630p {

    /* renamed from: a */
    int f335024a;

    /* renamed from: b */
    final /* synthetic */ C33575a f335025b;

    /* renamed from: c */
    final /* synthetic */ C71816z f335026c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120461i(C33575a aVar, C71816z zVar, C69577g gVar) {
        super(2, gVar);
        this.f335025b = aVar;
        this.f335026c = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120461i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335024a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33575a aVar2 = this.f335025b;
            C71816z zVar = this.f335026c;
            this.f335024a = 1;
            C71780f fVar = new C71780f(this);
            try {
                fVar.mo63014a(C71663i.m104691d(aVar2.mo38991a()).mo62827g(), new C120459g((C69577g) null));
                fVar.mo63014a(zVar, new C120460h((C69577g) null));
            } catch (Throwable th) {
                fVar.mo63021x(th);
            }
            if (fVar.mo63016f() == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120461i(this.f335025b, this.f335026c, gVar);
    }
}
