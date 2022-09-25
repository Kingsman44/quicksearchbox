package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.Status;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.k */
/* compiled from: PG */
public final /* synthetic */ class C30952k implements C143712ae {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f83400a;

    /* renamed from: b */
    public final /* synthetic */ Executor f83401b;

    /* renamed from: c */
    public final /* synthetic */ C58817ah f83402c;

    public /* synthetic */ C30952k(SettableFuture settableFuture, Executor executor, C58817ah ahVar) {
        this.f83400a = settableFuture;
        this.f83401b = executor;
        this.f83402c = ahVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        SettableFuture settableFuture = this.f83400a;
        Executor executor = this.f83401b;
        C58817ah ahVar = this.f83402c;
        Status a = adVar.mo117629a();
        if (a.f389621g == 14) {
            throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(adVar))));
        } else if (!a.mo119097c()) {
            settableFuture.mo57357o(new C30943b(adVar, a));
            C30956o.m57770b(adVar);
        } else {
            executor.execute(new C30954m(settableFuture, ahVar, adVar));
        }
    }
}
