package com.google.android.apps.gsa.staticplugins.opa.util;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ai */
/* compiled from: PG */
public final class C113766ai implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ PopupMenu.OnMenuItemClickListener f315066a;

    /* renamed from: b */
    final /* synthetic */ C113768ak f315067b;

    public C113766ai(C113768ak akVar, PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.f315067b = akVar;
        this.f315066a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C28292j b;
        boolean onMenuItemClick = this.f315066a.onMenuItemClick(menuItem);
        if (!onMenuItemClick || (b = this.f315067b.mo100610b(menuItem)) == null) {
            return onMenuItemClick;
        }
        this.f315067b.f315072a.mo100721a(0, 0, C28285c.m52883j(b, 5, (Integer) null));
        return true;
    }
}
