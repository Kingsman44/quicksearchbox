package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.a.b */
/* compiled from: PG */
final class C128458b extends C128461e {

    /* renamed from: a */
    public final long f353312a;

    /* renamed from: b */
    public final C128460d f353313b;

    /* renamed from: c */
    public final C79570b f353314c;

    /* renamed from: d */
    public final Optional f353315d;

    public C128458b(long j, C128460d dVar, C79570b bVar, Optional optional) {
        this.f353312a = j;
        this.f353313b = dVar;
        this.f353314c = bVar;
        this.f353315d = optional;
    }

    /* renamed from: a */
    public final long mo108447a() {
        return this.f353312a;
    }

    /* renamed from: b */
    public final C79570b mo108448b() {
        return this.f353314c;
    }

    /* renamed from: c */
    public final C128459c mo108449c() {
        return new C128457a(this);
    }

    /* renamed from: d */
    public final C128460d mo108450d() {
        return this.f353313b;
    }

    /* renamed from: e */
    public final Optional mo108451e() {
        return this.f353315d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128461e) {
            C128461e eVar = (C128461e) obj;
            return this.f353312a == eVar.mo108447a() && this.f353313b.equals(eVar.mo108450d()) && this.f353314c.equals(eVar.mo108448b()) && this.f353315d.equals(eVar.mo108451e());
        }
    }

    public final int hashCode() {
        long j = this.f353312a;
        return this.f353315d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f353313b.hashCode()) * 1000003) ^ this.f353314c.hashCode()) * 1000003);
    }
}
