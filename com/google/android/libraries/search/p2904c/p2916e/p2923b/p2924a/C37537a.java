package com.google.android.libraries.search.p2904c.p2916e.p2923b.p2924a;

import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.e.b.a.a */
/* compiled from: PG */
public final class C37537a extends C37538b {

    /* renamed from: a */
    private final C37772b f99727a;

    public C37537a(C37772b bVar) {
        C69664n.m101061g(bVar, "clientInfo");
        this.f99727a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37537a) && this.f99727a == ((C37537a) obj).f99727a;
    }

    public final int hashCode() {
        return this.f99727a.hashCode();
    }

    public final String toString() {
        C37772b bVar = this.f99727a;
        return "AudioRequestInjectionClient(clientInfo=" + bVar + ")";
    }
}
