package com.google.android.apps.gsa.staticplugins.bisto.p7464ab;

import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ab.g */
/* compiled from: PG */
public final /* synthetic */ class C94808g implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94809h f265105a;

    /* renamed from: b */
    public final /* synthetic */ String f265106b;

    /* renamed from: c */
    public final /* synthetic */ String f265107c;

    public /* synthetic */ C94808g(C94809h hVar, String str, String str2) {
        this.f265105a = hVar;
        this.f265106b = str;
        this.f265107c = str2;
    }

    public final void run() {
        C94809h hVar = this.f265105a;
        String str = this.f265106b;
        String str2 = this.f265107c;
        if (str.contains("assistant_settings_preferred_voice:")) {
            C59104x b = C94809h.f265108a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
            ((C59052c) ((C59052c) b).mo56372aa(16914)).mo56389s("assistantVoice: %s", str2);
        }
        C84533ar a = hVar.f265110c.mo78243a().mo78241a();
        a.mo78239e(str, str2);
        a.mo78236b();
        C89651f.m145940a(hVar.f265109b, new C88489j(C87739bu.BISTO_STARTUP_PREF_CHANGED).mo82013a());
    }
}
