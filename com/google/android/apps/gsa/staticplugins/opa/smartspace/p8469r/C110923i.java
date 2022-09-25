package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.i */
/* compiled from: PG */
final class C110923i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RemoteViews f308990a;

    /* renamed from: b */
    final /* synthetic */ AppWidgetManager f308991b;

    /* renamed from: c */
    final /* synthetic */ C110925k f308992c;

    public C110923i(C110925k kVar, RemoteViews remoteViews, AppWidgetManager appWidgetManager) {
        this.f308992c = kVar;
        this.f308990a = remoteViews;
        this.f308991b = appWidgetManager;
    }

    public final void run() {
        if (this.f308992c.f309004f == this) {
            this.f308990a.setViewVisibility(R.id.situational_chip_text, 8);
            this.f308991b.updateAppWidget(C110925k.f308998a, this.f308990a);
        }
    }
}
