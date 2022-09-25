package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.SharedPreferences;
import android.preference.Preference;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92605d;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92599f;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92554g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.n */
/* compiled from: PG */
public final class C92619n extends C92605d {

    /* renamed from: f */
    private final C91097g f258489f;

    /* renamed from: g */
    private final C90021c f258490g;

    /* renamed from: h */
    private final C89994f f258491h;

    /* renamed from: i */
    private final C92486a f258492i;

    /* renamed from: j */
    private final C68214a f258493j;

    /* renamed from: k */
    private final C68214a f258494k;

    /* renamed from: l */
    private final C68214a f258495l;

    /* renamed from: m */
    private final C68214a f258496m;

    /* renamed from: n */
    private final C68214a f258497n;

    /* renamed from: o */
    private final C68214a f258498o;

    /* renamed from: p */
    private final C68214a f258499p;

    /* renamed from: q */
    private final C68214a f258500q;

    /* renamed from: r */
    private final C68214a f258501r;

    /* renamed from: s */
    private final C68214a f258502s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92619n(C92597d dVar, C92602a aVar, C91097g gVar, C90021c cVar, C89994f fVar, C92599f fVar2, C92486a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12) {
        super(dVar, fVar2, aVar);
        C92597d dVar2 = dVar;
        C92602a aVar13 = aVar;
        C92599f fVar3 = fVar2;
        this.f258489f = gVar;
        this.f258490g = cVar;
        this.f258491h = fVar;
        this.f258492i = aVar2;
        this.f258493j = aVar3;
        this.f258494k = aVar4;
        this.f258495l = aVar5;
        this.f258496m = aVar6;
        this.f258497n = aVar7;
        this.f258498o = aVar8;
        this.f258499p = aVar9;
        this.f258500q = aVar10;
        this.f258501r = aVar11;
        this.f258502s = aVar12;
    }

    /* renamed from: o */
    private final boolean m152549o() {
        return !this.f258491h.mo83823l() && this.f258490g.mo79746e(C90082eg.f249878U);
    }

    /* renamed from: p */
    private static boolean m152550p(String str) {
        return "pref_category_voice_model".equals(str) || C92591at.f258382a.contains(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        C58976aa aaVar = C58975e.f156826a;
        String d = this.f258492i.mo87230d();
        int a = C92607f.m152511a(preference);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 1) {
            return new C92554g(((C92618m) this.f258493j.mo27525b()).mo87394a(this.f258445b, this.f258447d, this.f258491h));
        } else {
            if (i == 2) {
                C92583al alVar = (C92583al) this.f258494k.mo27525b();
                String string = this.f258445b.f258409b.getString(R.string.hotword_prefs_voice_everywhere_title);
                String string2 = this.f258445b.f258409b.getString(R.string.hotword_prefs_voice_everywhere_subtitle, new Object[]{d});
                C92597d dVar = this.f258445b;
                C92602a aVar = this.f258447d;
                string.getClass();
                string2.getClass();
                dVar.getClass();
                aVar.getClass();
                C89994f fVar = (C89994f) alVar.f258364a.mo17428b();
                fVar.getClass();
                C92486a aVar2 = (C92486a) alVar.f258365b.mo17428b();
                aVar2.getClass();
                ((C90021c) alVar.f258366c.mo17428b()).getClass();
                C91022f fVar2 = (C91022f) alVar.f258367d.mo17428b();
                fVar2.getClass();
                return new C92554g(new C92582ak(string, string2, dVar, aVar, fVar, aVar2, fVar2));
            } else if (i == 3) {
                C92615j jVar = (C92615j) this.f258496m.mo27525b();
                String string3 = this.f258445b.f258409b.getString(R.string.hotword_pref_title_always_on);
                String string4 = this.f258445b.f258409b.getString(R.string.hotword_pref_summary_always_on, new Object[]{d});
                C92597d dVar2 = this.f258445b;
                C92602a aVar3 = this.f258447d;
                string3.getClass();
                string4.getClass();
                dVar2.getClass();
                aVar3.getClass();
                C89994f fVar3 = (C89994f) jVar.f258471a.mo17428b();
                fVar3.getClass();
                C92486a aVar4 = (C92486a) jVar.f258472b.mo17428b();
                aVar4.getClass();
                C91022f fVar4 = (C91022f) jVar.f258474d.mo17428b();
                fVar4.getClass();
                C86124t tVar = (C86124t) jVar.f258475e.mo17428b();
                tVar.getClass();
                C42876ab abVar = (C42876ab) jVar.f258476f.mo17428b();
                abVar.getClass();
                C60887da daVar = (C60887da) jVar.f258477g.mo17428b();
                daVar.getClass();
                C9325m mVar = (C9325m) jVar.f258478h.mo17428b();
                mVar.getClass();
                return new C92554g(new C92614i(string3, string4, dVar2, aVar3, fVar3, aVar4, (C92518d) jVar.f258473c.mo17428b(), fVar4, tVar, abVar, daVar, mVar));
            } else if (i != 4) {
                if (i == 5) {
                    C92602a aVar5 = this.f258447d;
                    aVar5.getClass();
                    C92486a aVar6 = (C92486a) ((C92579ah) this.f258498o.mo27525b()).f258353a.mo17428b();
                    aVar6.getClass();
                    return new C92578ag(aVar5, aVar6);
                } else if (i == 7) {
                    return new C92554g(((C92574ac) this.f258499p.mo27525b()).mo87353a(this.f258445b, this.f258447d));
                } else {
                    if (i == 8) {
                        C92626u uVar = (C92626u) this.f258500q.mo27525b();
                        C92597d dVar3 = this.f258445b;
                        C92602a aVar7 = this.f258447d;
                        dVar3.getClass();
                        aVar7.getClass();
                        C90021c cVar = (C90021c) uVar.f258527a.mo17428b();
                        cVar.getClass();
                        C89994f fVar5 = (C89994f) uVar.f258528b.mo17428b();
                        fVar5.getClass();
                        SharedPreferences sharedPreferences = (SharedPreferences) uVar.f258529c.mo17428b();
                        sharedPreferences.getClass();
                        C91022f fVar6 = (C91022f) uVar.f258530d.mo17428b();
                        fVar6.getClass();
                        return new C92625t(dVar3, aVar7, cVar, fVar5, sharedPreferences, fVar6);
                    } else if (i == 11) {
                        C92623r rVar = (C92623r) this.f258502s.mo27525b();
                        return new C92622q(this.f258489f);
                    } else if ("voice_model_controller".equals(mo82940b(preference))) {
                        return new C92554g(((C92592au) this.f258501r.mo27525b()).mo87366a(this.f258489f, this.f258445b, this.f258447d));
                    } else {
                        return null;
                    }
                }
            } else if (this.f258446c.mo87378a()) {
                C92628w wVar = (C92628w) this.f258497n.mo27525b();
                String c = this.f258445b.mo87369c();
                String b = this.f258445b.mo87368b();
                C92597d dVar4 = this.f258445b;
                C92602a aVar8 = this.f258447d;
                c.getClass();
                b.getClass();
                dVar4.getClass();
                aVar8.getClass();
                C89994f fVar7 = (C89994f) wVar.f258532a.mo17428b();
                fVar7.getClass();
                C92486a aVar9 = (C92486a) wVar.f258533b.mo17428b();
                aVar9.getClass();
                C91022f fVar8 = (C91022f) wVar.f258535d.mo17428b();
                fVar8.getClass();
                C86124t tVar2 = (C86124t) wVar.f258536e.mo17428b();
                tVar2.getClass();
                C42876ab abVar2 = (C42876ab) wVar.f258537f.mo17428b();
                abVar2.getClass();
                C60887da daVar2 = (C60887da) wVar.f258538g.mo17428b();
                daVar2.getClass();
                C9325m mVar2 = (C9325m) wVar.f258539h.mo17428b();
                mVar2.getClass();
                return new C92554g(new C92627v(c, b, dVar4, aVar8, fVar7, aVar9, (C92518d) wVar.f258534c.mo17428b(), fVar8, tVar2, abVar2, daVar2, mVar2));
            } else {
                C92572aa aaVar2 = (C92572aa) this.f258495l.mo27525b();
                String c2 = this.f258445b.mo87369c();
                String b2 = this.f258445b.mo87368b();
                C92597d dVar5 = this.f258445b;
                C92602a aVar10 = this.f258447d;
                c2.getClass();
                b2.getClass();
                dVar5.getClass();
                aVar10.getClass();
                C89994f fVar9 = (C89994f) aaVar2.f258332a.mo17428b();
                fVar9.getClass();
                C92486a aVar11 = (C92486a) aaVar2.f258333b.mo17428b();
                aVar11.getClass();
                C90021c cVar2 = (C90021c) aaVar2.f258334c.mo17428b();
                cVar2.getClass();
                C91022f fVar10 = (C91022f) aaVar2.f258335d.mo17428b();
                fVar10.getClass();
                return new C92554g(new C92631z(c2, b2, dVar5, aVar10, fVar9, aVar11, cVar2, fVar10));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo82940b(Preference preference) {
        String key = preference.getKey();
        if (key == null) {
            return null;
        }
        return C92591at.f258382a.contains(key) ? "voice_model_controller" : key;
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        String key = preference.getKey();
        C58976aa aaVar = C58975e.f156826a;
        int a = C92607f.m152511a(preference);
        int i = a - 1;
        if (a != 0) {
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    return this.f258446c.mo87380c() || this.f258446c.mo87378a() || !this.f258446c.mo87379b() || m152549o();
                }
                if (i == 3) {
                    return this.f258446c.mo87380c() || !this.f258446c.mo87378a() || !this.f258446c.mo87379b() || m152549o();
                }
                if (i == 4) {
                    return !this.f258446c.mo87380c() || m152549o();
                }
                if (i == 5) {
                    if (!this.f258446c.mo87380c() && this.f258446c.mo87379b()) {
                        z = false;
                    }
                    if (z) {
                        ((SharedPreferences) this.f258445b.f258411d.mo27525b()).edit().putBoolean("hotword_from_lock_screen", false).apply();
                    }
                    return z;
                } else if (i == 7) {
                    boolean b = this.f258446c.mo87379b();
                    if (!this.f258490g.mo79746e(C90014bt.f247232dK) || !b) {
                        C89994f fVar = this.f258491h;
                        EventForDump.m147676e(5, "personal response not support");
                        fVar.mo83837C(false);
                    } else if (!this.f258490g.mo79746e(C90014bt.f247233dL)) {
                        return false;
                    }
                    return true;
                } else if (m152550p(key)) {
                    return !this.f258446c.mo87379b() || m152549o();
                } else {
                    return super.mo82950l(preference);
                }
            } else if (m152549o()) {
                return false;
            } else {
                return this.f258446c.mo87380c();
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo87386m(Preference preference) {
        String key = preference.getKey();
        C58976aa aaVar = C58975e.f156826a;
        int a = C92607f.m152511a(preference);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 5 || i == 7) {
            mo87387n(preference);
        } else if (m152550p(key)) {
            mo87387n(preference);
        }
    }
}
