package com.google.android.apps.gsa.staticplugins.opa.widget.impl;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.widget.impl.a */
/* compiled from: PG */
class C114248a extends AppWidgetProvider {

    /* renamed from: a */
    private volatile boolean f316802a = false;

    /* renamed from: b */
    private final Object f316803b = new Object();

    public void onReceive(Context context, Intent intent) {
        if (!this.f316802a) {
            synchronized (this.f316803b) {
                if (!this.f316802a) {
                    OpaWidgetProvider opaWidgetProvider = (OpaWidgetProvider) this;
                    ((C114251d) C68323g.m98667a(context)).mo101289sn();
                    this.f316802a = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}
