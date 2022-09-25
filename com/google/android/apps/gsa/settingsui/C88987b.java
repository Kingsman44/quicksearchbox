package com.google.android.apps.gsa.settingsui;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.settingsui.b */
/* compiled from: PG */
public abstract class C88987b implements C88990e {

    /* renamed from: a */
    public PreferenceScreen f241152a;

    /* renamed from: b */
    private final Map f241153b = new HashMap();

    /* renamed from: m */
    private final C88990e mo87386m(Preference preference) {
        String b = mo82940b(preference);
        if (b == null) {
            return null;
        }
        C88990e eVar = (C88990e) this.f241153b.get(b);
        if (eVar == null && (eVar = mo82939a(preference)) != null) {
            this.f241153b.put(b, eVar);
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C88990e mo82939a(Preference preference);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo82940b(Preference preference) {
        return preference.getKey();
    }

    /* renamed from: c */
    public void mo82941c(Preference preference) {
        C58976aa aaVar = C58975e.f156826a;
        C88990e m = mo87386m(preference);
        if (m != null) {
            m.mo82941c(preference);
        } else if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int preferenceCount = preferenceGroup.getPreferenceCount();
            while (true) {
                preferenceCount--;
                if (preferenceCount >= 0) {
                    Preference preference2 = preferenceGroup.getPreference(preferenceCount);
                    if (mo82950l(preference2)) {
                        preferenceGroup.removePreference(preference2);
                    } else {
                        mo82941c(preference2);
                    }
                } else {
                    return;
                }
            }
        } else if (preference.getKey() != null) {
            throw new C88986a(preference);
        }
    }

    /* renamed from: d */
    public final void mo82942d(Bundle bundle) {
        for (C88990e d : this.f241153b.values()) {
            d.mo82942d(bundle);
        }
    }

    /* renamed from: e */
    public void mo82943e() {
        for (C88990e e : this.f241153b.values()) {
            e.mo82943e();
        }
        this.f241153b.clear();
    }

    /* renamed from: f */
    public void mo82944f() {
        for (C88990e f : this.f241153b.values()) {
            f.mo82944f();
        }
    }

    /* renamed from: g */
    public void mo82945g() {
        for (C88990e eVar : this.f241153b.values()) {
            eVar.mo82949k(this.f241152a);
            eVar.mo82945g();
        }
    }

    /* renamed from: h */
    public final void mo82946h(Bundle bundle) {
        for (C88990e h : this.f241153b.values()) {
            h.mo82946h(bundle);
        }
    }

    /* renamed from: i */
    public final void mo82947i() {
        for (C88990e i : this.f241153b.values()) {
            i.mo82947i();
        }
    }

    /* renamed from: j */
    public final void mo82948j() {
        for (C88990e j : this.f241153b.values()) {
            j.mo82948j();
        }
    }

    /* renamed from: k */
    public void mo82949k(PreferenceScreen preferenceScreen) {
        this.f241152a = preferenceScreen;
    }

    /* renamed from: l */
    public boolean mo82950l(Preference preference) {
        C88990e m = !(preference instanceof PreferenceGroup) ? mo87386m(preference) : null;
        boolean l = m != null ? m.mo82950l(preference) : false;
        C58976aa aaVar = C58975e.f156826a;
        return l;
    }
}
