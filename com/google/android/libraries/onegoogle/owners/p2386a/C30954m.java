package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.api.C143711ad;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.m */
/* compiled from: PG */
public final /* synthetic */ class C30954m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f83405a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f83406b;

    /* renamed from: c */
    public final /* synthetic */ C143711ad f83407c;

    public /* synthetic */ C30954m(SettableFuture settableFuture, C58817ah ahVar, C143711ad adVar) {
        this.f83405a = settableFuture;
        this.f83406b = ahVar;
        this.f83407c = adVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f83405a;
        C58817ah ahVar = this.f83406b;
        C143711ad adVar = this.f83407c;
        try {
            settableFuture.mo57356n(ahVar.apply(adVar));
        } catch (RuntimeException e) {
            settableFuture.mo57357o(e);
        } finally {
            C30956o.m57770b(adVar);
        }
    }
}
