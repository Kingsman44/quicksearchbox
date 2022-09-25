package com.google.android.gms.wallet.firstparty;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.wallet.firstparty.f */
/* compiled from: PG */
public final class C146358f implements C143711ad {

    /* renamed from: a */
    public final GetClientTokenResponse f395380a;

    /* renamed from: b */
    private final Status f395381b;

    public C146358f(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.f395381b = status;
        this.f395380a = getClientTokenResponse;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f395381b;
    }
}
