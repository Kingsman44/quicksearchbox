package com.google.android.apps.search.googleapp.googleappbrowser.p10261b;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.b.c */
/* compiled from: PG */
public final class C135506c implements C47388b {

    /* renamed from: a */
    public final C139779t f369139a;

    public C135506c(C139779t tVar) {
        C69664n.m101061g(tVar, "destination");
        this.f369139a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135506c) && this.f369139a == ((C135506c) obj).f369139a;
    }

    public final int hashCode() {
        return this.f369139a.hashCode();
    }

    public final String toString() {
        C139779t tVar = this.f369139a;
        return "NavigateToSourceEvent(destination=" + tVar + ")";
    }
}
