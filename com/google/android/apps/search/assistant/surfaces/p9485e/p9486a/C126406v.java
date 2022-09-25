package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.apps.gsa.binaries.satin.app.aob;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32567d;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32574k;
import com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32577b;
import com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32587l;
import com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32590o;
import com.google.android.libraries.search.p2904c.C37352aq;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37421bz;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.audio.AudioInput$openAsync$1", mo61344c = "AudioInput.kt", mo61345d = "invokeSuspend", mo61346e = {48})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.v */
/* compiled from: PG */
public final class C126406v extends C69572j implements C69630p {

    /* renamed from: a */
    int f348151a;

    /* renamed from: b */
    final /* synthetic */ C126407w f348152b;

    /* renamed from: c */
    final /* synthetic */ C126377ae f348153c;

    /* renamed from: d */
    final /* synthetic */ C71422aw f348154d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126406v(C126407w wVar, C126377ae aeVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f348152b = wVar;
        this.f348153c = aeVar;
        this.f348154d = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126406v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348151a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126376ad adVar = this.f348152b.f348156b;
            C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
            C69664n.m101060f(bnVar, "newBuilder()");
            C37421bz a = C69664n.m101061g(bnVar, "builder");
            C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
            C69664n.m101060f(avVar, "newBuilder()");
            C37352aq a2 = C69664n.m101061g(avVar, "builder");
            C37357av avVar2 = a2.f99210a;
            avVar2.copyOnWrite();
            C37360ay ayVar = (C37360ay) avVar2.instance;
            ayVar.f99226a |= 8;
            ayVar.f99230e = 2;
            C37357av avVar3 = a2.f99210a;
            avVar3.copyOnWrite();
            C37360ay ayVar2 = (C37360ay) avVar3.instance;
            ayVar2.f99226a = 2 | ayVar2.f99226a;
            ayVar2.f99228c = 16000;
            C37357av avVar4 = a2.f99210a;
            avVar4.copyOnWrite();
            C37360ay ayVar3 = (C37360ay) avVar4.instance;
            ayVar3.f99226a |= 4;
            ayVar3.f99229d = 16;
            a2.mo40898b();
            a.mo40945b(a2.mo40897a());
            C37410bo a3 = a.mo40944a();
            C71422aw awVar = this.f348154d;
            C69664n.m101061g(a3, "audioRequestMicInputParams");
            C69664n.m101061g(awVar, "scope");
            C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C126375ac(adVar, a3, awVar, (C69577g) null), 3);
            this.f348151a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C126373aa aaVar = (C126373aa) obj;
        C71647ct.m104638b(this.f348154d.mo5702lZ()).mo62873s(new C126405u(aaVar));
        C32574k a4 = this.f348152b.f348157c.mo66631a(new C32567d(16000, 1));
        aob aob = this.f348152b.f348158d;
        Duration duration = Duration.ZERO;
        Duration ofMillis = Duration.ofMillis(200);
        C69664n.m101060f(ofMillis, "ofMillis(200)");
        C69664n.m101060f(duration, "ZERO");
        return new C126404t(aaVar, this.f348153c, a4, new C32587l(new C32577b(ofMillis, duration), (C69585o) aob.f199104a.a.bx.mo17428b(), (C32590o) aob.f199104a.a.d.f201538ax.mo17428b()));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126406v(this.f348152b, this.f348153c, this.f348154d, gVar);
    }
}
