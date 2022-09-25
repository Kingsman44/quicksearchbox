package com.google.android.apps.gsa.shared.p7031bk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87859gf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87860gg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87861gh;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.search.googleapp.searchwidget.C138925aa;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.shared.bk.b */
/* compiled from: PG */
public class C89693b extends C89695d {

    /* renamed from: a */
    public static final C59071e f242828a = C59071e.m91332i("com.google.android.apps.gsa.shared.bk.b");

    /* renamed from: b */
    static final AtomicBoolean f242829b = new AtomicBoolean(false);

    /* renamed from: f */
    private static final ClientConfig f242830f;

    /* renamed from: c */
    public C21370a f242831c;

    /* renamed from: d */
    public C90929bz f242832d;

    /* renamed from: e */
    public C88483e f242833e;

    /* renamed from: g */
    private final C118575h f242834g;

    /* renamed from: h */
    private final int f242835h;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.WIDGET;
        gVar.f239199a = 1;
        gVar.f239204f = "widget";
        f242830f = new ClientConfig(gVar);
    }

    public C89693b(C118575h hVar, int i) {
        this.f242834g = hVar;
        this.f242835h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo83603a(BroadcastReceiver.PendingResult pendingResult) {
        if (isOrderedBroadcast()) {
            pendingResult.setResultCode(-1);
        }
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        Duration duration;
        C74507e.m120467c(this.f242835h);
        super.onReceive(context, intent);
        C31167ax.m58112a().mo36914e(C31164au.m58092b("agsa.widget.intent.processing-time"));
        C31167ax.m58112a().mo36914e(C31164au.m58092b("agsa.widget.intent.processing-time.failure"));
        C31167ax.m58112a().mo36914e(C31164au.m58092b("agsa.widget.intent.return-time"));
        C59052c cVar = (C59052c) f242828a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "SearchWidgetFlow");
        ((C59052c) cVar.mo56372aa(11478)).mo56389s("GsaWidgetProvider:onReceive(%s) started", intent);
        C88489j jVar = new C88489j(C87739bu.WIDGET_INTENT_RECEIVED);
        C62940bt btVar = C87859gf.f237703a;
        C87860gg ggVar = (C87860gg) C87861gh.f237704c.createBuilder();
        C118575h hVar = this.f242834g;
        ggVar.copyOnWrite();
        C87861gh ghVar = (C87861gh) ggVar.instance;
        ghVar.f237707b = hVar.f330812sk;
        ghVar.f237706a |= 1;
        jVar.mo82014b(btVar, (C87861gh) ggVar.build());
        jVar.mo82015c(intent);
        ClientEventData a = jVar.mo82013a();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ClientConfig clientConfig = f242830f;
        if (f242829b.compareAndSet(false, true)) {
            duration = C138925aa.m225759a(this.f242831c, C138925aa.f377856a);
        } else {
            duration = C138925aa.f377856a;
        }
        this.f242832d.mo85142g(this.f242833e.mo82004b(clientConfig, a, duration.toMillis()), new C89692a(this, intent, goAsync));
        C31167ax.m58112a().mo36915f(C31164au.m58092b("agsa.widget.intent.return-time"));
    }
}
