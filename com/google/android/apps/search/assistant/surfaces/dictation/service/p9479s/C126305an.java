package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.an */
/* compiled from: PG */
public final /* synthetic */ class C126305an implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Iterable f347964a;

    public /* synthetic */ C126305an(Iterable iterable) {
        this.f347964a = iterable;
    }

    public final Object call() {
        ExecutionException executionException = null;
        for (C60870cx r : this.f347964a) {
            try {
                C60856cj.m92909r(r);
            } catch (ExecutionException e) {
                if (executionException == null) {
                    executionException = e;
                } else if (!(executionException.getCause() == null || e.getCause() == null)) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(executionException.getCause(), new Object[]{e.getCause()});
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (executionException == null) {
            return null;
        }
        throw executionException;
    }
}
