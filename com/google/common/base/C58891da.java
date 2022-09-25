package com.google.common.base;

import p3186j$.util.Objects;

/* renamed from: com.google.common.base.da */
/* compiled from: PG */
public final class C58891da extends RuntimeException {
    public C58891da(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    /* renamed from: a */
    public final synchronized Exception getCause() {
        return (Exception) Objects.requireNonNull(super.getCause());
    }
}
