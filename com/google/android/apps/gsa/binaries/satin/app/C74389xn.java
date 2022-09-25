package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.opaonboarding.C83889aw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e.C115870c;

/* renamed from: com.google.android.apps.gsa.binaries.satin.app.xn */
/* compiled from: PG */
final class C74389xn implements C83889aw {

    /* renamed from: a */
    private final aqy f208371a;

    public C74389xn(aqy aqy) {
        this.f208371a = aqy;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65465a(Fragment fragment) {
        C115870c cVar = (C115870c) fragment;
        cVar.f321306b = (SharedPreferences) this.f208371a.a.f203126k.mo17428b();
        cVar.f321307c = (PackageManager) this.f208371a.J.mo17428b();
        cVar.f321308d = (C86124t) this.f208371a.a.f202006C.mo17428b();
    }
}
