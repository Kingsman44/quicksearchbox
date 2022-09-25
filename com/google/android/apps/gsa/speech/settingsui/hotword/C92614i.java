package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7315a.C92571b;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92555h;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.i */
/* compiled from: PG */
public class C92614i implements C92558k, C92555h, C90991b {

    /* renamed from: a */
    public static final C59071e f258457a = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.i");

    /* renamed from: b */
    public final C89994f f258458b;

    /* renamed from: c */
    protected final C92518d f258459c;

    /* renamed from: d */
    public final AtomicBoolean f258460d = new AtomicBoolean(false);

    /* renamed from: e */
    protected C92559l f258461e;

    /* renamed from: f */
    private final String f258462f;

    /* renamed from: g */
    private final String f258463g;

    /* renamed from: h */
    private final C92597d f258464h;

    /* renamed from: i */
    private final C92602a f258465i;

    /* renamed from: j */
    private final C92486a f258466j;

    /* renamed from: k */
    private final C86124t f258467k;

    /* renamed from: l */
    private final C42876ab f258468l;

    /* renamed from: m */
    private final C60887da f258469m;

    /* renamed from: n */
    private final C9325m f258470n;

    public C92614i(String str, String str2, C92597d dVar, C92602a aVar, C89994f fVar, C92486a aVar2, C92518d dVar2, C91022f fVar2, C86124t tVar, C42876ab abVar, C60887da daVar, C9325m mVar) {
        this.f258462f = str;
        this.f258463g = str2;
        this.f258464h = dVar;
        this.f258465i = aVar;
        this.f258458b = fVar;
        this.f258466j = aVar2;
        this.f258459c = dVar2;
        this.f258467k = tVar;
        this.f258468l = abVar;
        this.f258469m = daVar;
        this.f258470n = mVar;
        fVar2.mo85301a(this);
        aVar.f258443a.add(new C92609d(this));
    }

    /* renamed from: i */
    private final EventForDump m152524i(String str, int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C92559l lVar = this.f258461e;
        if (lVar != null) {
            lVar.mo87331g(true);
        }
        boolean z2 = false;
        if (str == null) {
            C59104x c = f258457a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c).mo56372aa(12912)).mo56386p("Hotword Setting disabled: No account");
            m152527l(false, false);
            C92559l lVar2 = this.f258461e;
            if (lVar2 != null) {
                lVar2.mo87334j(R.string.hotword_prefs_voice_everywhere_subtitle_no_account);
            }
            return EventForDump.m147676e(5, "no account");
        }
        if (i == 1) {
            if (!z) {
                C59104x c2 = f258457a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) c2).mo56372aa(12911)).mo56386p("Hotword Setting untoggled: Enrolled, but speaker model is not available");
                return EventForDump.m147676e(5, "!isSpeakerModelAvailable: missing speaker model");
            }
            i = 1;
        }
        if (i == 4) {
            if (!z) {
                i = 4;
            } else if (m152529n()) {
                C59104x b = f258457a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) b).mo56372aa(12910)).mo56386p("ART tester enrollment state is INCOMPLETE and model is present; use hotword without Voice Match enabled.");
                return EventForDump.m147676e(5, "VM Setting Toggle: ART tester untoggled VM");
            } else {
                C59104x d = f258457a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) d).mo56372aa(12909)).mo56386p("Enrollment state is INCOMPLETE but model is present; WARNING: This should never happen!");
                m152527l(true, true);
                return EventForDump.m147676e(5, "VM Setting Toggle: incomplete state but model present");
            }
        }
        if (i == 1) {
            z2 = true;
        }
        m152527l(true, z2);
        return EventForDump.m147676e(5, "VM Setting Toggle: " + i);
    }

    /* renamed from: j */
    private final void m152525j(EventForDump eventForDump) {
        C92559l lVar = this.f258461e;
        boolean z = false;
        if (lVar != null && lVar.mo87337m() && this.f258461e.mo87339b()) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!m152529n()) {
            mo87389e(z, eventForDump);
        }
        m152528m(z);
    }

    /* renamed from: k */
    private final void m152526k() {
        C92559l lVar = this.f258461e;
        if (lVar != null) {
            lVar.mo87334j(R.string.hotword_pref_summary_always_on_error);
            this.f258461e.mo87331g(false);
            mo87389e(false, EventForDump.m147676e(5, "adapter error"));
        }
    }

    /* renamed from: l */
    private final void m152527l(boolean z, boolean z2) {
        C58976aa aaVar = C58975e.f156826a;
        C92559l lVar = this.f258461e;
        if (lVar != null) {
            lVar.mo87331g(z);
            this.f258461e.mo87338a(z2);
        }
    }

    /* renamed from: m */
    private final void m152528m(boolean z) {
        C60856cj.m92911t(this.f258468l.mo46039a(new C92608c(z), this.f258469m), new C92611f(), this.f258469m);
    }

    /* renamed from: n */
    private final boolean m152529n() {
        return this.f258467k.mo79746e(C90082eg.f249960bW) && this.f258458b.mo83855R() == 4 && this.f258458b.mo83847J(this.f258464h.mo87367a());
    }

    /* renamed from: o */
    private final boolean m152530o() {
        if (this.f258460d.get()) {
            C89994f fVar = this.f258458b;
            return fVar.mo83815d(fVar.mo83827p(), this.f258458b.mo83863Z());
        }
        C92518d dVar = this.f258459c;
        return dVar != null && dVar.mo87277e() && this.f258459c.mo87282j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87388a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C92518d dVar = this.f258459c;
        if (dVar == null || !dVar.mo87277e()) {
            if (!this.f258460d.get()) {
                C59104x c = f258457a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) c).mo56372aa(12934)).mo56386p("#handleAlwaysOnPreferenceChange - adapter is null or not connected.");
            } else if (!z || this.f258458b.mo83847J(this.f258464h.mo87367a())) {
                this.f258466j.mo87237k(z, EventForDump.m147676e(5, "#handleAlwaysOnPreferenceChange"));
            } else {
                C59104x d = f258457a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) d).mo56372aa(12935)).mo56386p("Speaker model not found, starting enrollment.");
                this.f258464h.mo87375i();
                return false;
            }
        } else if (this.f258459c.mo87281i() || this.f258459c.mo87280h()) {
            EventForDump e = EventForDump.m147676e(5, "#handleAlwaysOnPreferenceChange");
            if (!z) {
                this.f258466j.mo87237k(false, e);
                this.f258459c.mo87284l(false, new C92593b(this), e);
            } else if (!this.f258459c.mo87278f()) {
                C59104x c2 = f258457a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) c2).mo56372aa(12937)).mo56386p("DSP not enrolled");
                this.f258464h.mo87375i();
                return false;
            } else if (!this.f258459c.mo87281i() || this.f258458b.mo83847J(this.f258464h.mo87367a())) {
                this.f258466j.mo87237k(true, e);
                this.f258459c.mo87284l(true, new C92569a(this), e);
            } else {
                C59104x d2 = f258457a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) d2).mo56372aa(12936)).mo56386p("Speaker model not found enrolled. Starting Enrollment.");
                this.f258464h.mo87375i();
                return false;
            }
        } else {
            C59104x c3 = f258457a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c3).mo56372aa(12938)).mo56386p("#handleAlwaysOnPreferenceChange - hardware does not support voice trigger or user identification.");
            return false;
        }
        m152528m(z);
        return true;
    }

    /* renamed from: b */
    public final void mo87342b() {
        C92518d dVar = this.f258459c;
        if (dVar != null) {
            dVar.mo87273a(new C92610e(this));
            return;
        }
        C59104x c = f258457a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
        ((C59052c) ((C59052c) c).mo56372aa(12917)).mo56386p("Hotword Adapter is null");
        mo87390f();
    }

    /* renamed from: c */
    public final void mo87343c() {
        C92518d dVar = this.f258459c;
        if (dVar != null) {
            dVar.mo87274b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo87389e(boolean z, EventForDump eventForDump) {
        C58976aa aaVar = C58975e.f156826a;
        C85767f.m137817a(this.f258464h.f258409b);
        this.f258464h.mo87372f();
        this.f258464h.mo87373g();
        this.f258465i.mo87356d(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo87390f() {
        EventForDump eventForDump;
        C92518d dVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258461e == null) {
            C59104x c = f258457a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c).mo56372aa(12930)).mo56386p("No preference to update.");
        } else if (!this.f258466j.mo87242p()) {
            C59104x c2 = f258457a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c2).mo56372aa(12929)).mo56386p("hasHotwordEverywhere is false.");
            this.f258461e.mo87334j(R.string.hotword_pref_subtitle_disabled_device);
            this.f258461e.mo87331g(false);
        } else if (!this.f258470n.mo17534a()) {
            C59104x c3 = f258457a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c3).mo56372aa(12928)).mo56386p("Google is not default assistant.");
            this.f258461e.mo87334j(R.string.hotword_pref_summary_always_on_not_default_vis);
            m152527l(false, false);
            m152525j(EventForDump.m147676e(5, "Google not default assistant"));
        } else {
            String a = this.f258464h.mo87367a();
            int R = this.f258458b.mo83855R();
            boolean J = this.f258458b.mo83847J(a);
            boolean e = this.f258467k.mo79746e(C90082eg.f249892aH);
            if (this.f258460d.get() || ((dVar = this.f258459c) != null && dVar.mo87277e())) {
                if (!m152530o()) {
                    C59104x c4 = f258457a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                    ((C59052c) ((C59052c) c4).mo56372aa(12923)).mo56386p("Hotword Setting disabled: Unsupported locale");
                    this.f258461e.mo87334j(R.string.hotword_pref_subtitle_disabled_locale);
                    m152527l(false, false);
                    eventForDump = EventForDump.m147676e(5, "!isLanguageSupported");
                } else {
                    eventForDump = m152524i(a, R, J);
                }
                m152525j(eventForDump);
            } else if (e) {
                C59071e eVar = f258457a;
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) d).mo56372aa(12925)).mo56386p("No always on adapter or not connected - using previous toggle state.");
                C92571b bVar = (C92571b) C60856cj.m92910s(this.f258468l.mo46042d());
                if ((bVar.f258330a & 1) == 0 ? this.f258458b.mo83855R() != 1 : !bVar.f258331b) {
                    C59104x b = eVar.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                    ((C59052c) ((C59052c) b).mo56372aa(12926)).mo56386p("Cannot connect to adapter and previous toggle state is OFF - disabling the toggle.");
                    m152526k();
                    return;
                }
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) b2).mo56372aa(12927)).mo56386p("Cannot connect to adapter and previous toggle state is ON - performing follow up checks.");
                m152525j(m152524i(a, R, J));
            } else {
                C59104x c5 = f258457a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
                ((C59052c) ((C59052c) c5).mo56372aa(12924)).mo56386p("No always on adapter or not connected.");
                m152526k();
            }
        }
    }

    /* renamed from: g */
    public final void mo87391g() {
        C58976aa aaVar = C58975e.f156826a;
        C92518d dVar = this.f258459c;
        if (dVar != null) {
            dVar.mo87276d(new C92613h(this));
        }
    }

    /* renamed from: gS */
    public void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        if (this.f258458b != null) {
            fVar.mo85279c("Speaker ID Model Present=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258458b.mo83847J(this.f258464h.mo87367a()))));
            fVar.mo85279c("Last Known Is Always On Hotword Enabled=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258458b.mo83817f())));
        }
        fVar.mo85279c("Always On Hotword Available=").mo85276a(C90752i.m148228b(true));
        fVar.mo85279c("Speaker ID Supported").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258458b.mo83823l())));
        fVar.mo85279c("Last Known Audio History Enabled=").mo85276a(C90752i.m148228b(Boolean.valueOf(((C85664bo) this.f258464h.f258413f.mo27525b()).mo79197l(C85662bm.AUDIO_HISTORY))));
        fVar.mo85279c("Using HDM=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258460d.get())));
        C92518d dVar = this.f258459c;
        if (dVar != null && dVar.mo87277e()) {
            fVar.mo85279c("Last Known Is Hardware Available=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258459c.mo87279g())));
            fVar.mo85279c("Last Known Is Language Supported=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258459c.mo87282j())));
            fVar.mo85279c("Last Known Is Enrolled=").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f258459c.mo87278f())));
        } else if (this.f258460d.get()) {
            fVar.mo85279c("Last Known Is Language Supported=").mo85276a(C90752i.m148228b(Boolean.valueOf(m152530o())));
        }
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        if (C92607f.m152512b(jVar) == mo87392h()) {
            jVar.mo87332h(this);
            jVar.mo87336l(this.f258462f);
            jVar.mo87335k(this.f258463g);
            this.f258461e = (C92559l) jVar;
        }
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        if (C92607f.m152512b(jVar) == mo87392h()) {
            return mo87388a(((Boolean) obj).booleanValue());
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo87392h() {
        return 4;
    }
}
