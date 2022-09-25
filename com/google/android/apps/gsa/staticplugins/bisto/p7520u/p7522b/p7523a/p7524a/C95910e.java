package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.e */
/* compiled from: PG */
class C95910e extends C95914i {

    /* renamed from: c */
    private static final C58471gg f268541c = C58485gu.m89851s("DispatchingState", "OffHeadStateInteracting", "PhoneCallStatNew", "SdkState", "TwsReconnectingInteractingState", "VQInteractingState");

    /* renamed from: d */
    private final C96023bs f268542d;

    public C95910e(C95346ax axVar, C96023bs bsVar, String str, C89492cd cdVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, str, cdVar, iVar, aVar);
        this.f268542d = bsVar;
    }

    /* renamed from: j */
    public void mo89847j(String str, Intent intent) {
        if (!f268541c.contains(str)) {
            this.f268542d.mo89831a();
        }
        super.mo89847j(str, intent);
    }
}
