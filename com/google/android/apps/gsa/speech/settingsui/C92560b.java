package com.google.android.apps.gsa.speech.settingsui;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.languagepack.C74626q;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.b */
/* compiled from: PG */
public final class C92560b extends C88994i implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    private final C58881cr f258304a;

    /* renamed from: b */
    private Preference f258305b;

    public C92560b(C58881cr crVar) {
        this.f258304a = crVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        this.f258305b = preference;
        preference.setOnPreferenceClickListener(this);
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        return ((Integer) this.f258304a.mo6453a()).intValue() < 100;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Context context = this.f258305b.getContext();
        context.startActivity(C74626q.m120646v(context));
        return true;
    }
}
