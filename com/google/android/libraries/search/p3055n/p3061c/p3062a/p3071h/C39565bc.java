package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p3055n.p3056a.C39241a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60945d;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C67126m;
import com.google.speech.p5218j.C67153n;
import com.google.speech.p5218j.p5219a.C66744k;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66746m;
import com.google.speech.p5218j.p5219a.C66750q;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.util.concurrent.Callable;
import p3186j$.time.Instant;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71022bv;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71023bw;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bc */
/* compiled from: PG */
public final /* synthetic */ class C39565bc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104147a;

    public /* synthetic */ C39565bc(C39580br brVar) {
        this.f104147a = brVar;
    }

    public final Object call() {
        C39580br brVar = this.f104147a;
        C39536aa c = ((C39583bu) brVar.f104188u.mo56107c()).mo41921c();
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53766)).mo56359L("AudioFormat for Soda: sample rate : %s, channel count :  %s, encoding format :  %s", Integer.valueOf(c.mo41883b()), Integer.valueOf(c.mo41882a()), 2);
        C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
        boolean z = true;
        if (brVar.f104182o) {
            C59104x b2 = C39580br.f104168a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b2).mo56372aa(53768)).mo56386p("Using AudioBufferAndReplay algorithm to improve timestamp accuracy.");
            C19245ah.m36703k(rVar, c.mo41883b(), c.mo41882a());
        } else if (brVar.f104180m) {
            int i = true != c.mo41884c() ? 0 : -2500000;
            C59104x b3 = C39580br.f104168a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b3).mo56372aa(53767)).mo56387q("Applying NatCon-only timestamp accuracy adjustment of %d.", i);
            int b4 = c.mo41883b();
            int a = c.mo41882a();
            C60948g gVar = C60948g.f165068a;
            long a2 = C60945d.m93096a(Instant.now());
            C66744k kVar = (C66744k) C66745l.f181530c.createBuilder();
            C66746m h = C19245ah.m36700h(b4, a);
            h.copyOnWrite();
            C66750q qVar = (C66750q) h.instance;
            C66750q qVar2 = C66750q.f181536g;
            qVar.f181538a |= 64;
            qVar.f181543f = a2 + ((long) i);
            kVar.copyOnWrite();
            C66745l lVar = (C66745l) kVar.instance;
            C66750q qVar3 = (C66750q) h.build();
            qVar3.getClass();
            lVar.f181533b = qVar3;
            lVar.f181532a = 1;
            rVar.copyOnWrite();
            C66752s sVar = (C66752s) rVar.instance;
            C66745l lVar2 = (C66745l) kVar.build();
            lVar2.getClass();
            sVar.f181550e = lVar2;
            sVar.f181546a |= 8;
        } else {
            C19245ah.m36702j(rVar, c.mo41883b(), c.mo41882a());
        }
        rVar.copyOnWrite();
        C66752s sVar2 = (C66752s) rVar.instance;
        sVar2.f181546a |= 2;
        sVar2.f181548c = true;
        C67126m mVar = (C67126m) C67153n.f182543c.createBuilder();
        mVar.copyOnWrite();
        C67153n nVar = (C67153n) mVar.instance;
        nVar.f182546b = 2;
        nVar.f182545a = 2 | nVar.f182545a;
        rVar.copyOnWrite();
        C66752s sVar3 = (C66752s) rVar.instance;
        C67153n nVar2 = (C67153n) mVar.build();
        nVar2.getClass();
        sVar3.f181555j = nVar2;
        sVar3.f181546a |= 256;
        if (c.mo41884c()) {
            rVar.copyOnWrite();
            C66752s sVar4 = (C66752s) rVar.instance;
            sVar4.f181546a |= 4;
            sVar4.f181549d = 3000;
        }
        C66752s sVar5 = (C66752s) rVar.build();
        int i2 = ((Soda) brVar.f104186s.mo56107c()).mo24327d(sVar5).f150878a;
        if (i2 != 0) {
            z = false;
        }
        if (!z) {
            C71022bv bvVar = (C71022bv) C71023bw.f189405n.createBuilder();
            bvVar.copyOnWrite();
            C71023bw bwVar = (C71023bw) bvVar.instance;
            bwVar.f189407a |= 64;
            bwVar.f189414h = i2;
            brVar.mo41914l(C58833ax.m90834k((C71023bw) bvVar.build()), 5);
        }
        if (z && brVar.f104172e.mo56113h() && ((C39241a) brVar.f104172e.mo56107c()).mo41745d() && !((C39241a) brVar.f104172e.mo56107c()).mo41746e()) {
            if (brVar.f104177j.get() == C39579bq.STARTED) {
                C59104x c2 = C39580br.f104168a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
                ((C59052c) ((C59052c) c2).mo56372aa(53770)).mo56386p("Not connecting to ART; unexpectedly already in SodaState.STARTED");
            } else {
                brVar.f104185r = C60922j.m93045h(brVar.f104185r, C47810es.m84966f(new C39547al(brVar, sVar5)), brVar.f104174g);
                C46459k.m82829b(brVar.f104185r, "Failed to connect to ArtModelService!", new Object[0]);
            }
        }
        return Boolean.valueOf(z);
    }
}
