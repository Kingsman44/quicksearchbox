package com.google.android.apps.search.podcasts.settings;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.search.podcasts.settings.p10613b.C141077a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.g */
/* compiled from: PG */
final class C141083g implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ View f383024a;

    public C141083g(View view) {
        this.f383024a = view;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C69664n.m101061g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.podcasts_settings_enable_for_all) {
            C47393f.m84237h(new C141077a(true), this.f383024a);
            return true;
        } else if (itemId != R.id.podcasts_settings_disable_for_all) {
            return false;
        } else {
            C47393f.m84237h(new C141077a(false), this.f383024a);
            return true;
        }
    }
}
