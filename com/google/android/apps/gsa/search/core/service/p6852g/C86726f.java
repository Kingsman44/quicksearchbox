package com.google.android.apps.gsa.search.core.service.p6852g;

import java.util.Observable;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.f */
/* compiled from: PG */
public final class C86726f extends Observable {

    /* renamed from: a */
    public volatile C86725e f234274a;

    public C86726f(C86725e eVar) {
        this.f234274a = eVar;
    }

    /* renamed from: a */
    public final synchronized void mo80336a(C86725e eVar) {
        if (!this.f234274a.equals(eVar)) {
            this.f234274a = eVar;
            setChanged();
            notifyObservers();
        }
    }
}
