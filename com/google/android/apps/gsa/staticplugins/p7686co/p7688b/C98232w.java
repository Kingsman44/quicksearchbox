package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.w */
/* compiled from: PG */
public final /* synthetic */ class C98232w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274267a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f274268b;

    public /* synthetic */ C98232w(C98211bl blVar, C58485gu guVar) {
        this.f274267a = blVar;
        this.f274268b = guVar;
    }

    public final Object apply(Object obj) {
        C98211bl blVar = this.f274267a;
        C58485gu guVar = this.f274268b;
        if (((Boolean) obj).booleanValue()) {
            Intent intent = new Intent("com.google.android.apps.now.DEFERRED_ACTIONS_COMMITTED");
            intent.setPackage(blVar.f274216f.getPackageName());
            blVar.f274216f.sendBroadcast(intent);
        } else if (!guVar.isEmpty()) {
            C59104x c = C98211bl.f274214e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EuaStore");
            ((C59052c) ((C59052c) c).mo56372aa(30577)).mo56386p("Failed to commit the deferred actions");
        }
        return C118826c.f331422a;
    }
}
