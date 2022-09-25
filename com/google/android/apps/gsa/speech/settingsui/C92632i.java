package com.google.android.apps.gsa.speech.settingsui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.configuration.C74464a;
import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.settingsui.language.C92648l;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92554g;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.gsa.voiceime.C118689a;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.C121181d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.i */
/* compiled from: PG */
public final class C92632i extends C88987b implements Preference.OnPreferenceClickListener {

    /* renamed from: g */
    public static final /* synthetic */ int f258551g = 0;

    /* renamed from: h */
    private static final C58528ij f258552h = C58528ij.m90012L("language", "profanityFilter", "downloadLanguagePacks");

    /* renamed from: b */
    public final C86124t f258553b;

    /* renamed from: c */
    final C92567h f258554c = new C92567h(this);

    /* renamed from: d */
    public final C90929bz f258555d;

    /* renamed from: e */
    Preference f258556e;

    /* renamed from: f */
    boolean f258557f;

    /* renamed from: i */
    private final C89994f f258558i;

    /* renamed from: j */
    private final Activity f258559j;

    /* renamed from: k */
    private final C58881cr f258560k;

    /* renamed from: l */
    private final C86123s f258561l = new C92566g(this);

    /* renamed from: m */
    private final C69464a f258562m;

    /* renamed from: n */
    private final bm f258563n;

    /* renamed from: o */
    private final C118561t f258564o;

    /* renamed from: p */
    private final C68214a f258565p;

    /* renamed from: q */
    private final C68214a f258566q;

    /* renamed from: r */
    private final C58833ax f258567r;

    /* renamed from: s */
    private final C68214a f258568s;

    /* renamed from: t */
    private boolean f258569t;

    /* renamed from: u */
    private final SharedPreferences f258570u;

    /* renamed from: v */
    private final C68214a f258571v;

    /* renamed from: w */
    private int f258572w = 1;

    public C92632i(C89994f fVar, Activity activity, C58881cr crVar, C86124t tVar, C90929bz bzVar, C69464a aVar, SharedPreferences sharedPreferences, bm bmVar, Bundle bundle, C118561t tVar2, C68214a aVar2, C68214a aVar3, C58833ax axVar, C68214a aVar4, C68214a aVar5) {
        Bundle bundle2 = bundle;
        this.f258558i = fVar;
        this.f258559j = activity;
        this.f258560k = crVar;
        this.f258553b = tVar;
        this.f258555d = bzVar;
        this.f258562m = aVar;
        this.f258570u = sharedPreferences;
        this.f258563n = bmVar;
        this.f258564o = tVar2;
        this.f258565p = aVar2;
        this.f258566q = aVar3;
        this.f258567r = axVar;
        this.f258568s = aVar4;
        this.f258571v = aVar5;
        if (bundle2 != null) {
            this.f258569t = bundle.getBoolean("from_opa_settings", false);
            this.f258572w = C118689a.m197029a()[bundle.getInt("extra_transcription_voice_settings_entry_point", 0)];
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: o */
    private final boolean m152575o() {
        return this.f258569t && this.f258563n.u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        String b = mo82940b(preference);
        if ("language".equals(b)) {
            return new C92648l(this.f258558i, this.f258559j, (C92518d) this.f258562m.mo17428b(), this.f258570u, this.f258563n, this.f258564o, this.f258566q);
        }
        if ("ttsMode".equals(b)) {
            return new C92554g(new C92565f(this.f258559j, this.f258570u, (C121181d) this.f258568s.mo27525b()));
        }
        if ("bluetoothHeadset".equals(b)) {
            return new C92547a(this.f258553b, (C58833ax) this.f258571v.mo27525b());
        }
        if ("voice_ime_composite_controller".equals(b)) {
            return new C92634k(this.f258560k);
        }
        if ("lockscreen_search_bluetooth".equals(b) || "lockscreen_search_headset".equals(b)) {
            return new C92564e(this.f258558i, this.f258567r, this.f258559j, this.f258553b);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo82940b(Preference preference) {
        String key = preference.getKey();
        if (key == null) {
            return null;
        }
        return C92634k.f258586b.contains(key) ? "voice_ime_composite_controller" : key;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if ("hotword".equals(preference.getKey())) {
            this.f258556e = preference;
            if (this.f258563n.q()) {
                preference.setTitle(R.string.prefTitle_hotwordDetector_opa);
            }
            mo87401n(true, mo87400m());
            return;
        }
        super.mo82941c(preference);
    }

    /* renamed from: f */
    public final void mo82944f() {
        super.mo82944f();
        this.f258553b.mo79740k(this.f258561l);
    }

    /* renamed from: g */
    public final void mo82945g() {
        super.mo82945g();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f258556e != null) {
            this.f258557f = true;
            this.f258553b.mo79740k(this.f258561l);
            if (!this.f258553b.mo79760z()) {
                mo87401n(false, R.string.cloud_search_history_summary_fetching);
                ((C74464a) this.f258565p.mo27525b()).mo70780a();
                this.f258553b.mo79738i(this.f258561l);
            } else if (this.f258557f) {
                mo87401n(true, mo87400m());
            }
        }
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        String key = preference.getKey();
        int i = this.f258572w;
        if (i == 2 || i == 3) {
            if (!f258552h.contains(key)) {
                return true;
            }
            return super.mo82950l(preference);
        } else if ("language".equals(key)) {
            return m152575o();
        } else {
            if ("hotword".equals(key)) {
                if ((!this.f258553b.mo79746e(C90110fh.f250606aD) || this.f258563n.s()) && !m152575o()) {
                    return false;
                }
                return true;
            } else if ("ttsMode".equals(key)) {
                return m152575o();
            } else {
                if ("handsFree".equals(key)) {
                    return m152575o();
                }
                if (key.equals("ok_google_preference")) {
                    boolean z = this.f258563n.q() && !this.f258563n.w();
                    boolean z2 = this.f258553b.mo79746e(C90110fh.f250606aD) && !this.f258563n.s();
                    if (z || z2) {
                        return true;
                    }
                    return false;
                } else if (!this.f258553b.mo79746e(C90110fh.f250679bi) || !"profanityFilter".equals(key)) {
                    return super.mo82950l(preference);
                } else {
                    return true;
                }
            }
        }
    }

    /* renamed from: m */
    public final int mo87400m() {
        if (this.f258563n.q()) {
            return this.f258563n.t() ? R.string.hotword_pref_subtitle_opa_supported_locale : R.string.hotword_pref_subtitle_opa_unsupported_locale;
        }
        return 0;
    }

    /* renamed from: n */
    public final void mo87401n(boolean z, int i) {
        this.f258556e.setEnabled(z);
        if (i == 0) {
            this.f258556e.setSummary(BuildConfig.FLAVOR);
        } else {
            this.f258556e.setSummary(i);
        }
    }

    public final boolean onPreferenceClick(Preference preference) {
        return false;
    }
}
