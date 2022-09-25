package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92555h;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.l */
/* compiled from: PG */
public final class C92617l implements C92558k, C92555h {

    /* renamed from: c */
    private static final C59071e f258480c = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.l");

    /* renamed from: a */
    public final C92597d f258481a;

    /* renamed from: b */
    public C92559l f258482b;

    /* renamed from: d */
    private final C92602a f258483d;

    /* renamed from: e */
    private final C92486a f258484e;

    /* renamed from: f */
    private final C91077d f258485f;

    /* renamed from: g */
    private final C89994f f258486g;

    public C92617l(C92597d dVar, C92602a aVar, C89994f fVar, C92486a aVar2, C91077d dVar2) {
        this.f258481a = dVar;
        this.f258483d = aVar;
        this.f258484e = aVar2;
        this.f258485f = dVar2;
        this.f258486g = fVar;
        aVar.f258443a.add(new C92616k(this));
    }

    /* renamed from: b */
    public final void mo87342b() {
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* renamed from: e */
    public final void mo87393e() {
        C92559l lVar = this.f258482b;
        if (lVar != null) {
            lVar.mo87336l(this.f258481a.mo87369c());
            if (!this.f258484e.mo87246t()) {
                this.f258482b.mo87331g(false);
                this.f258482b.mo87338a(false);
                this.f258482b.mo87334j(R.string.hotword_pref_subtitle_disabled_locale);
                C59104x b = f258480c.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AsstAppOnlyHotwordCntrl");
                ((C59052c) ((C59052c) b).mo56372aa(12942)).mo56386p("#updatePreferenceState - Feature is currently unavailable for this language.");
                return;
            }
            this.f258482b.mo87331g(true);
            String d = this.f258484e.mo87230d();
            if (this.f258485f.f254356c.mo85346a("android.permission.RECORD_AUDIO")) {
                this.f258482b.mo87338a(((C84534as) this.f258481a.f258410c.mo27525b()).mo85406k("GSAPrefs.hotword_enabled", false));
                Context e = this.f258482b.mo87329e();
                if (C89429a.m145456n(e, C89429a.m145447e(e))) {
                    this.f258482b.mo87335k(e.getString(R.string.hotword_pref_summary_homescreen, new Object[]{d}));
                    return;
                }
                this.f258482b.mo87335k(this.f258481a.mo87368b());
                return;
            }
            this.f258482b.mo87338a(false);
            C92559l lVar2 = this.f258482b;
            lVar2.mo87335k(lVar2.mo87329e().getString(R.string.hotword_pref_summary_mic_permission, new Object[]{d}));
        }
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        jVar.mo87332h(this);
        this.f258482b = (C92559l) jVar;
        mo87393e();
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C59104x b = f258480c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AsstAppOnlyHotwordCntrl");
        ((C59052c) ((C59052c) b).mo56372aa(12939)).mo56389s("handleAppOnlyHotwordChange : %b", Boolean.valueOf(booleanValue));
        this.f258484e.mo87238l(booleanValue);
        this.f258481a.mo87374h();
        this.f258481a.mo87372f();
        this.f258483d.mo87383b(booleanValue);
        this.f258486g.mo83903aw(true != booleanValue ? 2 : 1, EventForDump.m147675d(5));
        return true;
    }
}
