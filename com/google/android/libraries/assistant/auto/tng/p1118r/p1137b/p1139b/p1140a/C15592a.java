package com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1139b.p1140a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.b.b.a.a */
/* compiled from: PG */
public final class C15592a {

    /* renamed from: a */
    public static final C59071e f46629a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.b.b.a.a");

    /* renamed from: b */
    public boolean f46630b = false;

    /* renamed from: c */
    public final ArrayList f46631c;

    /* renamed from: d */
    public final NotificationManager f46632d;

    /* renamed from: e */
    public final Context f46633e;

    /* renamed from: f */
    public final C69464a f46634f;

    public C15592a(NotificationManager notificationManager, Context context, C69464a aVar) {
        this.f46632d = notificationManager;
        this.f46633e = context;
        this.f46634f = aVar;
        this.f46631c = new ArrayList();
        if (((Boolean) aVar.mo17428b()).booleanValue()) {
            notificationManager.createNotificationChannel(new NotificationChannel("SETUP_NOTIFICATION_CHANNEL", "setup-notifications", 4));
        }
    }
}
