package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.search.googleapp.searchwidget.C139033k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ao */
/* compiled from: PG */
public final /* synthetic */ class C117200ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325338a;

    /* renamed from: b */
    public final /* synthetic */ Context f325339b;

    /* renamed from: c */
    public final /* synthetic */ AppWidgetManager f325340c;

    public /* synthetic */ C117200ao(C117204as asVar, Context context, AppWidgetManager appWidgetManager) {
        this.f325338a = asVar;
        this.f325339b = context;
        this.f325340c = appWidgetManager;
    }

    public final Object apply(Object obj) {
        C139033k kVar = (C139033k) obj;
        kVar.onUpdate(this.f325339b, this.f325340c, this.f325338a.f325355i.mo83226s());
        return null;
    }
}
