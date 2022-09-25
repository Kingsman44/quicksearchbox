package com.google.android.apps.gsa.staticplugins.opa.widget.impl;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.widget.impl.b */
/* compiled from: PG */
public final /* synthetic */ class C114249b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C114250c f316804a;

    public /* synthetic */ C114249b(C114250c cVar) {
        this.f316804a = cVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C114250c cVar = this.f316804a;
        return Boolean.valueOf(cVar.f316805a.requestPinAppWidget(new ComponentName(cVar.f316806b, OpaWidgetProvider.class), (Bundle) null, (PendingIntent) null));
    }
}
