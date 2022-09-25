package com.google.android.apps.search.podcasts.settings;

import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.k */
/* compiled from: PG */
final class C141088k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141093p f383043a;

    public C141088k(C141093p pVar) {
        this.f383043a = pVar;
    }

    public final void onClick(View view) {
        C141093p pVar = this.f383043a;
        C69664n.m101060f(view, "v");
        PopupMenu popupMenu = new PopupMenu(pVar.f383049b, view);
        popupMenu.getMenuInflater().inflate(R.menu.podcasts_settings_all_shows_action_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(pVar.f383055h.mo51611a(new C141092o(view), "New episode notifications shows action"));
        popupMenu.show();
    }
}
