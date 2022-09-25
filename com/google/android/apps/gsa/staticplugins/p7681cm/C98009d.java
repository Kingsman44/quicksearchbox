package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6807j.C86133b;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.customtabs.C98585aj;
import com.google.android.apps.gsa.staticplugins.customtabs.C98664g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.d */
/* compiled from: PG */
public final class C98009d extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public static final C59071e f273666a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.d");

    /* renamed from: b */
    public C60870cx f273667b;

    /* renamed from: c */
    public C86133b f273668c;

    /* renamed from: d */
    private final Context f273669d;

    /* renamed from: e */
    private final C90929bz f273670e;

    /* renamed from: f */
    private final C68214a f273671f;

    /* renamed from: g */
    private SwitchPreference f273672g;

    public C98009d(Context context, C90929bz bzVar, C68214a aVar) {
        this.f273669d = context;
        this.f273670e = bzVar;
        this.f273671f = aVar;
        C98585aj ajVar = (C98585aj) ((C58833ax) aVar.mo27525b()).mo56107c();
        this.f273668c = ajVar.mo91202a();
        C60870cx b = ((C98664g) ajVar.f275347a.mo17428b()).mo91248b();
        this.f273667b = b;
        bzVar.mo85147l(b, new C98003c(this));
    }

    /* renamed from: a */
    public final void mo90878a() {
        C86133b bVar;
        String str;
        SwitchPreference switchPreference = this.f273672g;
        if (switchPreference != null && (bVar = this.f273668c) != null) {
            switchPreference.setEnabled(bVar.mo79781e());
            SwitchPreference switchPreference2 = this.f273672g;
            C86133b bVar2 = this.f273668c;
            if (bVar2.mo79781e()) {
                if (TextUtils.isEmpty(bVar2.mo79778a()) || bVar2.mo79780c()) {
                    str = this.f273669d.getString(R.string.use_custom_tabs_enabled_summary);
                } else {
                    str = this.f273669d.getString(R.string.use_custom_tabs_primary_account, new Object[]{bVar2.mo79778a()});
                }
            } else if (bVar2.mo79783g()) {
                str = this.f273669d.getString(R.string.use_custom_tabs_unavailable_need_first_run_done);
            } else {
                str = this.f273669d.getString(R.string.use_custom_tabs_unavailable_update_chrome);
            }
            switchPreference2.setSummaryOn(str);
        }
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        SwitchPreference switchPreference = (SwitchPreference) preference;
        this.f273672g = switchPreference;
        switchPreference.setOnPreferenceChangeListener(this);
        mo90878a();
    }

    /* renamed from: e */
    public final void mo82943e() {
        C60870cx cxVar = this.f273667b;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (!(preference instanceof SwitchPreference)) {
            return true;
        }
        if (Boolean.TRUE.equals(obj)) {
            C89949q.m146523g(750);
            return true;
        }
        C89949q.m146523g(749);
        return true;
    }
}
