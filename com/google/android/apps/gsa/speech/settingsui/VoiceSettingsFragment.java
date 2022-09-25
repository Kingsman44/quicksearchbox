package com.google.android.apps.gsa.speech.settingsui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.support.p033v7.app.C0395p;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92598e;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class VoiceSettingsFragment extends VoiceSettingsFragmentBase {

    /* renamed from: a */
    public C92633j f258284a;

    /* renamed from: b */
    public C86054o f258285b;

    /* renamed from: c */
    public C90465g f258286c;

    /* renamed from: d */
    public int f258287d;

    /* renamed from: e */
    public C92598e f258288e;

    /* renamed from: f */
    public C90021c f258289f;

    /* renamed from: g */
    public bm f258290g;

    /* renamed from: h */
    public C68214a f258291h;

    /* renamed from: com.google.android.apps.gsa.speech.settingsui.VoiceSettingsFragment$a */
    /* compiled from: PG */
    public interface C92546a {
        /* renamed from: qr */
        void mo87322qr(VoiceSettingsFragment voiceSettingsFragment);
    }

    /* renamed from: f */
    private final void m152367f() {
        Preference findPreference = findPreference("hands_free_category");
        if (findPreference != null && this.f258289f.mo79746e(C90110fh.f250678bh)) {
            if (this.f258289f.mo79746e(C90110fh.f250676bf) || (this.f258289f.mo79746e(C90110fh.f250677bg) && ((Optional) this.f258291h.mo27525b()).isPresent() && ((C74720bx) ((Optional) this.f258291h.mo27525b()).get()).mo71089f().a())) {
                getPreferenceScreen().removePreference(findPreference);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return this.f258287d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C92633j jVar = this.f258284a;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        C89994f fVar = (C89994f) jVar.f258573a.mo17428b();
        fVar.getClass();
        activity.getClass();
        C58881cr crVar = (C58881cr) jVar.f258574b.mo17428b();
        crVar.getClass();
        C86124t tVar = (C86124t) jVar.f258575c.mo17428b();
        tVar.getClass();
        C90929bz bzVar = (C90929bz) jVar.f258576d.mo17428b();
        bzVar.getClass();
        C69464a aVar = jVar.f258577e;
        SharedPreferences sharedPreferences = (SharedPreferences) jVar.f258578f.mo17428b();
        sharedPreferences.getClass();
        bm bmVar = (bm) jVar.f258579g.mo17428b();
        bmVar.getClass();
        C118561t tVar2 = (C118561t) jVar.f258580h.mo17428b();
        tVar2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) jVar.f258581i).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) jVar.f258582j).f184585a);
        a2.getClass();
        C58833ax axVar = (C58833ax) jVar.f258583k.mo17428b();
        axVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) jVar.f258584l).f184585a);
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) jVar.f258585m).f184585a);
        a4.getClass();
        return new C92632i(fVar, activity, crVar, tVar, bzVar, aVar, sharedPreferences, bmVar, arguments, tVar2, a, a2, axVar, a3, a4);
    }

    /* renamed from: c */
    public final void mo79972c() {
        super.mo79972c();
        m152367f();
    }

    public final void onCreate(Bundle bundle) {
        C91097g x;
        ((C92546a) C47266f.m84076a(getActivity(), C92546a.class)).mo87322qr(this);
        super.onCreate(bundle);
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("ok_google_preference");
        Activity activity = getActivity();
        if (!(preferenceCategory == null || !(activity instanceof C91098h) || (x = ((C91098h) activity).mo17775x()) == null)) {
            preferenceCategory.setTitle(this.f258288e.mo87377a(x, C9439b.VOICE_SETTINGS).mo87369c());
        }
        Preference findPreference = findPreference("hotword");
        if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C92635l(this));
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("keep_options_menu")) {
            Menu menu2 = menu;
            this.f258286c.mo84210a(getActivity()).mo84208a(menu2, "now_voice_settings", this.f258285b.mo79668a(), C87562e.m142218a(getActivity(), "now_voice_settings"), false, getActivity() instanceof C0395p);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("spoken-language-bcp-47".equals(str)) {
            super.mo79972c();
            m152367f();
        }
    }
}
