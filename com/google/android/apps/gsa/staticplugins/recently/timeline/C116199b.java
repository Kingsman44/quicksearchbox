package com.google.android.apps.gsa.staticplugins.recently.timeline;

import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.timeline.b */
/* compiled from: PG */
public final class C116199b implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Group f322179a;

    /* renamed from: b */
    private int f322180b = 0;

    public C116199b(Group group) {
        this.f322179a = group;
    }

    /* renamed from: a */
    public final C22845p next() {
        if (hasNext()) {
            C22845p[] pVarArr = this.f322179a.f322177h;
            int i = this.f322180b;
            C22845p pVar = pVarArr[i];
            this.f322180b = i + 1;
            return pVar;
        }
        int i2 = this.f322180b;
        throw new NoSuchElementException("No next element with index: " + i2);
    }

    public final boolean hasNext() {
        return this.f322180b < this.f322179a.f322177h.length;
    }
}
