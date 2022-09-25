package com.google.android.libraries.assistant.contexttrigger.p1463g;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.location.C38713s;
import com.google.android.libraries.search.location.C38716v;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.g.b */
/* compiled from: PG */
public final class C17739b {

    /* renamed from: a */
    public static final C59071e f50960a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.g.b");

    /* renamed from: b */
    public static final Duration f50961b = Duration.ofDays(30);

    /* renamed from: c */
    public final C38713s f50962c;

    /* renamed from: d */
    public final C38716v f50963d;

    public C17739b(C38713s sVar, C38716v vVar) {
        this.f50962c = sVar;
        this.f50963d = vVar;
    }

    /* renamed from: a */
    public static PendingIntent m35007a(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(new Intent().setComponent(new ComponentName(context, "com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver")).setAction("GEOFENCE_CHANGE_ACTION"), 167772160, 0), 167772160);
        broadcast.getClass();
        return broadcast;
    }
}
