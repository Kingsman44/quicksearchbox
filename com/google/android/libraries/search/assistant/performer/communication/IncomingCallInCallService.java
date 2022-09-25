package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.InCallService;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class IncomingCallInCallService extends InCallService {

    /* renamed from: b */
    private static final C59071e f93212b = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService");

    /* renamed from: a */
    public final C35581cj f93213a = new C35581cj(this);

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f93212b.mo56224b()).mo56372aa(51648)).mo56386p("onBind() to the IncomingCallInCallService.");
        String action = intent.getAction();
        if (action == null || !action.equals("local_incallservice_intent")) {
            return super.onBind(intent);
        }
        return this.f93213a;
    }
}
