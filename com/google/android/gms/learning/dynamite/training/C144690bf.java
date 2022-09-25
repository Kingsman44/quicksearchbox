package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.util.C144005e;
import java.lang.Thread;

/* renamed from: com.google.android.gms.learning.dynamite.training.bf */
/* compiled from: PG */
final class C144690bf implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final Context f391467a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f391468b;

    public C144690bf(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f391467a = context;
        this.f391468b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C144005e.m234184a(this.f391467a, th);
        this.f391468b.uncaughtException(thread, th);
    }
}
