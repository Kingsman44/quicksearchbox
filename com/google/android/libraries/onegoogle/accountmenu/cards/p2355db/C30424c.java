package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import com.google.android.libraries.onegoogle.accountmenu.cards.p2354a.C30345a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.c */
/* compiled from: PG */
final class C30424c extends C30432k {

    /* renamed from: a */
    private final String f82225a;

    /* renamed from: b */
    private final C30345a f82226b;

    /* renamed from: c */
    private final long f82227c;

    /* renamed from: d */
    private final int f82228d;

    public C30424c(String str, C30345a aVar, long j, int i) {
        this.f82225a = str;
        this.f82226b = aVar;
        this.f82227c = j;
        this.f82228d = i;
    }

    /* renamed from: a */
    public final int mo36002a() {
        return this.f82228d;
    }

    /* renamed from: b */
    public final long mo36003b() {
        return this.f82227c;
    }

    /* renamed from: c */
    public final C30345a mo36004c() {
        return this.f82226b;
    }

    /* renamed from: d */
    public final String mo36005d() {
        return this.f82225a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30432k) {
            C30432k kVar = (C30432k) obj;
            return this.f82225a.equals(kVar.mo36005d()) && this.f82226b.equals(kVar.mo36004c()) && this.f82227c == kVar.mo36003b() && this.f82228d == kVar.mo36002a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f82225a.hashCode();
        int hashCode2 = this.f82226b.hashCode();
        long j = this.f82227c;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f82228d;
    }

    public final String toString() {
        String str = this.f82225a;
        String obj = this.f82226b.toString();
        long j = this.f82227c;
        int i = this.f82228d;
        return "StorageCardDecorationState{accountIdentifier=" + str + ", storageState=" + obj + ", lastDecorationConsumedTime=" + j + ", totalTimesConsumed=" + i + "}";
    }
}
