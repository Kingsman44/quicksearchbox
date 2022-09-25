package com.google.android.apps.gsa.speech.settingsui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.bisto.C89629b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.e */
/* compiled from: PG */
public final class C92564e extends C88994i implements Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener {

    /* renamed from: a */
    private static final C59071e f258312a = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.e");

    /* renamed from: b */
    private final C89994f f258313b;

    /* renamed from: c */
    private final C58833ax f258314c;

    /* renamed from: d */
    private final Activity f258315d;

    /* renamed from: e */
    private final C86124t f258316e;

    /* renamed from: f */
    private SwitchPreference f258317f;

    /* renamed from: g */
    private SwitchPreference f258318g;

    public C92564e(C89994f fVar, C58833ax axVar, Activity activity, C86124t tVar) {
        this.f258313b = fVar;
        this.f258314c = axVar;
        this.f258315d = activity;
        this.f258316e = tVar;
    }

    /* renamed from: b */
    private final void m152418b(String str, Object obj) {
        Intent putExtra = new Intent().setClassName(this.f258315d, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setAction("com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED").putExtra("setting_key", str);
        putExtra.putExtra("setting_value", ((Boolean) obj).booleanValue());
        this.f258315d.sendBroadcast(putExtra);
    }

    /* renamed from: m */
    private final void m152419m() {
        SwitchPreference switchPreference = this.f258317f;
        if (switchPreference != null) {
            switchPreference.setChecked(this.f258313b.mo83866aC());
        }
        SwitchPreference switchPreference2 = this.f258318g;
        if (switchPreference2 != null) {
            switchPreference2.setChecked(this.f258313b.mo83867aD());
        }
    }

    /* renamed from: a */
    public final void mo87348a(SwitchPreference switchPreference, String str, boolean z) {
        m152418b(str, Boolean.valueOf(z));
        switchPreference.setChecked(z);
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int preferenceCount = preferenceGroup.getPreferenceCount();
            while (true) {
                preferenceCount--;
                if (preferenceCount >= 0) {
                    Preference preference2 = preferenceGroup.getPreference(preferenceCount);
                    if (mo82950l(preferenceGroup.getPreference(preferenceCount))) {
                        preferenceGroup.removePreference(preference2);
                    } else {
                        mo82941c(preference2);
                    }
                } else {
                    return;
                }
            }
        } else {
            if ("lockscreen_search_bluetooth".equals(preference.getKey())) {
                this.f258317f = (SwitchPreference) preference;
                preference.setOnPreferenceChangeListener(this);
            } else if ("lockscreen_search_headset".equals(preference.getKey())) {
                this.f258318g = (SwitchPreference) preference;
                preference.setOnPreferenceChangeListener(this);
            }
            m152419m();
        }
    }

    /* renamed from: g */
    public final void mo82945g() {
        m152419m();
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        return (preference.getKey().equals("lockscreen_search_bluetooth") || preference.getKey().equals("lockscreen_search_headset")) && this.f258316e.mo79746e(C90110fh.f250678bh);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SwitchPreference switchPreference;
        if (this.f258314c.mo56113h() && ((C89629b) this.f258314c.mo56107c()).mo83505e() && "lockscreen_search_headset".equals(preference.getKey())) {
            Activity activity = this.f258315d;
            Bundle bundle = new Bundle();
            bundle.putInt("assistant_surface", 8);
            C18509a c = C18522b.m35986c();
            C18523c cVar = (C18523c) c;
            cVar.f52492a = "personalization";
            cVar.f52493b = bundle;
            Intent a = c.mo24020b().mo24031a();
            a.putExtra("highlight_pr_then_hpr", true);
            activity.startActivityForResult(a, 0);
            return false;
        } else if (!"lockscreen_search_bluetooth".equals(preference.getKey()) && !"lockscreen_search_headset".equals(preference.getKey())) {
            C59104x c2 = f258312a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "HandsFreeSettingsContro");
            ((C59052c) ((C59052c) c2).mo56372aa(12900)).mo56389s("Unexpected preference change: %s", preference);
            return true;
        } else if (((Boolean) obj).booleanValue()) {
            if ("lockscreen_search_bluetooth".equals(preference.getKey())) {
                switchPreference = this.f258317f;
            } else {
                switchPreference = this.f258318g;
            }
            new AlertDialog.Builder(this.f258315d).setTitle(R.string.search_lockscreen_headsets_confirmation_title).setMessage(R.string.search_lockscreen_headsets_confirmation_body).setPositiveButton(17039370, new C92563d(this, switchPreference, preference)).setNegativeButton(17039360, new C92562c(this, switchPreference, preference)).setCancelable(false).show();
            return false;
        } else {
            m152418b(preference.getKey(), false);
            return true;
        }
    }

    public final boolean onPreferenceClick(Preference preference) {
        return false;
    }
}
