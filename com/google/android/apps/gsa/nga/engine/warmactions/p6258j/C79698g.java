package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.g */
/* compiled from: PG */
final class C79698g extends C79690bs {

    /* renamed from: a */
    private final j f218564a;

    /* renamed from: b */
    private final String f218565b;

    /* renamed from: c */
    private final C79574f f218566c;

    /* renamed from: d */
    private final String f218567d;

    /* renamed from: e */
    private final C79485j f218568e;

    /* renamed from: f */
    private final Optional f218569f;

    /* renamed from: g */
    private final Duration f218570g;

    public C79698g(j jVar, String str, C79574f fVar, String str2, C79485j jVar2, Optional optional, Duration duration) {
        this.f218564a = jVar;
        this.f218565b = str;
        this.f218566c = fVar;
        this.f218567d = str2;
        this.f218568e = jVar2;
        this.f218569f = optional;
        this.f218570g = duration;
    }

    /* renamed from: a */
    public final j mo74193a() {
        return this.f218564a;
    }

    /* renamed from: b */
    public final C79485j mo74194b() {
        return this.f218568e;
    }

    /* renamed from: c */
    public final C79574f mo74195c() {
        return this.f218566c;
    }

    /* renamed from: d */
    public final Duration mo74196d() {
        return this.f218570g;
    }

    /* renamed from: e */
    public final Optional mo74197e() {
        return this.f218569f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79690bs) {
            C79690bs bsVar = (C79690bs) obj;
            return this.f218564a.equals(bsVar.mo74193a()) && this.f218565b.equals(bsVar.mo74199g()) && this.f218566c.equals(bsVar.mo74195c()) && this.f218567d.equals(bsVar.mo74198f()) && this.f218568e.equals(bsVar.mo74194b()) && this.f218569f.equals(bsVar.mo74197e()) && this.f218570g.equals(bsVar.mo74196d());
        }
    }

    /* renamed from: f */
    public final String mo74198f() {
        return this.f218567d;
    }

    /* renamed from: g */
    public final String mo74199g() {
        return this.f218565b;
    }

    public final int hashCode() {
        return ((((((((((((this.f218564a.hashCode() ^ 1000003) * 1000003) ^ this.f218565b.hashCode()) * 1000003) ^ this.f218566c.hashCode()) * 1000003) ^ this.f218567d.hashCode()) * 1000003) ^ this.f218568e.hashCode()) * 1000003) ^ this.f218569f.hashCode()) * 1000003) ^ this.f218570g.hashCode();
    }

    public final String toString() {
        String obj = this.f218564a.toString();
        String str = this.f218565b;
        String obj2 = this.f218566c.toString();
        String str2 = this.f218567d;
        String obj3 = this.f218568e.toString();
        String valueOf = String.valueOf(this.f218569f);
        String obj4 = this.f218570g.toString();
        return "WarmActionsQuery{candidateIdentifier=" + obj + ", query=" + str + ", recognitionParams=" + obj2 + ", command=" + str2 + ", triggeringContext=" + obj3 + ", sodaEventId=" + valueOf + ", endOfSpeechElapsedRealtime=" + obj4 + "}";
    }
}
