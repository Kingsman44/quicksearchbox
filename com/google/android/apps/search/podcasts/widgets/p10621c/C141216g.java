package com.google.android.apps.search.podcasts.widgets.p10621c;

import android.support.p033v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.c.g */
/* compiled from: PG */
public final class C141216g {
    /* renamed from: a */
    public static final MenuItem m229225a(View view) {
        Menu g;
        C69664n.m101061g(view, "rootView");
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.podcasts_toolbar);
        if (toolbar == null || (g = toolbar.mo2393g()) == null) {
            return null;
        }
        return g.findItem(R.id.podcasts_account_particle_disc_menu_item);
    }
}
