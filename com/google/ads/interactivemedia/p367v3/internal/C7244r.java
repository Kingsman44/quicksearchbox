package com.google.ads.interactivemedia.p367v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.ads.interactivemedia.v3.internal.r */
/* compiled from: PG */
public final class C7244r {

    /* renamed from: a */
    private static final C7244r f23674a = new C7244r();

    /* renamed from: b */
    private Context f23675b;

    /* renamed from: c */
    private BroadcastReceiver f23676c;

    /* renamed from: d */
    private boolean f23677d;

    /* renamed from: e */
    private boolean f23678e;

    /* renamed from: f */
    private C7379w f23679f;

    private C7244r() {
    }

    /* renamed from: a */
    public static C7244r m21679a() {
        return f23674a;
    }

    /* renamed from: f */
    static /* synthetic */ void m21680f(C7244r rVar, boolean z) {
        if (rVar.f23678e != z) {
            rVar.f23678e = z;
            if (rVar.f23677d) {
                rVar.m21681h();
                if (rVar.f23679f == null) {
                    return;
                }
                if (rVar.mo16353e()) {
                    C6802aq.m19255b().mo15163c();
                } else {
                    C6802aq.m19255b().mo15165e();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m21681h() {
        boolean z = this.f23678e;
        for (C7001i h : C7190p.m21443a().mo16267e()) {
            C6782ac h2 = h.mo16003h();
            if (h2.mo14418e()) {
                C7352v.m22064a().mo16604g(h2.mo14417d(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: b */
    public final void mo16350b(Context context) {
        this.f23675b = context.getApplicationContext();
    }

    /* renamed from: c */
    public final void mo16351c() {
        this.f23676c = new C7217q(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f23675b.registerReceiver(this.f23676c, intentFilter);
        this.f23677d = true;
        m21681h();
    }

    /* renamed from: d */
    public final void mo16352d() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f23675b;
        if (!(context == null || (broadcastReceiver = this.f23676c) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.f23676c = null;
        }
        this.f23677d = false;
        this.f23678e = false;
        this.f23679f = null;
    }

    /* renamed from: e */
    public final boolean mo16353e() {
        return !this.f23678e;
    }

    /* renamed from: g */
    public final void mo16354g(C7379w wVar) {
        this.f23679f = wVar;
    }
}
