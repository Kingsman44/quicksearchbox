package com.google.apps.tiktok.tracing;

import java.util.UUID;

/* renamed from: com.google.apps.tiktok.tracing.a */
/* compiled from: PG */
abstract class C47510a implements C47572bw {

    /* renamed from: a */
    private final C47572bw f123343a;

    /* renamed from: b */
    private final UUID f123344b;

    /* renamed from: c */
    private final String f123345c;

    /* renamed from: a */
    public final C47572bw mo51366a() {
        return this.f123343a;
    }

    /* renamed from: b */
    public final String mo51367b() {
        return this.f123345c;
    }

    /* renamed from: c */
    public final Thread mo51368c() {
        return null;
    }

    public final void close() {
        C47831fm.m85018m(this);
    }

    /* renamed from: d */
    public final UUID mo51370d() {
        return this.f123344b;
    }

    public final String toString() {
        return C47831fm.m85016k(this);
    }

    public C47510a(String str, C47572bw bwVar) {
        str.getClass();
        this.f123345c = str;
        this.f123343a = bwVar;
        this.f123344b = bwVar.mo51370d();
    }

    public C47510a(String str, UUID uuid) {
        str.getClass();
        this.f123345c = str;
        this.f123343a = null;
        this.f123344b = uuid;
    }
}
