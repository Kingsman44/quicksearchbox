package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.v */
/* compiled from: PG */
final class C144019v extends C144020w {

    /* renamed from: e */
    private final Callable f390256e;

    public C144019v(Callable callable) {
        super(false, (String) null, (Throwable) null);
        this.f390256e = callable;
    }

    /* renamed from: a */
    public final String mo119527a() {
        try {
            return (String) this.f390256e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
