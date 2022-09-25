package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C102368j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DetailsView f285668a;

    public /* synthetic */ C102368j(DetailsView detailsView) {
        this.f285668a = detailsView;
    }

    public final void onClick(View view) {
        DetailsView detailsView = this.f285668a;
        PopupMenu popupMenu = new PopupMenu(new ContextThemeWrapper(detailsView.getContext(), R.style.monet_viewer_overflow_menu), view);
        Menu menu = popupMenu.getMenu();
        popupMenu.getMenuInflater().inflate(R.menu.image_viewer_overflow_menu, menu);
        menu.findItem(R.id.image_viewer_menu_view_saved).setVisible(C102374p.m169703h(detailsView.f285432l));
        popupMenu.setOnMenuItemClickListener(new C102364f(detailsView));
        popupMenu.show();
    }
}
