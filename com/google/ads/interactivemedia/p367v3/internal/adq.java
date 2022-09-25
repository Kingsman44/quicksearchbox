package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adq */
final /* synthetic */ class adq implements Runnable {

    /* renamed from: a */
    private final CopyOnWriteArraySet f20381a;

    /* renamed from: b */
    private final adr f20382b;

    public adq(CopyOnWriteArraySet copyOnWriteArraySet, adr adr) {
        this.f20381a = copyOnWriteArraySet;
        this.f20382b = adr;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f20381a;
        adr adr = this.f20382b;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C6784ads) it.next()).mo14508b(adr);
        }
    }
}
