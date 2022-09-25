package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.g */
/* compiled from: PG */
public final class C125674g extends C125693z {

    /* renamed from: a */
    public final C125649ab f346352a;

    public C125674g(C125649ab abVar) {
        C69664n.m101061g(abVar, "listFormat");
        this.f346352a = abVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C125674g) && this.f346352a == ((C125674g) obj).f346352a;
    }

    public final int hashCode() {
        return this.f346352a.hashCode();
    }

    public final String toString() {
        C125649ab abVar = this.f346352a;
        return "CreateList(listFormat=" + abVar + ")";
    }
}
