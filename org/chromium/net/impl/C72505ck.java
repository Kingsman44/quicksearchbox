package org.chromium.net.impl;

import org.chromium.net.NetworkException;

/* renamed from: org.chromium.net.impl.ck */
/* compiled from: PG */
public class C72505ck extends NetworkException {

    /* renamed from: a */
    protected final int f192918a;

    /* renamed from: b */
    protected final int f192919b;

    public C72505ck(String str, int i, int i2) {
        super(str, (Throwable) null);
        this.f192918a = i;
        this.f192919b = i2;
    }

    public final int getCronetInternalErrorCode() {
        return this.f192919b;
    }

    public final int getErrorCode() {
        return this.f192918a;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.f192918a);
        if (this.f192919b != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.f192919b);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    public boolean immediatelyRetryable() {
        int i = this.f192918a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }
}
