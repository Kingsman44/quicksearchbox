package com.google.android.libraries.search.assistant.performer.communication;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dd */
/* compiled from: PG */
public final /* synthetic */ class C35669dd implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C35674di f93548a;

    /* renamed from: b */
    public final /* synthetic */ Context f93549b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter f93550c;

    /* renamed from: d */
    public final /* synthetic */ Uri f93551d;

    /* renamed from: e */
    public final /* synthetic */ PendingIntent f93552e;

    public /* synthetic */ C35669dd(C35674di diVar, Context context, IntentFilter intentFilter, Uri uri, PendingIntent pendingIntent) {
        this.f93548a = diVar;
        this.f93549b = context;
        this.f93550c = intentFilter;
        this.f93551d = uri;
        this.f93552e = pendingIntent;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C35674di diVar = this.f93548a;
        Context context = this.f93549b;
        IntentFilter intentFilter = this.f93550c;
        Uri uri = this.f93551d;
        PendingIntent pendingIntent = this.f93552e;
        diVar.f93560c = new C35675dj(cVar);
        context.registerReceiver(diVar.f93560c, intentFilter);
        SmsManager.getDefault().sendMultimediaMessage(context, uri, (String) null, (Bundle) null, pendingIntent);
        return "MmsStatusReceiver";
    }
}
