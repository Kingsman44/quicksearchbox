package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.android.libraries.search.p2904c.p2908b.C37389m;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.audiosourcedataaccessor.AudioAdapterAudioSourceDataAccessor$closeAudioSourceInternal$3", mo61344c = "AudioAdapterAudioSourceDataAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {213})
/* renamed from: com.google.android.libraries.search.c.t.b.a.c */
/* compiled from: PG */
final class C37994c extends C69572j implements C69626l {

    /* renamed from: a */
    int f100657a;

    /* renamed from: b */
    final /* synthetic */ C37336c f100658b;

    /* renamed from: c */
    final /* synthetic */ C38006o f100659c;

    /* renamed from: d */
    final /* synthetic */ C37389m f100660d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37994c(C37336c cVar, C38006o oVar, C37389m mVar, C69577g gVar) {
        super(1, gVar);
        this.f100658b = cVar;
        this.f100659c = oVar;
        this.f100660d = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C37994c(this.f100658b, this.f100659c, this.f100660d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100657a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f100658b.mo40885b().mo40891i();
            C60870cx f = this.f100659c.f100689d.mo24476f((C37390n) this.f100660d.build());
            C69664n.m101060f(f, "audioAdapter.stopListeni…topParamsBuilder.build())");
            this.f100657a = 1;
            obj = C71663i.m104690c(f, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
