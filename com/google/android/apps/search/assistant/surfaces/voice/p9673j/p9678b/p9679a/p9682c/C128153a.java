package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.C128220j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.a */
/* compiled from: PG */
final class C128153a extends C128163k {

    /* renamed from: a */
    private final C81237ab f352554a;

    /* renamed from: b */
    private final C128220j f352555b;

    public C128153a(C81237ab abVar, C128220j jVar) {
        if (abVar != null) {
            this.f352554a = abVar;
            if (jVar != null) {
                this.f352555b = jVar;
                return;
            }
            throw new NullPointerException("Null freData");
        }
        throw new NullPointerException("Null ngaData");
    }

    /* renamed from: a */
    public final C81237ab mo108348a() {
        return this.f352554a;
    }

    /* renamed from: b */
    public final C128220j mo108349b() {
        return this.f352555b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128163k) {
            C128163k kVar = (C128163k) obj;
            return this.f352554a.equals(kVar.mo108348a()) && this.f352555b.equals(kVar.mo108349b());
        }
    }

    public final int hashCode() {
        return ((this.f352554a.hashCode() ^ 1000003) * 1000003) ^ this.f352555b.hashCode();
    }

    public final String toString() {
        String obj = this.f352554a.toString();
        String obj2 = this.f352555b.toString();
        return "FreReadData{ngaData=" + obj + ", freData=" + obj2 + "}";
    }
}
