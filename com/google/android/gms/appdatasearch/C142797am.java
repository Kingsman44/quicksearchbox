package com.google.android.gms.appdatasearch;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.gms.appdatasearch.am */
/* compiled from: PG */
public final class C142797am implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    protected int f387594a;

    /* renamed from: b */
    public C142795ak f387595b;

    /* renamed from: c */
    public C142795ak f387596c;

    /* renamed from: d */
    public final Map[] f387597d;

    /* renamed from: e */
    final /* synthetic */ SearchResults f387598e;

    public C142797am(SearchResults searchResults) {
        String[] strArr;
        this.f387598e = searchResults;
        Map[] mapArr = null;
        if (!searchResults.mo117665a() && (strArr = searchResults.f387545i) != null) {
            mapArr = new Map[strArr.length];
        }
        this.f387597d = mapArr;
    }

    /* renamed from: a */
    public final C142796al next() {
        if (hasNext()) {
            SearchResults searchResults = this.f387598e;
            int i = this.f387594a;
            C142796al alVar = new C142796al(searchResults, i, this);
            this.f387594a = i + 1;
            return alVar;
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        SearchResults searchResults = this.f387598e;
        return !searchResults.mo117665a() && this.f387594a < searchResults.f387543g;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
