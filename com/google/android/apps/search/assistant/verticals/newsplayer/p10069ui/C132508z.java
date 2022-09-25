package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.view.MenuItem;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.z */
/* compiled from: PG */
public final /* synthetic */ class C132508z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132455ab f361648a;

    public /* synthetic */ C132508z(C132455ab abVar) {
        this.f361648a = abVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C132455ab abVar = this.f361648a;
        C47474k g = C47475l.m84477g();
        ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.NEWS_PLAYER_FEEDBACK_CATEGORY";
        abVar.f361540a.f361599n.mo51336a(g.mo51332e());
        return true;
    }
}
