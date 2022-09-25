package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11686aq;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11687ar;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11689at;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.an */
/* compiled from: PG */
final /* synthetic */ class C11492an implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C11494ap f37345a;

    public C11492an(C11494ap apVar) {
        this.f37345a = apVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C11689at atVar = (C11689at) obj;
        C69664n.m101061g(atVar, "p0");
        C11494ap apVar = this.f37345a;
        C11686aq aqVar = (C11686aq) C11687ar.f37682e.createBuilder();
        aqVar.copyOnWrite();
        C11687ar arVar = (C11687ar) aqVar.instance;
        arVar.f37687d = atVar.f37699j;
        arVar.f37684a |= 1;
        switch (atVar.ordinal()) {
            case 1:
                boolean e = apVar.f37350d.f37198c.mo19961e();
                aqVar.copyOnWrite();
                C11687ar arVar2 = (C11687ar) aqVar.instance;
                arVar2.f37685b = 2;
                arVar2.f37686c = Boolean.valueOf(e);
                return C60856cj.m92900i(aqVar.build());
            case 2:
                return C60922j.m93044g((C60870cx) apVar.f37357k.mo6453a(), C47810es.m84963c(new C11488aj(aqVar)), apVar.f37352f);
            case 3:
                return C47633f.m84733g(apVar.f37349c.mo50215b(apVar.f37348b)).mo51515h(new C11489ak(aqVar), apVar.f37352f).mo51513e(C46167as.class, new C11490al(aqVar), apVar.f37352f);
            case 4:
                return C60922j.m93044g(apVar.f37351e.mo23063b(), C47810es.m84963c(new C11491am(aqVar)), apVar.f37352f);
            case 5:
                Object b = apVar.f37355i.mo17428b();
                C69664n.m101060f(b, "mediaRecEnabled.get()");
                boolean booleanValue = ((Boolean) b).booleanValue();
                aqVar.copyOnWrite();
                C11687ar arVar3 = (C11687ar) aqVar.instance;
                arVar3.f37685b = 2;
                arVar3.f37686c = Boolean.valueOf(booleanValue);
                return C60856cj.m92900i(aqVar.build());
            case 6:
                Object b2 = apVar.f37356j.mo17428b();
                C69664n.m101060f(b2, "assistantTranscriptionEnabled.get()");
                boolean booleanValue2 = ((Boolean) b2).booleanValue();
                aqVar.copyOnWrite();
                C11687ar arVar4 = (C11687ar) aqVar.instance;
                arVar4.f37685b = 2;
                arVar4.f37686c = Boolean.valueOf(booleanValue2);
                return C60856cj.m92900i(aqVar.build());
            case 7:
                Object b3 = apVar.f37353g.mo17428b();
                C69664n.m101060f(b3, "directReplyEnabled.get()");
                boolean booleanValue3 = ((Boolean) b3).booleanValue();
                aqVar.copyOnWrite();
                C11687ar arVar5 = (C11687ar) aqVar.instance;
                arVar5.f37685b = 2;
                arVar5.f37686c = Boolean.valueOf(booleanValue3);
                return C60856cj.m92900i(aqVar.build());
            case 8:
                Object b4 = apVar.f37354h.mo17428b();
                C69664n.m101060f(b4, "proactiveReadMessageEnabled.get()");
                boolean booleanValue4 = ((Boolean) b4).booleanValue();
                aqVar.copyOnWrite();
                C11687ar arVar6 = (C11687ar) aqVar.instance;
                arVar6.f37685b = 2;
                arVar6.f37686c = Boolean.valueOf(booleanValue4);
                return C60856cj.m92900i(aqVar.build());
            default:
                return C60856cj.m92899h(new IllegalArgumentException("Unsupported Setting Key : ".concat(String.valueOf(atVar.name()))));
        }
    }
}
