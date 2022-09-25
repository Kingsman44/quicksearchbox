package com.google.android.libraries.geller.p1818f;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.geller.f.c */
/* compiled from: PG */
public final class C21844c extends C21828bk {

    /* renamed from: a */
    public Boolean f60291a;

    /* renamed from: b */
    public Integer f60292b;

    /* renamed from: c */
    private boolean f60293c;

    /* renamed from: d */
    private C58485gu f60294d;

    /* renamed from: e */
    private byte f60295e;

    /* renamed from: a */
    public final C21829bl mo27131a() {
        Boolean bool;
        Integer num;
        C58485gu guVar;
        if (this.f60295e == 1 && (bool = this.f60291a) != null && (num = this.f60292b) != null && (guVar = this.f60294d) != null) {
            return new C21854d(this.f60293c, bool, num, guVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f60295e == 0) {
            sb.append(" enableGellerReconSyncScheduling");
        }
        if (this.f60291a == null) {
            sb.append(" enableGellerSyncRetry");
        }
        if (this.f60292b == null) {
            sb.append(" maximumRetryAttemptsCount");
        }
        if (this.f60294d == null) {
            sb.append(" gellerRetryableErrorCodes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27132b(boolean z) {
        this.f60293c = z;
        this.f60295e = 1;
    }

    /* renamed from: c */
    public final void mo27133c(C58485gu guVar) {
        if (guVar != null) {
            this.f60294d = guVar;
            return;
        }
        throw new NullPointerException("Null gellerRetryableErrorCodes");
    }
}
