package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137248f;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.a.d */
/* compiled from: PG */
public final class C137306d extends C137311i {

    /* renamed from: a */
    private final C137248f f373517a;

    public C137306d(C137248f fVar) {
        if (fVar != null) {
            this.f373517a = fVar;
            return;
        }
        throw new NullPointerException("Null listElement");
    }

    /* renamed from: a */
    public final C137248f mo113629a() {
        return this.f373517a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137311i) {
            return this.f373517a.equals(((C137311i) obj).mo113629a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f373517a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f373517a.toString();
        return "ListElementClickedEvent{listElement=" + obj + "}";
    }
}
