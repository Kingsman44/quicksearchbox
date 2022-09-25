package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38091o;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$LocalAudioRecordingCallback$onRecordingConfigChanged$1", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.c.a.a */
/* compiled from: PG */
final class C38058a extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38070m f100839a;

    /* renamed from: b */
    final /* synthetic */ List f100840b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38058a(C38070m mVar, List list, C69577g gVar) {
        super(1, gVar);
        this.f100839a = mVar;
        this.f100840b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38058a(this.f100839a, this.f100840b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C38091o e = this.f100839a.mo41234e(this.f100840b);
        C62971cq cqVar = e.f100922a;
        C69664n.m101060f(cqVar, "micStateUpdateDelta.deltasList");
        if (!cqVar.isEmpty()) {
            C38070m mVar = this.f100839a;
            mVar.mo41236g(mVar.mo41233d(), e);
        }
        return C69788q.f186170a;
    }
}
