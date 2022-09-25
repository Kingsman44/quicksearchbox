package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.g */
/* compiled from: PG */
public final /* synthetic */ class C98012g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C98015j f273675a;

    /* renamed from: b */
    public final /* synthetic */ Preference f273676b;

    public /* synthetic */ C98012g(C98015j jVar, Preference preference) {
        this.f273675a = jVar;
        this.f273676b = preference;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C98015j jVar = this.f273675a;
        Preference preference = this.f273676b;
        Optional optional = (Optional) obj;
        C60870cx cxVar = jVar.f273681c;
        if (cxVar == null || cxVar.isCancelled()) {
            preference.setSummary(BuildConfig.FLAVOR);
        } else {
            preference.setSummary((CharSequence) optional.map(new C98014i(jVar)).orElse(BuildConfig.FLAVOR));
        }
    }
}
