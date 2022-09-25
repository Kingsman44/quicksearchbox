package com.google.android.apps.gsa.search.core.google.gaia.p6798a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.C84522ag;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.shared.util.p7188v.p7189a.p7190a.C91126a;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.a.c */
/* compiled from: PG */
public final class C85989c implements C84522ag {

    /* renamed from: a */
    private static final C59071e f232505a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.gaia.a.c");

    /* renamed from: b */
    private final Context f232506b;

    public C85989c(Context context) {
        this.f232506b = context;
    }

    /* renamed from: a */
    public final void mo78234a(C86117m mVar) {
        C58800sl lA = C85987a.f232504a.keySet().iterator();
        while (lA.hasNext()) {
            if (mVar.mo79735a(((Integer) lA.next()).intValue())) {
                try {
                    this.f232506b.sendBroadcast(new Intent(this.f232506b, C91126a.class));
                    return;
                } catch (NullPointerException e) {
                    C59104x c = f232505a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SSCFlagsUpdateListener");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8075)).mo56386p("Failed to send broadcast");
                    return;
                }
            }
        }
    }
}
