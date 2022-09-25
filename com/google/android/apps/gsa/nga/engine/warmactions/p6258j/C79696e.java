package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.e */
/* compiled from: PG */
final class C79696e extends C79670az {

    /* renamed from: a */
    private final C79574f f218555a;

    /* renamed from: b */
    private final String f218556b;

    public C79696e(C79574f fVar, String str) {
        if (fVar != null) {
            this.f218555a = fVar;
            if (str != null) {
                this.f218556b = str;
                return;
            }
            throw new NullPointerException("Null command");
        }
        throw new NullPointerException("Null recognitionParams");
    }

    /* renamed from: a */
    public final C79574f mo74182a() {
        return this.f218555a;
    }

    /* renamed from: b */
    public final String mo74183b() {
        return this.f218556b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79670az) {
            C79670az azVar = (C79670az) obj;
            return this.f218555a.equals(azVar.mo74182a()) && this.f218556b.equals(azVar.mo74183b());
        }
    }

    public final int hashCode() {
        return ((this.f218555a.hashCode() ^ 1000003) * 1000003) ^ this.f218556b.hashCode();
    }

    public final String toString() {
        String obj = this.f218555a.toString();
        String str = this.f218556b;
        return "ParsedHotqueryCategory{recognitionParams=" + obj + ", command=" + str + "}";
    }
}
