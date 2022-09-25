package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120421a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioFocus$2$1", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {157})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.i */
/* compiled from: PG */
final class C120490i extends C69572j implements C69630p {

    /* renamed from: a */
    int f335092a;

    /* renamed from: b */
    final /* synthetic */ C120421a f335093b;

    /* renamed from: c */
    final /* synthetic */ C119906y f335094c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120490i(C120421a aVar, C119906y yVar, C69577g gVar) {
        super(2, gVar);
        this.f335093b = aVar;
        this.f335094c = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120490i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C60870cx a;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335092a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                if (this.f335094c.f333916b) {
                    C59052c cVar = (C59052c) C120498q.f335119a.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
                    C59052c cVar2 = (C59052c) cVar.mo56382g(th);
                    cVar2.mo56379ah(new C59094n(35471));
                    cVar2.mo56386p("Audio Focus loss ignored");
                } else {
                    throw th;
                }
            }
        } else {
            C69714l.m101134b(obj);
            C120421a aVar2 = this.f335093b;
            if (!(aVar2 == null || (a = aVar2.mo104748a()) == null)) {
                this.f335092a = 1;
                obj = C71663i.m104690c(a, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return C69788q.f186170a;
        }
        Void voidR = (Void) obj;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120490i(this.f335093b, this.f335094c, gVar);
    }
}
