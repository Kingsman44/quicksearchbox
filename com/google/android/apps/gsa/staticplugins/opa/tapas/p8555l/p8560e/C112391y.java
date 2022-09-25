package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p386ak.C8406v;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5187e.C66361k;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.y */
/* compiled from: PG */
public final /* synthetic */ class C112391y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311829a;

    /* renamed from: b */
    public final /* synthetic */ Instant f311830b;

    public /* synthetic */ C112391y(C112312ag agVar, Instant instant) {
        this.f311829a = agVar;
        this.f311830b = instant;
    }

    public final void run() {
        C112312ag agVar = this.f311829a;
        Instant instant = this.f311830b;
        synchronized (agVar) {
            if (!agVar.f311682n.isEmpty()) {
                int i = 0;
                while (true) {
                    C66278a aVar = agVar.f311681m.f180433a;
                    if (i < aVar.f180248b) {
                        C66376a aVar2 = (C66376a) aVar.mo59448a(i);
                        if (aVar2.mo59467j().mo59503c() >= instant.toEpochMilli()) {
                            String c = aVar2.mo59460c();
                            C112341bi biVar = (C112341bi) agVar.f311682n.get();
                            Optional empty = Optional.empty();
                            try {
                                empty = Optional.ofNullable((Map) C112341bi.f311730c.mo17147e(aVar2.mo59459b(), new C112340bh().f164813a));
                            } catch (C8406v e) {
                                C59104x d = C112341bi.f311729b.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "ReflectEnsemble");
                                ((C59052c) ((C59052c) d).mo56372aa(27711)).mo56389s("Failed to parse the target id map, only train on predictors that expect the fulfillment id. %s", e);
                            }
                            if (empty.isEmpty()) {
                                C59104x d2 = C112341bi.f311729b.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "ReflectEnsemble");
                                ((C59052c) ((C59052c) d2).mo56372aa(27710)).mo56386p("Got an empty string for the serialized id map, only train on predictors that expect the fulfillment id.");
                                boolean z = false;
                                for (C66361k kVar : biVar.f180453g) {
                                    if (C112341bi.f311731d.contains(C112341bi.m186203a(kVar))) {
                                        kVar.mo59596n(aVar2);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    biVar.f180452f++;
                                }
                            } else {
                                for (C66361k kVar2 : biVar.f180453g) {
                                    String str = (String) ((Map) empty.get()).get(kVar2.mo59575e());
                                    if (str != null) {
                                        aVar2.mo59469l(str);
                                        kVar2.mo59596n(aVar2);
                                    }
                                }
                                biVar.f180452f++;
                            }
                            aVar2.mo59469l(c);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
