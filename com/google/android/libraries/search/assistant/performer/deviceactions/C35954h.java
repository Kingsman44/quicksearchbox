package com.google.android.libraries.search.assistant.performer.deviceactions;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.h */
/* compiled from: PG */
final class C35954h extends C35918bn {

    /* renamed from: a */
    private final Boolean f94127a;

    public C35954h(Boolean bool) {
        this.f94127a = bool;
    }

    /* renamed from: a */
    public final Boolean mo39889a() {
        return this.f94127a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35918bn) {
            return this.f94127a.equals(((C35918bn) obj).mo39889a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f94127a.hashCode() ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f94127a;
        return "OpenProviderPerformerConfig{shouldPreferLeanback=" + bool + "}";
    }
}
