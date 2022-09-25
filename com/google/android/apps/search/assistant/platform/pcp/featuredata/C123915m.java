package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.m */
/* compiled from: PG */
final class C123915m implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C123990n.f342458a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.LocalDataManager");
        C0118a.m116x(d, "Failed to sync local data on PCP.", 35203, th, C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_SYNC_LOCAL_DATA_VALUE));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
