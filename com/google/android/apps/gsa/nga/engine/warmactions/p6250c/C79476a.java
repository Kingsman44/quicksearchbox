package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.a */
/* compiled from: PG */
public final class C79476a extends C79485j {

    /* renamed from: a */
    public final C77566as f218156a;

    /* renamed from: b */
    public final C79566g f218157b;

    /* renamed from: c */
    private final Optional f218158c;

    public C79476a(Optional optional, C77566as asVar, C79566g gVar) {
        this.f218158c = optional;
        this.f218156a = asVar;
        this.f218157b = gVar;
    }

    /* renamed from: a */
    public final C77566as mo74080a() {
        return this.f218156a;
    }

    /* renamed from: b */
    public final C79566g mo74081b() {
        return this.f218157b;
    }

    /* renamed from: c */
    public final Optional mo74082c() {
        return this.f218158c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79485j) {
            C79485j jVar = (C79485j) obj;
            return this.f218158c.equals(jVar.mo74082c()) && this.f218156a.equals(jVar.mo74080a()) && this.f218157b.equals(jVar.mo74081b());
        }
    }

    public final int hashCode() {
        return ((((this.f218158c.hashCode() ^ 1000003) * 1000003) ^ this.f218156a.hashCode()) * 1000003) ^ this.f218157b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f218158c);
        String obj = this.f218156a.toString();
        String obj2 = this.f218157b.toString();
        return "TriggeringContext{notification=" + valueOf + ", speechSessionParams=" + obj + ", state=" + obj2 + "}";
    }
}
