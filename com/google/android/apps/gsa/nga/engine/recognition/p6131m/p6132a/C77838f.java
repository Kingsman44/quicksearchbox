package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.f */
/* compiled from: PG */
final class C77838f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C77839g f214414a;

    public C77838f(C77839g gVar) {
        this.f214414a = gVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C80275dd ddVar = (C80275dd) obj;
        if (ddVar.f220290a == 3) {
            C77839g gVar = this.f214414a;
            C80156ce ceVar = (C80156ce) ddVar.f220291b;
            long j = ceVar.f219958b;
            C60870cx cxVar = (C60870cx) gVar.f214416b.remove(Long.valueOf(j));
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            if (!ceVar.f219959c) {
                gVar.mo72837b(j);
            } else {
                ((C58970a) ((C58970a) C77839g.f214415a.mo56224b()).mo56372aa(4492)).mo56388r("Removed network: %s from blacklist", j);
            }
        }
    }
}
