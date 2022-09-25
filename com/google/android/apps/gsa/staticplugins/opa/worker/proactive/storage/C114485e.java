package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.e */
/* compiled from: PG */
final class C114485e extends C3966s {
    public C114485e(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C114493m mVar = (C114493m) obj;
        if (mVar.mo101341b() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, mVar.mo101341b());
        }
        if (mVar.mo101342c() == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8201c(2, mVar.mo101342c());
        }
        lVar.mo8204e(3, mVar.mo101340a());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `opa_delayed_notification` (`groupingKey`,`notificationArgs`,`uniqueId`) VALUES (?,?,?)";
    }
}
