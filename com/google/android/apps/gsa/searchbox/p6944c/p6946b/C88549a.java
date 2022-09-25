package com.google.android.apps.gsa.searchbox.p6944c.p6946b;

import com.google.android.libraries.searchbox.root.C41626a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a */
/* compiled from: PG */
final class C88549a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Object f239329a;

    /* renamed from: b */
    final /* synthetic */ LinkedList f239330b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f239331c;

    public C88549a(Object obj, LinkedList linkedList, C60870cx cxVar) {
        this.f239329a = obj;
        this.f239330b = linkedList;
        this.f239331c = cxVar;
    }

    /* renamed from: c */
    private final void m143061c(boolean z) {
        synchronized (this.f239329a) {
            if (!this.f239330b.isEmpty()) {
                Iterator descendingIterator = this.f239330b.descendingIterator();
                C60870cx cxVar = (C60870cx) descendingIterator.next();
                while (descendingIterator.hasNext() && cxVar != this.f239331c) {
                    cxVar = (C60870cx) descendingIterator.next();
                }
                if (cxVar == this.f239331c) {
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
        m143061c(false);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C41626a aVar = (C41626a) obj;
        m143061c(true);
    }
}
