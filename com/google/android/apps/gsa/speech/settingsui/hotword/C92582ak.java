package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.apps.gsa.search.core.C85767f;
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

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ak */
/* compiled from: PG */
public final class C92582ak implements C92558k, C92555h, C90991b {

    /* renamed from: b */
    private static final C59071e f258356b = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.ak");

    /* renamed from: a */
    protected C92559l f258357a;

    /* renamed from: c */
    private final String f258358c;

    /* renamed from: d */
    private final String f258359d;

    /* renamed from: e */
    private final C92597d f258360e;

    /* renamed from: f */
    private final C92602a f258361f;

    /* renamed from: g */
    private final C89994f f258362g;

    /* renamed from: h */
    private final C92486a f258363h;

    public C92582ak(String str, String str2, C92597d dVar, C92602a aVar, C89994f fVar, C92486a aVar2, C91022f fVar2) {
        this.f258358c = str;
        this.f258359d = str2;
        this.f258360e = dVar;
        this.f258361f = aVar;
        this.f258362g = fVar;
        this.f258363h = aVar2;
        fVar2.mo85301a(this);
        aVar.f258443a.add(new C92581aj(this));
    }

    /* renamed from: f */
    private final boolean m152445f(Context context) {
        String a = C90744a.m148217a("hw.aov.disable_hotword");
        if (a == null || !a.equals("1")) {
            return false;
        }
        C59104x b = f258356b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ScreenOnHotwordCntrlr");
        ((C59052c) ((C59052c) b).mo56372aa(12981)).mo56386p("Motoroal AoV is enabled");
        String d = this.f258363h.mo87230d();
        String string = context.getString(R.string.hotword_disabled, new Object[]{d});
        new AlertDialog.Builder(context).setTitle(string).setMessage(context.getString(R.string.hotword_disabled_motorola_aov, new Object[]{d})).setIconAttribute(16843605).setPositiveButton("OK", C92580ai.f258354a).setCancelable(false).show();
        return true;
    }

    /* renamed from: b */
    public final void mo87342b() {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258357a != null) {
            StringBuilder sb = new StringBuilder("disableSpeakerId: ");
            String a = this.f258360e.mo87367a();
            if (!this.f258363h.mo87242p()) {
                C92343a aVar = this.f258363h.f258091e;
                if (aVar == C92343a.AVAILABLE || a == null || !this.f258362g.mo83847J(a)) {
                    this.f258357a.mo87331g(false);
                    return;
                }
                sb.append("!canSafelyPerformHeadlessHotword - ");
                sb.append(aVar.name());
                z = true;
            } else {
                z = false;
            }
            if (a == null) {
                this.f258357a.mo87334j(R.string.hotword_prefs_voice_everywhere_subtitle_no_account);
                sb.append("null account");
            } else if (!this.f258362g.mo83823l()) {
                C59104x b = f258356b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ScreenOnHotwordCntrlr");
                ((C59052c) ((C59052c) b).mo56372aa(12974)).mo56389s("Speaker ID disabled, Speaker id is not supported for %s", this.f258362g.mo83863Z());
                this.f258357a.mo87334j(R.string.hotword_pref_subtitle_disabled_locale);
                sb.append("!hasSpeakerIdSupport");
            } else if (!z) {
                this.f258357a.mo87331g(true);
                this.f258357a.mo87335k(this.f258359d);
                if (this.f258362g.mo83824m(a)) {
                    EventForDump.m147676e(5, "model present");
                    mo87360e(true);
                    return;
                }
                EventForDump.m147676e(5, "model not present");
                mo87360e(false);
                return;
            }
            this.f258357a.mo87331g(false);
            EventForDump.m147676e(5, sb.toString());
            mo87360e(false);
        }
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo87360e(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C92559l lVar = this.f258357a;
        if (lVar != null) {
            lVar.mo87338a(z);
        }
        this.f258360e.mo87374h();
        C85767f.m137817a(this.f258360e.f258409b);
        this.f258360e.mo87372f();
        this.f258360e.mo87373g();
        this.f258361f.mo87356d(z);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        fVar.mo85279c("From Any Screen Preference Available=").mo85276a(C90752i.m148228b(true));
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        if (C92607f.m152512b(jVar) == 3) {
            jVar.mo87332h(this);
            jVar.mo87336l(this.f258358c);
            jVar.mo87335k(this.f258359d);
            this.f258357a = (C92559l) jVar;
            C58976aa aaVar = C58975e.f156826a;
            if (this.f258357a.mo87337m() && this.f258357a.mo87339b() && m152445f(this.f258357a.mo87329e())) {
                this.f258357a.mo87338a(false);
                mo87340ge(this.f258357a, false);
            }
        }
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        if (C92607f.m152512b(jVar) != 3) {
            return true;
        }
        Context e = jVar.mo87329e();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C58976aa aaVar = C58975e.f156826a;
        if (booleanValue) {
            if (!m152445f(e)) {
                if (this.f258362g.mo83847J(this.f258360e.mo87367a())) {
                    EventForDump.m147676e(5, "reusing old speaker id model");
                    mo87360e(true);
                    return true;
                }
                this.f258360e.mo87375i();
            }
            return false;
        }
        EventForDump.m147676e(5, "preferenceChange");
        mo87360e(false);
        return true;
    }
}
