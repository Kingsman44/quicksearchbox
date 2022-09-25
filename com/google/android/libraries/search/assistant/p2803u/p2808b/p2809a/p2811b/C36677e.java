package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C36677e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Iterable f95564a;

    public /* synthetic */ C36677e(Iterable iterable) {
        this.f95564a = iterable;
    }

    public final Object call() {
        C58801sm G = ((C58485gu) this.f95564a).listIterator(0);
        ExecutionException executionException = null;
        while (G.hasNext()) {
            try {
                C60856cj.m92909r((C60870cx) G.next());
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
