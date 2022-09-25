package com.google.android.apps.search.podcasts.settings;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.search.podcasts.settings.p10613b.C141078b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.o */
/* compiled from: PG */
final class C141092o implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ View f383047a;

    public C141092o(View view) {
        this.f383047a = view;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.podcasts_settings_enable_for_all) {
            C47393f.m84237h(new C141078b(true), this.f383047a);
            return true;
        } else if (itemId != R.id.podcasts_settings_disable_for_all) {
            return false;
        } else {
            C47393f.m84237h(new C141078b(false), this.f383047a);
            return true;
        }
    }
}
