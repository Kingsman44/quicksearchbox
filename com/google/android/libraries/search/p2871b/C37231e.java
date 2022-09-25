package com.google.android.libraries.search.p2871b;

import com.google.android.libraries.search.p2871b.p2895i.C37265n;

/* renamed from: com.google.android.libraries.search.b.e */
/* compiled from: PG */
final class C37231e extends C37315p {

    /* renamed from: a */
    private final C37265n f98904a;

    /* renamed from: b */
    private final long f98905b;

    public C37231e(C37265n nVar, long j) {
        this.f98904a = nVar;
        this.f98905b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo40722a() {
        return this.f98905b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C37265n mo40723b() {
        return this.f98904a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37315p) {
            C37315p pVar = (C37315p) obj;
            return this.f98904a.equals(pVar.mo40723b()) && this.f98905b == pVar.mo40722a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f98904a.hashCode();
        long j = this.f98905b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f98904a.toString();
        long j = this.f98905b;
        return "RecentAppFlow{appFlow=" + obj + ", loggedTimeNanos=" + j + "}";
    }
}
