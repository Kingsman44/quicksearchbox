package com.google.android.libraries.onegoogle.accountmenu;

import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.p */
/* compiled from: PG */
public final class C30789p {
    /* renamed from: a */
    public static SelectedAccountDisc m57485a(MenuItem menuItem) {
        menuItem.setActionView(R.layout.selected_account_disc_open_search_bar);
        return (SelectedAccountDisc) menuItem.getActionView().findViewById(R.id.selected_account_disc);
    }
}
