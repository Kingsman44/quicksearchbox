package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.view.MenuItem;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.m */
/* compiled from: PG */
final class C140632m implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C140636q f381940a;

    public C140632m(C140636q qVar) {
        this.f381940a = qVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        C140636q qVar = this.f381940a;
        C140621b bVar = C140621b.f381913c;
        C69664n.m101060f(bVar, "getDefaultInstance()");
        qVar.mo115805a(bVar);
        return true;
    }
}
