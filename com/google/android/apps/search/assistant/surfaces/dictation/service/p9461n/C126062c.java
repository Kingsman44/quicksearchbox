package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.c */
/* compiled from: PG */
final class C126062c extends C126140ex {

    /* renamed from: a */
    public final long f347430a;

    /* renamed from: b */
    public final String f347431b;

    public C126062c(long j, String str) {
        this.f347430a = j;
        this.f347431b = str;
    }

    /* renamed from: a */
    public final long mo107298a() {
        return this.f347430a;
    }

    /* renamed from: b */
    public final String mo107299b() {
        return this.f347431b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126140ex) {
            C126140ex exVar = (C126140ex) obj;
            return this.f347430a == exVar.mo107298a() && this.f347431b.equals(exVar.mo107299b());
        }
    }

    public final int hashCode() {
        long j = this.f347430a;
        return this.f347431b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f347430a;
        String str = this.f347431b;
        return "SequenceTag{replacing=" + j + ", incremental=" + str + "}";
    }
}
