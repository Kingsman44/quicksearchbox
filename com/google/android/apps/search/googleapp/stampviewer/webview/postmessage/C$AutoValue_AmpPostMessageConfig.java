package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.$AutoValue_AmpPostMessageConfig  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AmpPostMessageConfig extends AmpPostMessageConfig {

    /* renamed from: a */
    public final boolean f379610a;

    public C$AutoValue_AmpPostMessageConfig(boolean z) {
        this.f379610a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AmpPostMessageConfig) && this.f379610a == ((AmpPostMessageConfig) obj).mo115129f();
    }

    /* renamed from: f */
    public final boolean mo115129f() {
        return this.f379610a;
    }

    public final int hashCode() {
        return (true != this.f379610a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f379610a;
        return "AmpPostMessageConfig{allowAnyUrl=" + z + "}";
    }
}
