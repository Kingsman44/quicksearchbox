package com.google.android.libraries.search.assistant.performer.deviceactions;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.d */
/* compiled from: PG */
final class C35950d extends C35896ay {

    /* renamed from: a */
    private final Boolean f94123a;

    public C35950d(Boolean bool) {
        this.f94123a = bool;
    }

    /* renamed from: a */
    public final Boolean mo39876a() {
        return this.f94123a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35896ay) {
            return this.f94123a.equals(((C35896ay) obj).mo39876a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f94123a.hashCode() ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f94123a;
        return "ModifySettingPerformerConfig{disableBluetoothSliceApi=" + bool + "}";
    }
}
