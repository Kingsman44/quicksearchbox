package com.google.android.apps.gsa.shared.p7031bk;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.shared.bk.d */
/* compiled from: PG */
class C89695d extends AppWidgetProvider {

    /* renamed from: a */
    private volatile boolean f242836a = false;

    /* renamed from: b */
    private final Object f242837b = new Object();

    public void onReceive(Context context, Intent intent) {
        if (!this.f242836a) {
            synchronized (this.f242837b) {
                if (!this.f242836a) {
                    ((C89694c) C68323g.m98667a(context)).mo83605rt((C89693b) this);
                    this.f242836a = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}
