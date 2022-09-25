package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.os.Bundle;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bl */
/* compiled from: PG */
public final /* synthetic */ class C117244bl implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C117251bs f325480a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f325481b;

    public /* synthetic */ C117244bl(C117251bs bsVar, ComponentName componentName) {
        this.f325480a = bsVar;
        this.f325481b = componentName;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C117251bs bsVar = this.f325480a;
        return Boolean.valueOf(AppWidgetManager.getInstance(bsVar.f325491b).requestPinAppWidget(this.f325481b, (Bundle) null, (PendingIntent) null));
    }
}
