package com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.libraries.p11029ao.p11030a.C147798a;

/* compiled from: PG */
public final class PieNotificationReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public C75958c f210747a;

    /* renamed from: a */
    public static PendingIntent m122507a(Context context, String str, Bundle bundle) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(new Intent(str).putExtras(bundle).setClass(context, PieNotificationReceiver.class), 1409286144, 0), 1409286144);
        if (broadcast != null) {
            return broadcast;
        }
        C81380n d = C81381o.m129461d();
        d.mo75044c(C81377k.m129443a(bundle));
        d.mo75043b(C80265t.TRIGGER_NOTIFICATION_FAILED_TO_CREATE_PENDINGINTENT);
        throw d.mo75042a();
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        C75956a aVar;
        C74507e.m120467c(11);
        if (this.f210747a == null && (aVar = (C75956a) C74745a.m120861a(context)) != null) {
            aVar.mo71985pP(this);
        }
        C75957b bVar = (C75957b) this.f210747a.f210748a.get();
        if (bVar != null) {
            bVar.mo71960c(intent);
        }
    }
}
