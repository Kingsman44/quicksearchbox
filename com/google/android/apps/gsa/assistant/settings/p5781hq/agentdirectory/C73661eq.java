package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.MenuItem;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.eq */
/* compiled from: PG */
public final /* synthetic */ class C73661eq implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73664et f194852a;

    /* renamed from: b */
    public final /* synthetic */ MenuItem.OnMenuItemClickListener f194853b;

    public /* synthetic */ C73661eq(C73664et etVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f194852a = etVar;
        this.f194853b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C28292j b;
        C73664et etVar = this.f194852a;
        boolean onMenuItemClick = this.f194853b.onMenuItemClick(menuItem);
        if (!onMenuItemClick || (b = etVar.mo65140b(menuItem)) == null || etVar.f194860a == null) {
            return onMenuItemClick;
        }
        b.d(b);
        return true;
    }
}
