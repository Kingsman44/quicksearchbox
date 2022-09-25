package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bd */
/* compiled from: PG */
final class C80675bd extends C80734di {

    /* renamed from: b */
    private final String f221499b;

    /* renamed from: c */
    private final String f221500c;

    /* renamed from: d */
    private final C80831aj f221501d;

    /* renamed from: e */
    private final String f221502e;

    /* renamed from: f */
    private final int f221503f;

    public C80675bd(String str, String str2, C80831aj ajVar, int i, String str3) {
        this.f221499b = str;
        this.f221500c = str2;
        this.f221501d = ajVar;
        this.f221503f = i;
        this.f221502e = str3;
    }

    /* renamed from: a */
    public final C80831aj mo74538a() {
        return this.f221501d;
    }

    /* renamed from: b */
    public final String mo74539b() {
        return this.f221502e;
    }

    /* renamed from: c */
    public final String mo74540c() {
        return this.f221500c;
    }

    /* renamed from: d */
    public final String mo74541d() {
        return this.f221499b;
    }

    /* renamed from: e */
    public final int mo74542e() {
        return this.f221503f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80734di) {
            C80734di diVar = (C80734di) obj;
            if (this.f221499b.equals(diVar.mo74541d()) && this.f221500c.equals(diVar.mo74540c()) && this.f221501d.equals(diVar.mo74538a())) {
                int i = this.f221503f;
                int e = diVar.mo74542e();
                if (i != 0) {
                    return i == e && this.f221502e.equals(diVar.mo74539b());
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.f221499b.hashCode() ^ 1000003) * 1000003) ^ this.f221500c.hashCode()) * 1000003) ^ this.f221501d.hashCode()) * 1000003;
        int i = this.f221503f;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.f221502e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str = this.f221499b;
        String str2 = this.f221500c;
        String valueOf = String.valueOf(this.f221501d);
        int i = this.f221503f;
        String str3 = this.f221502e;
        return "HeroChip{text=" + str + ", subText=" + str2 + ", clickAction=" + valueOf + ", type=" + C80733dh.m128573a(i) + ", imageUrl=" + str3 + "}";
    }
}
