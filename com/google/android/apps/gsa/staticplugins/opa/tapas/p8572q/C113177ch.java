package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ch */
/* compiled from: PG */
public final class C113177ch implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Object f313494a;

    /* renamed from: b */
    final /* synthetic */ ArrayDeque f313495b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f313496c;

    public C113177ch(Object obj, ArrayDeque arrayDeque, C60870cx cxVar) {
        this.f313494a = obj;
        this.f313495b = arrayDeque;
        this.f313496c = cxVar;
    }

    /* renamed from: c */
    private final void m187196c(boolean z) {
        synchronized (this.f313494a) {
            if (!this.f313495b.isEmpty()) {
                Iterator descendingIterator = this.f313495b.descendingIterator();
                C60870cx cxVar = (C60870cx) descendingIterator.next();
                while (descendingIterator.hasNext() && cxVar != this.f313496c) {
                    cxVar = (C60870cx) descendingIterator.next();
                }
                if (cxVar == this.f313496c) {
                    descendingIterator.remove();
                }
                if (z) {
                    while (descendingIterator.hasNext()) {
                        descendingIterator.remove();
                        ((C60870cx) descendingIterator.next()).cancel(true);
                    }
                }
            }
        }
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m187196c(false);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        m187196c(true);
    }
}
