package com.google.android.libraries.web.webview.contrib.stuckjs;

/* renamed from: com.google.android.libraries.web.webview.contrib.stuckjs.$AutoValue_StuckJsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_StuckJsFeature extends StuckJsFeature {

    /* renamed from: a */
    public final int f115400a;

    public C$AutoValue_StuckJsFeature(int i) {
        this.f115400a = i;
    }

    /* renamed from: d */
    public final int mo47283d() {
        return this.f115400a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof StuckJsFeature) && this.f115400a == ((StuckJsFeature) obj).mo47283d();
    }

    public final int hashCode() {
        return this.f115400a ^ 1000003;
    }

    public final String toString() {
        int i = this.f115400a;
        return "StuckJsFeature{timeoutSeconds=" + i + "}";
    }
}
