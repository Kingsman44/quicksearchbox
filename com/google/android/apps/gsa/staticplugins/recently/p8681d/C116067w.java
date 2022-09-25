package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.w */
/* compiled from: PG */
public final /* synthetic */ class C116067w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321835a;

    /* renamed from: b */
    public final /* synthetic */ long f321836b;

    public /* synthetic */ C116067w(C116070z zVar, long j) {
        this.f321835a = zVar;
        this.f321836b = j;
    }

    public final void run() {
        C116070z zVar = this.f321835a;
        long j = this.f321836b;
        File q = zVar.mo102447q(j);
        if (q == null) {
            C59104x c = C116070z.f321840a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RecentlyStorage");
            ((C59052c) ((C59052c) c).mo56372aa(30935)).mo56388r("Could not find screenshot to delete with id: %d", j);
        } else if (!q.delete()) {
            C59104x c2 = C116070z.f321840a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "RecentlyStorage");
            ((C59052c) ((C59052c) c2).mo56372aa(30934)).mo56388r("Failed to delete screenshot with id: %d", j);
        }
    }
}
