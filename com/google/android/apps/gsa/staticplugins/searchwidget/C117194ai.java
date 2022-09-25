package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ai */
/* compiled from: PG */
public final /* synthetic */ class C117194ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325325a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f325326b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f325327c;

    /* renamed from: d */
    public final /* synthetic */ AppWidgetManager f325328d;

    /* renamed from: e */
    public final /* synthetic */ int f325329e;

    /* renamed from: f */
    public final /* synthetic */ boolean f325330f;

    public /* synthetic */ C117194ai(C117204as asVar, C60870cx cxVar, C60870cx cxVar2, AppWidgetManager appWidgetManager, int i, boolean z) {
        this.f325325a = asVar;
        this.f325326b = cxVar;
        this.f325327c = cxVar2;
        this.f325328d = appWidgetManager;
        this.f325329e = i;
        this.f325330f = z;
    }

    public final Object call() {
        C117204as asVar = this.f325325a;
        C60870cx cxVar = this.f325326b;
        C60870cx cxVar2 = this.f325327c;
        AppWidgetManager appWidgetManager = this.f325328d;
        int i = this.f325329e;
        boolean z = this.f325330f;
        RemoteViews remoteViews = (RemoteViews) C60856cj.m92909r(cxVar);
        RemoteViews remoteViews2 = (RemoteViews) C60856cj.m92909r(cxVar2);
        if (!(remoteViews == null || remoteViews2 == null)) {
            remoteViews = new RemoteViews(remoteViews2, remoteViews);
        }
        remoteViews.getClass();
        C89257aa.m145196i(appWidgetManager, i, remoteViews, z, (C89911f) asVar.f325353g.mo27525b());
        return Boolean.valueOf(asVar.mo103192n(i));
    }
}
