package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.android.C80955k;
import com.google.android.apps.gsa.nga.shared.android.C80958n;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80942c;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80943d;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80944e;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.an */
/* compiled from: PG */
public final class C76303an extends C79356f {

    /* renamed from: a */
    public final Context f211345a;

    /* renamed from: b */
    public final C80944e f211346b;

    /* renamed from: c */
    public final d f211347c;

    /* renamed from: d */
    public final C81515c f211348d;

    /* renamed from: e */
    private final C76092h f211349e;

    /* renamed from: f */
    private final BroadcastReceiver f211350f;

    public C76303an(Context context, C80944e eVar, d dVar, C81515c cVar, C76092h hVar, C79359i iVar, C91142g gVar) {
        super(iVar);
        this.f211345a = context;
        this.f211346b = eVar;
        this.f211347c = dVar;
        this.f211348d = cVar;
        this.f211349e = hVar;
        this.f211350f = new C80958n(C76293ad.f211331a, gVar, C90126fx.f251120cn);
    }

    /* renamed from: a */
    public static Intent m122896a(C76303an anVar, Context context, Consumer consumer) {
        Intent b = C80955k.m128812b(anVar, consumer);
        b.setAction("nga:screenshot_notification_callback_action");
        b.setPackage(context.getPackageName());
        return b;
    }

    /* renamed from: b */
    public final void mo72162b(String str, C80943d dVar) {
        this.f211346b.mo74730c(C89094c.NGA_SCREENSHOT, C80942c.NGA_SCREENSHOT, new C76300ak(str, dVar));
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f211349e.mo72021b().mo72041f();
    }

    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f211345a.registerReceiver(this.f211350f, new IntentFilter("nga:screenshot_notification_callback_action"));
        return C118826c.f331423b;
    }

    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f211345a.unregisterReceiver(this.f211350f);
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "ScreenshotNotificationController";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 16;
    }
}
