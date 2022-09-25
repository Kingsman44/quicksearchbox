package com.google.android.apps.gsa.staticplugins.bisto.p7530v;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95300f;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96634d;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96635e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.v.b */
/* compiled from: PG */
public final class C96509b {

    /* renamed from: a */
    static final long f269998a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: b */
    public final C95300f f269999b;

    /* renamed from: c */
    public final C68214a f270000c;

    /* renamed from: d */
    public final C68214a f270001d;

    /* renamed from: e */
    public final C68214a f270002e;

    /* renamed from: f */
    public final String f270003f;

    /* renamed from: g */
    public String f270004g;

    /* renamed from: h */
    public C124548d f270005h;

    /* renamed from: i */
    public final String f270006i;

    /* renamed from: j */
    public final C60888db f270007j;

    /* renamed from: k */
    public final C68214a f270008k;

    /* renamed from: l */
    public final C21370a f270009l;

    /* renamed from: m */
    public final Context f270010m;

    /* renamed from: n */
    public final long f270011n;

    /* renamed from: o */
    NotificationManager f270012o;

    /* renamed from: p */
    public C60872cz f270013p;

    public C96509b(Context context, C95300f fVar, C60888db dbVar, C68214a aVar, C21370a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C96634d dVar) {
        int b = C96635e.m160134b(dVar.f270327b);
        if (b == 0 || b != 3) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (BluetoothAdapter.checkBluetoothAddress(dVar.f270326a)) {
            this.f270003f = dVar.f270328c;
            this.f270000c = aVar3;
            this.f270001d = aVar4;
            this.f270002e = aVar5;
            this.f269999b = fVar;
            this.f270007j = dbVar;
            this.f270008k = aVar;
            this.f270009l = aVar2;
            this.f270011n = dVar.f270329d;
            this.f270006i = dVar.f270326a;
            this.f270010m = context;
            this.f270012o = (NotificationManager) context.getSystemService("notification");
            return;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        throw new IllegalArgumentException("Invalid saved state");
    }

    /* renamed from: a */
    public static Notification m159892a(NotificationManager notificationManager, String str) {
        Notification notification;
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            if (statusBarNotification.getId() == 20 && (notification = statusBarNotification.getNotification()) != null && notification.extras != null && str.equals(notification.extras.getString("extra_device_id"))) {
                return notification;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final PendingIntent mo90192b() {
        Intent a = C89636g.m145895a(this.f270010m, this.f270006i, mo90194d(), 0, C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL);
        a.putExtra("dismiss_notification", true);
        return PendingIntent.getActivity(this.f270010m, 1002, a, 201326592);
    }

    /* renamed from: c */
    public final PendingIntent mo90193c() {
        Context context = this.f270010m;
        return PendingIntent.getActivity(context, 1000, C89636g.m145895a(context, this.f270006i, mo90194d(), 0, C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL), 201326592);
    }

    /* renamed from: d */
    public final String mo90194d() {
        C124548d dVar;
        if (this.f270004g == null && (dVar = this.f270005h) != null) {
            this.f270004g = dVar.mo106481V();
        }
        return this.f270004g;
    }

    /* renamed from: e */
    public final void mo90195e(C1839z zVar) {
        Bundle b = zVar.mo5014b();
        if (b == null) {
            b = new Bundle();
        }
        b.putString("extra_device_id", this.f270006i);
        b.putLong("create_timestamp", this.f270011n);
        b.putLong("post_timestamp", this.f270009l.mo26870b());
        zVar.f5706z = b;
    }

    /* renamed from: f */
    public final void mo90196f() {
        C60872cz czVar = this.f270013p;
        if (czVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            czVar.cancel(false);
        }
    }

    /* renamed from: g */
    public final boolean mo90197g() {
        Notification a = m159892a(this.f270012o, this.f270006i);
        if (a == null || a.extras == null || a.extras.getLong("create_timestamp") != this.f270011n) {
            a = null;
        }
        return a != null;
    }

    public C96509b(Context context, C95300f fVar, C60888db dbVar, C68214a aVar, C21370a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, String str, C124548d dVar, String str2) {
        this.f270003f = str2;
        this.f270000c = aVar3;
        this.f269999b = fVar;
        this.f270001d = aVar4;
        this.f270002e = aVar5;
        this.f270006i = str;
        this.f270007j = dbVar;
        this.f270008k = aVar;
        this.f270009l = aVar2;
        this.f270011n = aVar2.mo26870b();
        this.f270010m = context;
        this.f270005h = dVar;
        this.f270012o = (NotificationManager) context.getSystemService("notification");
    }
}
