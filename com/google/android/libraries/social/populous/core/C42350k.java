package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.k */
/* compiled from: PG */
public final class C42350k extends C42338dj {

    /* renamed from: a */
    public String f111082a;

    /* renamed from: b */
    public String f111083b;

    /* renamed from: c */
    public int f111084c;

    /* renamed from: a */
    public final SourceIdentity mo45320a() {
        if (this.f111084c != 0) {
            return new AutoValue_SourceIdentity(this.f111084c, this.f111082a, this.f111083b);
        }
        throw new IllegalStateException("Missing required properties: containerType");
    }
}
