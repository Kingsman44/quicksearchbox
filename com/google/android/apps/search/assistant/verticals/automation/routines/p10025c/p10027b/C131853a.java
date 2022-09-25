package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.p10027b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.search.assistant.verticals.automation.routines.receiver.GeofenceTransitionsListener_Receiver;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.location.C38716v;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C131853a implements C38716v {

    /* renamed from: a */
    public static final /* synthetic */ C131853a f360084a = new C131853a();

    private /* synthetic */ C131853a() {
    }

    /* renamed from: a */
    public final PendingIntent mo23455a(Context context) {
        Intent intent = new Intent(context, GeofenceTransitionsListener_Receiver.class);
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent, i, 5), i);
        broadcast.getClass();
        return broadcast;
    }
}
