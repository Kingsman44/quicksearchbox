package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58532in;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.a */
/* compiled from: PG */
final class C18783a extends C18791i {

    /* renamed from: a */
    private C18995y f52903a;

    /* renamed from: b */
    private C58528ij f52904b;

    /* renamed from: c */
    private C58532in f52905c;

    /* renamed from: a */
    public final C18792j mo24123a() {
        C58528ij ijVar;
        C58532in inVar;
        C18995y yVar = this.f52903a;
        if (yVar != null && (ijVar = this.f52904b) != null && (inVar = this.f52905c) != null) {
            return new C18784b(yVar, ijVar, inVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f52903a == null) {
            sb.append(" storedElement");
        }
        if (this.f52904b == null) {
            sb.append(" unchangedRenderedDataIds");
        }
        if (this.f52905c == null) {
            sb.append(" removedValidRenderedDataIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24124b(C58532in inVar) {
        if (inVar != null) {
            this.f52905c = inVar;
            return;
        }
        throw new NullPointerException("Null removedValidRenderedDataIds");
    }

    /* renamed from: c */
    public final void mo24125c(C18995y yVar) {
        if (yVar != null) {
            this.f52903a = yVar;
            return;
        }
        throw new NullPointerException("Null storedElement");
    }

    /* renamed from: d */
    public final void mo24126d(C58528ij ijVar) {
        if (ijVar != null) {
            this.f52904b = ijVar;
            return;
        }
        throw new NullPointerException("Null unchangedRenderedDataIds");
    }
}
