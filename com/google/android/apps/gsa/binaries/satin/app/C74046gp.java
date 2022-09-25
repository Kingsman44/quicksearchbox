package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.opaonboarding.C83889aw;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108887cq;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C109005z;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21590b;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21593e;

/* renamed from: com.google.android.apps.gsa.binaries.satin.app.gp */
/* compiled from: PG */
final class C74046gp implements C83889aw {

    /* renamed from: a */
    private final aqy f206243a;

    /* renamed from: b */
    private final C74206oz f206244b;

    public C74046gp(aqy aqy, C74206oz ozVar) {
        this.f206243a = aqy;
        this.f206244b = ozVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65465a(Fragment fragment) {
        C109005z zVar = (C109005z) fragment;
        zVar.f303105c = (Context) this.f206243a.g.mo17428b();
        SharedPreferences sharedPreferences = (SharedPreferences) this.f206243a.a.f203126k.mo17428b();
        zVar.f303106d = (C108887cq) this.f206243a.b.mo67489eo();
        zVar.f303107e = (C86124t) this.f206243a.a.f202006C.mo17428b();
        zVar.f303112j = (C104149a) this.f206243a.b.f200015bc.mo17428b();
        zVar.f303108f = (C83893b) this.f206244b.f207580f.mo17428b();
        C21590b bVar = (C21590b) this.f206243a.lk.mo17428b();
        C21593e eVar = (C21593e) this.f206243a.ll.mo17428b();
        aqy aqy = this.f206243a;
        zVar.f303109g = aqy.lp;
        zVar.f303110h = ((Boolean) aqy.is.mo17428b()).booleanValue();
        zVar.f303111i = this.f206244b.mo70129cw();
    }
}
