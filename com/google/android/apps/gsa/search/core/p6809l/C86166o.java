package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.gms.appdatasearch.C142805b;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.l.o */
/* compiled from: PG */
public final /* synthetic */ class C86166o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C86167p f232859a;

    /* renamed from: b */
    public final /* synthetic */ GetRecentContextCall$Request f232860b;

    public /* synthetic */ C86166o(C86167p pVar, GetRecentContextCall$Request getRecentContextCall$Request) {
        this.f232859a = pVar;
        this.f232860b = getRecentContextCall$Request;
    }

    public final Object call() {
        C86167p pVar = this.f232859a;
        return (GetRecentContextCall$Response) C142805b.f387603c.mo117684a(pVar.f253319d, this.f232860b).mo117317b(1100, TimeUnit.MILLISECONDS);
    }
}
