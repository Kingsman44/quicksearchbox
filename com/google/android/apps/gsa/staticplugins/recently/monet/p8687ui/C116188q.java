package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.q */
/* compiled from: PG */
public final /* synthetic */ class C116188q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322159a;

    public /* synthetic */ C116188q(C116166ai aiVar) {
        this.f322159a = aiVar;
    }

    public final void onClick(View view) {
        C116166ai aiVar = this.f322159a;
        PopupMenu popupMenu = new PopupMenu(aiVar.f322102d, view);
        popupMenu.setOnMenuItemClickListener(new C116192u(aiVar));
        popupMenu.getMenuInflater().inflate(R.menu.recent_overflow_menu, popupMenu.getMenu());
        if (!((Boolean) ((C23249a) aiVar.f322099a.mo102510i()).mo28725a()).booleanValue()) {
            popupMenu.getMenu().removeItem(R.id.recent_help);
        }
        popupMenu.show();
    }
}
