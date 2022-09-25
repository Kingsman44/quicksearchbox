package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.c */
/* compiled from: PG */
public final class C42301c extends C42261an {

    /* renamed from: a */
    public int f110930a;

    /* renamed from: b */
    public int f110931b;

    /* renamed from: c */
    public int f110932c;

    /* renamed from: a */
    public final AutocompletionCallbackMetadata mo45216a() {
        if (this.f110930a != 0 && this.f110931b != 0 && this.f110932c != 0) {
            return new AutoValue_AutocompletionCallbackMetadata(this.f110930a, this.f110931b, this.f110932c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f110930a == 0) {
            sb.append(" currentCacheStatus");
        }
        if (this.f110931b == 0) {
            sb.append(" currentNetworkState");
        }
        if (this.f110932c == 0) {
            sb.append(" callbackDelayStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
