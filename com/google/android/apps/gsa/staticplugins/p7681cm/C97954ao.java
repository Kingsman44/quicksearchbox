package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Intent;
import android.preference.Preference;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.ao */
/* compiled from: PG */
public final /* synthetic */ class C97954ao implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97962aw f273511a;

    /* renamed from: b */
    public final /* synthetic */ Intent f273512b;

    public /* synthetic */ C97954ao(C97962aw awVar, Intent intent) {
        this.f273511a = awVar;
        this.f273512b = intent;
    }

    public final boolean onPreferenceClick(Preference preference) {
        C97962aw awVar = this.f273511a;
        awVar.f273532c.startActivity(this.f273512b);
        return true;
    }
}
