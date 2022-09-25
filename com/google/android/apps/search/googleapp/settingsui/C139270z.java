package com.google.android.apps.search.googleapp.settingsui;

import android.view.MenuItem;
import com.google.android.apps.search.googleapp.settingsui.p10483b.C139174a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.z */
/* compiled from: PG */
public final class C139270z implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ C139148ab f378791a;

    public C139270z(C139148ab abVar) {
        this.f378791a = abVar;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "item");
        C47393f.m84237h(C139174a.f378506a, this.f378791a.f378447c);
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "item");
        return true;
    }
}
