package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ay */
/* compiled from: PG */
final class C82323ay extends C82553jl {

    /* renamed from: a */
    private final String f224887a;

    /* renamed from: b */
    private final int f224888b;

    /* renamed from: c */
    private final String f224889c;

    /* renamed from: d */
    private final int f224890d;

    public C82323ay(String str, int i, String str2, int i2) {
        this.f224887a = str;
        this.f224888b = i;
        this.f224889c = str2;
        this.f224890d = i2;
    }

    /* renamed from: b */
    public final int mo75703b() {
        return this.f224888b;
    }

    /* renamed from: c */
    public final int mo75704c() {
        return this.f224890d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224887a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82553jl) {
            C82553jl jlVar = (C82553jl) obj;
            return this.f224887a.equals(jlVar.mo75583d()) && this.f224888b == jlVar.mo75703b() && this.f224889c.equals(jlVar.mo75706f()) && this.f224890d == jlVar.mo75704c();
        }
    }

    /* renamed from: f */
    public final String mo75706f() {
        return this.f224889c;
    }

    public final int hashCode() {
        return ((((((this.f224887a.hashCode() ^ 1000003) * 1000003) ^ this.f224888b) * 1000003) ^ this.f224889c.hashCode()) * 1000003) ^ this.f224890d;
    }

    public final String toString() {
        String str = this.f224887a;
        int i = this.f224888b;
        String str2 = this.f224889c;
        int i2 = this.f224890d;
        return "NgaApaDataFileProviderEvent{token=" + str + ", groupId=" + i + ", status=" + str2 + ", grpcError=" + i2 + "}";
    }
}
