package com.google.android.libraries.search.assistant.performer.communication;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dg */
/* compiled from: PG */
public final /* synthetic */ class C35672dg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35674di f93556a;

    public /* synthetic */ C35672dg(C35674di diVar) {
        this.f93556a = diVar;
    }

    public final C60870cx apply(Object obj) {
        C35674di diVar = this.f93556a;
        Context context = diVar.f93558a;
        Intent intent = new Intent(context, C35675dj.class);
        intent.setAction("com.google.android.libraries.search.assistant.performer.communication.MMS_SENT_ACTION");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent, 1342177280, 5), 1342177280);
        return C2169h.m6027a(new C35669dd(diVar, context, new IntentFilter("com.google.android.libraries.search.assistant.performer.communication.MMS_SENT_ACTION"), (Uri) obj, broadcast));
    }
}
