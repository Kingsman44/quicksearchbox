package com.google.android.libraries.gcoreclient.p1753c.p1754a;

import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.libraries.gcoreclient.p1753c.C21451a;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gcoreclient.c.a.c */
/* compiled from: PG */
public abstract class C21455c implements Iterator, C21451a {

    /* renamed from: a */
    protected final C142797am f59906a;

    public C21455c(C142797am amVar) {
        this.f59906a = amVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f59906a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
