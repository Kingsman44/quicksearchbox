package com.google.android.libraries.social.populous;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.social.populous.n */
/* compiled from: PG */
final class C42593n extends C42198bc {

    /* renamed from: a */
    public Integer f111759a;

    /* renamed from: b */
    public int f111760b;

    /* renamed from: c */
    private boolean f111761c;

    /* renamed from: d */
    private C58528ij f111762d;

    /* renamed from: e */
    private C58485gu f111763e;

    /* renamed from: f */
    private byte f111764f;

    /* renamed from: a */
    public final C42199bd mo44885a() {
        C58528ij ijVar;
        C58485gu guVar;
        int i;
        Integer num;
        if (this.f111764f == 1 && (ijVar = this.f111762d) != null && (guVar = this.f111763e) != null && (i = this.f111760b) != 0 && (num = this.f111759a) != null) {
            return new C42594o(this.f111761c, ijVar, guVar, i, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111764f == 0) {
            sb.append(" isLastCallback");
        }
        if (this.f111762d == null) {
            sb.append(" notFoundIds");
        }
        if (this.f111763e == null) {
            sb.append(" errors");
        }
        if (this.f111760b == 0) {
            sb.append(" callbackDelayStatus");
        }
        if (this.f111759a == null) {
            sb.append(" numberSentToNetwork");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44886b(C58485gu guVar) {
        if (guVar != null) {
            this.f111763e = guVar;
            return;
        }
        throw new NullPointerException("Null errors");
    }

    /* renamed from: c */
    public final void mo44887c(boolean z) {
        this.f111761c = z;
        this.f111764f = 1;
    }

    /* renamed from: d */
    public final void mo44888d(C58528ij ijVar) {
        if (ijVar != null) {
            this.f111762d = ijVar;
            return;
        }
        throw new NullPointerException("Null notFoundIds");
    }
}
