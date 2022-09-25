package com.google.android.libraries.search.assistant.performer.deviceactions;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.b */
/* compiled from: PG */
final class C35898b extends C35983v {

    /* renamed from: a */
    private final Boolean f94038a;

    /* renamed from: b */
    private final Boolean f94039b;

    public C35898b(Boolean bool, Boolean bool2) {
        this.f94038a = bool;
        this.f94039b = bool2;
    }

    /* renamed from: a */
    public final Boolean mo39879a() {
        return this.f94038a;
    }

    /* renamed from: b */
    public final Boolean mo39880b() {
        return this.f94039b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35983v) {
            C35983v vVar = (C35983v) obj;
            return this.f94038a.equals(vVar.mo39879a()) && this.f94039b.equals(vVar.mo39880b());
        }
    }

    public final int hashCode() {
        return ((this.f94038a.hashCode() ^ 1000003) * 1000003) ^ this.f94039b.hashCode();
    }

    public final String toString() {
        Boolean bool = this.f94038a;
        Boolean bool2 = this.f94039b;
        return "CameraActionPerformerConfig{enableCameraActionStickyApp=" + bool + ", skipChangeCameraIntentActionOnLockScreen=" + bool2 + "}";
    }
}
