package com.google.android.libraries.search.assistant.performer.deviceactions;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.f */
/* compiled from: PG */
final class C35952f extends C35909be {

    /* renamed from: a */
    private final Boolean f94125a;

    public C35952f(Boolean bool) {
        this.f94125a = bool;
    }

    /* renamed from: a */
    public final Boolean mo39886a() {
        return this.f94125a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35909be) {
            return this.f94125a.equals(((C35909be) obj).mo39886a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f94125a.hashCode() ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f94125a;
        return "OpenDeviceSettingPerformerConfig{ignoreSuccessfulOpenSettingResult=" + bool + "}";
    }
}
