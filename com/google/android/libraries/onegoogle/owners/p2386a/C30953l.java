package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.api.C143854z;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.l */
/* compiled from: PG */
public final /* synthetic */ class C30953l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f83403a;

    /* renamed from: b */
    public final /* synthetic */ C143854z f83404b;

    public /* synthetic */ C30953l(SettableFuture settableFuture, C143854z zVar) {
        this.f83403a = settableFuture;
        this.f83404b = zVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f83403a;
        C143854z zVar = this.f83404b;
        if (settableFuture.value instanceof C60873d.C60875b) {
            zVar.mo117320e();
        }
    }
}
