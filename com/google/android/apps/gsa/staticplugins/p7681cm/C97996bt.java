package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bt */
/* compiled from: PG */
public class C97996bt extends C88994i {

    /* renamed from: a */
    public final Context f273631a;

    /* renamed from: b */
    public final C85929cw f273632b;

    /* renamed from: c */
    public final C91748d f273633c;

    /* renamed from: d */
    public final String f273634d;

    public C97996bt(Context context, C85929cw cwVar, C91748d dVar, String str, C86124t tVar) {
        this.f273631a = context;
        this.f273632b = cwVar;
        this.f273633c = dVar;
        this.f273634d = str;
        C58833ax.m90834k(tVar);
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setOnPreferenceClickListener(new C97995bs(this));
    }
}
