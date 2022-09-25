package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.az */
/* compiled from: PG */
public final class C106460az implements C131077g {

    /* renamed from: a */
    public final C85664bo f296943a;

    /* renamed from: b */
    public final C58974d f296944b;

    /* renamed from: c */
    private final C86054o f296945c;

    /* renamed from: d */
    private final C9684l f296946d;

    /* renamed from: e */
    private final C60888db f296947e;

    public C106460az(C86054o oVar, C9684l lVar, C85664bo boVar, C60888db dbVar, C83564a aVar) {
        this.f296945c = oVar;
        this.f296946d = lVar;
        this.f296943a = boVar;
        this.f296947e = dbVar;
        this.f296944b = aVar.mo76901b(this);
    }

    /* renamed from: a */
    public final C60870cx mo95545a() {
        C60870cx cxVar;
        if (!this.f296945c.mo79666M() || this.f296945c.mo79668a() == null) {
            ((C58970a) ((C58970a) this.f296944b.mo56226d()).mo56372aa(23089)).mo56386p("Missing user account. Cannot verify PR bit.");
            cxVar = C60856cj.m92900i(false);
        } else {
            C9684l lVar = this.f296946d;
            Account a = this.f296945c.mo79668a();
            a.getClass();
            cxVar = lVar.mo17952a(a);
        }
        return C47633f.m84733g(cxVar).mo51515h(new C106459ay(this), this.f296947e);
    }
}
