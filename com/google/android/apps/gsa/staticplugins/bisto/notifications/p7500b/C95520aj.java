package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.net.Uri;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C95520aj implements C95284n {

    /* renamed from: a */
    public final /* synthetic */ C95522al f267304a;

    /* renamed from: b */
    public final /* synthetic */ C95284n f267305b;

    /* renamed from: c */
    public final /* synthetic */ C95285o f267306c;

    public /* synthetic */ C95520aj(C95522al alVar, C95284n nVar, C95285o oVar) {
        this.f267304a = alVar;
        this.f267305b = nVar;
        this.f267306c = oVar;
    }

    /* renamed from: a */
    public final void mo88601a() {
        C95522al alVar = this.f267304a;
        C95284n nVar = this.f267305b;
        C95285o oVar = this.f267306c;
        Uri A = alVar.mo89427A();
        if (A == null) {
            C89655j.m145957a("no uri");
            nVar.mo88601a();
            return;
        }
        alVar.mo89428B((C95209x) null, A, false, true, oVar, nVar);
    }
}
