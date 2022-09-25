package com.google.android.gms.appdatasearch;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.gms.appdatasearch.aq */
/* compiled from: PG */
public final class C142801aq implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ SuggestionResults f387599a;

    /* renamed from: b */
    private int f387600b = 0;

    public C142801aq(SuggestionResults suggestionResults) {
        this.f387599a = suggestionResults;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        String[] strArr = this.f387599a.f387560b;
        return strArr != null && this.f387600b < strArr.length;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.f387600b++;
            return new C142800ap();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
