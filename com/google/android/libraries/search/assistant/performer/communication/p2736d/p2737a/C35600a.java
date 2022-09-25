package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a.a */
/* compiled from: PG */
public final class C35600a extends C35602c {

    /* renamed from: a */
    public final Boolean f93440a;

    public C35600a(Boolean bool) {
        this.f93440a = bool;
    }

    /* renamed from: a */
    public final Boolean mo39732a() {
        return this.f93440a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35602c) {
            return this.f93440a.equals(((C35602c) obj).mo39732a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f93440a.hashCode() ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f93440a;
        return "CacheSetSideEffectParams{shouldTriggerSmartActionGeneration=" + bool + "}";
    }
}
