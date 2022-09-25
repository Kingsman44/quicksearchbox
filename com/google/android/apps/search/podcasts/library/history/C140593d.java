package com.google.android.apps.search.podcasts.library.history;

import android.view.MenuItem;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140589f;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.history.d */
/* compiled from: PG */
final class C140593d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C140590b f381834a;

    /* renamed from: b */
    final /* synthetic */ boolean f381835b;

    public C140593d(C140590b bVar, boolean z) {
        this.f381834a = bVar;
        this.f381835b = z;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        C140589f fVar = this.f381834a.f381826g;
        fVar.f381817c.mo50787a(fVar.f381818d.mo115688m(Boolean.valueOf(!this.f381835b)), C140192a.f380885a);
        return true;
    }
}
