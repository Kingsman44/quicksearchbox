package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.p6816p.C86236bs;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.core.service.ak */
/* compiled from: PG */
public final /* synthetic */ class C86615ak implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86610af f233997a;

    public /* synthetic */ C86615ak(C86610af afVar) {
        this.f233997a = afVar;
    }

    public final void run() {
        C86237bt btVar = (C86237bt) this.f233997a.f233973h.mo27525b();
        Iterator it = btVar.f233069e.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (true) {
                C86236bs bsVar = (C86236bs) next;
                if (!it.hasNext()) {
                    break;
                }
                it.remove();
                bsVar.mo79903a();
                next = it.next();
            }
        }
        synchronized (btVar.f233070f) {
            btVar.f233071g.clear();
        }
    }
}
