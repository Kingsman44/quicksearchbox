package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.s */
/* compiled from: PG */
public final class C134739s extends C134740t {

    /* renamed from: a */
    public final C134221j f366893a;

    public C134739s(C134221j jVar) {
        this.f366893a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134739s) && this.f366893a == ((C134739s) obj).f366893a;
    }

    public final int hashCode() {
        C134221j jVar = this.f366893a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public final String toString() {
        C134221j jVar = this.f366893a;
        String name = jVar != null ? jVar.name() : null;
        return "Rendering(error=" + name + ")";
    }
}
