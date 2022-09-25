package com.google.android.apps.search.podcasts.widgets.p10621c;

import android.graphics.drawable.InsetDrawable;
import android.support.p033v7.view.menu.C0477q;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.c.e */
/* compiled from: PG */
public final class C141214e {
    /* renamed from: a */
    public static final void m229222a(Menu menu) {
        C69664n.m101061g(menu, "<this>");
        C0477q qVar = (C0477q) menu;
        qVar.f1659j = true;
        ArrayList e = qVar.mo1654e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            Object obj = e.get(i);
            C69664n.m101060f(obj, "this.visibleItems");
            MenuItem menuItem = (MenuItem) obj;
            int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, qVar.f1650a.getResources().getDisplayMetrics());
            if (menuItem.getIcon() != null) {
                menuItem.setIcon(new InsetDrawable(menuItem.getIcon(), applyDimension, 0, applyDimension, 0));
            }
        }
    }
}
