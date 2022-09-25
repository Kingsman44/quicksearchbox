package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1129f.p1130a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.f.a.l */
/* compiled from: PG */
final class C15573l extends C15566e {

    /* renamed from: a */
    private final Boolean f46589a;

    /* renamed from: b */
    private final C122549e f46590b;

    public C15573l(Boolean bool, C122549e eVar) {
        this.f46589a = bool;
        if (eVar != null) {
            this.f46590b = eVar;
            return;
        }
        throw new NullPointerException("Null connection");
    }

    /* renamed from: a */
    public final C122549e mo22398a() {
        return this.f46590b;
    }

    /* renamed from: b */
    public final Boolean mo22399b() {
        return this.f46589a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15566e) {
            C15566e eVar = (C15566e) obj;
            return this.f46589a.equals(eVar.mo22399b()) && this.f46590b.equals(eVar.mo22398a());
        }
    }

    public final int hashCode() {
        return ((this.f46589a.hashCode() ^ 1000003) * 1000003) ^ this.f46590b.hashCode();
    }

    public final String toString() {
        Boolean bool = this.f46589a;
        String obj = this.f46590b.toString();
        return "PrewarmedStatusConnectionStore{isPrewarmed=" + bool + ", connection=" + obj + "}";
    }
}
