package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.u */
/* compiled from: PG */
public final /* synthetic */ class C116192u implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322163a;

    public /* synthetic */ C116192u(C116166ai aiVar) {
        this.f322163a = aiVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C116166ai aiVar = this.f322163a;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.recent_settings) {
            C116129b bVar = aiVar.f322100b;
            ((C116130c) bVar).f322041a.mo28345s("onSettingsMenuItemClicked", "RecentlyEventsDispatcher", new Bundle());
            return true;
        } else if (itemId == R.id.recent_onboarding) {
            C116129b bVar2 = aiVar.f322100b;
            ((C116130c) bVar2).f322041a.mo28345s("onOnboardingMenuItemClicked", "RecentlyEventsDispatcher", new Bundle());
            return true;
        } else if (itemId == R.id.recent_myactivity) {
            C116129b bVar3 = aiVar.f322100b;
            ((C116130c) bVar3).f322041a.mo28345s("onMyActivityMenuItemClicked", "RecentlyEventsDispatcher", new Bundle());
            return true;
        } else if (itemId != R.id.recent_help) {
            return false;
        } else {
            C116129b bVar4 = aiVar.f322100b;
            ((C116130c) bVar4).f322041a.mo28345s("onHelpMenuItemClicked", "RecentlyEventsDispatcher", new Bundle());
            return true;
        }
    }
}
