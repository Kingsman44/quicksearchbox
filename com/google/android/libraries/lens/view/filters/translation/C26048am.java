package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4707j.C62470ct;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4711m.C62632i;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.am */
/* compiled from: PG */
final class C26048am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C26059ax f70770a;

    public C26048am(C26059ax axVar) {
        this.f70770a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56225c()).mo56382g(th)).mo56372aa(49374)).mo56386p("Unable to retrieve languagepack download states.");
        this.f70770a.f70796J = false;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C62470ct ctVar;
        C62470ct ctVar2;
        C58495hd hdVar = (C58495hd) obj;
        this.f70770a.f70830t.mo5708l(C26059ax.m48090b(hdVar));
        C26059ax axVar = this.f70770a;
        if (C62632i.m94823h(axVar.f70821k.mo32701h())) {
            C62471cu v = axVar.f70821k.mo32717v();
            if (v.f168678a == 2) {
                ctVar = (C62470ct) v.f168679b;
            } else {
                ctVar = C62470ct.f168670e;
            }
            if (ctVar.f168675d.size() != 0) {
                C62471cu v2 = axVar.f70821k.mo32717v();
                if (v2.f168678a == 2) {
                    ctVar2 = (C62470ct) v2.f168679b;
                } else {
                    ctVar2 = C62470ct.f168670e;
                }
                for (String forLanguageTag : ctVar2.f168675d) {
                    Locale forLanguageTag2 = Locale.forLanguageTag(forLanguageTag);
                    if (axVar.f70819i.mo33436i(forLanguageTag2).equals(C25327c.DOWNLOADABLE)) {
                        axVar.f70819i.mo33440m(forLanguageTag2);
                    }
                }
            }
        }
        C26059ax axVar2 = this.f70770a;
        if (axVar2.f70797K) {
            ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49403)).mo56386p("Already synced with BC settings.");
        } else {
            axVar2.f70797K = true;
            if (!axVar2.f70823m) {
                ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49402)).mo56386p("Config flag bluechip language settings sync is not enabled.");
            } else if (!axVar2.f70820j.mo56113h()) {
                ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49401)).mo56386p("SettingsSyncManager is not present.");
            } else {
                ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49400)).mo56386p("syncBluechipLanguageSettings");
                C60870cx d = C28122k.m52404d(axVar2.f70814d, axVar2.f70817g);
                C26051ap apVar = new C26051ap(axVar2);
                C60856cj.m92911t(d, C47810es.m84974n(apVar), axVar2.f70818h);
            }
        }
        this.f70770a.f70799M = C58833ax.m90834k((C58528ij) Collection.EL.stream(hdVar.entrySet()).filter(C26046ak.f70768a).map(C26047al.f70769a).collect(C58370cn.f155947b));
    }
}
