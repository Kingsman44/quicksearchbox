package com.google.apps.tiktok.p3644h;

import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.apps.tiktok.h.n */
/* compiled from: PG */
public final class C47137n extends C47140q {

    /* renamed from: a */
    public String f122753a;

    /* renamed from: b */
    public Integer f122754b;

    /* renamed from: c */
    private C61373ao f122755c;

    /* renamed from: a */
    public final C47141r mo51034a() {
        C61373ao aoVar = this.f122755c;
        if (aoVar != null) {
            return new C47138o(this.f122753a, this.f122754b, aoVar);
        }
        throw new IllegalStateException("Missing required properties: rpcServiceConfig");
    }

    /* renamed from: b */
    public final void mo51035b(C61373ao aoVar) {
        if (aoVar != null) {
            this.f122755c = aoVar;
            return;
        }
        throw new NullPointerException("Null rpcServiceConfig");
    }
}
