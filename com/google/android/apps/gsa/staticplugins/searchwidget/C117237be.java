package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.app.PendingIntent;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.be */
/* compiled from: PG */
public final /* synthetic */ class C117237be implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ RemoteViews f325452a;

    /* renamed from: b */
    public final /* synthetic */ int f325453b;

    public /* synthetic */ C117237be(RemoteViews remoteViews, int i) {
        this.f325452a = remoteViews;
        this.f325453b = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        this.f325452a.setOnClickPendingIntent(this.f325453b, (PendingIntent) obj);
    }
}
