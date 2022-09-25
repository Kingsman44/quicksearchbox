package com.google.android.apps.search.googleapp.tabs.manager.p10524a;

import com.google.android.apps.search.googleapp.p10117aa.C133125j;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.a.a */
/* compiled from: PG */
public final class C139714a extends C139716c {

    /* renamed from: a */
    private final C133125j f379761a;

    public C139714a(C133125j jVar) {
        if (jVar != null) {
            this.f379761a = jVar;
            return;
        }
        throw new NullPointerException("Null tab");
    }

    /* renamed from: a */
    public final C133125j mo115189a() {
        return this.f379761a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139716c) {
            return this.f379761a.equals(((C139716c) obj).mo115189a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f379761a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f379761a.toString();
        return "TabCloseButtonClickedEvent{tab=" + obj + "}";
    }
}
