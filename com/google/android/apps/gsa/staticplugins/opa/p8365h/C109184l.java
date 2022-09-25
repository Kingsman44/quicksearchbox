package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.l */
/* compiled from: PG */
public final /* synthetic */ class C109184l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C109191s f304010a;

    /* renamed from: b */
    public final /* synthetic */ Intent f304011b;

    /* renamed from: c */
    public final /* synthetic */ int f304012c;

    public /* synthetic */ C109184l(C109191s sVar, Intent intent, int i) {
        this.f304010a = sVar;
        this.f304011b = intent;
        this.f304012c = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C109191s sVar = this.f304010a;
        Intent intent = this.f304011b;
        int i = this.f304012c;
        if (intent == null) {
            return C118826c.f331423b;
        }
        ((C58970a) ((C58970a) sVar.f304019a.mo56224b()).mo56372aa(23869)).mo56395y("sendMessage(): received broadcast id:%d with action:%s", i, intent.getAction());
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelable("pss_broadcast_intent", intent);
        obtain.setData(bundle);
        obtain.replyTo = sVar.f304025g;
        obtain.arg1 = i;
        return C2169h.m6027a(new C109183k(sVar, i, obtain, intent));
    }
}
