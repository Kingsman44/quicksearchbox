package com.google.android.apps.gsa.sidekick.main.remoteservice;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84566z;
import com.google.android.sidekick.shared.remoteapi.C45330b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.remoteservice.a */
/* compiled from: PG */
public final class C91606a extends C45330b {

    /* renamed from: a */
    private final C86054o f255499a;

    /* renamed from: b */
    private final C85651bb f255500b;

    /* renamed from: c */
    private final C84566z f255501c;

    public C91606a(C86054o oVar, C85651bb bbVar, C84566z zVar) {
        this.f255499a = oVar;
        this.f255500b = bbVar;
        this.f255501c = zVar;
    }

    /* renamed from: a */
    public final Account mo49328a() {
        this.f255501c.mo78318b(getCallingUid());
        return this.f255499a.mo79668a();
    }

    /* renamed from: b */
    public final boolean mo49329b() {
        this.f255501c.mo78318b(getCallingUid());
        return this.f255500b.mo79134G();
    }
}
