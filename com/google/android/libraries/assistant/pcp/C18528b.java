package com.google.android.libraries.assistant.pcp;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.assistant.pcp.b */
/* compiled from: PG */
final class C18528b extends C18777i {

    /* renamed from: a */
    private final C58528ij f52502a;

    /* renamed from: b */
    private final int f52503b;

    public C18528b(int i, C58528ij ijVar) {
        this.f52503b = i;
        this.f52502a = ijVar;
    }

    /* renamed from: a */
    public final C58528ij mo24042a() {
        return this.f52502a;
    }

    /* renamed from: b */
    public final int mo24043b() {
        return this.f52503b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18777i) {
            C18777i iVar = (C18777i) obj;
            return this.f52503b == iVar.mo24043b() && this.f52502a.equals(iVar.mo24042a());
        }
    }

    public final int hashCode() {
        return ((this.f52503b ^ 1000003) * 1000003) ^ this.f52502a.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f52503b - 1);
        String obj = this.f52502a.toString();
        return "ProactiveClientFetchProperties{cachingStrategy=" + num + ", featuresSubset=" + obj + "}";
    }
}
