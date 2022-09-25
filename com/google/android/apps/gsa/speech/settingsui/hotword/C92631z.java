package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.hotword.C92343a;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92555h;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.z */
/* compiled from: PG */
public class C92631z implements C92558k, C92555h, C90991b {

    /* renamed from: b */
    private static final C59071e f258542b = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.z");

    /* renamed from: a */
    protected C92559l f258543a;

    /* renamed from: c */
    private final String f258544c;

    /* renamed from: d */
    private final String f258545d;

    /* renamed from: e */
    private final C92597d f258546e;

    /* renamed from: f */
    private final C92602a f258547f;

    /* renamed from: g */
    private final C89994f f258548g;

    /* renamed from: h */
    private final C92486a f258549h;

    /* renamed from: i */
    private final C90021c f258550i;

    public C92631z(String str, String str2, C92597d dVar, C92602a aVar, C89994f fVar, C92486a aVar2, C90021c cVar, C91022f fVar2) {
        this.f258544c = str;
        this.f258545d = str2;
        this.f258546e = dVar;
        this.f258547f = aVar;
        this.f258548g = fVar;
        this.f258549h = aVar2;
        this.f258550i = cVar;
        fVar2.mo85301a(this);
        aVar.f258443a.add(new C92630y(this));
    }

    /* renamed from: f */
    private final EventForDump m152566f(boolean z, String str) {
        C92559l lVar = this.f258543a;
        if (lVar != null) {
            lVar.mo87338a(z);
        }
        return EventForDump.m147676e(5, str);
    }

    /* renamed from: g */
    private final boolean m152567g(Context context) {
        String a = C90744a.m148217a("hw.aov.disable_hotword");
        if (a == null || !a.equals("1")) {
            return false;
        }
        C59104x b = f258542b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaScreenOnHotwordCtrlr");
        ((C59052c) ((C59052c) b).mo56372aa(12964)).mo56386p("Motoroal AoV is enabled");
        String d = this.f258549h.mo87230d();
        String string = context.getString(R.string.hotword_disabled, new Object[]{d});
        new AlertDialog.Builder(context).setTitle(string).setMessage(context.getString(R.string.hotword_disabled_motorola_aov, new Object[]{d})).setIconAttribute(16843605).setPositiveButton("OK", C92629x.f258540a).setCancelable(false).show();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87398a(Context context, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            mo87399e(false, EventForDump.m147676e(5, "preferenceChange"));
            return true;
        } else if (m152567g(context)) {
            return false;
        } else {
            if (this.f258548g.mo83847J(this.f258546e.mo87367a())) {
                mo87399e(true, EventForDump.m147676e(5, "reusing old speaker id model"));
                return true;
            }
            this.f258546e.mo87375i();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo87342b() {
        EventForDump eventForDump;
        C58976aa aaVar = C58975e.f156826a;
        C92559l lVar = this.f258543a;
        if (lVar != null) {
            boolean z = true;
            lVar.mo87331g(true);
            this.f258543a.mo87335k(this.f258545d);
            String a = this.f258546e.mo87367a();
            int R = this.f258548g.mo83855R();
            boolean J = this.f258548g.mo83847J(a);
            if (a == null) {
                this.f258543a.mo87334j(R.string.hotword_prefs_voice_everywhere_subtitle_no_account);
                this.f258543a.mo87331g(false);
                eventForDump = m152566f(false, "Screen-On Hotword disabled: null account");
            } else if (!this.f258549h.mo87242p()) {
                C59104x c = f258542b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaScreenOnHotwordCtrlr");
                ((C59052c) ((C59052c) c).mo56372aa(12958)).mo56386p("Hotword Setting disabled: hotword everywhere not available.");
                this.f258543a.mo87334j(R.string.hotword_pref_subtitle_disabled_device);
                C92343a aVar = this.f258549h.f258091e;
                if (aVar == C92343a.AVAILABLE || R == 2) {
                    this.f258543a.mo87331g(false);
                    eventForDump = m152566f(false, "Screen-On Hotword disabled: hotword everywhere unavailable");
                } else {
                    this.f258543a.mo87331g(false);
                    eventForDump = m152566f(false, "Screen-On Hotword disabled: !canSafelyPerformHeadlessHotword - ".concat(String.valueOf(aVar.name())));
                }
            } else {
                if (R == 1) {
                    if (!J) {
                        C59104x c2 = f258542b.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "OpaScreenOnHotwordCtrlr");
                        ((C59052c) ((C59052c) c2).mo56372aa(12957)).mo56386p("Hotword Setting untoggled: enrolled but model not present");
                        eventForDump = m152566f(false, "Screen-On Hotword disabled: enrolled but missing model");
                    } else {
                        R = 1;
                    }
                }
                if (R == 4) {
                    if (!J) {
                        R = 4;
                    } else if (this.f258550i.mo79746e(C90082eg.f249960bW)) {
                        C59104x b = f258542b.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "OpaScreenOnHotwordCtrlr");
                        ((C59052c) ((C59052c) b).mo56372aa(12956)).mo56386p("ART tester enrollment state is INCOMPLETE and model is present; use hotword without Voice Match enabled.");
                        return;
                    } else {
                        C59104x d = f258542b.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "OpaScreenOnHotwordCtrlr");
                        ((C59052c) ((C59052c) d).mo56372aa(12955)).mo56386p("Enrollment state is INCOMPLETE but model is present; WARNING: This should never happen!");
                        eventForDump = m152566f(true, "preference: incomplete state but model present");
                    }
                }
                boolean z2 = R == 1;
                eventForDump = m152566f(z2, "preference: " + R);
            }
            if (!this.f258543a.mo87337m() || !this.f258543a.mo87339b()) {
                z = false;
            }
            mo87399e(z, eventForDump);
        }
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo87399e(boolean z, EventForDump eventForDump) {
        C58976aa aaVar = C58975e.f156826a;
        C92559l lVar = this.f258543a;
        if (lVar != null) {
            lVar.mo87338a(z);
        }
        this.f258546e.mo87374h();
        C85767f.m137817a(this.f258546e.f258409b);
        this.f258546e.mo87372f();
        this.f258546e.mo87373g();
        this.f258547f.mo87356d(z);
        this.f258549h.mo87237k(z, eventForDump);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        fVar.mo85279c("OPA From Any Screen Preference Available=").mo85276a(C90752i.m148228b(true));
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        if (C92607f.m152512b(jVar) == 5) {
            jVar.mo87332h(this);
            jVar.mo87336l(this.f258544c);
            jVar.mo87335k(this.f258545d);
            this.f258543a = (C92559l) jVar;
            C58976aa aaVar = C58975e.f156826a;
            if (this.f258543a.mo87337m() && this.f258543a.mo87339b() && m152567g(this.f258543a.mo87329e())) {
                this.f258543a.mo87338a(false);
                mo87340ge(this.f258543a, false);
            }
        }
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        if (C92607f.m152512b(jVar) == 5) {
            return mo87398a(jVar.mo87329e(), ((Boolean) obj).booleanValue());
        }
        return true;
    }
}
