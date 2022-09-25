package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.y */
/* compiled from: PG */
public final /* synthetic */ class C95168y implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ Runnable f266268a;

    public /* synthetic */ C95168y(Runnable runnable) {
        this.f266268a = runnable;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        Runnable runnable = this.f266268a;
        for (int valueOf : iArr) {
            if (Integer.valueOf(valueOf).intValue() != 0) {
                C59104x d = C95144aj.f266188a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoWorker");
                ((C59052c) ((C59052c) d).mo56372aa(18209)).mo56386p("Connect not granted");
                return;
            }
            runnable.run();
        }
    }
}
