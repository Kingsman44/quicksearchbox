package com.google.android.libraries.assistant.pcp;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.assistant.pcp.a */
/* compiled from: PG */
public final class C18525a extends C18773h {

    /* renamed from: a */
    public int f52500a;

    /* renamed from: b */
    private C58528ij f52501b;

    /* renamed from: a */
    public final C18777i mo24039a() {
        C58528ij ijVar;
        int i = this.f52500a;
        if (i != 0 && (ijVar = this.f52501b) != null) {
            return new C18528b(i, ijVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f52500a == 0) {
            sb.append(" cachingStrategy");
        }
        if (this.f52501b == null) {
            sb.append(" featuresSubset");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24040b(C58528ij ijVar) {
        if (ijVar != null) {
            this.f52501b = ijVar;
            return;
        }
        throw new NullPointerException("Null featuresSubset");
    }
}
