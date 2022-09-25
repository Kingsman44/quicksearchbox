package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.location.C131763ad;
import com.google.android.gms.semanticlocation.PlaceEnterEvent;
import com.google.android.gms.semanticlocation.PlaceExitEvent;
import com.google.android.gms.semanticlocation.PlaceOngoingEvent;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53694as;
import com.google.assistant.p4016z.C53695at;
import com.google.assistant.p4016z.C53697av;
import com.google.assistant.p4016z.C53698aw;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import com.google.assistant.p4016z.C53722g;
import com.google.assistant.p4016z.C53723h;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.y */
/* compiled from: PG */
public final /* synthetic */ class C131813y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f360007a;

    /* renamed from: b */
    public final /* synthetic */ Intent f360008b;

    public /* synthetic */ C131813y(C131763ad adVar, Intent intent) {
        this.f360007a = adVar;
        this.f360008b = intent;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        boolean z;
        Optional optional;
        C131763ad adVar = this.f360007a;
        Intent intent = this.f360008b;
        if (!((Boolean) obj).booleanValue()) {
            return C47633f.m84733g(adVar.mo110305g(C58837ba.m90858g(intent.getDataString()))).mo51516i(new C131791c(adVar), adVar.f359938e);
        }
        adVar.f359937d.mo109945r(false, false);
        SemanticLocationState a = SemanticLocationState.m237751a(intent);
        if (a == null) {
            ((C58970a) ((C58970a) adVar.f359943j.mo56226d()).mo56372aa(39358)).mo56386p("semanticLocationState is null");
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C131778ar arVar = adVar.f359942i;
            C58480gp e = C58485gu.m89837e();
            C58480gp e2 = C58485gu.m89837e();
            C58480gp e3 = C58485gu.m89837e();
            ((C58970a) ((C58970a) arVar.f359958a.mo56224b()).mo56372aa(39367)).mo56388r("last CSL timestamp in seconds: %d", a.f394628b);
            Iterator it = a.f394627a.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                SemanticLocationEvent semanticLocationEvent = (SemanticLocationEvent) it.next();
                int i = semanticLocationEvent.f394619c;
                if (i == 2) {
                    PlaceExitEvent placeExitEvent = semanticLocationEvent.f394621e;
                    placeExitEvent.getClass();
                    e.mo55395g(placeExitEvent);
                    arVar.mo110312b(a, semanticLocationEvent, 4);
                } else if (i == 1) {
                    PlaceEnterEvent placeEnterEvent = semanticLocationEvent.f394620d;
                    placeEnterEvent.getClass();
                    e2.mo55395g(placeEnterEvent);
                    arVar.mo110312b(a, semanticLocationEvent, 2);
                } else if (i == 3) {
                    PlaceOngoingEvent placeOngoingEvent = semanticLocationEvent.f394622f;
                    placeOngoingEvent.getClass();
                    e3.mo55395g(placeOngoingEvent);
                    arVar.mo110312b(a, semanticLocationEvent, 3);
                }
            }
            C58485gu f = e.mo55394f();
            C58485gu f2 = e2.mo55394f();
            C58485gu f3 = e3.mo55394f();
            if (f2.isEmpty() && f3.isEmpty() && f.isEmpty()) {
                ((C58970a) ((C58970a) arVar.f359958a.mo56224b()).mo56372aa(39368)).mo56386p("Received a non-place event from CSL");
                optional = Optional.empty();
            } else if (!f2.isEmpty() || !f3.isEmpty()) {
                Optional max = Collection.EL.stream(f2).max(Comparator.CC.comparingDouble(C131776ap.f359956a));
                Optional max2 = Collection.EL.stream(f3).max(Comparator.CC.comparingDouble(C131777aq.f359957a));
                if (!max.isPresent()) {
                    C53722g gVar = (C53722g) C53723h.f141037b.createBuilder();
                    C53695at atVar = (C53695at) C53698aw.f140958e.createBuilder();
                    C53694as a2 = arVar.mo110311a(((PlaceOngoingEvent) max2.get()).f394608d);
                    atVar.copyOnWrite();
                    C53698aw awVar = (C53698aw) atVar.instance;
                    a2.getClass();
                    awVar.f140962c = a2;
                    awVar.f140960a |= 2;
                    atVar.copyOnWrite();
                    C53698aw awVar2 = (C53698aw) atVar.instance;
                    awVar2.f140963d = 2;
                    awVar2.f140960a |= 4;
                    gVar.mo54010a(atVar);
                    optional = Optional.m71637of((C53723h) gVar.build());
                } else if (!max2.isPresent()) {
                    C53722g gVar2 = (C53722g) C53723h.f141037b.createBuilder();
                    C53695at atVar2 = (C53695at) C53698aw.f140958e.createBuilder();
                    C53694as a3 = arVar.mo110311a(((PlaceEnterEvent) max.get()).f394598d);
                    atVar2.copyOnWrite();
                    C53698aw awVar3 = (C53698aw) atVar2.instance;
                    a3.getClass();
                    awVar3.f140962c = a3;
                    awVar3.f140960a |= 2;
                    atVar2.copyOnWrite();
                    C53698aw awVar4 = (C53698aw) atVar2.instance;
                    awVar4.f140963d = 1;
                    awVar4.f140960a |= 4;
                    gVar2.mo54010a(atVar2);
                    optional = Optional.m71637of((C53723h) gVar2.build());
                } else if (((PlaceEnterEvent) max.get()).f394596b >= ((PlaceOngoingEvent) max2.get()).f394606b) {
                    C53722g gVar3 = (C53722g) C53723h.f141037b.createBuilder();
                    C53695at atVar3 = (C53695at) C53698aw.f140958e.createBuilder();
                    C53694as a4 = arVar.mo110311a(((PlaceEnterEvent) max.get()).f394598d);
                    atVar3.copyOnWrite();
                    C53698aw awVar5 = (C53698aw) atVar3.instance;
                    a4.getClass();
                    awVar5.f140962c = a4;
                    awVar5.f140960a |= 2;
                    atVar3.copyOnWrite();
                    C53698aw awVar6 = (C53698aw) atVar3.instance;
                    awVar6.f140963d = 1;
                    awVar6.f140960a |= 4;
                    gVar3.mo54010a(atVar3);
                    optional = Optional.m71637of((C53723h) gVar3.build());
                } else {
                    C53722g gVar4 = (C53722g) C53723h.f141037b.createBuilder();
                    C53695at atVar4 = (C53695at) C53698aw.f140958e.createBuilder();
                    C53694as a5 = arVar.mo110311a(((PlaceOngoingEvent) max2.get()).f394608d);
                    atVar4.copyOnWrite();
                    C53698aw awVar7 = (C53698aw) atVar4.instance;
                    a5.getClass();
                    awVar7.f140962c = a5;
                    awVar7.f140960a |= 2;
                    atVar4.copyOnWrite();
                    C53698aw awVar8 = (C53698aw) atVar4.instance;
                    awVar8.f140963d = 2;
                    awVar8.f140960a |= 4;
                    gVar4.mo54010a(atVar4);
                    optional = Optional.m71637of((C53723h) gVar4.build());
                }
            } else {
                Optional max3 = Collection.EL.stream(f).max(Comparator.CC.comparingDouble(C131775ao.f359955a));
                C53722g gVar5 = (C53722g) C53723h.f141037b.createBuilder();
                C53695at atVar5 = (C53695at) C53698aw.f140958e.createBuilder();
                atVar5.copyOnWrite();
                C53698aw awVar9 = (C53698aw) atVar5.instance;
                awVar9.f140963d = 3;
                awVar9.f140960a |= 4;
                C53694as a6 = arVar.mo110311a(((PlaceExitEvent) max3.get()).f394603d);
                atVar5.copyOnWrite();
                C53698aw awVar10 = (C53698aw) atVar5.instance;
                a6.getClass();
                awVar10.f140962c = a6;
                awVar10.f140960a |= 2;
                C53698aw awVar11 = (C53698aw) atVar5.build();
                gVar5.copyOnWrite();
                C53723h hVar = (C53723h) gVar5.instance;
                awVar11.getClass();
                hVar.mo54011a();
                hVar.f141039a.add(awVar11);
                optional = Optional.m71637of((C53723h) gVar5.build());
            }
            if (!optional.isPresent()) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                if (adVar.f359939f.isPresent()) {
                    C53723h hVar2 = (C53723h) optional.get();
                    C46459k.m82829b(((C131759a) adVar.f359939f.get()).mo110302a(), "Failed to update csl state", new Object[0]);
                }
                if (((C53723h) optional.get()).f141039a.size() != 1) {
                    z = false;
                }
                C58838bb.m90869d(z, "Should have only one event");
                C53698aw awVar12 = (C53698aw) ((C53723h) optional.get()).f141039a.get(0);
                int a7 = C53697av.m86886a(awVar12.f140963d);
                if (a7 != 0 && a7 == 4) {
                    C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
                    C106588b bVar = C106588b.f297185b;
                    bkVar.copyOnWrite();
                    C53715bm bmVar = (C53715bm) bkVar.instance;
                    bVar.getClass();
                    bmVar.f141024b = bVar;
                    bmVar.f141023a = 12;
                    cxVar = C60856cj.m92900i(Optional.m71637of((C53715bm) bkVar.build()));
                } else {
                    cxVar = C47633f.m84733g(adVar.f359935b.mo104411a(C131763ad.C131764a.class)).mo51515h(C131806r.f360000a, adVar.f359938e).mo51516i(new C131807s(awVar12), adVar.f359938e).mo51515h(C131808t.f360002a, adVar.f359938e);
                }
            }
        }
        return C47633f.m84733g(cxVar).mo51516i(new C131792d(adVar), adVar.f359938e);
    }
}
