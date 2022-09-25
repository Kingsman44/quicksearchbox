package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.am */
/* compiled from: PG */
public final /* synthetic */ class C9567am implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C9569ao f33142a;

    public /* synthetic */ C9567am(C9569ao aoVar) {
        this.f33142a = aoVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C84533ar a = ((C84534as) this.f33142a.f33146k.mo27525b()).mo78241a();
        String str = (String) obj;
        a.mo78239e("bisto_ota_device_indexes", str);
        a.mo78236b();
        preference.mo8329n(str);
        return true;
    }
}
