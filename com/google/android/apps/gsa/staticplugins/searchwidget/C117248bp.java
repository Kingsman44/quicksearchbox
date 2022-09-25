package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bp */
/* compiled from: PG */
public final /* synthetic */ class C117248bp implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C117251bs f325486a;

    public /* synthetic */ C117248bp(C117251bs bsVar) {
        this.f325486a = bsVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        return Boolean.valueOf(AppWidgetManager.getInstance(this.f325486a.f325491b).isRequestPinAppWidgetSupported());
    }
}
