package com.google.android.apps.gsa.staticplugins.opa.widget.impl;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.widget.impl.c */
/* compiled from: PG */
public final class C114250c {

    /* renamed from: a */
    public final AppWidgetManager f316805a;

    /* renamed from: b */
    public final Context f316806b;

    /* renamed from: c */
    public final C22871g f316807c;

    public C114250c(Context context, C22871g gVar) {
        this.f316805a = AppWidgetManager.getInstance(context);
        this.f316806b = context;
        this.f316807c = gVar;
    }

    /* renamed from: a */
    public final boolean mo101288a() {
        return this.f316805a.getAppWidgetIds(new ComponentName(this.f316806b, OpaWidgetProvider.class)).length > 0;
    }
}
