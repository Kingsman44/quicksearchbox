package com.google.android.apps.gsa.speech.microdetection.p7310c;

import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.c.a */
/* compiled from: PG */
public final class C92531a implements C86091a {

    /* renamed from: a */
    private static final C59071e f258225a = C59071e.m91332i("com.google.android.apps.gsa.speech.microdetection.c.a");

    /* renamed from: b */
    private final int f258226b;

    /* renamed from: c */
    private final C68214a f258227c;

    /* renamed from: d */
    private final C86338r f258228d;

    /* renamed from: e */
    private final C68214a f258229e;

    /* renamed from: f */
    private final C92504i f258230f;

    public C92531a(int i, C68214a aVar, C86338r rVar, C68214a aVar2, C92504i iVar) {
        this.f258226b = i;
        this.f258227c = aVar;
        this.f258228d = rVar;
        this.f258229e = aVar2;
        this.f258230f = iVar;
    }

    /* renamed from: a */
    private final boolean m152235a() {
        C89994f fVar = (C89994f) this.f258229e.mo27525b();
        String ab = fVar.mo83882ab();
        if (!fVar.mo83847J(ab)) {
            return false;
        }
        if (fVar.mo83824m(ab) || fVar.mo83817f()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!z && !z2) {
            return;
        }
        if (!((C89994f) this.f258229e.mo27525b()).mo83834w() || !((C90021c) this.f258227c.mo27525b()).mo79746e(C90082eg.f249895aK)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        synchronized (C92531a.class) {
            C58976aa aaVar2 = C58975e.f156826a;
            z3 = false;
            z4 = this.f258226b >= 300727368;
            if (z4) {
                C59104x b = f258225a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordUpgradeTask");
                ((C59052c) ((C59052c) b).mo56372aa(12767)).mo56387q("App version upgraded to %d: running speaker ID model upgrade tasks v2.", this.f258226b);
            }
        }
        if (z4) {
            int i = this.f258228d.getInt("hotword_upgrade_notification_count", 0);
            if (((long) i) < ((C90021c) this.f258227c.mo27525b()).mo79743a(C90082eg.f250033cq)) {
                boolean v = ((C89994f) this.f258229e.mo27525b()).mo83833v(C90584f.OK_HEY_GOOGLE, ((C89994f) this.f258229e.mo27525b()).mo83863Z());
                boolean z5 = m152235a() && !v;
                C59071e eVar = f258225a;
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HotwordUpgradeTask");
                ((C59052c) ((C59052c) b2).mo56372aa(12769)).mo56359L("#shouldShowNotificationForUserUpgrade - %b [isUserSpeakerIdEnabled: %b, isUserUpgraded: %b]", Boolean.valueOf(z5), Boolean.valueOf(m152235a()), Boolean.valueOf(v));
                if (!z5) {
                    boolean e = ((C90021c) this.f258227c.mo27525b()).mo79746e(C90082eg.f250079p);
                    boolean h = this.f258230f.mo87267h(((C89994f) this.f258229e.mo27525b()).mo83863Z(), C90584f.OK_HEY_GOOGLE);
                    if (e && h && !m152235a()) {
                        z3 = true;
                    }
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "HotwordUpgradeTask");
                    ((C59052c) ((C59052c) b3).mo56372aa(12768)).mo56360M("#shouldShowNotificationForModelDownload - %b [shouldCheckHotwordModel: %b, xGoogleHotwordModelPresent: %b, isUserSpeakerIdEnabled: %b]", Boolean.valueOf(z3), Boolean.valueOf(e), Boolean.valueOf(h), Boolean.valueOf(m152235a()));
                    if (!z3) {
                        C59104x b4 = eVar.mo56224b();
                        b4.mo56378ag(C58975e.f156826a, "HotwordUpgradeTask");
                        ((C59052c) ((C59052c) b4).mo56372aa(12764)).mo56386p("Notification requirements not met. Do not show notification.");
                        return;
                    }
                }
                C86337q b5 = this.f258228d.mo80076b();
                b5.mo80070e("hands_free_hotword_retraining_notification_source", 35);
                b5.mo80070e("hands_free_hotword_retraining_notification_state", 2);
                b5.mo80070e("hotword_upgrade_notification_count", i + 1);
                b5.apply();
                return;
            }
            C59104x b6 = f258225a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "HotwordUpgradeTask");
            ((C59052c) ((C59052c) b6).mo56372aa(12765)).mo56386p("Max notifications already displayed. Do not show notification.");
        }
    }
}
