package com.google.android.apps.search.podcasts.widgets.p10621c;

import android.os.Bundle;
import android.support.p033v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.c.b */
/* compiled from: PG */
final class C141211b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C141213d f383379a;

    /* renamed from: b */
    final /* synthetic */ Toolbar f383380b;

    public C141211b(C141213d dVar, Toolbar toolbar) {
        this.f383379a = dVar;
        this.f383380b = toolbar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "it");
        this.f383379a.f383383a.mo50480a(R.id.podcasts_action_to_settings, (Bundle) null, "App bar more actions menu item to settings").onClick(this.f383380b);
        return true;
    }
}
