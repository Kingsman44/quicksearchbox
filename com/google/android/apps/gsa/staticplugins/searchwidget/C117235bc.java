package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.app.PendingIntent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bc */
/* compiled from: PG */
public final /* synthetic */ class C117235bc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C117239bg f325440a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f325441b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f325442c;

    /* renamed from: d */
    public final /* synthetic */ RemoteViews f325443d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f325444e;

    /* renamed from: f */
    public final /* synthetic */ PendingIntent f325445f;

    public /* synthetic */ C117235bc(C117239bg bgVar, C60870cx cxVar, C60870cx cxVar2, RemoteViews remoteViews, Bundle bundle, PendingIntent pendingIntent) {
        this.f325440a = bgVar;
        this.f325441b = cxVar;
        this.f325442c = cxVar2;
        this.f325443d = remoteViews;
        this.f325444e = bundle;
        this.f325445f = pendingIntent;
    }

    public final Object call() {
        C117239bg bgVar = this.f325440a;
        C60870cx cxVar = this.f325441b;
        C60870cx cxVar2 = this.f325442c;
        RemoteViews remoteViews = this.f325443d;
        Bundle bundle = this.f325444e;
        PendingIntent pendingIntent = this.f325445f;
        remoteViews.setOnClickPendingIntent(R.id.search_widget_google_logo, (PendingIntent) C60856cj.m92909r(cxVar));
        remoteViews.setCharSequence(R.id.search_widget_google_logo, "setContentDescription", bgVar.f325458d.getResources().getString(R.string.accessibility_feed_button));
        remoteViews.setOnClickPendingIntent(R.id.search_widget_background, (PendingIntent) C60856cj.m92909r(cxVar2));
        if (!bgVar.mo103212e(bundle)) {
            remoteViews.setOnClickPendingIntent(R.id.search_widget_voice_btn, pendingIntent);
        } else {
            remoteViews.setOnClickPendingIntent(R.id.search_widget_voice_btn_v2_container, pendingIntent);
        }
        return remoteViews;
    }
}
