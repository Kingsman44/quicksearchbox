package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2977w.p2979b.p2981b.C38150a;
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

@C69567e(mo61343b = "com.google.android.libraries.search.audio.routing.restricted.impl.AudioRouteDisconnectorImpl$disconnectAudioAdapterRoute$1", mo61344c = "AudioRouteDisconnectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {139})
/* renamed from: com.google.android.libraries.search.c.w.b.a.c */
/* compiled from: PG */
final class C38143c extends C69572j implements C69626l {

    /* renamed from: a */
    int f101060a;

    /* renamed from: b */
    final /* synthetic */ C38148h f101061b;

    /* renamed from: c */
    final /* synthetic */ C37384h f101062c;

    /* renamed from: d */
    final /* synthetic */ C37500dg f101063d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38143c(C38148h hVar, C37384h hVar2, C37500dg dgVar, C69577g gVar) {
        super(1, gVar);
        this.f101061b = hVar;
        this.f101062c = hVar2;
        this.f101063d = dgVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38143c(this.f101061b, this.f101062c, this.f101063d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101060a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C38148h hVar = this.f101061b;
            C60870cx b = hVar.mo41283b(hVar.f101080e, hVar.f101079d, new C38142b(hVar, this.f101062c, this.f101063d, (C69577g) null));
            this.f101060a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "private fun disconnectAu…FAILURE\n      }\n    }\n  }");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C38148h hVar2 = this.f101061b;
        C37895i iVar = hVar2.f101078c;
        C37384h hVar3 = this.f101062c;
        iVar.mo41116q(hVar3, hVar2.f101077b.mo40910d(hVar3), false);
        if (booleanValue) {
            return C38150a.STATUS_SUCCESS;
        }
        return C38150a.STATUS_UNEXPECTED_FAILURE;
    }
}
