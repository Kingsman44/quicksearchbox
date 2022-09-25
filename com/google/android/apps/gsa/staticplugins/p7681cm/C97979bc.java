package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.os.Bundle;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bc */
/* compiled from: PG */
final class C97979bc extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f273569a;

    /* renamed from: b */
    final /* synthetic */ PreferenceScreen f273570b;

    /* renamed from: c */
    final /* synthetic */ C97980bd f273571c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97979bc(C97980bd bdVar, SwitchPreference switchPreference, PreferenceScreen preferenceScreen) {
        super("Get launcher pref result");
        this.f273571c = bdVar;
        this.f273569a = switchPreference;
        this.f273570b = preferenceScreen;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C97980bd.f273572a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeScreenPrefCtrler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30403)).mo56386p("Failed to get launcher settings");
        this.f273570b.removePreference(this.f273569a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Bundle bundle = (Bundle) obj;
        C97980bd bdVar = this.f273571c;
        SwitchPreference switchPreference = this.f273569a;
        if (bundle == null) {
            switchPreference.setEnabled(false);
            switchPreference.setChecked(false);
            return;
        }
        switchPreference.setEnabled(true);
        switchPreference.setChecked(bundle.getBoolean("value"));
        if (switchPreference.getKey().equals("pref_show_predictions")) {
            switchPreference.setOnPreferenceChangeListener(bdVar.f273575d);
        } else {
            switchPreference.setOnPreferenceChangeListener(new C97965ay(bdVar, switchPreference));
        }
    }
}
