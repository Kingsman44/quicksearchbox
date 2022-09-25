package com.google.android.apps.search.podcasts.show;

import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140290ak;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.v */
/* compiled from: PG */
final class C141174v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C141175w f383262a;

    /* renamed from: b */
    final /* synthetic */ View f383263b;

    public C141174v(C141175w wVar, View view) {
        this.f383262a = wVar;
        this.f383263b = view;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        String str = this.f383262a.f383265b.f383151a;
        C69664n.m101060f(str, "showArgs.feedUrl");
        C47393f.m84237h(new C140290ak(str), this.f383263b);
        return true;
    }
}
