package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.social.populous.d */
/* compiled from: PG */
final class C42366d extends C42204bi {

    /* renamed from: a */
    public IdentityInfo f111095a;

    /* renamed from: b */
    public C58528ij f111096b;

    /* renamed from: c */
    public int f111097c;

    /* renamed from: a */
    public final PersonMetadata mo44906a() {
        if (this.f111097c != 0) {
            return new AutoValue_PersonMetadata(this.f111095a, this.f111097c, this.f111096b);
        }
        throw new IllegalStateException("Missing required properties: autocompletionType");
    }
}
