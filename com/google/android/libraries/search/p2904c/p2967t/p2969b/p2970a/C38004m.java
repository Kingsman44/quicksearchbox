package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.audiosourcedataaccessor.AudioAdapterAudioSourceDataAccessor$writeableAudioBufferData$2$1", mo61344c = "AudioAdapterAudioSourceDataAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.b.a.m */
/* compiled from: PG */
final class C38004m extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38006o f100684a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38004m(C38006o oVar, C69577g gVar) {
        super(1, gVar);
        this.f100684a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38004m(this.f100684a, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (this.f100684a.f100687b.mo56113h()) {
            C59052c cVar = (C59052c) C38006o.f100686a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ALT.AdapterSrcAccessor");
            int i = this.f100684a.f100688c;
            cVar.mo56379ah(new C59094n(52935));
            cVar.mo56387q("#audio# audio request session(token(%d)) opening source", i);
        } else {
            C59052c cVar2 = (C59052c) C38006o.f100686a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "ALT.AdapterSrcAccessor");
            int i2 = this.f100684a.f100688c;
            cVar2.mo56379ah(new C59094n(52934));
            cVar2.mo56387q("#audio# hotword session(token(%d)) opening source", i2);
        }
        C38006o oVar = this.f100684a;
        C37363a aVar2 = oVar.f100689d;
        C37388l lVar = oVar.f100690e.f99305b;
        if (lVar == null) {
            lVar = C37388l.f99307e;
        }
        return aVar2.mo24473c(lVar);
    }
}
