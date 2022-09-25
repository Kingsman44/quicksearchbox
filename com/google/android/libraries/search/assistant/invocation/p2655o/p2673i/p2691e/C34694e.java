package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2691e;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2627b.C33873a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34045bh;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34079co;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34080cp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34082cr;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34696f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34699i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34701k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.e.e */
/* compiled from: PG */
final class C34694e implements C33873a {

    /* renamed from: a */
    final /* synthetic */ C68214a f92114a;

    public C34694e(C68214a aVar) {
        this.f92114a = aVar;
    }

    /* renamed from: a */
    public final void mo39100a(C33514d dVar, Bundle bundle, int i) {
        C34080cp cpVar;
        C34693d dVar2 = (C34693d) this.f92114a.mo27525b();
        if (bundle == null) {
            C34079co coVar = (C34079co) C34080cp.f90803i.createBuilder();
            C69664n.m101060f(coVar, "newBuilder()");
            C34082cr a = C69664n.m101061g(coVar, "builder");
            C34079co coVar2 = a.f90813a;
            coVar2.copyOnWrite();
            C34080cp cpVar2 = (C34080cp) coVar2.instance;
            cpVar2.f90805a |= 1;
            cpVar2.f90806b = i;
            cpVar = a.mo39209a();
        } else {
            C34079co coVar3 = (C34079co) C34080cp.f90803i.createBuilder();
            C69664n.m101060f(coVar3, "newBuilder()");
            C34082cr a2 = C69664n.m101061g(coVar3, "builder");
            C34079co coVar4 = a2.f90813a;
            coVar4.copyOnWrite();
            C34080cp cpVar3 = (C34080cp) coVar4.instance;
            cpVar3.f90805a |= 1;
            cpVar3.f90806b = i;
            Integer a3 = C34692c.m63424a(bundle, "invocation_type");
            if (a3 != null) {
                int intValue = a3.intValue();
                C34079co coVar5 = a2.f90813a;
                coVar5.copyOnWrite();
                C34080cp cpVar4 = (C34080cp) coVar5.instance;
                cpVar4.f90805a |= 2;
                cpVar4.f90807c = intValue;
            }
            Long b = C34692c.m63425b(bundle, "invocation_time_ms");
            if (b != null) {
                long longValue = b.longValue();
                C34079co coVar6 = a2.f90813a;
                coVar6.copyOnWrite();
                C34080cp cpVar5 = (C34080cp) coVar6.instance;
                cpVar5.f90805a |= 4;
                cpVar5.f90808d = longValue;
            }
            Integer a4 = C34692c.m63424a(bundle, "invocation_phone_state");
            if (a4 != null) {
                int intValue2 = a4.intValue();
                C34079co coVar7 = a2.f90813a;
                coVar7.copyOnWrite();
                C34080cp cpVar6 = (C34080cp) coVar7.instance;
                cpVar6.f90805a |= 8;
                cpVar6.f90809e = intValue2;
            }
            Long b2 = C34692c.m63425b(bundle, "latency_id");
            if (b2 != null) {
                long longValue2 = b2.longValue();
                C34079co coVar8 = a2.f90813a;
                coVar8.copyOnWrite();
                C34080cp cpVar7 = (C34080cp) coVar8.instance;
                cpVar7.f90805a |= 16;
                cpVar7.f90810f = longValue2;
            }
            Integer a5 = C34692c.m63424a(bundle, "assistant_launch_mode");
            if (a5 != null) {
                int intValue3 = a5.intValue();
                C34079co coVar9 = a2.f90813a;
                coVar9.copyOnWrite();
                C34080cp cpVar8 = (C34080cp) coVar9.instance;
                cpVar8.f90805a |= 32;
                cpVar8.f90811g = intValue3;
            }
            Integer a6 = C34692c.m63424a(bundle, "triggered_by");
            if (a6 != null) {
                int intValue4 = a6.intValue();
                C34079co coVar10 = a2.f90813a;
                coVar10.copyOnWrite();
                C34080cp cpVar9 = (C34080cp) coVar10.instance;
                cpVar9.f90805a |= 64;
                cpVar9.f90812h = intValue4;
            }
            cpVar = a2.mo39209a();
        }
        C34666c cVar = (C34666c) C34684d.f92090g.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C34701k a7 = C69664n.m101061g(cVar, "builder");
        a7.mo39467b(C34043bf.ENTRYPOINT_SESSION);
        C34036az azVar = (C34036az) C34038ba.f90707h.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C34045bh a8 = C69664n.m101061g(azVar, "builder");
        C69664n.m101061g(cpVar, "value");
        C34036az azVar2 = a8.f90745a;
        azVar2.copyOnWrite();
        C34038ba baVar = (C34038ba) azVar2.instance;
        cpVar.getClass();
        baVar.f90713e = cpVar;
        baVar.f90709a |= 8;
        a7.mo39469d(a8.mo39195a());
        C34696f fVar = (C34696f) C34697g.f92115a.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C34699i a9 = C69664n.m101061g(fVar, "builder");
        C62940bt btVar = C34691b.f92109d;
        C69664n.m101060f(btVar, "sessionInvocationInputExtras");
        C34690a aVar = (C34690a) C34691b.f92108c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        long j = dVar.f89676a;
        aVar.copyOnWrite();
        C34691b bVar = (C34691b) aVar.instance;
        bVar.f92111a |= 1;
        bVar.f92112b = j;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        a9.mo39465b(btVar, (C34691b) build);
        a7.mo39468c(a9.mo39464a());
        C46459k.m82829b(dVar2.f92113a.mo39276a(a7.mo39466a()), "Invocation propagation failed.", new Object[0]);
    }
}
