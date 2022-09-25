package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.app.PendingIntent;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.f */
/* compiled from: PG */
public final /* synthetic */ class C110920f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C110925k f308981a;

    /* renamed from: b */
    public final /* synthetic */ RemoteViews f308982b;

    /* renamed from: c */
    public final /* synthetic */ boolean f308983c;

    public /* synthetic */ C110920f(C110925k kVar, RemoteViews remoteViews, boolean z) {
        this.f308981a = kVar;
        this.f308982b = remoteViews;
        this.f308983c = z;
    }

    public final void accept(Object obj) {
        C110925k kVar = this.f308981a;
        RemoteViews remoteViews = this.f308982b;
        boolean z = this.f308983c;
        ((C58970a) ((C58970a) kVar.f309001c.mo56224b()).mo56372aa(26876)).mo56386p("Feedback chip present");
        remoteViews.setViewVisibility(R.id.feedback_chip_container, 0);
        remoteViews.setViewVisibility(R.id.feedback_chip_icon, 0);
        remoteViews.setOnClickPendingIntent(R.id.feedback_chip_container, (PendingIntent) obj);
        if (z) {
            remoteViews.setViewVisibility(R.id.feedback_chip_text, 8);
        } else {
            remoteViews.setViewVisibility(R.id.feedback_chip_text, 0);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
