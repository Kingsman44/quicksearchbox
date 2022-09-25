package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.Call;
import android.telecom.InCallService;
import com.google.android.apps.gsa.p5846e.C74507e;
import p3186j$.util.Optional;

/* compiled from: PG */
public class WarmActionsInCallService extends InCallService {

    /* renamed from: c */
    public static final /* synthetic */ int f218216c = 0;

    /* renamed from: a */
    public final C79522i f218217a = new C79522i(this);

    /* renamed from: b */
    public Optional f218218b = Optional.empty();

    /* renamed from: d */
    private final Call.Callback f218219d = new C79520g(this);

    /* renamed from: a */
    public static void m127600a(Optional optional, Call call, int i) {
        optional.ifPresent(new C79519f(call, i));
    }

    public final IBinder onBind(Intent intent) {
        if ("local_agsa_incallservice_intent".equals(intent.getAction())) {
            return this.f218217a;
        }
        return super.onBind(intent);
    }

    public final void onCallAdded(Call call) {
        if (((Boolean) Optional.m71637of(call).map(C79514a.f218220a).map(C79515b.f218221a).map(C79516c.f218222a).map(C79517d.f218223a).map(new C79518e()).orElse(false)).booleanValue()) {
            call.registerCallback(this.f218219d);
            m127600a(this.f218218b, call, call.getState());
        }
    }

    public final void onCreate() {
        C74507e.m120466b(10);
        super.onCreate();
    }
}
