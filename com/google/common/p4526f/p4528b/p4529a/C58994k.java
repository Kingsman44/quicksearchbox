package com.google.common.p4526f.p4528b.p4529a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.common.f.b.a.k */
/* compiled from: PG */
public final class C58994k {

    /* renamed from: a */
    private final C58990g f156856a;

    /* renamed from: b */
    private final C60887da f156857b;

    public C58994k(C58990g gVar, C60887da daVar) {
        this.f156856a = gVar;
        this.f156857b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo56261a() {
        C59002s sVar = this.f156856a.f156851a;
        SettableFuture settableFuture = new SettableFuture();
        sVar.f156875e.execute(new C59000q(sVar, settableFuture));
        C60870cx h = C60922j.m93045h(settableFuture, C58993j.f156855a, this.f156857b);
        settableFuture.mo4106b(new C58992i(settableFuture), this.f156857b);
        return h;
    }
}
