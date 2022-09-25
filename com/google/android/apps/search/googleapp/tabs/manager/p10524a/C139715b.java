package com.google.android.apps.search.googleapp.tabs.manager.p10524a;

import com.google.android.apps.search.googleapp.p10117aa.C133125j;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.a.b */
/* compiled from: PG */
public final class C139715b extends C139717d {

    /* renamed from: a */
    private final C133125j f379762a;

    public C139715b(C133125j jVar) {
        if (jVar != null) {
            this.f379762a = jVar;
            return;
        }
        throw new NullPointerException("Null tab");
    }

    /* renamed from: a */
    public final C133125j mo115193a() {
        return this.f379762a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139717d) {
            return this.f379762a.equals(((C139717d) obj).mo115193a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f379762a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f379762a.toString();
        return "TabScreenshotClickedEvent{tab=" + obj + "}";
    }
}
