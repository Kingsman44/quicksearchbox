package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ad */
/* compiled from: PG */
public final /* synthetic */ class C9558ad implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C9559ae f33126a;

    public /* synthetic */ C9558ad(C9559ae aeVar) {
        this.f33126a = aeVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C9559ae aeVar = this.f33126a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aeVar.mo17872F(booleanValue);
        C84533ar a = ((C84534as) aeVar.f33128i.mo27525b()).mo78241a();
        a.mo78237c("bisto_spoken_notifications", booleanValue);
        a.mo78236b();
        aeVar.mo17873b();
        return true;
    }
}
