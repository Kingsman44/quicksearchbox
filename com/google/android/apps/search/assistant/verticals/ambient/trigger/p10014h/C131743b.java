package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10014h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106584a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131691a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.h.b */
/* compiled from: PG */
public final class C131743b extends BroadcastReceiver implements C131692b {

    /* renamed from: a */
    private final C58974d f359884a;

    /* renamed from: b */
    private final Context f359885b;

    /* renamed from: c */
    private final C47770dh f359886c;

    /* renamed from: d */
    private Optional f359887d = Optional.empty();

    public C131743b(C130603a aVar, Context context, C47770dh dhVar) {
        this.f359884a = aVar.mo109740b(this);
        this.f359885b = context;
        this.f359886c = dhVar;
    }

    /* renamed from: b */
    public final C60870cx mo110268b(C131713d dVar) {
        ((C58970a) ((C58970a) this.f359884a.mo56224b()).mo56372aa(39387)).mo56386p("Registering SCREEN_ON listener.");
        this.f359887d = Optional.m71637of(dVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.f359885b.registerReceiver(this, intentFilter);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo110269c() {
        ((C58970a) ((C58970a) this.f359884a.mo56224b()).mo56372aa(39388)).mo56386p("Unregistering SCREEN_ON listener.");
        this.f359885b.unregisterReceiver(this);
        this.f359887d = Optional.empty();
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo110270d(C53715bm bmVar, long j) {
        return C131691a.m214140a();
    }

    public final void onReceive(Context context, Intent intent) {
        C60870cx cxVar;
        C47538ax c = this.f359886c.mo51613c("ScreenStateTriggerSource#onReceive");
        try {
            ((C58970a) ((C58970a) this.f359884a.mo56224b()).mo56372aa(39390)).mo56389s("ScreenState: onReceive=%s", intent.getAction());
            if (!this.f359887d.isEmpty()) {
                C131713d dVar = (C131713d) this.f359887d.get();
                if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                    C106584a aVar = (C106584a) C106586c.f297181c.createBuilder();
                    aVar.copyOnWrite();
                    C106586c cVar = (C106586c) aVar.instance;
                    cVar.f297184b = 1;
                    cVar.f297183a |= 1;
                    cxVar = dVar.mo110075a(C131701c.m214153c((C106586c) aVar.build()));
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    C106584a aVar2 = (C106584a) C106586c.f297181c.createBuilder();
                    aVar2.copyOnWrite();
                    C106586c cVar2 = (C106586c) aVar2.instance;
                    cVar2.f297184b = 2;
                    cVar2.f297183a |= 1;
                    cxVar = dVar.mo110075a(C131701c.m214153c((C106586c) aVar2.build()));
                } else {
                    cxVar = C60866ct.f164955a;
                }
                C46459k.m82829b(cxVar, "onReceive.onFailure(): failed future.", new Object[0]);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } else if (c != null) {
                c.close();
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
