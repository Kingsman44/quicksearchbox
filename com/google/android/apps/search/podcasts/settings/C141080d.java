package com.google.android.apps.search.podcasts.settings;

import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.d */
/* compiled from: PG */
final class C141080d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141084h f383021a;

    public C141080d(C141084h hVar) {
        this.f383021a = hVar;
    }

    public final void onClick(View view) {
        C141084h hVar = this.f383021a;
        C69664n.m101060f(view, "v");
        PopupMenu popupMenu = new PopupMenu(hVar.f383026b, view);
        popupMenu.getMenuInflater().inflate(R.menu.podcasts_settings_all_shows_action_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(hVar.f383032h.mo51611a(new C141083g(view), "Auto download shows action"));
        popupMenu.show();
    }
}
