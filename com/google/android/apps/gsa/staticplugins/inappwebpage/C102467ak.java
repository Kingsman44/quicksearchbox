package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.view.MenuItem;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ak */
/* compiled from: PG */
final class C102467ak implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C102468al f285970a;

    public C102467ak(C102468al alVar) {
        this.f285970a = alVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f285970a.f285976f.f285996h.mo93264a(new Request(this.f285970a.f285973c, C58733pz.f156496a, Query.f252741b));
        return true;
    }
}
