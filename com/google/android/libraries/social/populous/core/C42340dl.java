package com.google.android.libraries.social.populous.core;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.core.dl */
/* compiled from: PG */
public final class C42340dl extends C42341dm {

    /* renamed from: e */
    private final Callable f111042e;

    /* renamed from: f */
    private final Executor f111043f;

    public C42340dl(Callable callable, C60845bz bzVar, Executor executor) {
        super(bzVar);
        this.f111042e = callable;
        this.f111043f = executor;
    }

    /* renamed from: e */
    public final C60870cx mo45321e() {
        return C60856cj.m92904m(this.f111042e, this.f111043f);
    }
}
