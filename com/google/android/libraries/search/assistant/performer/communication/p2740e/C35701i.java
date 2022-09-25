package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.i */
/* compiled from: PG */
public final class C35701i extends BroadcastReceiver {

    /* renamed from: c */
    private static final Duration f93597c = Duration.ofSeconds(5);

    /* renamed from: a */
    public final C2164c f93598a;

    /* renamed from: b */
    public boolean f93599b = false;

    /* renamed from: d */
    private final AtomicInteger f93600d;

    /* renamed from: e */
    private final C60870cx f93601e;

    /* renamed from: f */
    private final Executor f93602f;

    /* renamed from: g */
    private final Context f93603g;

    public C35701i(int i, C2164c cVar, C60888db dbVar, Context context) {
        this.f93600d = new AtomicInteger(i);
        this.f93598a = cVar;
        this.f93602f = new C60904dr(dbVar);
        this.f93603g = context;
        this.f93601e = dbVar.mo29165e(new C35698f(this), f93597c.getSeconds() * ((long) i), TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public final void mo39807a() {
        this.f93599b = true;
        this.f93603g.unregisterReceiver(this);
        if (!this.f93601e.isDone()) {
            this.f93601e.cancel(false);
        }
    }

    /* renamed from: b */
    public final void mo39808b(Exception exc) {
        C35699g gVar = new C35699g(this, exc);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f93602f), "onMessageDeliveryFailed failed", new Object[0]);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.libraries.search.assistant.performer.communication.ACTION_SMS_STATUS".equals(intent.getAction())) {
            int resultCode = getResultCode();
            if (resultCode == -1) {
                if (this.f93600d.decrementAndGet() == 0) {
                    C35700h hVar = new C35700h(this);
                    C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(hVar), this.f93602f), "onMessageDeliveryFailed failed", new Object[0]);
                }
            } else if (resultCode == 0) {
                mo39808b(new C35695c("Failed to send SMS. SMS Cancelled."));
            } else {
                mo39808b(new C35695c("Failed to send SMS. Unknown error. ResultCode: " + resultCode));
            }
        }
    }
}
