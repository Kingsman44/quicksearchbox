package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cs */
/* compiled from: PG */
public final /* synthetic */ class C102964cs implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102967cv f287527a;

    public /* synthetic */ C102964cs(C102967cv cvVar) {
        this.f287527a = cvVar;
    }

    public final void run() {
        C102967cv cvVar = this.f287527a;
        ((SharedPreferences) cvVar.f287533d.mo27525b()).registerOnSharedPreferenceChangeListener(cvVar);
        C102977f fVar = (C102977f) cvVar.f287532c.mo27525b();
        synchronized (fVar.f287552d) {
            fVar.f287553e.add(cvVar);
        }
        cvVar.f287530a.registerReceiver(new C102966cu(cvVar), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }
}
