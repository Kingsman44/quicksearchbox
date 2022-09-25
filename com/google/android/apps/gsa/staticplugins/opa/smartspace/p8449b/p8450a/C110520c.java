package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8449b.p8450a;

import android.content.Intent;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.b.a.c */
/* compiled from: PG */
public final class C110520c implements C46575i {

    /* renamed from: a */
    private final C83793i f308128a;

    /* renamed from: b */
    private final C86124t f308129b;

    public C110520c(C83793i iVar, C86124t tVar) {
        this.f308128a = iVar;
        this.f308129b = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        if (this.f308129b.mo79746e(C90014bt.f247697lz)) {
            C83793i iVar = this.f308128a;
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = new Intent();
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.BIRTHDAY_DATA_UPDATE");
            C74445c.m120396c(iVar.f228383c, intent);
        }
        return C60856cj.m92900i(new C4645z(C4632m.f14549a));
    }
}
