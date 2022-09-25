package com.google.android.libraries.elements.p1729h;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.elements.h.c */
/* compiled from: PG */
final class C21205c extends C21228z {

    /* renamed from: a */
    public C21225w f59497a;

    /* renamed from: b */
    public String f59498b;

    /* renamed from: c */
    private C58528ij f59499c;

    /* renamed from: d */
    private int f59500d;

    /* renamed from: e */
    private byte f59501e;

    /* renamed from: a */
    public final C21198aa mo26250a() {
        C58528ij ijVar;
        if (this.f59501e == 1 && (ijVar = this.f59499c) != null) {
            return new C21206d(ijVar, this.f59497a, this.f59498b, this.f59500d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f59499c == null) {
            sb.append(" templateUris");
        }
        if (this.f59501e == 0) {
            sb.append(" materializationCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo26251b(int i) {
        this.f59500d = i;
        this.f59501e = 1;
    }

    /* renamed from: c */
    public final void mo26252c(C58528ij ijVar) {
        if (ijVar != null) {
            this.f59499c = ijVar;
            return;
        }
        throw new NullPointerException("Null templateUris");
    }
}
