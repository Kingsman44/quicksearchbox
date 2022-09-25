package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0631et;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ex */
/* compiled from: PG */
public final /* synthetic */ class C73668ex implements C0631et {

    /* renamed from: a */
    public final /* synthetic */ RatingWidget f194865a;

    public /* synthetic */ C73668ex(RatingWidget ratingWidget) {
        this.f194865a = ratingWidget;
    }

    /* renamed from: a */
    public final boolean mo2855a(MenuItem menuItem) {
        RatingWidget ratingWidget = this.f194865a;
        int i = ((C0480t) menuItem).f1682a;
        if (i == R.id.rating_menu_edit) {
            ratingWidget.f194604b.setVisibility(0);
            ratingWidget.f194605c.setVisibility(8);
            ratingWidget.mo65053a(ratingWidget.f194603a);
            return true;
        } else if (i != R.id.rating_menu_delete) {
            return false;
        } else {
            return true;
        }
    }
}
