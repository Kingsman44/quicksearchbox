package com.google.android.libraries.search.assistant.performer.deviceactions;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a */
/* compiled from: PG */
public final class C35785a extends C35982u {

    /* renamed from: a */
    public Boolean f93743a;

    /* renamed from: b */
    public Boolean f93744b;

    /* renamed from: a */
    public final C35983v mo39837a() {
        Boolean bool;
        Boolean bool2 = this.f93743a;
        if (bool2 != null && (bool = this.f93744b) != null) {
            return new C35898b(bool2, bool);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93743a == null) {
            sb.append(" enableCameraActionStickyApp");
        }
        if (this.f93744b == null) {
            sb.append(" skipChangeCameraIntentActionOnLockScreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
