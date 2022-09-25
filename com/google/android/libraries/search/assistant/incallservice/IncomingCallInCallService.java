package com.google.android.libraries.search.assistant.incallservice;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.Call;
import android.telecom.InCallService;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79528o;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79529p;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79530q;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79531r;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79532s;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79534u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class IncomingCallInCallService extends InCallService {

    /* renamed from: c */
    private static final C59071e f89603c = C59071e.m91332i("com.google.android.libraries.search.assistant.incallservice.IncomingCallInCallService");

    /* renamed from: a */
    public final C33482a f89604a = new C33482a(this);

    /* renamed from: b */
    public final Set f89605b = ConcurrentHashMap.newKeySet();

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f89603c.mo56224b()).mo56372aa(51217)).mo56386p("onBind() to the IncomingCallInCallService.");
        String action = intent.getAction();
        if (action == null || !action.equals("local_incallservice_intent")) {
            return super.onBind(intent);
        }
        return this.f89604a;
    }

    public final void onCallAdded(Call call) {
        for (C79534u uVar : this.f89605b) {
            if (((Boolean) Optional.m71637of(call).map(C79528o.f218243a).map(C79529p.f218244a).map(C79530q.f218245a).map(C79531r.f218246a).map(new C79532s()).orElse(false)).booleanValue()) {
                call.registerCallback(uVar.f218250b);
                C79534u.m127611a(uVar.f218249a, call, call.getState());
            }
        }
    }

    public final void onCallRemoved(Call call) {
        for (C79534u uVar : this.f89605b) {
            call.unregisterCallback(uVar.f218250b);
        }
    }
}
