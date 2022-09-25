package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.a */
/* compiled from: PG */
public final /* synthetic */ class C35693a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C35694b f93585a;

    /* renamed from: b */
    public final /* synthetic */ Optional f93586b;

    /* renamed from: c */
    public final /* synthetic */ String f93587c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f93588d;

    public /* synthetic */ C35693a(C35694b bVar, Optional optional, String str, ArrayList arrayList) {
        this.f93585a = bVar;
        this.f93586b = optional;
        this.f93587c = str;
        this.f93588d = arrayList;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C35694b bVar = this.f93585a;
        Optional optional = this.f93586b;
        String str = this.f93587c;
        ArrayList arrayList = this.f93588d;
        SmsManager smsManager = (SmsManager) optional.get();
        int size = arrayList.size();
        Context context = bVar.f93590b;
        C60888db dbVar = bVar.f93591c;
        int size2 = arrayList.size();
        IntentFilter intentFilter = new IntentFilter("com.google.android.libraries.search.assistant.performer.communication.ACTION_SMS_STATUS");
        C35701i iVar = new C35701i(size2, cVar, dbVar, context);
        context.registerReceiver(iVar, intentFilter);
        try {
            Context context2 = bVar.f93590b;
            Intent intent = new Intent(context2, C35701i.class);
            intent.setAction("com.google.android.libraries.search.assistant.performer.communication.ACTION_SMS_STATUS");
            ArrayList arrayList2 = new ArrayList(size);
            int i = 0;
            while (i < size) {
                int intValue = C35696d.f93592a.intValue() + i;
                int i2 = i == 0 ? 1409286144 : 1140850688;
                PendingIntent broadcast = PendingIntent.getBroadcast(context2, intValue, C147798a.m240896b(intent, i2, 0), i2);
                if (broadcast != null) {
                    arrayList2.add(broadcast);
                    i++;
                } else {
                    throw new C35695c("Failed to prepare pendingIntent, likely there is already an ongoing pendingIntent.");
                }
            }
            smsManager.sendMultipartTextMessage(str, (String) null, arrayList, arrayList2, (ArrayList) null);
            return "sendSmsInternal";
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C35694b.f93589a.mo56225c()).mo56382g(e)).mo56372aa(51770)).mo56386p("Failed to Send SMS.");
            iVar.mo39808b(new C35695c((Throwable) e));
            return "sendSmsInternal";
        }
    }
}
