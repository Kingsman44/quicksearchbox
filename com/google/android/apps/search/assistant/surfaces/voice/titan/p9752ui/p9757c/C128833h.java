package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.h */
/* compiled from: PG */
public final class C128833h implements C128831f {

    /* renamed from: a */
    public final C128839n f354117a;

    public C128833h(C128839n nVar) {
        C69664n.m101061g(nVar, "type");
        this.f354117a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C128833h) && this.f354117a == ((C128833h) obj).f354117a;
    }

    public final int hashCode() {
        return this.f354117a.hashCode();
    }

    public final String toString() {
        C128839n nVar = this.f354117a;
        return "GreetingContentState(type=" + nVar + ")";
    }
}
