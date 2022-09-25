package com.google.android.apps.gsa.nga.engine.p6144ui.p6145a.p6146a;

import android.service.notification.StatusBarNotification;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78020b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C78024f f214868a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f214869b;

    public /* synthetic */ C78020b(C78024f fVar, StatusBarNotification statusBarNotification) {
        this.f214868a = fVar;
        this.f214869b = statusBarNotification;
    }

    public final void onClick(View view) {
        this.f214868a.f214876c.e(this.f214869b.getNotification());
    }
}
