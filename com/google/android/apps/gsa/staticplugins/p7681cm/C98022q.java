package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.q */
/* compiled from: PG */
public final class C98022q extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    private final Context f273701a;

    /* renamed from: b */
    private final C86127w f273702b;

    public C98022q(Context context, C86127w wVar) {
        this.f273701a = context;
        this.f273702b = wVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if ("gel_usage_stats".equals(preference.getKey())) {
            preference.setOnPreferenceChangeListener(this);
        }
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        if ("gel_usage_stats".equals(preference.getKey())) {
            Context context = this.f273701a;
            if (!C89429a.m145456n(context, C89429a.m145447e(context))) {
                return true;
            }
        }
        return false;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (!"gel_usage_stats".equals(preference.getKey())) {
            return true;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C84533ar a = this.f273702b.f232790a.f232728c.mo78241a();
        a.mo78237c("GEL.GSAPrefs.log_gel_events", booleanValue);
        a.mo78236b();
        return true;
    }
}
