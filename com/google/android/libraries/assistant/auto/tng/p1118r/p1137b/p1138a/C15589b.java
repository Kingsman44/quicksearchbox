package com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1138a;

import com.google.assistant.p3897e.p3921j.C52081en;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.b.a.b */
/* compiled from: PG */
public final class C15589b extends C15591d {

    /* renamed from: a */
    private final long f46626a;

    /* renamed from: b */
    private final String f46627b;

    /* renamed from: c */
    private final C52081en f46628c;

    public C15589b(long j, String str, C52081en enVar) {
        this.f46626a = j;
        this.f46627b = str;
        this.f46628c = enVar;
    }

    /* renamed from: a */
    public final long mo22408a() {
        return this.f46626a;
    }

    /* renamed from: b */
    public final C52081en mo22409b() {
        return this.f46628c;
    }

    /* renamed from: c */
    public final String mo22410c() {
        return this.f46627b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15591d) {
            C15591d dVar = (C15591d) obj;
            return this.f46626a == dVar.mo22408a() && this.f46627b.equals(dVar.mo22410c()) && this.f46628c.equals(dVar.mo22409b());
        }
    }

    public final int hashCode() {
        long j = this.f46626a;
        return this.f46628c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f46627b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f46626a;
        String str = this.f46627b;
        String obj = this.f46628c.toString();
        return "PopRequest{requestID=" + j + ", queryString=" + str + ", conversationDelta=" + obj + "}";
    }
}
