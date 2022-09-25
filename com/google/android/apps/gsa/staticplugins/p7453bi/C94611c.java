package com.google.android.apps.gsa.staticplugins.p7453bi;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.c */
/* compiled from: PG */
public final class C94611c extends C94614f {

    /* renamed from: a */
    private final int f264619a;

    /* renamed from: b */
    private final Object f264620b;

    /* renamed from: c */
    private final C58833ax f264621c;

    public C94611c(int i, Object obj, C58833ax axVar) {
        this.f264619a = i;
        if (obj != null) {
            this.f264620b = obj;
            this.f264621c = axVar;
            return;
        }
        throw new NullPointerException("Null attachedObject");
    }

    /* renamed from: a */
    public final int mo88542a() {
        return this.f264619a;
    }

    /* renamed from: b */
    public final C58833ax mo88543b() {
        return this.f264621c;
    }

    /* renamed from: c */
    public final Object mo88544c() {
        return this.f264620b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C94614f) {
            C94614f fVar = (C94614f) obj;
            return this.f264619a == fVar.mo88542a() && this.f264620b.equals(fVar.mo88544c()) && this.f264621c.equals(fVar.mo88543b());
        }
    }

    public final int hashCode() {
        return ((((this.f264619a ^ 1000003) * 1000003) ^ this.f264620b.hashCode()) * 1000003) ^ this.f264621c.hashCode();
    }

    public final String toString() {
        int i = this.f264619a;
        String obj = this.f264620b.toString();
        String obj2 = this.f264621c.toString();
        return "HttpEventData{requestId=" + i + ", attachedObject=" + obj + ", clientResponseFuture=" + obj2 + "}";
    }
}
