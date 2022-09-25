package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.opaonboarding.C83889aw;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108887cq;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108962fk;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21590b;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21593e;

/* compiled from: PG */
final class awo implements C83889aw {

    /* renamed from: a */
    private final aqy f204580a;

    /* renamed from: b */
    private final C74206oz f204581b;

    public awo(aqy aqy, C74206oz ozVar) {
        this.f204580a = aqy;
        this.f204581b = ozVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65465a(Fragment fragment) {
        C108962fk fkVar = (C108962fk) fragment;
        fkVar.f303005c = (Context) this.f204580a.g.mo17428b();
        SharedPreferences sharedPreferences = (SharedPreferences) this.f204580a.a.f203126k.mo17428b();
        fkVar.f303006d = (C108887cq) this.f204580a.b.mo67489eo();
        fkVar.f303007e = (C86124t) this.f204580a.a.f202006C.mo17428b();
        fkVar.f303008f = (C83893b) this.f204581b.f207580f.mo17428b();
        C21590b bVar = (C21590b) this.f204580a.lk.mo17428b();
        C21593e eVar = (C21593e) this.f204580a.ll.mo17428b();
        fkVar.f303009g = this.f204580a.lp;
    }
}
