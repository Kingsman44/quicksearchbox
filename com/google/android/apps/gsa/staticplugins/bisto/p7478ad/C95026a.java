package com.google.android.apps.gsa.staticplugins.bisto.p7478ad;

import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89682u;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ad.a */
/* compiled from: PG */
public final class C95026a {

    /* renamed from: a */
    private static final C59071e f265862a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ad.a");

    /* renamed from: b */
    private final C89606ad f265863b;

    /* renamed from: c */
    private final C89682u f265864c;

    /* renamed from: d */
    private final C89656k f265865d;

    public C95026a(C89606ad adVar, C89682u uVar, C89656k kVar) {
        this.f265863b = adVar;
        this.f265864c = uVar;
        this.f265865d = kVar;
    }

    /* renamed from: c */
    private final boolean m156904c(C124548d dVar) {
        C58833ax b = this.f265864c.mo83585b(C58837ba.m90858g(this.f265863b.mo83457c()), dVar.mo106480U(), dVar.mo106479T());
        if (!b.mo56113h()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        b.mo56107c();
        dVar.mo106463D().toArray(C58471gg.f156097c);
        if (dVar.mo106494ah()) {
            C59104x b2 = f265862a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
            ((C59052c) ((C59052c) b2).mo56372aa(17921)).mo56386p("Device supports model upload");
            return true;
        }
        boolean contains = dVar.mo106463D().contains(b.mo56107c());
        C59104x b3 = f265862a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
        ((C59052c) ((C59052c) b3).mo56372aa(17920)).mo56389s("deviceHasCorrect1stStageHotwordModel: %b", Boolean.valueOf(contains));
        return contains;
    }

    /* renamed from: a */
    public final int mo88939a(C124548d dVar) {
        if (!C89643n.m145916a(dVar)) {
            C59104x b = f265862a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
            ((C59052c) ((C59052c) b).mo56372aa(17918)).mo56386p("Hotword: Unavailable device unsupported");
            return 1;
        } else if (!m156904c(dVar)) {
            C59104x b2 = f265862a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
            ((C59052c) ((C59052c) b2).mo56372aa(17917)).mo56386p("Hotword: Unavailable unsupported first stage model");
            return 2;
        } else if (C89643n.m145920e(dVar)) {
            String g = C58837ba.m90858g(this.f265863b.mo83457c());
            boolean w = this.f265863b.mo83477w();
            C59104x b3 = C89643n.f242726a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "VoiceMatchUtil");
            ((C59052c) ((C59052c) b3).mo56372aa(10514)).mo56355H("#isSpeakerIdSupportedForLocale locale: %s, isAllowed: %b", g, w);
            if (!w || C58837ba.m90859h(g)) {
                C59104x b4 = f265862a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
                ((C59052c) ((C59052c) b4).mo56372aa(17914)).mo56386p("Hotword: Unavailable locale unsupported");
                return 6;
            } else if (!this.f265863b.mo83480z()) {
                C59104x b5 = f265862a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
                ((C59052c) ((C59052c) b5).mo56372aa(17913)).mo56386p("Hotword: Unavailable requires speaker id enrollment");
                return 5;
            } else if (!C89643n.m145917b(dVar)) {
                C59104x b6 = f265862a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
                ((C59052c) ((C59052c) b6).mo56372aa(17912)).mo56386p("Hotword: Unavailable no user consent");
                return 4;
            } else {
                C59104x b7 = f265862a.mo56224b();
                b7.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
                ((C59052c) ((C59052c) b7).mo56372aa(17911)).mo56386p("Hotwording Active on the device.");
                return 0;
            }
        } else if (C89643n.m145917b(dVar) || C89643n.m145919d(dVar)) {
            C58976aa aaVar = C58975e.f156826a;
            return 0;
        } else {
            C59104x b8 = f265862a.mo56224b();
            b8.mo56378ag(C58975e.f156826a, "VoiceMatchHelperIP");
            ((C59052c) ((C59052c) b8).mo56372aa(17916)).mo56386p("Hotword: Unavailable no user consent");
            return 4;
        }
    }

    /* renamed from: b */
    public final boolean mo88940b(C124548d dVar) {
        if (!this.f265865d.mo83551f()) {
            if (dVar != null) {
                if ("deviceId-c18b75e2-82d5-4974-8bc9-7119c97c6ad8".equals(dVar.mo106475P())) {
                    return true;
                }
                C58976aa aaVar = C58975e.f156826a;
                this.f265863b.mo83478x();
                mo88939a(dVar);
            }
            return dVar != null && !this.f265863b.mo83478x() && mo88939a(dVar) == 0;
        } else if (dVar == null || !m156904c(dVar) || (!C89643n.m145917b(dVar) && !C89643n.m145919d(dVar))) {
            return false;
        } else {
            return true;
        }
    }
}
