package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.p */
/* compiled from: PG */
public final class C42595p extends C42200be {

    /* renamed from: a */
    public C58485gu f111770a;

    /* renamed from: b */
    public C58485gu f111771b;

    /* renamed from: c */
    public int f111772c;

    /* renamed from: d */
    private boolean f111773d;

    /* renamed from: e */
    private boolean f111774e;

    /* renamed from: f */
    private byte f111775f;

    /* renamed from: a */
    public final C42201bf mo44894a() {
        if (this.f111775f == 3 && this.f111772c != 0 && this.f111770a != null && this.f111771b != null) {
            return new C42596q(this.f111773d, this.f111774e, this.f111772c, this.f111770a, this.f111771b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f111775f & 1) == 0) {
            sb.append(" returnContactsWithProfileIdOnly");
        }
        if ((this.f111775f & 2) == 0) {
            sb.append(" restrictLookupToCache");
        }
        if (this.f111772c == 0) {
            sb.append(" personMask");
        }
        if (this.f111770a == null) {
            sb.append(" highPriorityCustomDataProviderIds");
        }
        if (this.f111771b == null) {
            sb.append(" lowPriorityCustomDataProviderIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44895b(boolean z) {
        this.f111774e = z;
        this.f111775f = (byte) (this.f111775f | 2);
    }

    /* renamed from: c */
    public final void mo44896c(boolean z) {
        this.f111773d = z;
        this.f111775f = (byte) (this.f111775f | 1);
    }
}
