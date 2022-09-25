package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import androidx.preference.C4023s;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89637h;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89638i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142415em;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.r */
/* compiled from: PG */
public final class C9635r extends C9504g implements C4023s, C89495cg {

    /* renamed from: i */
    public static final C59071e f33339i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.r");

    /* renamed from: j */
    public final String f33340j;

    /* renamed from: k */
    private final C91142g f33341k;

    /* renamed from: l */
    private final C68214a f33342l;

    /* renamed from: m */
    private final C88483e f33343m;

    /* renamed from: n */
    private final C89994f f33344n;

    /* renamed from: o */
    private final C89496ch f33345o;

    /* renamed from: p */
    private final C89493ce f33346p;

    /* renamed from: q */
    private Preference f33347q;

    public C9635r(String str, C88483e eVar, C68214a aVar, C91142g gVar, C89994f fVar, C89496ch chVar, C89493ce ceVar) {
        this.f33340j = str;
        this.f33343m = eVar;
        this.f33342l = aVar;
        this.f33341k = gVar;
        this.f33344n = fVar;
        this.f33345o = chVar;
        this.f33346p = ceVar;
    }

    /* renamed from: G */
    private final void m24347G(C124548d dVar) {
        String str;
        Preference preference = this.f33347q;
        if (preference == null) {
            C59104x c = f33339i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDiagnostics");
            ((C59052c) ((C59052c) c).mo56372aa(351)).mo56389s("OHD Preference is null for %s", this.f33340j);
            return;
        }
        if (this.f33346p.mo83439a(dVar)) {
            str = String.format("%s (enforced)", new Object[]{dVar.mo106461B().name()});
        } else if (C142413ek.OHD_NONE_DETECTED.equals(dVar.mo106461B())) {
            str = String.format("%s (not enforced)", new Object[]{dVar.mo106461B().name()});
        } else {
            str = dVar.mo106461B().name();
        }
        preference.mo8329n(str);
    }

    /* renamed from: H */
    private static boolean m24348H(C124548d dVar) {
        return dVar != null && dVar.mo106513k() == C124719q.GACS_DEVICE;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (C89638i.f242714b.containsKey(str)) {
            if (booleanValue) {
                C0391l gh = mo17796gh();
                gh.mo1307l(R.string.bisto_device_diagnostics_alert_title);
                gh.mo1300f(R.string.bisto_device_diagnostics_speech_alert_message);
                C0391l positiveButton = gh.setPositiveButton(17039370, new C9630m(this, str));
                positiveButton.mo1299e(17301543);
                positiveButton.setNegativeButton(17039360, new C9631n(preference)).create().show();
                return true;
            }
            mo17916b(str, false);
            return true;
        } else if (C89638i.f242715c.containsKey(str)) {
            mo17916b(str, booleanValue);
            return true;
        } else {
            C59104x c = f33339i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDeviceDiagnostics");
            ((C59052c) ((C59052c) c).mo56372aa(353)).mo56389s("Unknown preference: %s", str);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo17916b(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C84533ar a = ((C84534as) this.f33342l.mo27525b()).mo78241a();
        a.mo78237c(str, z);
        a.mo78236b();
        C89651f.m145940a(this.f33343m, new C88489j(C87739bu.BISTO_STARTUP_PREF_CHANGED).mo82013a());
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        Preference preference = this.f33347q;
        if (str.equals(this.f33340j) && set.contains(29) && preference != null) {
            m24347G(dVar);
        }
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        Context context = mo17792e().f12738j;
        PreferenceCategory preferenceCategory = new PreferenceCategory(context);
        preferenceCategory.mo8347N("Debug Settings");
        mo17792e().mo8379af(preferenceCategory);
        String str = this.f33340j;
        C124548d b = str != null ? this.f33345o.mo83401b(str) : null;
        if (!m24348H(b)) {
            Preference preference = new Preference(context);
            this.f33347q = preference;
            preference.mo8346M(R.string.bisto_ohd_status);
            if (b != null) {
                m24347G(b);
                if (!C142413ek.OHD_UNSUPPORTED.equals(b.mo106461B())) {
                    preferenceCategory.mo8379af(preference);
                }
            } else {
                C59104x c = f33339i.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoDeviceDiagnostics");
                ((C59052c) ((C59052c) c).mo56372aa(348)).mo56386p("Null deviceInfo");
                C142413ek a = C142413ek.m231079a(C142415em.f386437c.f386440b);
                if (a == null) {
                    a = C142413ek.UNKNOWN;
                }
                preference.mo8329n(a.name());
                preferenceCategory.mo8379af(preference);
            }
        }
        if (b != null && b.mo106497ak()) {
            Preference preference2 = new Preference(context);
            preference2.mo8346M(R.string.bisto_local_hotword_model);
            C90580b bVar = (C90580b) this.f33344n.mo83829r().get(this.f33344n.mo83863Z());
            if (bVar != null) {
                preference2.mo8329n(bVar.f253241c);
            } else {
                preference2.mo8329n("UNKNOWN");
            }
            preferenceCategory.mo8379af(preference2);
        }
        C58800sl lA = C89638i.f242714b.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str2 = (String) entry.getKey();
            SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
            switchPreferenceCompat.mo8343J(str2);
            switchPreferenceCompat.mo8347N("Speech Testing mode");
            switchPreferenceCompat.mo8329n(((C89637h) entry.getValue()).mo83508a());
            switchPreferenceCompat.mo8391j(this.f33341k.mo85406k(str2, false));
            switchPreferenceCompat.f12742n = this;
            preferenceCategory.mo8379af(switchPreferenceCompat);
        }
        if (m24348H(b)) {
            C58800sl lA2 = C89638i.f242715c.entrySet().iterator();
            while (lA2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) lA2.next();
                String str3 = (String) entry2.getKey();
                C89637h hVar = (C89637h) entry2.getValue();
                SwitchPreferenceCompat switchPreferenceCompat2 = new SwitchPreferenceCompat(context);
                switchPreferenceCompat2.mo8343J(str3);
                switchPreferenceCompat2.mo8347N(hVar.mo83509b());
                switchPreferenceCompat2.mo8329n(hVar.mo83508a());
                switchPreferenceCompat2.mo8391j(this.f33341k.mo85406k(str3, false));
                switchPreferenceCompat2.f12742n = this;
                preferenceCategory.mo8379af(switchPreferenceCompat2);
            }
        }
        if (!m24348H(b)) {
            Preference preference3 = new Preference(context);
            preference3.f12719E = R.layout.preference_widget_next;
            preference3.mo8347N("OTA extended control");
            preference3.f12743o = new C9632o(this);
            preferenceCategory.mo8379af(preference3);
            Preference preference4 = new Preference(context);
            preference4.f12719E = R.layout.preference_widget_next;
            preference4.mo8347N("Hotword DSP Model Info");
            preference4.f12743o = new C9633p(this);
            preferenceCategory.mo8379af(preference4);
        }
        Preference preference5 = new Preference(context);
        preference5.f12719E = R.layout.preference_widget_next;
        preference5.mo8347N("Device Actions");
        preference5.f12743o = new C9634q(this);
        preferenceCategory.mo8379af(preference5);
    }

    /* renamed from: u */
    public final void mo17810u() {
        this.f33345o.mo83360B(new C58759qy(29), this);
    }

    /* renamed from: v */
    public final void mo17811v() {
        this.f33345o.mo83379U(this);
    }
}
