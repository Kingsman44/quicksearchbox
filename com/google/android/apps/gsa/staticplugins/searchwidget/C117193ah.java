package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ah */
/* compiled from: PG */
public final /* synthetic */ class C117193ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325321a;

    /* renamed from: b */
    public final /* synthetic */ AppWidgetManager f325322b;

    /* renamed from: c */
    public final /* synthetic */ int f325323c;

    /* renamed from: d */
    public final /* synthetic */ boolean f325324d;

    public /* synthetic */ C117193ah(C117204as asVar, AppWidgetManager appWidgetManager, int i, boolean z) {
        this.f325321a = asVar;
        this.f325322b = appWidgetManager;
        this.f325323c = i;
        this.f325324d = z;
    }

    public final Object apply(Object obj) {
        C117204as asVar = this.f325321a;
        AppWidgetManager appWidgetManager = this.f325322b;
        int i = this.f325323c;
        boolean z = this.f325324d;
        RemoteViews remoteViews = (RemoteViews) obj;
        remoteViews.getClass();
        C89257aa.m145196i(appWidgetManager, i, remoteViews, z, (C89911f) asVar.f325353g.mo27525b());
        return Boolean.valueOf(asVar.mo103192n(i));
    }
}
