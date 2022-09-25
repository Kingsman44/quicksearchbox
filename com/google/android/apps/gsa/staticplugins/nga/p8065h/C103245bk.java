package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.SearchResults;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bk */
/* compiled from: PG */
public abstract class C103245bk {
    /* renamed from: d */
    public static C103245bk m171139d(C103245bk bkVar, SearchResults searchResults, boolean z) {
        C58480gp f = C58485gu.m89838f(bkVar.mo93727b().size() + 1);
        f.mo55396h(bkVar.mo93727b());
        f.mo55395g(searchResults);
        C58485gu f2 = f.mo55394f();
        int a = bkVar.mo93726a();
        int i = searchResults.f387543g;
        bkVar.mo93727b().size();
        return new C103278g(f2, a + i, z);
    }

    /* renamed from: a */
    public abstract int mo93726a();

    /* renamed from: b */
    public abstract C58485gu mo93727b();

    /* renamed from: c */
    public abstract boolean mo93728c();
}
