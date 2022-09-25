package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.cb */
/* compiled from: PG */
public final /* synthetic */ class C103263cb implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103245bk f288046a;

    public /* synthetic */ C103263cb(C103245bk bkVar) {
        this.f288046a = bkVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        C103245bk bkVar = this.f288046a;
        SearchResults searchResults = (SearchResults) obj;
        boolean z = false;
        if (searchResults.mo117665a() || (i = searchResults.f387543g) == 0) {
            return C103245bk.m171139d(bkVar, searchResults, false);
        }
        if (i == 100) {
            z = true;
        }
        return C103245bk.m171139d(bkVar, searchResults, z);
    }
}
