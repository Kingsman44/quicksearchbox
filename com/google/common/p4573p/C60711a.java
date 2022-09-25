package com.google.common.p4573p;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: com.google.common.p.a */
/* compiled from: PG */
public final class C60711a {
    static {
        new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
        Math.log(10.0d);
        Math.log(2.0d);
    }

    /* renamed from: a */
    public static BigInteger m92638a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
