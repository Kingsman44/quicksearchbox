package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.b */
/* compiled from: PG */
public final class C72467b extends C72505ck {
    public C72467b(String str, int i, int i2) {
        super(str, i, i2);
    }

    public final boolean immediatelyRetryable() {
        int i = this.f192919b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
