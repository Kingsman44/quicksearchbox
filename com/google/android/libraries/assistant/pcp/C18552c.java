package com.google.android.libraries.assistant.pcp;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.assistant.pcp.c */
/* compiled from: PG */
final class C18552c extends C18798k {

    /* renamed from: a */
    private C58528ij f52565a;

    /* renamed from: a */
    public final C18947l mo24050a() {
        C58528ij ijVar = this.f52565a;
        if (ijVar != null) {
            return new C18572d(ijVar);
        }
        throw new IllegalStateException("Missing required properties: featuresSubset");
    }

    /* renamed from: b */
    public final void mo24051b(C58528ij ijVar) {
        if (ijVar != null) {
            this.f52565a = ijVar;
            return;
        }
        throw new NullPointerException("Null featuresSubset");
    }
}
