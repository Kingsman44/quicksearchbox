package com.google.android.apps.gsa.search.core.service;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.state.p6864a.C86802q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.by */
/* compiled from: PG */
public final /* synthetic */ class C86658by implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86659bz f234109a;

    /* renamed from: b */
    public final /* synthetic */ Intent f234110b;

    public /* synthetic */ C86658by(C86659bz bzVar, Intent intent) {
        this.f234109a = bzVar;
        this.f234110b = intent;
    }

    public final void run() {
        C86659bz bzVar = this.f234109a;
        Intent intent = this.f234110b;
        C86663ca caVar = bzVar.f234111a;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            caVar.f234119a.mo80500c(false);
            C86802q qVar = caVar.f234119a;
            boolean isDeviceLocked = ((C84516aa) caVar.f234120b.mo27525b()).f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
            qVar.mo80499b(isDeviceLocked);
        } else if ("android.intent.action.USER_PRESENT".equals(action)) {
            caVar.f234119a.mo80499b(false);
        }
    }
}
