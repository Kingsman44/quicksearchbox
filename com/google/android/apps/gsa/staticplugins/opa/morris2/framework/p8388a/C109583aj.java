package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.aj */
/* compiled from: PG */
final class C109583aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109585al f305195a;

    public C109583aj(C109585al alVar) {
        this.f305195a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109585al.f305198a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24895)).mo56386p("Failed to read driving settings from Geller when updating eligibility status and DS visited status");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C14782b bVar = (C14782b) obj;
        if (this.f305195a.f305205h.isEmpty()) {
            C59104x c = C109585al.f305198a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(24896)).mo56386p("driving settings is not present when enabling Morris Mini and updating DS visited status for user");
            return;
        }
        C52685ar arVar = (C52685ar) ((C52686as) this.f305195a.f305205h.get()).toBuilder();
        C109585al alVar = this.f305195a;
        C52690aw a = C52690aw.m86687a(((C52686as) arVar.instance).f138307o);
        if (a == null) {
            a = C52690aw.DEFAULT;
        }
        if (!a.equals(C52690aw.ENABLED)) {
            C52690aw a2 = C52690aw.m86687a(((C52686as) arVar.instance).f138307o);
            if (a2 == null) {
                a2 = C52690aw.DEFAULT;
            }
            if (!a2.equals(C52690aw.OPTED_OUT) || alVar.f305203f.mo79746e(C90051dc.f248804aL)) {
                C59104x b = C109585al.f305198a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
                ((C59052c) ((C59052c) b).mo56372aa(24915)).mo56386p("Morris Mini not enabled, Updating Eligibility");
                C52690aw awVar = C52690aw.ENABLED;
                arVar.copyOnWrite();
                C52686as asVar = (C52686as) arVar.instance;
                asVar.f138307o = awVar.f138318g;
                asVar.f138293a |= C89885b.NOW_VALUE;
                arVar.copyOnWrite();
                C52686as asVar2 = (C52686as) arVar.instance;
                asVar2.f138293a |= 32;
                asVar2.f138298f = true;
                this.f305195a.mo97909j((C52686as) arVar.build());
            }
        }
        if (((C52686as) arVar.instance).f138298f) {
            return;
        }
        arVar.copyOnWrite();
        C52686as asVar22 = (C52686as) arVar.instance;
        asVar22.f138293a |= 32;
        asVar22.f138298f = true;
        this.f305195a.mo97909j((C52686as) arVar.build());
    }
}
