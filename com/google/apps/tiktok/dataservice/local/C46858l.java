package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.lifecycle.C47414a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.local.l */
/* compiled from: PG */
public final /* synthetic */ class C46858l implements C47414a {

    /* renamed from: a */
    public static final /* synthetic */ C46858l f122286a = new C46858l();

    private /* synthetic */ C46858l() {
    }

    /* renamed from: a */
    public final void mo50868a(Object obj) {
        C46841ap apVar = (C46841ap) obj;
        C19559g.m37304c();
        C58838bb.m90866a(apVar.f122265a, "LocalSubscriptionStateReference was destroyed twice.");
        C58833ax a = apVar.f122265a.mo50844a();
        if (a.mo56113h()) {
            ((C60870cx) a.mo56107c()).cancel(false);
        }
        apVar.f122265a = null;
    }
}
