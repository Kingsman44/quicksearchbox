package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.search.googleapp.searchwidget.C139033k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ap */
/* compiled from: PG */
public final /* synthetic */ class C117201ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325341a;

    /* renamed from: b */
    public final /* synthetic */ Context f325342b;

    /* renamed from: c */
    public final /* synthetic */ AppWidgetManager f325343c;

    public /* synthetic */ C117201ap(C117204as asVar, Context context, AppWidgetManager appWidgetManager) {
        this.f325341a = asVar;
        this.f325342b = context;
        this.f325343c = appWidgetManager;
    }

    public final Object apply(Object obj) {
        C139033k kVar = (C139033k) obj;
        kVar.onUpdate(this.f325342b, this.f325343c, this.f325341a.f325355i.mo83227t());
        return true;
    }
}
