package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.settings.shared.d.c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92555h;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ab */
/* compiled from: PG */
public final class C92573ab implements C92558k, C92555h, C90991b {

    /* renamed from: a */
    private final C92597d f258336a;

    /* renamed from: b */
    private final C89994f f258337b;

    /* renamed from: c */
    private final C86124t f258338c;

    /* renamed from: d */
    private final Resources f258339d;

    /* renamed from: e */
    private final C92602a f258340e;

    /* renamed from: f */
    private C92559l f258341f;

    public C92573ab(C92597d dVar, C92602a aVar, C89994f fVar, C91022f fVar2, C86124t tVar, Resources resources) {
        this.f258336a = dVar;
        this.f258337b = fVar;
        this.f258338c = tVar;
        this.f258339d = resources;
        this.f258340e = aVar;
        fVar2.mo85301a(this);
    }

    /* renamed from: b */
    public final void mo87342b() {
        C58976aa aaVar = C58975e.f156826a;
        boolean A = this.f258337b.mo83835A();
        C92559l lVar = this.f258341f;
        if (lVar != null) {
            lVar.mo87331g(true);
            this.f258341f.mo87338a(A);
        }
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        C91005e c = fVar.mo85279c("Personal Response enabled=");
        C92559l lVar = this.f258341f;
        boolean z = false;
        if (lVar != null && lVar.mo87339b()) {
            z = true;
        }
        c.mo85276a(C90752i.m148228b(Boolean.valueOf(z)));
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        String str;
        if (C92607f.m152512b(jVar) == 8) {
            jVar.mo87332h(this);
            jVar.mo87336l(this.f258339d.getString(R.string.hotword_pref_personal_response_title));
            this.f258341f = (C92559l) jVar;
            if (this.f258338c.mo79746e(C90014bt.f247548jI)) {
                str = this.f258339d.getString(R.string.hotword_pref_personal_response_summary_for_ambient_mode);
            } else if (this.f258338c.mo79746e(C90014bt.f247797nt)) {
                str = this.f258339d.getString(R.string.hotword_pref_personal_response_summary_updated);
            } else {
                str = this.f258339d.getString(R.string.hotword_pref_personal_response_summary);
            }
            jVar.mo87335k(c.b(jVar.mo87329e(), str, this.f258339d.getString(R.string.personal_response_learn_more_url)));
        }
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        if (C92607f.m152512b(jVar) == 8) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            EventForDump.m147676e(5, "onPreferenceChange");
            C58976aa aaVar = C58975e.f156826a;
            this.f258336a.mo87372f();
            this.f258337b.mo83837C(booleanValue);
            this.f258340e.mo87385e(booleanValue);
            C92559l lVar = this.f258341f;
            if (lVar != null) {
                lVar.mo87338a(booleanValue);
            }
        }
        return true;
    }
}
