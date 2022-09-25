package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.av */
/* compiled from: PG */
public final /* synthetic */ class C26153av implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ MenuItem f71062a;

    public /* synthetic */ C26153av(MenuItem menuItem) {
        this.f71062a = menuItem;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        MenuItem menuItem = this.f71062a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (menuItem.isActionViewExpanded()) {
            menuItem.collapseActionView();
        } else {
            dialogInterface.dismiss();
        }
        return true;
    }
}
