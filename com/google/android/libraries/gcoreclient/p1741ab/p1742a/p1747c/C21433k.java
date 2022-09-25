package com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c;

import com.google.android.gms.wallet.firstparty.C146355c;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.C21416a;

/* renamed from: com.google.android.libraries.gcoreclient.ab.a.c.k */
/* compiled from: PG */
public final class C21433k extends C21426d {

    /* renamed from: a */
    private final C146355c f59892a = new C146355c(new GetClientTokenRequest());

    /* renamed from: a */
    public final C21416a mo26925a() {
        GetClientTokenRequest getClientTokenRequest = this.f59892a.f395379a;
        if (getClientTokenRequest.f395364a != null) {
            return new C21434l(getClientTokenRequest);
        }
        throw new NullPointerException("WalletCustomTheme is required");
    }

    /* renamed from: b */
    public final C21426d mo26926b(C21438p pVar) {
        this.f59892a.f395379a.f395364a = pVar.f59896a;
        return this;
    }

    /* renamed from: c */
    public final C21426d mo26927c() {
        this.f59892a.f395379a.f395365b = true;
        return this;
    }
}
