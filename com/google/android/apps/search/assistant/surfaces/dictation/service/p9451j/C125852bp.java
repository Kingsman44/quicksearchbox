package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bp */
/* compiled from: PG */
public final class C125852bp implements C125854br, C125851bo {

    /* renamed from: a */
    public final C125853bq f346858a;

    public C125852bp(C125853bq bqVar) {
        C69664n.m101061g(bqVar, "reason");
        this.f346858a = bqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125852bp) && this.f346858a == ((C125852bp) obj).f346858a;
    }

    public final int hashCode() {
        return this.f346858a.hashCode();
    }

    public final String toString() {
        C125853bq bqVar = this.f346858a;
        return "PreparationFailure(reason=" + bqVar + ")";
    }
}
