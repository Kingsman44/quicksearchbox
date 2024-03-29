package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* compiled from: PG */
public @interface Idempotency {
    public static final int DEFAULT_IDEMPOTENCY = 0;
    public static final int IDEMPOTENT = 1;
    public static final int NOT_IDEMPOTENT = 2;
}
