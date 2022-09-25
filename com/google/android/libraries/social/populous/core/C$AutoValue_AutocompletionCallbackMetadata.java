package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_AutocompletionCallbackMetadata  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AutocompletionCallbackMetadata extends AutocompletionCallbackMetadata {

    /* renamed from: a */
    public final int f110608a;

    /* renamed from: b */
    public final int f110609b;

    /* renamed from: c */
    public final int f110610c;

    public C$AutoValue_AutocompletionCallbackMetadata(int i, int i2, int i3) {
        if (i != 0) {
            this.f110608a = i;
            if (i2 != 0) {
                this.f110609b = i2;
                if (i3 != 0) {
                    this.f110610c = i3;
                    return;
                }
                throw new NullPointerException("Null callbackDelayStatus");
            }
            throw new NullPointerException("Null currentNetworkState");
        }
        throw new NullPointerException("Null currentCacheStatus");
    }

    /* renamed from: a */
    public final int mo44945a() {
        return this.f110608a;
    }

    /* renamed from: b */
    public final int mo44946b() {
        return this.f110610c;
    }

    /* renamed from: c */
    public final int mo44947c() {
        return this.f110609b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletionCallbackMetadata) {
            AutocompletionCallbackMetadata autocompletionCallbackMetadata = (AutocompletionCallbackMetadata) obj;
            return this.f110608a == autocompletionCallbackMetadata.mo44945a() && this.f110609b == autocompletionCallbackMetadata.mo44947c() && this.f110610c == autocompletionCallbackMetadata.mo44946b();
        }
    }

    public final int hashCode() {
        return ((((this.f110608a ^ 1000003) * 1000003) ^ this.f110609b) * 1000003) ^ this.f110610c;
    }

    public final String toString() {
        int i = this.f110608a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NOT_RELEVANT" : "ON_DISK" : "EMPTY" : "PARTIAL" : "FULL";
        int i2 = this.f110609b;
        String str2 = i2 != 1 ? i2 != 2 ? "NOT_ATTEMPTED" : "NOT_CONNECTED" : "CONNECTED";
        String str3 = this.f110610c != 1 ? "DID_NOT_WAIT_FOR_RESULTS" : "WAITED_FOR_RESULTS";
        return "AutocompletionCallbackMetadata{currentCacheStatus=" + str + ", currentNetworkState=" + str2 + ", callbackDelayStatus=" + str3 + "}";
    }
}
