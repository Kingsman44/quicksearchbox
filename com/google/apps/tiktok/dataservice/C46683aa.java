package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.aa */
/* compiled from: PG */
final class C46683aa extends C46790dg {

    /* renamed from: a */
    public final C46689ag f121961a;

    /* renamed from: b */
    public final long f121962b;

    /* renamed from: c */
    public final C46763cg f121963c;

    /* renamed from: d */
    public final C46769cm f121964d;

    /* renamed from: e */
    public final int f121965e;

    /* renamed from: f */
    public final long f121966f;

    public C46683aa(C46689ag agVar, long j, C46763cg cgVar, C46769cm cmVar, int i, long j2) {
        if (agVar != null) {
            this.f121961a = agVar;
            this.f121962b = j;
            this.f121963c = cgVar;
            this.f121964d = cmVar;
            this.f121965e = i;
            this.f121966f = j2;
            return;
        }
        throw new NullPointerException("Null dataSource");
    }

    /* renamed from: a */
    public final int mo50716a() {
        return this.f121965e;
    }

    /* renamed from: b */
    public final long mo50717b() {
        return this.f121966f;
    }

    /* renamed from: c */
    public final long mo50718c() {
        return this.f121962b;
    }

    /* renamed from: d */
    public final C46689ag mo50719d() {
        return this.f121961a;
    }

    /* renamed from: e */
    public final C46763cg mo50720e() {
        return this.f121963c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46790dg) {
            C46790dg dgVar = (C46790dg) obj;
            return this.f121961a.equals(dgVar.mo50719d()) && this.f121962b == dgVar.mo50718c() && this.f121963c.equals(dgVar.mo50720e()) && this.f121964d.equals(dgVar.mo50722f()) && this.f121965e == dgVar.mo50716a() && this.f121966f == dgVar.mo50717b();
        }
    }

    /* renamed from: f */
    public final C46769cm mo50722f() {
        return this.f121964d;
    }

    public final int hashCode() {
        int hashCode = this.f121961a.hashCode();
        long j = this.f121962b;
        int hashCode2 = this.f121963c.hashCode();
        int hashCode3 = this.f121964d.hashCode();
        int i = this.f121965e;
        long j2 = this.f121966f;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String obj = this.f121961a.toString();
        long j = this.f121962b;
        String obj2 = this.f121963c.toString();
        String obj3 = this.f121964d.toString();
        int i = this.f121965e;
        long j2 = this.f121966f;
        return "SubscribeSequenceState{dataSource=" + obj + ", index=" + j + ", fetchTaskIdentifier=" + obj2 + ", loadTaskIdentifier=" + obj3 + ", loadAttempts=" + i + ", epochTimeAtStartMs=" + j2 + "}";
    }
}
